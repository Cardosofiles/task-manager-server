package br.com.cardosofiles.task_manager_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for the task manager server
 * 
 * @author Cardoso Files
 * @version 1.0.0
 * @since 1.0.0
 * @see TaskManagerServerApplication
 */

@SpringBootApplication
public class TaskManagerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerServerApplication.class, args);
	}

}
