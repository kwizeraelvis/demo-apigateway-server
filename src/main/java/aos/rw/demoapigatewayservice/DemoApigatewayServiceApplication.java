package aos.rw.demoapigatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoApigatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApigatewayServiceApplication.class, args);
    }

}
