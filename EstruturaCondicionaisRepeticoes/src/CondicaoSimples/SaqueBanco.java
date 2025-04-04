package CondicaoSimples;
public class SaqueBanco {
public static void main(String[] args) {
    
        // Cria um objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);
            
            // Definindo o saldo inicial (pode ser qualquer valor)
            double saldo = 500.00;  // Exemplo de saldo inicial
            double saque;
            
            // Solicita o valor do saque
            System.out.print("Digite o valor do saque: ");
            saque = scanner.nextDouble();
            
            // Condicional simples para verificar se o saldo é suficiente para o saque
            if (saldo >= saque) {
                saldo -= saque;  // Atualiza o saldo após o saque
                System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + saldo);
            } else {
                System.out.println("Saldo insuficiente! Encerrando o programa.");
            }
            
            // Fecha o scanner
            scanner.close();
        }
    
    
}
