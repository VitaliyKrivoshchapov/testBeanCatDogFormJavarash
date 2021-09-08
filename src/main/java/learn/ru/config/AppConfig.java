package learn.ru.config;

import learn.ru.model.Cat;
import learn.ru.model.Dog;
import learn.ru.model.Human;
import learn.ru.model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("config.AppConfig")
@ComponentScan("learn.ru")
public class AppConfig {
   /* @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + " - killer");
        return cat;
    }
    @Bean
    public Dog getDog(){
        return new Dog();
    }*/

    @Bean
    public Parrot parrot(){
        return new Parrot();
    }
    @Bean
    public Human human(Parrot parrot){
        Human human = new Human();
        parrot().setName("Kesha");    parrot().toString();
        return human;
    }


}
