public class OperadorLogicoE {
    public static void main(String[] args) {
        int idade = 25;
        boolean temCarteira = true;

        // Verifica se a pessoa tem mais de 18 anos E se tem carteira de motorista
        if (idade >= 18 && temCarteira) {
            System.out.println("Você pode dirigir.");
        } else {
            System.out.println("Você não pode dirigir.");
        }
    }
}
