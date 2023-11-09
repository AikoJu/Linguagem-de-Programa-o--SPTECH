package bilhete;

import java.util.Scanner;

public class TesteBilhete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            BilheteUnico bilhete01 = new BilheteUnico();

            bilhete01.nomeTitular = "Peterson";
            bilhete01.saldo = 60.00;
            bilhete01.carregar(100.00);

            BilheteUnico bilhete02 = new BilheteUnico();
            bilhete02.nomeTitular = "Mirella";
            bilhete02.saldo = 10.00;
            bilhete02.carregar(10.00);
    }
}
