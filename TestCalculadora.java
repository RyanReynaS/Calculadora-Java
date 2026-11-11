public class TestCalculadora {

    public static void main(String[] args) {

        Calculadora c1 = new Calculadora();

        double r1 = c1.sumar(4, 2);
        System.out.println("Resultado de la suma: " + r1);

        double r2 = c1.restar(4, 2);
        System.out.println("Resultado de la resta: " + r2);

        double r3 = c1.multiplicar(10, 5);
        System.out.println("Resultado de la multiplicación: " + r3);

        double r4 = c1.dividir(10, 2);
        System.out.println("Resultado de la división: " + r4);

        double r5 = c1.promediar(10, 8, 9);
        System.out.println("Resultado del promedio: " + r5);

        c1.mostrarResultado();
    }
}
