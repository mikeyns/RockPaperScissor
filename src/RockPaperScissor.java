import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        // Definindo as opções do jogo
        String[] options = {"pedra", "papel", "tesoura"};
        
        // Criando um objeto para gerar números aleatórios
        Random random = new Random();
        
        // Definindo o número de vezes que queremos repetir o jogo
        int numberOfGames = 10;
        
        // Repetindo o jogo várias vezes
        for (int i = 0; i < numberOfGames; i++) {
            // Gerando um número aleatório no intervalo [0, 2]
            int randomNumber = random.nextInt(3);
            
            // Exibindo a escolha do computador
            System.out.println("Escolha do jogador: " + options[randomNumber]);
        }
    }
}
