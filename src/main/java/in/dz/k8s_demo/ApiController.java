package in.dz.k8s_demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/k8s")
public class ApiController {
    @GetMapping("/aks")
    public ResponseEntity<String> testAks()
    {
        return ResponseEntity.ok("Welcome to Azure AKS demo");
    }

    @GetMapping("/eks")
    public ResponseEntity<String> testEks()
    {
        return ResponseEntity.ok("Welcome to AWS EKS demo");
    }
}
