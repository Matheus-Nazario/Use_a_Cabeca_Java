public class PhraseOMatic{
    public static void main(String[] args) {
        
        String [] wordListOne = {"24/7", "V�rias camadas", "30.000 p�s", "b-to-b", "Todos ganham", "Front-end", "baseado na web", "difundido", "inteligente", "Seis sigma", "Caminho Cr�tico", "Din�mico"};

        String [] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado", "central", "distribu�do", "agupado", "solidificado", "indepedente da m�quina", "posicionado", "em rede", "dedicado", "alavancado", "alavancado", "destinado", "Compatihado", "Cooperativo", "acelerado"};

        String [] wordLisThree = {"processo", "ponto m�ximo", "solu��o", "arquitetura", "habilita��o nucleo", "estrat�gia", "mindshare", "portal", "espa�o", "vis�o", "portal", "espa�o", "vis�o", "paradigma", "Miss�o"};
        
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