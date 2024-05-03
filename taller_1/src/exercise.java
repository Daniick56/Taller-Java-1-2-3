import javax.swing.*;

public class exercise {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("Ingrese el numero de ejes");
        int numEjes = Integer.parseInt(input);


            if (numEjes == 2)
            {
                System.out.println("Valor: $4000");
            }
            else if (numEjes==3)
            {
                System.out.println("Valor: $5000");
            }
            else if (numEjes==4)
            {
                System.out.println("Valor: $6000");
            }
            else if (numEjes==5)
            {
                System.out.println("Valor: $11000");
            }


        switch (numEjes)
        {
            case 2:
                System.out.println("Valor $4000");
                break;
            case 3:
                System.out.println("Valor $5000");
                break;
            case 4:
                System.out.println("Valor $6000");
                break;
            case 5:
                System.out.println("Valor $11000");
            break;
        }
    }

}
