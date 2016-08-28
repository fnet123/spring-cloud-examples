package me.hebaceous.cloud.gateway.client;

import me.hebaceous.cloud.api.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "${service.user}", path = "/users")
public interface UserClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> all();

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    User user(@PathVariable("userId") Long userId);

}