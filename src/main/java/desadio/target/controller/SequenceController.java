package desadio.target.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sequence")
public class SequenceController {
    @GetMapping("/a")
    public String sequenceA() {
        return "Próximo número da sequência (a): " + (7 + 2); // 9
    }

    @GetMapping("/b")
    public String sequenceB() {
        return "Próximo número da sequência (b): " + (64 * 2); // 128
    }

    @GetMapping("/c")
    public String sequenceC() {
        return "Próximo número da sequência (c): " + ((int) Math.pow(7, 2)); // 49
    }

    @GetMapping("/d")
    public String sequenceD() {
        return "Próximo número da sequência (d): " + ((int) Math.pow(10, 2)); // 100
    }

    @GetMapping("/e")
    public String sequenceE() {
        return "Próximo número da sequência (e): " + (5 + 8); // 13
    }

    @GetMapping("/f")
    public String sequenceF() {
        return "Próximo número da sequência (f): " + 200; // 200
    }
}