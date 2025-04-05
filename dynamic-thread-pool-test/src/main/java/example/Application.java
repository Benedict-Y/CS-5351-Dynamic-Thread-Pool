package example;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@Configurable
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public ApplicationRunner applicationRunner(ExecutorService threadPoolExecutor01) {
        return args -> {
            while (true) {
                // Create a random number generator
                Random random = new Random();

                // Random delay to simulate task startup latency
                int initialDelay = random.nextInt(10) + 1; // between 1 and 10 seconds

                // Random sleep time to simulate task execution duration
                int sleepTime = random.nextInt(10) + 1; // between 1 and 10 seconds

                // Submit a task to the thread pool
                threadPoolExecutor01.submit(() -> {
                    try {
                        // Simulate task startup delay
                        TimeUnit.SECONDS.sleep(initialDelay);
                        System.out.println("Task started after " + initialDelay + " seconds.");

                        // Simulate task execution
                        TimeUnit.SECONDS.sleep(sleepTime);
                        System.out.println("Task executed for " + sleepTime + " seconds.");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });

                // Wait randomly before submitting the next task
                Thread.sleep(random.nextInt(50) + 1);
            }
        };
    }
}

