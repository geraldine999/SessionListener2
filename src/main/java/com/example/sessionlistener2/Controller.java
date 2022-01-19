package com.example.sessionlistener2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class Controller {

    @GetMapping("get-my-session-id")
    public String getMySessionId(HttpSession httpSession){
        return httpSession.getId();
    }
}
