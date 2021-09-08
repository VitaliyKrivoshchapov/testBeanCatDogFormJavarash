package learn.ru.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    public String name = "Санта";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog {" +
                " name = '" + name + '\'' +
                '}';
    }

}
