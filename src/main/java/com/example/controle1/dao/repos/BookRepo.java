package com.example.controle1.dao.repos;

import com.example.controle1.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
    public List<Book> findByTitle(String titre);
}
