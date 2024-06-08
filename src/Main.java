public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo("Rojo", 5.0);
        Figura rectangulo = new Rectangulo("Azul", 4.0, 6.0);

        System.out.println("Color del círculo: " + circulo.getColor());
        System.out.println("Área del círculo: " + circulo.calcularArea());

        System.out.println("Color del rectángulo: " + rectangulo.getColor());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}
