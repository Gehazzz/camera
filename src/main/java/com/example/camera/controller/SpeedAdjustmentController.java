package com.example.camera.controller;

import com.example.camera.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class SpeedAdjustmentController {

    @Autowired
    private CameraService cameraService;

    @PostMapping("/adjust-speed")
    @ResponseStatus(value = HttpStatus.OK)
    public void adjustSpeed(@RequestBody long ms) {
        cameraService.adjust(ms);
    }
}
