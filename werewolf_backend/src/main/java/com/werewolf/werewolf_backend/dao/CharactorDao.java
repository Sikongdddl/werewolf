package com.werewolf.werewolf_backend.dao;

import com.werewolf.werewolf_backend.entity.Charactor;
import com.werewolf.werewolf_backend.entity.User;

import java.util.List;

public interface CharactorDao {
    Charactor get_charactor_by_name(String name);

    List<Charactor> getCharactors();
}
