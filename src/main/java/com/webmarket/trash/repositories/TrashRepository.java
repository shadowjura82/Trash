package com.webmarket.trash.repositories;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Scope("session")
public class TrashRepository {
    private Map<Integer, Integer> trash;

    public TrashRepository() {
        this.trash = new HashMap<>();
    }

    public void setTrash(Integer ID) {
        if (this.trash.containsKey(ID)) {
            this.trash.put(ID, this.trash.get(ID) + 1);
        } else {
            this.trash.put(ID, 1);
        }
    }

    public Map<Integer, Integer> getTrash() {
        return trash;
    }

    public void clearTrash() {
        this.trash.clear();
    }
}
