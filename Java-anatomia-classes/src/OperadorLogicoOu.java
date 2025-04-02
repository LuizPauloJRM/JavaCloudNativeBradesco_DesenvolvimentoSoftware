public class OperadorLogicoOu {
    public static void main(String[] args) {
        boolean temPassaporte = false;
        boolean temIdentidade = true;

        // Verifica se a pessoa tem passaporte ou identidade
        if (temPassaporte || temIdentidade) {
            System.out.println("Você tem um documento válido.");
        } else {
            System.out.println("Você não tem nenhum documento válido.");
        }
    }
}
