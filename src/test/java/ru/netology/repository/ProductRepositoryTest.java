package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Book coreJava = new Book();
    Product first = new Book(1, "Фиеста", 1000, "Хемингуэй");
    Product second = new Book(2, "Три товарища", 1100, "А.Хемингуэй");

    @Test
    public void shouldSaveOneItem() {
        repository.save(coreJava);

        Product[] expected = new Product[]{coreJava};
        Product[] actual = repository.getAll();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldRemoveIfExists() {
        int idToRemove=2;
        repository.removeById(idToRemove);

        Product[] expected = new Product[] {first};
        Product[] actual = repository.getAll();

        assertEquals(expected, actual);


    }


}
