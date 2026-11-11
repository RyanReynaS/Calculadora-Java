public class TestCuadrado {

    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado();
        c1.lado = 4;
        System.out.println("Cuadrado 1 - lado: " + c1.lado);
        System.out.println("Area: " + c1.calcularArea());
        System.out.println("Perimetro: " + c1.calcularPerimetro());

        Cuadrado c2 = new Cuadrado();
        c2.lado = 3;
        System.out.println("Cuadrado 2 - lado: " + c2.lado);
        System.out.println("Area: " + c2.calcularArea());
        System.out.println("Perimetro: " + c2.calcularPerimetro());

        Cuadrado c3 = new Cuadrado();
        c3.lado = 10;
        System.out.println("Cuadrado 3 - lado: " + c3.lado);
        System.out.println("Area: " + c3.calcularArea());
        System.out.println("Perimetro: " + c3.calcularPerimetro());

    }
}
