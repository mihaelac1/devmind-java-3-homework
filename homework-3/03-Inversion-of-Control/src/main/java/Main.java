import com.devmind.springapp.abs.IAnimal;
import com.devmind.springapp.impl.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve a list with all the beans of IAnimal type defined in the configuration file
        Map<String, IAnimal> beans = context.getBeansOfType(IAnimal.class);
        IAnimal animal;
        for (Map.Entry<String, IAnimal> entry : beans.entrySet()) {
            System.out.println("\nBean name: " + entry.getKey());
            // retrieve bean
            animal = context.getBean(entry.getKey(), IAnimal.class);
            // call methods on the bean
            System.out.println(animal.makeSound());

            //if is an instance of a Cat get also the name
            if (animal instanceof Cat) {
                System.out.println((((Cat) animal).getAnimalName()));
            }
        }

        // close the context
        context.close();
    }
}
