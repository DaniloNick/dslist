package com.intensivospring.dslist.repositories;

import com.intensivospring.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long> {

}
