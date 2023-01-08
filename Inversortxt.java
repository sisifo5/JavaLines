package animal_instinct;

/*importamos bibliotecas*/
import java.util.Scanner;

public class Animal_instinct {

    public static void main(String[] args) {
        // TODO code application logic here
        // Strings 
        String word = "", drow = "";
        // Enteros
        int num_char = 0;
        // Objeto de tipo scanner
        Scanner in = new Scanner(System.in);
        
        /*se guardan los caracteres de tipo 
          objeto lectura
        */
        System.out.print("Dame los Caracteres; ");
        word = in.nextLine();

        num_char = word.length();
        /*condiciono con las variables de tipo entero y de 
          tipo string
        */ 
        while (num_char != 0) {
            /*WORD y DROW se comparan y la funcion ejecuta
              como debe realizar la convercion
            */
            drow += word.substring(num_char - 1, num_char);
            num_char --;

        }
        /*se imprime la variale drow y texto*/
        System.out.println("TU PALABRA " + drow);
        System.out.println("");
    }
}
