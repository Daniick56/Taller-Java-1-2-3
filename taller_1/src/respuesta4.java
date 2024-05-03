import javax.swing.*;

public class respuesta4 {
    public static void main(String[] args) {

        final double porciento= 0.30;

        String valor="";

        valor= JOptionPane.showInputDialog("Ingrese cual es el Sueldo neto");

        double sueldoOriginal=Double.parseDouble(valor);
        double sueldoFinal= sueldoOriginal+(sueldoOriginal*0.30);
        System.out.println("El Sueldo final del empleado con un aumento de 30% es: "+sueldoFinal);
    }
}
