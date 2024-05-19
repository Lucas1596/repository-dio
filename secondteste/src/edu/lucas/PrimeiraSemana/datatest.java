package edu.lucas.PrimeiraSemana;

public class datatest {
    public static void main(String[] args){
        String dia = "12";
        String mes = "02";
        String ano = "2024";
        String data = data(dia, mes, ano);
        System.out.println(data);

 
   }
   public static String data(String dia,String mes,String ano) {
        return dia.concat("/").concat(mes).concat("/").concat(ano);
   }
}
