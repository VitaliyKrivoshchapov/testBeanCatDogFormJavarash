package learn.ru.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Cat {
    public String name = "Эдуард";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat {" +
                " name = '" + name + '\'' +
                '}';
    }
}
