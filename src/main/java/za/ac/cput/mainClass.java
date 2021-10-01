package za.ac.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class mainClass {

    public static void main(String[] args) {
        SpringApplication.run(mainClass.class,args);

    }
}