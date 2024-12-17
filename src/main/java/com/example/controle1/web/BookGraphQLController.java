package com.example.controle1.web;

import com.example.controle1.dto.BookDTO;
import com.example.controle1.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
@AllArgsConstructor
public class BookGraphQLController {
    private BookService bookService ;

    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO book){
        return bookService.saveBook(book);
    }




    @QueryMapping
    public List<BookDTO> getBookByTitre(@Argument String titre){
        return bookService.getBookByTitle(titre);
    }


}
