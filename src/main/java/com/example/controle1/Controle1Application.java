package com.example.controle1;

import com.example.controle1.dto.BookDTO;
import com.example.controle1.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Controle1Application {

    public static void main(String[] args) {
        SpringApplication.run(Controle1Application.class, args);
    }
    @Bean
    CommandLineRunner start(BookService bookService){
        return args -> {
            bookService.saveBooks(
                    BookDTO.builder().titre("PeterPan").publisher("SantaMonice").datePublication().price(150000).resume("").build(),
                    BookDTO.builder().titre("TomSawyer").publisher("SantaMonice").datePublication("11/09/1991").price(150000).resume("").build()

            );
        };
    }
}
}
