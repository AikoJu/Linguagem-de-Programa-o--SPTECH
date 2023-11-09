package continuada01.src.main.java.aula3008.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate data =LocalDate.now();
        System.out.println(data);

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter formatador1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
//        DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
//        DateTimeFormatter formatador3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy",Locale.CANADA);

        LocalDate aniversario = LocalDate.parse(in.nextLine(),formatador);

        System.out.println(data.format(formatador));
//        System.out.println(data.format(formatador1));
//        System.out.println(data.format(formatador2));
//        System.out.println(data.format(formatador3));

        System.out.println(aniversario);
        System.out.println(aniversario.getDayOfWeek());

    }
}
