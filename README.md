# Ejemplo de Abstracción en Java

Este repositorio contiene un ejemplo básico de abstracción en Java utilizando clases abstractas.
La abstracción es uno de los cuatro pilares fundamentales de la programación orientada a objetos (POO), junto con la herencia, el polimorfismo y la encapsulación. La abstracción consiste en ocultar los detalles complejos de la implementación y mostrar solo las funcionalidades esenciales al usuario. En otras palabras, se enfoca en "qué hace" un objeto en lugar de "cómo lo hace".

## Descripción

El ejemplo se centra en una clase abstracta `Figura` que representa una figura geométrica con un color y un método abstracto `calcularArea` que debe ser implementado por las subclases. Las subclases `Circulo` y `Rectangulo` extienden `Figura` y proporcionan implementaciones concretas del método `calcularArea`.

## Estructura del Proyecto

El proyecto consta de los siguientes archivos:

- `Figura.java`: Clase abstracta que define el método abstracto `calcularArea` y un método concreto `getColor`.
- `Circulo.java`: Subclase de `Figura` que implementa el método `calcularArea` para calcular el área de un círculo.
- `Rectangulo.java`: Subclase de `Figura` que implementa el método `calcularArea` para calcular el área de un rectángulo.
- `Main.java`: Clase principal que demuestra el uso de la abstracción creando instancias de `Circulo` y `Rectangulo` y llamando a sus métodos.

## Uso

Para ejecutar este proyecto, sigue los siguientes pasos:

1. Clona este repositorio en tu máquina local:
    ```bash
    git clone https://github.com/tuusuario/ejemplo-abstraccion.git
    ```
2. Navega al directorio del proyecto:
    ```bash
    cd ejemplo-abstraccion
    ```
3. Compila las clases Java:
    ```bash
    javac *.java
    ```
4. Ejecuta la clase principal:
    ```bash
    java Main
    ```

## Ejemplo de Salida

Al ejecutar el proyecto, deberías ver una salida similar a la siguiente:

    Color del círculo: Rojo
    Área del círculo: 78.53981633974483
    Color del rectángulo: Azul
    Área del rectángulo: 24.0

