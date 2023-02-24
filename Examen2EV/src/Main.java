import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int opcion=EntradaSalida.entradaInt(JOptionPane.showInputDialog("Ingrese un numero: \n1 Suma\n2 Resta\n3 Multiplicacion\n4 Division\n5 Raiz"));
        float num1 = EntradaSalida.entradaFloat("Dame un numero");
        float num2 = EntradaSalida.entradaFloat("Dame un numero");
        Libreria obj = new Libreria();
        switch(opcion) {
            case 1:obj.suma(EntradaSalida.entradaInt(JOptionPane.showInputDialog("Ingrese un numero")),EntradaSalida.entradaInt(JOptionPane.showInputDialog("Ingrese un numero")));
                break;
            case 2:obj.resta(EntradaSalida.entradaInt(JOptionPane.showInputDialog("Ingrese un numero")),EntradaSalida.entradaInt(JOptionPane.showInputDialog("Ingrese un numero")));
                break;
            case 3:obj.multi(EntradaSalida.entradaInt(JOptionPane.showInputDialog("Ingrese un numero")),EntradaSalida.entradaInt(JOptionPane.showInputDialog("Ingrese un numero")));
                break;
            case 4:obj.div(EntradaSalida.entradaInt(JOptionPane.showInputDialog("Ingrese un numero (numerador)")),EntradaSalida.entradaInt(JOptionPane.showInputDialog("Ingrese un numero (denominador)")));
                break;
            case 5:obj.raz(EntradaSalida.entradaInt(JOptionPane.showInputDialog("Ingrese un numero")),EntradaSalida.entradaInt(JOptionPane.showInputDialog("Ingresa numero para tipo de raiz")));
                break;
            default:
        }

    }
    }