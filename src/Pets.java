public class Pets{
    public static void main(String[] args) {
        String[] pets = {"Maltês", "Poodle", "buudog"};
        int x = pets.length;
        int s = (int) (Math.random() * x );
        String p =  pets[s]  + " é um cão";
        System.out.print(p);
    }
}