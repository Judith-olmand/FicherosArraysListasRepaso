import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fichero de origen");
        String origen = sc.nextLine();
        System.out.println("Fichero de destino");
        String destino = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(origen));FileWriter writer = new FileWriter(destino); FileReader reader2 = new FileReader(origen)) {
            String linea;
            int contador = 0;
            while ((linea = reader.readLine()) != null) {
                while ((reader2.read()) != -1) {
                    contador ++;
                }
                writer.write(linea + "\n");
            }
            System.out.println("Escritura completada.");
            System.out.println("Total de caracteres: " + contador);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }

    }
}

