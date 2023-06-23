package com.example.krontest.Service;

import com.example.krontest.models.DTOFactory;
import com.example.krontest.models.DTOManuf;
import com.example.krontest.models.Detail;
import com.example.krontest.models.PKI;
import com.example.krontest.repository.PKIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Task3 {
    @Autowired
    PKIRepository pkiRepository;
    public List<DTOManuf> makeDTO(){
        List<PKI> list=pkiRepository.findAll();

        Set<String> items=new HashSet<>();
        List<DTOManuf> dtoManufList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            items.add(list.get(i).getManufacturer());
        }
        for (String i:items) {
            DTOManuf dtoManuf=new DTOManuf();
            dtoManuf.setName(i);
            dtoManuf.setItems(makeMap(i));
            dtoManufList.add(dtoManuf);
        }
        return dtoManufList;

    }
    public Map<String, Integer> makeMap(String name){
        List<PKI> pkis= pkiRepository.findPKIByManufacturer(name);
        Map<String, Integer> map=new HashMap<>();
        for (int i = 0; i < pkis.size(); i++) {
            if(!map.containsKey(pkis.get(i).getName())){
                map.put(pkis.get(i).getName(),1);
            }
            else {
                int num=map.get(pkis.get(i).getName());
                num=num+1;
                map.replace(pkis.get(i).getName(), num);
            }
        }
        return map;
    }
}
