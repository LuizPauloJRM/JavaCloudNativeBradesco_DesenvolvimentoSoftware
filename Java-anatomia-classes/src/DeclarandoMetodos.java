

public class DeclarandoMetodos {
    public static void main(String[] args) {
        String primeiroNome="Luiz";
        String segundoNome="Medeiros";
        String nomeCompleto=nomeCompleto(primeiroNome,segundoNome); 
        System.out.println(nomeCompleto);
    }
        
    public static String nomeCompleto(String primeiroNome,String segundoNome){
        return "resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}
}