package com.werewolf.werewolf_backend.daoImpl;

import com.werewolf.werewolf_backend.dao.CharactorDao;
import com.werewolf.werewolf_backend.entity.Charactor;
import com.werewolf.werewolf_backend.repository.CharactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CharactorDaoImpl implements CharactorDao {
    @Autowired
    private CharactorRepository charactorRepository;

    @Override
    public Charactor get_charactor_by_name(String name){
        return charactorRepository.findByName(name);
    }

    @Override
    public List<Charactor> getCharactors(){
        return charactorRepository.getCharactors();
    }



}
