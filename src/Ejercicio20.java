import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio20 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("numeros.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                //System.out.println(linea);
                numeros.add(Integer.parseInt(linea));
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }

        int suma = 0;
        int max = numeros.get(0);
        int min = numeros.get(0);

        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
            if (numeros.get(i) > max) {
                max = numeros.get(i);
            }
            if (numeros.get(i) < min) {
                min = numeros.get(i);
            }
        }
        System.out.println("Suma: " + suma);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
