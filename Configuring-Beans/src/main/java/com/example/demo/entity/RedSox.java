package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class RedSox implements Team {
	
    @Override
    public String getName() {
        return "Boston red sox";
    }
}
