public class Pets{
    public static void main(String[] args) {
        String[] pets = {"Malt�s", "Poodle", "buudog"};
        int x = pets.length;
        int s = (int) (Math.random() * x );
        String p =  pets[s]  + " � um c�o";
        System.out.print(p);
    }
}