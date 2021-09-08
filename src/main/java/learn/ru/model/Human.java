package learn.ru.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
    private String name;

    @Autowired
    private Cat cat;
    @Autowired
    private Dog dod;
    //@Autowired
    private Parrot parrot;

 /*   @Autowired
    public Human(Parrot parrot) {
        System.out.println("Работает конструктор");
        this.parrot = parrot;
    }*/

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Cat getCat() {
        return cat;
    }
    public Dog getDod() {
        return dod;
    }
    public Parrot getParrot() {
        return parrot;
    }

    @Override
    public String toString() {
        return "Human has {" +
                "name='" + name + '\'' +
                ", cat=" + cat.getName() +
                ", dod=" + dod.getName() +
                ", " +"parrot=" + parrot.getName()+'}';
    }
}
