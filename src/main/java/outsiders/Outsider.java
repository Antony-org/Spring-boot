package outsiders;

import org.springframework.stereotype.Component;

@Component
public class Outsider {
    public Outsider() {
        System.out.println("outsider bean");
    }
}
