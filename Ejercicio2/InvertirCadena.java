package Ejercicio2;
import java.util.LinkedList;
import java.util.Stack;

public class ejer1 {

    private void invertirPalabrastack(){
        String cadena = "La vida es bella";
        LinkedList<Character> lista = new LinkedList<Character>();
        Stack<Character> pila = new Stack<Character>();

        // Almacenar la cadena en una lista
        for (int i = 0; i < cadena.length(); i++) {
            lista.add(cadena.charAt(i));
            System.out.println(cadena.charAt(i));
        }

        // Utilizar una pila para invertir la lista
        while (!lista.isEmpty()) {
            pila.push(lista.remove());
        }

        // Mostrar la cadena invertida
        System.out.print("La cadena invertida es: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }
    }

    public static void main(String[] args) {
        ejer1 ejercicio=new ejer1();
        ejercicio.invertirPalabrastack();
    }

}
