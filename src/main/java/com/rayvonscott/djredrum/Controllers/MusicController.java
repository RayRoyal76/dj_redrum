package com.rayvonscott.djredrum.Controllers;


import com.rayvonscott.djredrum.Models.Music;
import com.rayvonscott.djredrum.Services.MusicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MusicController {

    @Autowired
    MusicServiceImpl musicServiceImpl;

    @GetMapping("/music/{search}")
    public Music getMusic(@PathVariable String search) {
        System.out.println("search"+search);
        return musicServiceImpl.getMusic(search);

    }
}
