package org.coursera.crud.service;

import org.coursera.crud.model.Book;
import org.coursera.crud.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void saveBook(Book book) {
        this.bookRepository.save(book);
    }

    @Override
    public Book getBookById(long id) {
        Optional<Book> optional = bookRepository.findById(id);
        Book book = null;
        if(optional.isPresent()){
            book = optional.get();
        }
        else {
            throw new RuntimeException("Book not found with id: " + id);
        }
        return  book;
    }

    @Override
    public void deleteBookById(long id) {
        this.bookRepository.deleteById(id);
    }
}
