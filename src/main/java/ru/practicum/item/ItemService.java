package ru.practicum.item;

import java.util.List;

public interface ItemService {
    List<Item> getItem(Long userId);

    Item add(long userId, long itemId);

    void deleteItem(long userId, long itemId);
}
