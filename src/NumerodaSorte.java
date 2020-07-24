public class NumerodaSorte{
    public static void main(String[] args){
        
        int [] num = {2, 4, 6, 8, 10};
        
        int numLength = num.length;
        
        int numRandom = (int) ( Math.random() * numLength);
        
        System.out.println("O Número da sorte é " + num[numRandom]  );
    }
}