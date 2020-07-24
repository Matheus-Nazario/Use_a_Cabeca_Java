public class PhraseOMatic{
    public static void main(String[] args) {
        
        String [] wordListOne = {"24/7", "Várias camadas", "30.000 pés", "b-to-b", "Todos ganham", "Front-end", "baseado na web", "difundido", "inteligente", "Seis sigma", "Caminho Crítico", "Dinâmico"};

        String [] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado", "central", "distribuído", "agupado", "solidificado", "indepedente da máquina", "posicionado", "em rede", "dedicado", "alavancado", "alavancado", "destinado", "Compatihado", "Cooperativo", "acelerado"};

        String [] wordLisThree = {"processo", "ponto máximo", "solução", "arquitetura", "habilitação nucleo", "estratégia", "mindshare", "portal", "espaço", "visão", "portal", "espaço", "visão", "paradigma", "Missão"};
        
            int oneLength = wordListOne.length;
            int twoLength = wordListTwo.length;
            int threeLength = wordLisThree.length;
            
            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);
            
            String phrase = wordListOne[rand1] + "  " + wordListTwo[rand2] + "  "+ wordLisThree[rand3];
            
            System.out.println( "Precisamos de " + phrase );
    }
}