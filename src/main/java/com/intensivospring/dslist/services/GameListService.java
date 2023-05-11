package com.intensivospring.dslist.services;

import com.intensivospring.dslist.dto.GameListDto;
import com.intensivospring.dslist.dto.GameMinDTO;
import com.intensivospring.dslist.entities.GameList;
import com.intensivospring.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDto> dto = result.stream().map(x -> new GameListDto(x)).toList();
        return dto;
    }


}
