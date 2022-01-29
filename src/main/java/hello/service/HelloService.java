package hello.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Map;

@Validated
@Controller("/hello")
public class HelloService {
    @Get()
    public Map<String,Object> getGreeting() throws UnknownHostException {
        return Map.of("hostname", InetAddress.getLocalHost().getHostName(),
                "greeting", "Hello",
                "from", System.getProperty("user.name", "hello world"),
                "date", new Date());
    }
}
