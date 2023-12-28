package misc;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Misc {

    public static int customParseInteger(String text) throws NumberFormatException, ArithmeticException {
        try {
            // Tenta converter a String para um inteiro
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            // Lança a exceção para cima na pilha de chamadas
            throw new NumberFormatException("String inválida para conversão em inteiro: " + text);
        }
        // Note que uma ArithmeticException não é lançada por parseInt,
        // portanto, não será capturada aqui.
    }

    public static void main(String[] args) {
        String textVal = "123";
        int val;
        try {
            val = customParseInteger(textVal);
            System.out.println(val);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Erro ao converter String para inteiro: " + e.getMessage());
        }
    }
}
