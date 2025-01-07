package com.guilherme.courses_spring;

import com.guilherme.courses_spring.model.Course;
import com.guilherme.courses_spring.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoursesSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course course = new Course();
			course.setName("Java");
			course.setCategory("Back-end");
			courseRepository.save(course);
		};
	}

}
