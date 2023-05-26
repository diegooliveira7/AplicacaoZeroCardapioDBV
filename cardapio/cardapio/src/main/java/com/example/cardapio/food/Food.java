package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "foods")
@Entity(name = "foods")
@Data //Agora tds os atributos tem get e set
public class Food {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;

    private String type;



}
