package com.werewolf.werewolf_backend.controller;

import com.werewolf.werewolf_backend.entity.Charactor;
import com.werewolf.werewolf_backend.service.CharactorService;
import com.werewolf.werewolf_backend.utils.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/charactor")
class CharactorController {
    @Resource
    private CharactorService charactorService;

    @PostMapping("/getCharactors")
    public Result<List<Charactor>> getCharactorsController(){
        return Result.success(charactorService.getCharactors(),"Get all Charactors Successfully");
    }
}
