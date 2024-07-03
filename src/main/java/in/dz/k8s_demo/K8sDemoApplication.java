package in.dz.k8s_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class K8sDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sDemoApplication.class, args);
	}

	@GetMapping("")
	public ResponseEntity<String> testBase()
	{
		return ResponseEntity.ok("Successful");
	}

}
