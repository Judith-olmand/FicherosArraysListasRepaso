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

        try (BufferedReader reader = new BufferedReader(new FileReader(origen));FileWriter writer = new FileWriter(destino)) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea + "\n");
            }
            System.out.println("Escritura completada.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }

    }
}
