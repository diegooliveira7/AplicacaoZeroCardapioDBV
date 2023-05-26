package com.example.cardapio.food;

public record FoodRequestDTO(String title, String image, Integer price, String type) {//Como é um record nem precisa declarar essas variáveis
}
