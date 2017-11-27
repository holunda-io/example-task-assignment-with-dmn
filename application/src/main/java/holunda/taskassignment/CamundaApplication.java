package holunda.taskassignment;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application staring camunda + webapp.
 */
@SpringBootApplication
@EnableProcessApplication
public class CamundaApplication {

  public static void main(String[] args) {
    SpringApplication.run(CamundaApplication.class, args);
  }

}
