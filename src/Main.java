import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Veicolo[] veicoli = new Veicolo[2];

        veicoli[0] = veicoli[1] = new Automobile("Fiat", 2010, 4);
        veicoli[0].startMotore();
        veicoli[1] = new Moto("Ducati", 2025, 1103);
        veicoli[1].startMotore();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanle veicolo vuoi? 1=Automobile, 2=Moto");
        int n = scanner.nextInt();

        switch(n){

            case 1:

                System.out.println();
        }

    }
}