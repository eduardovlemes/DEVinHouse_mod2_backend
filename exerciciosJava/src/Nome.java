import java.util.*;

public class Nome {
    public static void main(String[] args) {
        int contador = 0;
        String nome;
        List todosOsNomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try{
            while (contador <= 10){
                System.out.println("Digite um nome: ");
                nome = scanner.nextLine();
                todosOsNomes.add(nome);
                contador++;
            }
            System.out.println(todosOsNomes);

        }catch (Exception e){
           nome = null;
        };
    }
}
