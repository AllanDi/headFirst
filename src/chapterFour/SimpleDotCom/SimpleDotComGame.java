package chapterFour.SimpleDotCom;

public class SimpleDotComGame {

    public static void main(String[] args) {

        --> metodo checkTourSelf
            pegue o palpite do usuario como string
            converter o palpite do usuario como um int

                repita -->em cada local da celula
                        valide se o palpite do usuario esta correto
                se o palpite do usuario estiver correto
                        aumente o numero de acerto
                        verificar se foi a ultima celula
                            se o numero de acertos for igual a 3
                            retorne eliminação como resultado
                            caso contrario não tera eliminado, retorne "correto"
                caso contrario o palpite esta incorreto, retorne errado

            fim da iteracao
            fim do metodo


            -->metodo void setLocationCells(int[] cellLocations)
            caputure os locais das celulas como um parametro de matriz de int
            atribua o parametro dos locais das celulas a variavel das celulas a variavel de instancia desses locais
                fim do metodo







    }

}
