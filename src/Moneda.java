import javax.swing.*;

public class Moneda {
    public static void convertir(){
        int opcionMoneda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion deseada:\n1. Convertir de pesos a dolares\n2. Convertir de soles a dolares\n3. Convertir de dolares a pesos\n4. Convertir de dolares a soles"));
        switch (opcionMoneda){
            case 1:
                convert_to_dolar(17.96, "pesos");
                break;
            case 2:
                convert_to_dolar(3.78, "soles");
                break;
            case 3:
                convert_from_dolar(17.96, "pesos");
                break;
            case 4:
                convert_from_dolar(3.78, "soles");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida");
                break;
        }
    }

    static void convert_to_dolar(double valorDolar, String moneda){
        double cantidad;
        double dolares;
        cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir"));
        dolares = cantidad / valorDolar;
        dolares = Math.round(dolares * 100.0) / 100.0;
        JOptionPane.showMessageDialog(null, "La cantidad de " + cantidad + " " + moneda + " equivale a " + dolares + " dolares");
    }

    static void convert_from_dolar(double valorDolar, String moneda){
        double cantidad;
        double monedaLocal;
        cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir"));
        monedaLocal = cantidad * valorDolar;
        monedaLocal = Math.round(monedaLocal * 100.0) / 100.0;
        JOptionPane.showMessageDialog(null, "La cantidad de " + cantidad + " dolares equivale a " + monedaLocal + " " + moneda);
    }
}
