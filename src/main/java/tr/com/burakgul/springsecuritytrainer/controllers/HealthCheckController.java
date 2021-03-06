package tr.com.burakgul.springsecuritytrainer.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Burak GUL
 */
@RestController
@RequestMapping("/healthCheck")
public class HealthCheckController {

    /**
     * Bu controller'ı uygulamanın requestlere sorunsuz cevap verip vermediğini test etmek için kullanabiliriz.
     * Authenticate olmadan /healthCheck 'e gelen isteklere unauthorized şeklinde response dönülecektir.
     * Öncelikli olarak /auth/login yolu ile authenticate olunması gerekmektedir.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("OK");
    }
}
