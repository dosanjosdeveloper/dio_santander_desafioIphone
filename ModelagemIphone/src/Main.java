import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);
        String opcao;

        System.out.println("1 - Internet\n" +
                "2 - Musicas\n" +
                "3 - Telefone");

        opcao = scanner.next();

        switch (opcao){
            case "1":
                System.out.println("Aessar Internet");
                break;
            case "2":
                System.out.println("Ouvir Musica");
                break;
            case "3":
                System.out.println("Usar Telefone");
                break;
            default:
                System.out.println("Nada a fazer!");
                break;
        }
    }
}