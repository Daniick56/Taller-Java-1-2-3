import javax.swing.*;

public class Respuesta2 {
    public static void main(String[]args) {

        int valorA=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor: "));
        int valorB=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor: "));

        if(valorA<valorB)
        {
            valorA = valorB;

        }

        JOptionPane.showMessageDialog(null,"El número mayor es: " + valorA);

    }
}
