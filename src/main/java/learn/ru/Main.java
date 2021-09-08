package learn.ru;

import learn.ru.model.Cat;
import learn.ru.model.Dog;
import learn.ru.model.Human;
import learn.ru.model.Parrot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext("learn.ru");

      /*  Cat cat = appContext.getBean(Cat.class);
        Dog dog = (Dog)appContext.getBean(Dog.class);
        Parrot parrot = appContext.getBean(Parrot.class);*/
/*
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(parrot);*/

        Human human = appContext.getBean(Human.class);
        human.setName("Ivan");
        Parrot parrot = appContext.getBean(Parrot.class);
        parrot.setName("Kesha");
        System.out.println(human.getCat());
        System.out.println(human.getDod());
        System.out.println(human.getParrot());
        String rez = human.toString();
        System.out.println(rez);

    }
}
