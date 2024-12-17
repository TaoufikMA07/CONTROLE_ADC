package com.example.controle1.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BookDTO {
    private String titre;
    private String publisher;
    private Date datePublication;
    private double price;
    private String resume;

}
