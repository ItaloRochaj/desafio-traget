package desadio.target.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomaController {

    @GetMapping("/soma")
    public String calcularSoma(){
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        return "O valor final de SOMA é: " + SOMA; // Valor esperado: 78
    }
}