abstract class Figura {
    private String color;

    // Constructor
    public Figura(String color) {
        this.color = color;
    }

    // Método abstracto (sin implementación)
    abstract double calcularArea();

    // Método concreto
    public String getColor() {
        return color;
    }
}

class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // Implementación del método abstracto
    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    // Constructor
    public Rectangulo(String color, double largo, double ancho) {
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }

    // Implementación del método abstracto
    @Override
    double calcularArea() {
        return largo * ancho;
    }
}
