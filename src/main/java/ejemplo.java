import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class ejemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> estudiantes = new TreeMap<>();

        while (true) {

            System.out.println("Introduce el codigo del estudiante");
            String codigo = sc.nextLine();

            if (codigo.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println("Introduce el nombre del estudiante");
            String nombre = sc.nextLine();

            estudiantes.put(codigo, nombre);
        }

        System.out.println("\nLista de estudiantes:");

        estudiantes.forEach((codigo, nombre) ->
                System.out.println(codigo + " " + nombre));

        sc.close();
    }
}
