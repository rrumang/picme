package org.rrumang.markm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MarkmApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarkmApplication.class, args);
    }

}
