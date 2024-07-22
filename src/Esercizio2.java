
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        String cognome = scanner.nextLine();
        String nikName = scanner.nextLine();
        System.out.println("Ciao " + nome + " " + cognome + ", " + "Nikname: " + nikName);
        scanner.close();
    }



}
