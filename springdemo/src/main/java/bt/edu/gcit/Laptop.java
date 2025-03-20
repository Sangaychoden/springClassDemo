package bt.edu.gcit;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop obj created");
    }
    public void compile() {
        System.out.println("compiling from the laptop class....");
    }
    
}