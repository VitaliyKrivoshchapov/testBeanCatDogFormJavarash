package learn.ru.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component()
public class Parrot {
    public  String name ="Kesha";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot {" +
                " name = '" + name + '\'' +
                '}';
    }
}
