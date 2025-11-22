// Crie um projeto separado para testar se seu JAR funciona
// 1. Adicione seu JAR como dependência
// 2. Teste se consegue importar e usar sua classe:
import br.edu.icev.aed.forense.AnaliseForenseAvancada;
import br.edu.icev.ead.forense.MinhaAnaliseForense;


import java.util.Set;

public class TesteValidacao {
    public static void main(String[] args) throws Exception {
        // Simula o que o validador fará
        AnaliseForenseAvancada impl = new MinhaAnaliseForense();
        
        Set<String> invalidas = impl.encontrarSessoesInvalidas("test_sessoes_invalidas.csv");
        System.out.println("Funciona! Encontradas: " + invalidas.size() + " sessões inválidas");
        System.out.println("===============");
        for (String i : invalidas) {
            System.out.println(i);
        }
    }
}
