import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" entrer le premier nombre:");
        double nombre1 =scanner.nextDouble();
        System.out.println(" entrer le deuxieme nombre:");
        double nombre2 =scanner.nextDouble();
        System.out.println(" entrer une operation (+,-,*,/)");
        scanner.nextLine();
        String op =scanner.nextLine();
        double resultat=0;
        switch (op) {
            case "+":
                resultat=Calculatrice.addition(nombre1, nombre2);
                break;
            case "-":
                resultat=Calculatrice.soustraction(nombre1, nombre2);
                break;
            case "*":
                resultat=Calculatrice.multiplaction(nombre1, nombre2);
                break;
            case "/":
                resultat=Calculatrice.division(nombre1, nombre2);
                break;
            default:
                System.out.println("non valide");
                break;
        }
        System.out.println("le résultat est :"+resultat);
        scanner.close();

    }
}
