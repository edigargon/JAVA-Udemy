package instaciacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args){

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now(); //Data Atual
        LocalDateTime d02 = LocalDateTime.now(); // Data Atual com Tempo
        Instant d03 = Instant.now(); // Data Atual com Tempo + GMT

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); //horario São Paulo

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
    }
}