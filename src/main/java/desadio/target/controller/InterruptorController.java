package desadio.target.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterruptorController {

    @GetMapping("/interruptor")
    public String descobrirInterruptores() {
        // Simulação da lógica para descobrir qual interruptor controla qual lâmpada

        // Passo 1: Ligue o primeiro interruptor e espere alguns minutos
        boolean interruptor1 = true;
        // Simula o tempo esperado (deixe ligado por um tempo)

        // Passo 2: Desligue o primeiro interruptor e ligue o segundo
        interruptor1 = false;
        boolean interruptor2 = true;

        // Passo 3: Vá até a sala das lâmpadas e observe
        boolean lampada1Quente = true; // Simulação: a lâmpada 1 estava quente
        boolean lampada2Ligada = true; // Simulação: a lâmpada 2 está ligada
        boolean lampada3Fria = true; // Simulação: a lâmpada 3 está fria

        StringBuilder resultado = new StringBuilder();
        if (lampada2Ligada) {
            resultado.append("O interruptor 2 controla a lâmpada 2.\n");
        }

        if (lampada1Quente) {
            resultado.append("O interruptor 1 controla a lâmpada 1.\n");
        }

        if (lampada3Fria) {
            resultado.append("O interruptor 3 controla a lâmpada 3.\n");
        }

        return resultado.toString();
    }
}