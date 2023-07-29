package com.webmarket.trash.interfaces;

import com.webmarket.trash.repositories.TrashRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Map;

public interface TrashService {

    void add(ArrayList<Integer> ID);

    String getDescriprion();

    Map<Integer, Integer> get();
}
