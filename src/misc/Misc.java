package misc;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Misc {
    public static void main(String[] args) {

        // Criamos um saco mágico chamado 'p' que guarda informações.
        Properties p = new Properties();

        // Adicionamos algumas informações ao saco mágico.
        p.setProperty("chave1", "valor1");
        p.setProperty("chave2", "valor2");
        p.setProperty("chave3", "valor3");

        // Agora, vamos olhar para dentro do saco mágico e ver quais informações estão lá.
        // Para fazer isso, usamos um lápis mágico e um papel mágico.

        // Primeiro, pegamos um pedaço de papel mágico e anotamos as chaves do saco mágico.
        Set<Object> s = p.keySet();

        // Pegamos um lápis mágico para ler as chaves do papel mágico.
        Iterator<Object> iterator = s.iterator();

        // Agora, olhamos para cada chave no papel mágico.
        while (iterator.hasNext()) {
            // Pegamos uma chave do papel mágico.
            Object key = iterator.next();

            // Pegamos um valor mágico do saco usando a chave.
            String value = p.getProperty(key.toString());

            // E agora, escrevemos no nosso novo papel mágico a chave e o valor juntos.
            System.out.println(key + ": " + value);
        }
    }
}
