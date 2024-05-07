public class Main {
    public static void main(String[] args) {
        // Método para imprimir un árbol de navidad

        int height = 10; // Altura del árbol

        System.out.printf("%" + height + "s", ""); // Espacio para poner la estrella en el centro
        System.out.println("*");

        for (int i = 0; i < height - 1; i++) {
            System.out.printf("%" + (height - i) + "s", ""); // Espacio para poner los ceros a la derecha
            System.out.println("0".repeat(2 * i + 1)); // Imprime los ceros del árbol
        }
    }
}