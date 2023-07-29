package com.webmarket.trash.controllers;

import com.webmarket.trash.services.TrashServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class TrashController {
    private final TrashServiceImpl trashServiceImpl;

    public TrashController(TrashServiceImpl trashServiceImpl) {
        this.trashServiceImpl = trashServiceImpl;
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam(name = "ID") ArrayList<Integer> ID) {
        trashServiceImpl.add(ID);
    }

    @GetMapping(path = "/description")
    public String description() {
        return trashServiceImpl.getDescriprion();
    }

    @GetMapping(path = "/get")
    public Map<Integer, Integer> get() {
        return trashServiceImpl.get();
    }

    @GetMapping(path = "/clear")
    public void clear() {
        trashServiceImpl.clear();
    }
}
