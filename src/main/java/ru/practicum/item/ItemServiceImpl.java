package ru.practicum.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository repository;

    @Autowired
    public ItemServiceImpl(ItemRepository repository) {
        this.repository = repository;
    }

    public List<Item> getItem(Long userId) {
        return repository.findByUserId(userId);
    }

    public Item add(long userId, Item item) {
        item.setUserId(userId);
        return repository.save(item);
    }

    public void deleteItem(long userId, long itemId) {
        repository.deleteByUserIdAndItemId(userId, itemId);
    }
}
