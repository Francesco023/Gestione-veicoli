import java.util.Scanner;

public class Main {



    public static void main(String[] args) {



        Veicolo[] veicoli = new Veicolo[2];

        veicoli[0] = new Automobile("Mercedes", 2020, 4);
        veicoli[1] = new Moto("Ducati", 2025, 1103);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanle veicolo vuoi? 1=Automobile, 2=Moto");
        int n = scanner.nextInt();

     if(n == 1) {
          System.out.println(veicoli[0].getModello() + " " + veicoli[0].getAnno() + " " + (Automobile) veicoli[0].get);
      } else if(n == 2) {

      } else {
          System.out.println("Opzione non valida");
      }


    }
}