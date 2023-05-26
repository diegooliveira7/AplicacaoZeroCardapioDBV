package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "foods")
@Entity(name = "foods")
@Data //Agora tds os atributos tem get e set
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
    private String type;

    public Food(FoodRequestDTO dado) {
        this.title = dado.title();
        this.image = dado.image();
        this.price = dado.price();
        this.type = dado.type();
    }

}
