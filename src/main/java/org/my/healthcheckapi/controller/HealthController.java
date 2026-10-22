package org.my.healthcheckapi.controller;

import org.my.healthcheckapi.dto.LiveResponse;
import org.my.healthcheckapi.dto.ReadyResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/healthz")
public class HealthController {

    @GetMapping("/live")
    public ResponseEntity<LiveResponse> getLive(){
        return ResponseEntity.ok(new LiveResponse("alive", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssxxx").format(ZonedDateTime.now())));
    }

    @GetMapping("/ready")
    public ResponseEntity<ReadyResponse> getReady(){
        return ResponseEntity.ok(new ReadyResponse("ready", "not_connected_yet", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssxxx").format(ZonedDateTime.now())));
    }

}
