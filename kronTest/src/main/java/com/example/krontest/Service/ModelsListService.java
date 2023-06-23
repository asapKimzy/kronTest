package com.example.krontest.Service;

import com.example.krontest.models.Build;
import com.example.krontest.models.Detail;
import com.example.krontest.models.Factory;
import com.example.krontest.models.PKI;
import com.example.krontest.repository.BuildRepository;
import com.example.krontest.repository.DetailRepository;
import com.example.krontest.repository.FactoryRepository;
import com.example.krontest.repository.PKIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ModelsListService {
    @Autowired
    PKIRepository pkiRepository;
    @Autowired
    BuildRepository buildRepository;
    @Autowired
    DetailRepository detailRepository;
    @Autowired
    FactoryRepository factoryRepository;
    public  void getDetailsList() throws IOException {
        File file=new File("DetailsList.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String line="";
        while ((line = br.readLine()) != null) {
            String[] detMass=line.split(";");
            Detail detail=new Detail();
            detail.setId(Long.valueOf(detMass[0]));
            detail.setName(detMass[1]);
            detail.setMaterial(detMass[2]);
            detail.setWorkShop(detMass[3]);
            Build build=buildRepository.findById(Long.valueOf(detMass[4])).get();
            detail.setBuilds(build);
            detailRepository.save(detail);
        }
    }
    public  void getPKIList() throws IOException {
        File file=new File("PKIList.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String line="";
        while ((line = br.readLine()) != null) {
            String[] pkiMass=line.split(";");
            PKI pki=new PKI();
            pki.setId(Long.valueOf(pkiMass[0]));
            pki.setName(pkiMass[1]);
            pki.setArticle(pkiMass[2]);
            pki.setManufacturer(pkiMass[3]);
            Build build=buildRepository.findById(Long.valueOf(pkiMass[4])).get();
            pki.setBuild(build);
            pkiRepository.save(pki);
        }
    }

    public  void getBuildsList() throws IOException {
        File file=new File("BuildsList.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String line="";
        while ((line = br.readLine()) != null) {
            String[] buildMass=line.split(";");
            Build build=new Build();
            build.setId(Long.valueOf(buildMass[0]));
            build.setName(buildMass[1]);
            build.setApplicabillity(buildMass[2]);


            buildRepository.save(build);
        }
    }

    public void writePKIList() throws IOException {
        File file = new File("ModelsList.CSV");
        FileWriter fr = null;
        BufferedWriter br = null;
        List<PKI> pkis=pkiRepository.findAll();

        try{
            fr = new FileWriter(file,true);
            br = new BufferedWriter(fr);
            for(int i =pkis.size()-1 ; i>=0; i--){
                Long id=pkis.get(i).getId();
                String name=pkis.get(i).getName();
                br.write(id+";"+name+";PKI;"+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void writeDetailsList() throws IOException {
        File file = new File("ModelsList.CSV");
        FileWriter fr = null;
        BufferedWriter br = null;
        List<Detail> details=detailRepository.findAll();

        try{
            fr = new FileWriter(file,true);
            br = new BufferedWriter(fr);
            for(int i =details.size()-1 ; i>=0; i--){
                br.write(details.get(i).getId()+";"+details.get(i).getName()+";Details;"+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void writeBuildsList() throws IOException {
        File file = new File("ModelsList.CSV");
        FileWriter fr = null;
        BufferedWriter br = null;
        List<Build> builds=buildRepository.findAll();

        try{
            fr = new FileWriter(file,true);
            br = new BufferedWriter(fr);
            for(int i =builds.size()-1 ; i>=0; i--){
                br.write(builds.get(i).getId()+";"+builds.get(i).getName()+";Builds"+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
