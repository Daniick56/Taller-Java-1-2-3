import java.io.DataInputStream;
import java.io.IOException;

public class DataInputExc {
    public static void main(String []args) throws IOException {
        DataInputStream entrada= new DataInputStream(System.in);

        String nomb="";
        System.out.println("Ingrese el nombre: ");

        nomb=entrada.readLine();

        System.out.println("El nombre ingresado es: "+nomb);
    }
}
