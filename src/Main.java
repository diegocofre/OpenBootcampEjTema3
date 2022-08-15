public class Main {
    public static void main(String[] args) {

        //primera parta
        System.out.println(SumaTres(1,2,3));

        //segunda parte
        var miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.Puertas);

    }

    public static int SumaTres(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int Puertas;
    public void AgregarPuerta() {
        this.Puertas += 1;
    }
}

