public class TestRectangulo {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo();
        r1.base = 5;
        r1.altura = 10;
        int resultadoArea;
        resultadoArea = r1.calcularArea();
        System.out.println("El area del rectangulo es: " + resultadoArea);
        double resultadoPerimetro = r1.calcularPerimetro();
        System.out.println("El perimetro del rectangulo es: " + resultadoPerimetro);

        Rectangulo r2 = new Rectangulo();
        r2.base = 7;
        r2.altura = 12;
        int resultadoArea2;
        resultadoArea2 = r2.calcularArea();
        System.out.println("El area del rectangulo es: " + resultadoArea2);
        double resultadoPerimetro2 = r2.calcularPerimetro();
        System.out.println("El perimetro del rectangulo es: " + resultadoPerimetro2);

    }
}
