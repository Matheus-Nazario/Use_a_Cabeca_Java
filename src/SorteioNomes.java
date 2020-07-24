public class SorteioNomes{
    public static void main(String[] args){
        
        String [] name = {"Matheus", "Maiara", "Marcones", "Regineide", "Marcos", "Marcello"}; 
        
        int nameLength = name.length;
        
        int radName = (int) ( Math.random()* nameLength);
        
        String sorteio = "O Sorteado foi " + name[radName];
        System.out.println(sorteio);
    } 
}