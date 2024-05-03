import javax.swing.*;

public class PracticaCondicionalJava {
    public static void main(String[]args){
        int x=-4;

        if(x<0)
        {
            JOptionPane.showMessageDialog(null, "El valor de x es: "+ (x=x*-1));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El numero x es: "+ x);
        }
    }

}
