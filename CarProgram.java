import java.util.Scanner;

public class CarProgram {
        public static void main(String[] args) {
                try (Scanner myCar = new Scanner(System.in)) {
                        System.out.println("Inserisci il brand automobilistico:");
                        String brand = myCar.next();
                        System.out.println("Inserisci il modello dell'auto:");
                        String model = myCar.next();
                        System.out.println("Inserisci l'anno di produzione:");
                        int year = myCar.nextInt();
                        System.out.println("Inserisci il peso dell'auto:");
                        double weight = myCar.nextDouble();
                        System.out.println("Inserisci la cilindrata dell'auto:");
                        double engineVolume = myCar.nextDouble();
                        System.out.println("Inserisci i cavalli dell'auto:");
                        double horsePower = myCar.nextDouble();
                        System.out.println("Inserisci i giri al minuto ai quali viene sviluppata la potenza massima:");
                        double rpm = myCar.nextDouble();
                        Car c1 = new Car(brand, model, year, horsePower, weight, engineVolume, rpm);
                        System.out.println(c1.toString());
                }
        }
}
