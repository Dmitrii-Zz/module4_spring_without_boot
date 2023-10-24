package ru.practicum.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    private final HashMap<Long, List<Item>> items = new HashMap<>();
    private long id = 0;
    @Override
    public List<Item> findByUserId(long userId) {
        return items.getOrDefault(userId, new ArrayList<>());
    }

    @Override
    public Item save(Item item) {
        item.setId(id++);
        List<Item> itemsUser = items.getOrDefault(item.getUserId(), new ArrayList<>());
        itemsUser.add(item);
        items.put(item.getId(), itemsUser);
        return item;
    }

    @Override
    public void deleteByUserIdAndItemId(long userId, long itemId) {
        List<Item> itemsUser = items.get(userId);
        for (Item item : itemsUser) {
            if (item.getId() == itemId) {
                itemsUser.remove(item);
            }
            break;
        }
    }
}
