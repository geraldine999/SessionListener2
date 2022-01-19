package com.example.sessionlistener2;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.security.web.session.HttpSessionCreatedEvent;
import org.springframework.security.web.session.HttpSessionDestroyedEvent;

@Configuration
public class MySessionListener {

    @Bean
    public ApplicationListener<HttpSessionCreatedEvent> listener() {
        return new ApplicationListener<HttpSessionCreatedEvent>() {

            @Override
            public void onApplicationEvent(HttpSessionCreatedEvent httpSessionCreatedEvent) {
                System.out.println("SESSION "+httpSessionCreatedEvent.getSession().getId()+" CREATED");
            }

        };
    }

    @Bean
    public ApplicationListener<HttpSessionDestroyedEvent> listener2() {
        return new ApplicationListener<HttpSessionDestroyedEvent>() {

            @Override
            public void onApplicationEvent(HttpSessionDestroyedEvent httpSessionDestroyedEvent) {
                System.out.println("SESSION "+httpSessionDestroyedEvent.getSession().getId()+" DESTROYED");
            }

        };
    }

    @EventListener
    public void listenForHttpSessionCreatedEvent(HttpSessionCreatedEvent e) {
        System.out.println("Another way to listen to the creation of a session");
    }





}
