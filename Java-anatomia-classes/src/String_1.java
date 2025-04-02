public class String_1 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";

        // Comparando as referências de memória (não é recomendado para conteúdo de strings)
        System.out.println(str1 == str2);  // true, porque as duas variáveis apontam para o mesmo objeto

        // Comparando o conteúdo das strings
        System.out.println(str1.equals(str2));  // true, pois o conteúdo das duas strings é o mesmo
    }
}
