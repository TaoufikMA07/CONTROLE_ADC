package com.example.controle1.service;

import com.example.controle1.dao.entities.Book;
import com.example.controle1.dao.repos.BookRepo;
import com.example.controle1.dto.BookDTO;
import com.example.controle1.mapper.BookMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BookManager implements BookService{
private BookRepo bookRepository ;
private BookMapper bookMapper;

@Override
    public BookDTO saveBook(BookDTO bookDto) {
       Book book = bookMapper.fromBookDtoToBook(bookDto);
        book = bookRepository.save(book);
        bookDto = bookMapper.fromBookToBookDto(book);
        return bookDto;


    }
@Override
    public List<BookDTO> getBookByTitle(String title){
    List<Book> books = bookRepository.findByTitle(title);
    List<BookDTO> bookDtos = new ArrayList<>();
    for (Book avion : books) {
        bookDtos.add(bookMapper.fromBookToBookDto(avion));
    }
    return bookDtos;
}
@Override
    public List<BookDTO> saveBooks(List<BookDTO> bookDtos) {

        List<Book> books = new ArrayList<>();
        for (BookDTO avionDto : bookDtos) {
            books.add(bookMapper.fromBookDtoToBook(avionDto));
        }

        books = bookRepository.saveAll(books);

        bookDtos = new ArrayList<>();
        for (Book book : books) {
            bookDtos.add(bookMapper.fromBookToBookDto(book));
        }
        return bookDtos;
    }


}
