package com.example.krontest.Service;

import com.example.krontest.models.DTOFactory;
import com.example.krontest.models.Detail;
import com.example.krontest.repository.DetailRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Task2 {
    @Autowired
    DetailRepository detailRepository;
    public List<DTOFactory> makeDTO(){
        List<Detail> list=detailRepository.findAll();

        Set<String> factories=new HashSet<>();
        List<DTOFactory> dtoFactoryList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
         factories.add(list.get(i).getWorkShop());
        }
        for (String i:factories) {
            DTOFactory dtoFactory=new DTOFactory();
            dtoFactory.setName(i);
            dtoFactory.setMaterial(makeMap(i));
            dtoFactoryList.add(dtoFactory);
        }
        return dtoFactoryList;

    }
    public Map<String, Integer> makeMap(String name){
       List<Detail> details= detailRepository.findDetailByWorkShop(name);
        Map<String, Integer> map=new HashMap<>();
        for (int i = 0; i < details.size(); i++) {
            if(!map.containsKey(details.get(i).getMaterial())){
                map.put(details.get(i).getMaterial(),1);
            }
            else {
              int num=map.get(details.get(i).getMaterial());
              num=num+1;
              map.replace(details.get(i).getMaterial(), num);
            }
        }
        return map;
    }

}
