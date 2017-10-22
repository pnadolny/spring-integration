package com.transplace.tracking;

import org.springframework.stereotype.Service;

@Service
public class MacroService {

    public void sayHello(String name) {

        System.out.println("################################");
        System.out.println("################################");
        System.out.println("################################");
        System.out.println("##  Hello " + name + "!!!" );
        System.out.println("################################");
        System.out.println("################################");
        System.out.println("################################");

    }

}
