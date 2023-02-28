package io.github.SilenceShine.example.webclient;

import io.github.SilenceShine.httpinterface.webclient.EnableWebclientHttpExchanges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import reactor.core.publisher.Mono;

/**
 * @author SilenceShine
 * @since 1.0
 */
@RestController
@SpringBootApplication
@EnableWebclientHttpExchanges
public class ExampleWebclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleWebclientApplication.class, args);
    }

    @Autowired
    private TestClient testClient;

    @GetMapping("/single")
    public Mono<ResponseEntity<Object>> single() {
        return testClient.single();
    }

    @HttpExchange("http://basic-id")
    public interface TestClient {

        @GetExchange("/uid/single")
        Mono<ResponseEntity<Object>> single();

    }

}
