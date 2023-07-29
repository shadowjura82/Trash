package com.webmarket.trash.repositories;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
// Эмуляция базы данных товаров
@Repository
@Scope("session")
public class ItemsRepository {
    private final Map<Integer,Item> database = new HashMap<>();

    public ItemsRepository() {
        this.database.put(10, new Item("планшет", "электроника", "Самый популярный планшет"));
        this.database.put(20, new Item("телефон", "электроника", "Самый лучший телефон"));
        this.database.put(30, new Item("миксер", "бытовая техника", "Мощный миксер"));
        this.database.put(40, new Item("кофеварка", "бытовая техника", "Элитная кофеварка"));
        this.database.put(50, new Item("Стол", "мебель", "Журнальный стол из дерева"));
        this.database.put(60, new Item("Стул", "мебель", "Кухонный металлический стул"));
        this.database.put(70, new Item("удочка", "рыбалка и отдых", "Спининг 3.5 метров длинной"));
        this.database.put(80, new Item("комплект коючков", "рыбалка и отдых", "Комплект крючков для разного вида рыб"));
        this.database.put(90, new Item("палатка", "туризм", "Двухместная палатка с водоотталкивающим покрытием"));
        this.database.put(100, new Item("фонарик", "туризм", "Многофункциональный фонарик"));
    }

    public Map<Integer, Item> getDatabase() {
        return database;
    }
}
