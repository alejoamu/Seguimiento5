import java.util.Scanner;


public class Main {
    public static final BST tree = new BST();

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Por favor ingrese el arreglo de nombres de manera ordenada");
        String names = sc.nextLine();
        String[] array = names.split(" ");
        int posmitad = division(array);
        String[] subderecha = arregloderecha(array, division(array));
        String[] subizquierda = arregloizquierda(array, division(array));
        addNode(subderecha, subizquierda, array, posmitad);
        tree.inOrderContrary();
    }

    public static void addNode(String[] subderecha, String[] subizquierda, String[] array, int posmitad) {
        for (int i = 0; i < array.length; i++) {
            if (i == posmitad) {
                tree.add(new Node(array[i]));
            }
        }
        if (subderecha.length <= 2) {
            for (int i = 0; i < subderecha.length; i++) {
                tree.add(new Node(subderecha[i]));
            }
        } else if (subderecha.length != 2) {
            division(subderecha);
        }
        if (subizquierda.length <= 2) {
            for (int i = 0; i < subizquierda.length; i++) {
                tree.add(new Node(subizquierda[i]));
            }
        } else if (subizquierda.length != 2) {
            division(subizquierda);
        }
    }

    public static int division(String[] names) {
        float lognitud = names.length;
        float mitad = 2;
        float division = lognitud / mitad;
        if (names.length % 2 == 0) {
            int division1 = (int) division;
            return division1 - 1;
        } else if (names.length % 2 != 0) {
            int division2 = Math.round(division);
            arregloderecha(names, division2 - 1);
            arregloizquierda(names, division2 - 1);
            addNode(arregloderecha(names, division2 - 1), arregloizquierda(names, division2 - 1), names, division2-1 );
            return division2-1;
        }
        return 0;
    }

    public static String[] arregloizquierda(String[] names, int posmitad) {
        String subizquierdo = "";
        for (int i = 0; i < posmitad; i++) {
            subizquierdo += names[i] + " ";
        }
        String[] subizquierda = subizquierdo.split(" ");
        return subizquierda;
    }

    public static String[] arregloderecha(String[] names, int posmitad) {
        String subderecho = "";
        for (int j = posmitad + 1; j < names.length; j++) {

            subderecho += names[j] + " ";

        }
        String[] subderecha = subderecho.split(" ");
        return subderecha;
    }
}