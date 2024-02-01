package misc;

public class Contador {

    private int contagem = 0;

    public void incrementar(){
        contagem++;
    }

    public int getContagem(){
        return contagem;
    }

    public static void main(String[] args) throws InterruptedException {
        final Contador contador = new Contador();

        //Thread 1
        Thread t1 = new Thread(() ->{

            for (int i = 0; i<1000; i++){
                contador.incrementar();
            }
        });

        //Thread 2
        Thread t2 = new Thread(() -> {

            for (int i = 0; i<1000; i++){
                contador.incrementar();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Valor final do contador " + contador.getContagem());





    }



}
