package com.intensivospring.dslist.repositories;

import com.intensivospring.dslist.entities.Game;
import com.intensivospring.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository <GameList, Long> {

}
