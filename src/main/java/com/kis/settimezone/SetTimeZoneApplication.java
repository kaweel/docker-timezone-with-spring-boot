package com.kis.settimezone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class SetTimeZoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SetTimeZoneApplication.class, args);
    }

    @GetMapping("/")
    public @ResponseBody
    String getTimeZone() {
        Date date = new Date();
        return date.toString() + "\n\r";
    }

}
