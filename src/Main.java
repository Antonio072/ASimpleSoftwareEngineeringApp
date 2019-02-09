
    /**
     *
     * @author Equipo Innovacion
     * @school Tecnológico Nacional de México en Celaya
     * @subject Software Engineering
     * @career Computer Systems Engineering
     *
     * */
public class Main {


    public static void main(String[] args) {
        /**
         * Debajo se listan los metodos realizados por el Equipo Innovacion de la materia Ingenieria de Software
         * Para hacer uso de ellos solamente hay que llamarlos y pasarle sus respectivos parametros
         */
    }

    static boolean logic1_specialEleven(int n) {

        if(n%11==0|n%11==1)
            return true;
        else

            return false;
    } // URL: https://codingbat.com/prob/p100962

    static int logic2_Blackjack(int a, int b){
        if(a>21 && b>21)
            return 0;
        return (a>21)? b : (b>21)? a : Math.max(a,b);
    }// URL: https://codingbat.com/prob/p117019

    static int logic1_GreenTicket(int a, int b, int c){
        if (a == b && b == c)
            return 20;
        if (a == b || a == c || b == c)
            return 10;
        else;
        return 0;
    } // URL: https://codingbat.com/prob/p120633

    static boolean logic1_old35(int n){
        return n % 3 == 0 ^ n % 5 == 0;
    }// URL: https://codingbat.com/prob/p159612

    static String string2_oneTwo(String str){
        String str2 = "";
        for(int i=0; i<str.length()-2; i+=3) {
            str2 = str2+str.substring(i+1,i+3)+str.charAt(i);
        }
        return str2;
    }// URL: https://codingbat.com/prob/p122943

    static String string1_seeColor(String str) {
        return str.startsWith("red") ? "red" : str.startsWith("blue") ? "blue" : "";
    }// URL: https://codingbat.com/prob/p199216

    static String warmUp2_fronTimes(String str, int n) {
        String acumulador="";
        String var;
        int nocar=str.length();
        if(nocar>3)
            var=str.substring(0,3);
        else
            var=str;
        for (int j=0;j<n;j++)
            acumulador=acumulador+var;

        return acumulador;
    } // URL: https://codingbat.com/prob/p101475


}
