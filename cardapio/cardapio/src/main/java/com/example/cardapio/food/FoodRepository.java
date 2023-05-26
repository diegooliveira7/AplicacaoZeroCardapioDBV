package com.example.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {//Com isso eu n vou precisar fazer mais nada, ele vai herdar tds as funcionalidades para acessar o banco

}
