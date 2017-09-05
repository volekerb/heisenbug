package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnlimitedController {
    @GetMapping("/unlimited")
    public String unlimited() {
        while (true) {
            //we dont' need an answer - we just want to know the error
            //todo(vbrekelov): rewrite to wait exactly 61 seconds
        }
    }
}
