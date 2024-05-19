package edu.lucas.PrimeiraSemana;
public class MeuProjeto {
    public static void main (String [] args){
        final String ola ="1"; //"final" tipa a variável deixando-a imutável
        String primeiro = "jonatas";
        String segundo = "Lucas";
        System.out.println("helloo babys! "+nome(primeiro, segundo));
    }
    public static String nome (String primeiro,String segundo) {
        return primeiro.concat("-").concat(segundo);
    }
}
