import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        String fichero = "numeros.txt";
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(200+51);
        //int numero = (int) (Math.random()*10000)
        System.out.println("Se van a escribir " + numero + " números");

        try (FileWriter writer = new FileWriter(fichero)) {
            for (int i = 1; i <= numero; i++) {
                writer.write(i + "\n");
            }
            System.out.println("Escritura completada.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }
}
