package com.example.controle1.mapper;

import com.example.controle1.dao.entities.Book;
import com.example.controle1.dto.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Book fromBookDtoToBook(BookDTO bookDto){
        return mapper.map(bookDto, Book.class);
    }

    public BookDTO fromBookToBookDto(Book b){
        return mapper.map(b, BookDTO.class);
    }
}
