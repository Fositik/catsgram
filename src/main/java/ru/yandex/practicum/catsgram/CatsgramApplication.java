package ru.yandex.practicum.catsgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; //показывает фреймворку Spring Boot, что это основной класс с конфигурацией приложения.

@SpringBootApplication
public class CatsgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatsgramApplication.class, args);
	}

}
