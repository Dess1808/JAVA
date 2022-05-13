class errosVariaveis{
    // int idade = ;

   void ImprimeIdade(int anoAtual, int anoNascimento){
        // String nome = ;
        System.out.println(anoAtual - anoNascimento);
    }
}

class ErrosVariaveis2{
    public static void main(String[] args){
        errosVariaveis erro1 = new errosVariaveis();

        erro1.ImprimeIdade(2022, 1998);
    }
}