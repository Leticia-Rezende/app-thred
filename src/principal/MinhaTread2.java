package principal;

public class MinhaTread2 implements  Runnable{

    @Override
    public void run(){
        for(int i = 1; i <=5; i++){
            System.out.println("Executando a Tread: " + i);
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
