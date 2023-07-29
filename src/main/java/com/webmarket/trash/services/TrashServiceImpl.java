package com.webmarket.trash.services;

import com.webmarket.trash.interfaces.TrashService;
import com.webmarket.trash.repositories.Item;
import com.webmarket.trash.repositories.ItemsRepository;
import com.webmarket.trash.repositories.TrashRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

@Service
public class TrashServiceImpl implements TrashService {
    private final TrashRepository trashRepository;
    private final ItemsRepository itemsRepository;

    public TrashServiceImpl(TrashRepository trashRepository, ItemsRepository itemsRepository) {
        this.trashRepository = trashRepository;
        this.itemsRepository = itemsRepository;
    }

    @Override
    public void add(ArrayList<Integer> ID) {
        for (Integer integer : ID) trashRepository.setTrash(integer);
    }

    @Override
    public String getDescriprion() {
        StringBuilder result = new StringBuilder("Список товаров добавленных в корзину:\n");
        Map<Integer, Integer> trash = trashRepository.getTrash();
        Map<Integer, Item> db = itemsRepository.getDatabase();
        Set<Integer> keys = trash.keySet();
        keys.forEach(id -> {
            result.append(db.get(id).getName()).append(" в количестве ").append(trash.get(id)).append(" шт.\n");
            result.append("Категория: ").append(db.get(id).getCategory()).append("\n");
            result.append("Описание товара: ").append(db.get(id).getDescription());
            result.append("*******************************************************************************\n");
        });
        return result.toString();
    }

    public Map<Integer, Integer> get() {
        return trashRepository.getTrash();
    }

    public void clear() {
        trashRepository.clearTrash();
    }
}
