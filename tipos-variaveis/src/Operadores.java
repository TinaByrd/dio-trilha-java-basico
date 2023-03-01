public class Operadores {
    public static void main(String[] args) {
        String nomeUm = "Maria";
        String nomeDois = new String("Maria");
      
        System.out.println(nomeUm.equals(nomeDois)); /*para string se usa o equals para comparar */


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente de numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que numero2? " + simNao);
    }
}
