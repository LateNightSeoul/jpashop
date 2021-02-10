package jpashop.jpashop.service;

import jpashop.jpashop.domain.item.Book;
import jpashop.jpashop.domain.item.Item;
import jpashop.jpashop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    @Transactional
    public void updateBook(Long itemId, String name, int price, int stockQuantity, String author, String isbn) {
        Book findItem = itemRepository.findOneBook(itemId);
        findItem.setPrice(price);
        findItem.setName(name);
        findItem.setStockQuantity(stockQuantity);
        findItem.setId(itemId);
        findItem.setIsbn(isbn);
        findItem.setAuthor(author);
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    public Item findOne(Long itemId) {
        return itemRepository.findOne(itemId);
    }
}

