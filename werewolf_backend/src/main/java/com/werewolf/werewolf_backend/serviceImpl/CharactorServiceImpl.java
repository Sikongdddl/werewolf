package com.werewolf.werewolf_backend.serviceImpl;

import com.werewolf.werewolf_backend.dao.CharactorDao;
import com.werewolf.werewolf_backend.entity.Charactor;
import com.werewolf.werewolf_backend.service.CharactorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CharactorServiceImpl implements CharactorService {
    @Resource
    private CharactorDao charactorDao;

    @Override
    public List<Charactor> getCharactors(){
        return charactorDao.getCharactors();
    }
}
