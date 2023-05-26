package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//Isso daqui está me dizendo que essa classe é um controller da nossa aplicação
@RequestMapping("food")
public class FoodController {

    @Autowired //Eu estou informando que deve fazer a injeção nessa variável
    private FoodRepository repository;

    //@CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping //Quando ele chamar o RequestMapping ele vai chamar esse método aq
    public List<FoodResponseDTO> getAll(){

        //O stream() é um filtro que se lança
        List<FoodResponseDTO> listFood = this.repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return listFood;
    }



}
