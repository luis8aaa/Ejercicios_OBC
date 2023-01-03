public class Ejercicios_tema_4 {
    public static void main(String[] args) {
        int numeroif = 0;
        int numeroWhile = 0;
        int numeroDoWhile = 0;
        String estacion = "Primavera";

        if (numeroif > 0) {
            System.out.println("El número es positivo");
        } else if (numeroif < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
        } while (numeroDoWhile < 1);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        switch (estacion) {
            case "Verano": System.out.printf("Es Verano");
                break;
            case "Otoño": System.out.printf("Es Otoño");
                break;
            case "Invierno": System.out.printf("Es invierno");
                break;
            case "Primavera": System.out.printf("Es Primavera");
                break;
            default: System.out.printf("No es un nombre de una estación");
        }
    }
}