public class Main {
   suma (10, 20, 30);

   coche miCoche = new coche();
   miCoche.sumaPuertas();
    System.out.println(puertas);
}

static public int suma (int a, int b, int c) {
    return a + b + c;
}

public class coche {
    private int puertas = 0;

    public void sumaPuertas () {
        puertas++;
    }
}