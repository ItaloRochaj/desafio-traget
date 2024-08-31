package desadio.target.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {

    @GetMapping("/{numero}")
    public String verificarFibonacci(@PathVariable int numero) {
        if (isFibonacci(numero)) {
            return "O número " + numero + " pertence à sequência de Fibonacci.";
        } else {
            return "O número " + numero + " não pertence à sequência de Fibonacci.";
        }
    }
    private boolean isFibonacci(int numero) {
        int a = 0, b = 1;
        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return numero == b || numero == 0;
    }
}