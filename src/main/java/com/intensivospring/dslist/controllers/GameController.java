package com.intensivospring.dslist.controllers;

import com.intensivospring.dslist.dto.GameDto;
import com.intensivospring.dslist.dto.GameMinDTO;
import com.intensivospring.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id){
        GameDto result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO>findall(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
