package vetores.desafios.problemaPensionato.application;

import vetores.desafios.problemaPensionato.entities.Rent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int qtd = scanner.nextInt();
        clearBuffer(scanner);

        Rent[] rooms = new Rent[10];

        for (int i = 0; i < qtd; i++){
            System.out.printf("Rent #%d:%n", i+1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            clearBuffer(scanner);
            rooms[room] = new Rent(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i] != null ){
                System.out.printf("%d: %s%n", i, rooms[i]);
            }
        }

        scanner.close();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
