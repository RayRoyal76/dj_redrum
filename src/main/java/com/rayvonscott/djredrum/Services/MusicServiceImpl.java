package com.rayvonscott.djredrum.Services;

import com.rayvonscott.djredrum.Models.Music;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MusicServiceImpl implements MusicService{

//  injects api_key from secrets.properties
    @Value("${API_KEY}")
    String api_key;



    @Override
    public Music getMusic(String search) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://www.googleapis.com/youtube/v3/search?part=snippet&channelId=UC2pmfLm7iq6Ov1UwYrWYkZA&maxResults=100&q=" + search + "&type=video&videoEmbeddable=true&key=" + api_key, Music.class);
    }


    }

