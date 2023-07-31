package com.werewolf.werewolf_backend.repository;

import com.werewolf.werewolf_backend.entity.Charactor;
import com.werewolf.werewolf_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharactorRepository extends JpaRepository<Charactor,Long> {
    Charactor findByName(String name);

    @Query("select u from Charactor u")
    List<Charactor> getCharactors();
}
