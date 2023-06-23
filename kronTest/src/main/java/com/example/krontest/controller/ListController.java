package com.example.krontest.controller;

import com.example.krontest.Service.ModelsListService;
import com.example.krontest.Service.Task2;
import com.example.krontest.Service.Task3;
import com.example.krontest.models.DTOFactory;
import com.example.krontest.models.DTOManuf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class ListController {
    @Autowired
    ModelsListService modelsListService;
    @Autowired
    Task2 task2;
    @Autowired
    Task3 task3;
    @GetMapping("/test")
    public void getLists(Model model) throws IOException {
        modelsListService.getBuildsList();
        modelsListService.getDetailsList();
        modelsListService.getPKIList();
        modelsListService.writeBuildsList();
        modelsListService.writePKIList();
        modelsListService.writeDetailsList();
    }
    @GetMapping("/test2")
    public List<DTOFactory> getRes(){
       List<DTOFactory>list=task2.makeDTO();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.toString());
        }
       return list;
    }
    @GetMapping("/test3")
    public List<DTOManuf> getRes2(){
        List<DTOManuf>list=task3.makeDTO();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.toString());
        }
        return list;
    }
}
