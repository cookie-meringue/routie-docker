package routie.business;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTestController {

    @GetMapping("/docker-test")
    public String dockerTest() {
        return "Docker is working!";
    }
}
