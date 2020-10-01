package br.com.todo;

import br.com.todo.entity.Category;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
		System.out.println("Hello Word");
		Category category = new Category();
		category.setName("filmes");
		System.out.println(category.getName());

		Category category2 = new Category();
		category2.setName("Novelas");
		System.out.println(category2.getName());

	}

}
