import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ØVING 4 OPPGAVE 1: VALUTAVEKSLER");
        Valuta[] valutaList = createValuta();

        int userInput;
        do {
            userInput = getUserInput(valutaList);
            if (userInput < 0 || userInput > valutaList.length + 1) {
                System.out.println("Invalid input \n");
            } else if (userInput <= valutaList.length) {
                exchange(valutaList, userInput);
            }

        } while (userInput != valutaList.length + 1);

        System.out.println("Avslutter programmet");
    }

    public static void exchange(Valuta[] list, int i) {
        System.out.println("Hvor mange " + list[i - 1].getName() + " til NOK?");
        double belop = (new Scanner(System.in)).nextDouble();
        double result = list[i - 1].veksling(belop);
        System.out.println(belop + " " + list[i - 1].getName() + " = " + result + " NOK \n");

    }
    public static int getUserInput(Valuta[] list) {
        printOptions(list);
        return (new Scanner(System.in)).nextInt();
    }

    public static void printOptions(Valuta[] list) {
        System.out.println("Velg valuta:");
        for (int i = 0; i < list.length; i++) {
            System.out.println((i + 1) + ". " + list[i].getName());
        }
        System.out.println((list.length + 1) + ". Avslutt");
    }
    public static Valuta[] createValuta() {
        return new Valuta[]{
                new Valuta("Dollar", 10.66),
                new Valuta("Euro", 11.43),
                new Valuta("SEK", 0.96)
        };
    }
}