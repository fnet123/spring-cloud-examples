package me.hebaceous.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
public class Zuul {

    public static void main(String[] args) {
        SpringApplication.run(Zuul.class, args);
    }

}
