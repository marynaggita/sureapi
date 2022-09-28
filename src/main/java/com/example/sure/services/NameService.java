package com.example.sure.services;

import com.example.sure.models.nameRequest;
import org.springframework.stereotype.Service;

@Service
public class NameService {

    public nameRequest person() {
        System.out.println("id"+ person().getId());
        System.out.println("name" + person().getName());
        System.out.println("age" + person().getAge());
        return person();
    }



}
