public static void imprimirNumAsientos(Coche[] arrayCoches){  
        for (Coche coche : arrayCoches) {
            System.out.println(coche.numAsientos());
        }
    }

imprimirNumAsientos(arrayCoches);  

abstract class Coche {

    // ...
    abstract int numAsientos();
}
class Renault extends Coche {

    // ...
    @Override
    int numAsientos() {
        return 5;
    }
}
// ...