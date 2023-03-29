import org.example.Classe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Jogador jogador = new Jogador(1, "Pedro Original", new Classe("Paladino", "duas-maos", "corpo-corpo-magico"), "7");

        Jogador jogadorClone = jogador.clone();
        jogadorClone.setId(2);
        jogadorClone.setNome("Pedro Clonado");
        jogadorClone.getClasse().setTipoArma("martelo-uma-mao&escudo");
        jogadorClone.setNivel("8");

        assertEquals("Jogador{id=1, nome='Pedro Original', classe=Classe{nomeClasse='Paladino', tipoArma=duas-maos, tipoClasse=corpo-corpo-magico}, nivel='7'}", jogador.toString());
        assertEquals("Jogador{id=2, nome='Pedro Clonado', classe=Classe{nomeClasse='Paladino', tipoArma=martelo-uma-mao&escudo, tipoClasse=corpo-corpo-magico}, nivel='8'}", jogadorClone.toString());
    }
}