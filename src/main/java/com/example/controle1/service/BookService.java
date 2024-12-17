package com.example.controle1.service;

import com.example.controle1.dto.BookDTO;

import java.util.List;

public interface BookService  {
    public BookDTO saveBook(BookDTO bookDto);
    public List<BookDTO> getBookByTitle(String title);
    public List<BookDTO> saveBooks(List<BookDTO> bookDtos);
}
