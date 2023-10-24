package ru.practicum.item;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {
    private ItemServiceImpl itemService;

    @GetMapping
    public List<Item> get(@RequestHeader("X-Later-User-Id") long userId) {
        return itemService.getItem(userId);
    }

    @PostMapping
    public Item add(@RequestHeader("X-Later-User-Id") long userId, @PathVariable Item item) {
        return itemService.add(userId, item);
    }

    @DeleteMapping
    public void deleteItem(@RequestHeader("X-Later-User-Id") long userId, @PathVariable long itemId) {
        itemService.deleteItem(userId, itemId);
    }
}
