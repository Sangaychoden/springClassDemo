package bt.edu.gcit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import bt.edu.gcit.Desktop;
import bt.edu.gcit.Laptop;
import bt.edu.gcit.Alien;
import bt.edu.gcit.Computer;

@Configuration
@ComponentScan("bt.edu.gcit")
public class AppConfig {

    // @Bean(name = "comp1")
    // // @Scope("prototype")
    // public Desktop desktop(){
    //     return new Desktop();
    // }
    // @Bean
    // @Primary
    // public Laptop laptop(){
    //     return new Laptop();
    // }

    // @Bean
    // public Alien alien(@Autowired Computer comp){
    //     // return new Alien();
    //     Alien obj = new Alien();
    //     obj.setComp(comp);
    //     return obj;
    // }
}
