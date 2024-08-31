package desadio.target.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/countA")
    public String countAInString(@RequestParam String input) {
        int count = countLetterA(input);
        return "A letra 'a' ocorre " + count + " vezes na string.";
    }
    private int countLetterA(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }
}