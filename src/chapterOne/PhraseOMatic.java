package chapterOne;

public class PhraseOMatic {
    public static void main(String[] args) {

    String[] wordListOne = {"24/7", "várias camadas", "30.000 pés", "B-to-B", "todos ganham", "front-end",
            "basead na web", "difundindo", "inteligente", "seis sigma", "caminho critico", "dinâmico"};
    String[] wordListTwo = {"Habilitado", "adesivo", "valor agregado", "orientado", "central", "distribuido",
            "agrupado", "solidificado", "independente da maquina", "posicionado", "em rede", "dedicado", "alavancar",
            "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado"};
    String[] wordListThree = {"processo", "ponto maximo", "solução", "arquitetura", "habilitação no nucleo",
            "estratégia", "mindshate", "portal", "espaço", "visão", "paradigma", "missão"};
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);

    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("precisamos de " + phrase);

    }


}
