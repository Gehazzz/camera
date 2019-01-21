package com.example.camera.service;

import com.example.camera.model.Photo;
import com.example.camera.util.Photos;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

@Service
public class CameraServiceImpl implements CameraService {
    @Autowired
    private RestTemplate restTemplate;

    private long sleep = 0L;

    @Override
    @SneakyThrows
    @Scheduled(fixedDelay = 1L)
    public void takePhoto() {
        Instant start = Instant.now();
        Thread.sleep(sleep);
        Photo photo = new Photo();
        photo.setPhoto(getPhoto());
        postPhoto(photo);
        Instant end = Instant.now();
        System.out.println("SLEEP: " + sleep + "ms");
        System.out.println(Duration.between(start, end));
    }

    @Override
    public void adjust(long ms) {
        sleep = ((sleep + ms) < 0) ? 0 : (sleep + ms);
    }

    private void postPhoto(Photo photo){
        restTemplate.postForObject(
                "http://localhost:8080/photo/process",
                photo,
                ResponseEntity.class);
    }

    private String getPhoto(){
        Random random = new Random();
        return Photos.photos.get(random.nextInt(10));
    }
}
