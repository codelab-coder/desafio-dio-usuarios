import java.util.HashSet;
import java.util.Scanner;

public class DesafioDioUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lendo o número de usuários a serem cadastrados
        int N = scanner.nextInt();
        HashSet<Integer> usuarios = new HashSet<>();

        // Cadastro de usuários
        for (int i = 0; i < N; i++) {
            int id = scanner.nextInt();
            int idade = scanner.nextInt(); // A idade é lida, mas não utilizada
            usuarios.add(id);
            System.out.println("user " + id + " OK");
        }

        // Lendo o número de IDs a serem verificados
        int M = scanner.nextInt();

        // Verificação dos usuários
        for (int i = 0; i < M; i++) {
            int idVerificar = scanner.nextInt();
            if (usuarios.contains(idVerificar)) {
                System.out.println(idVerificar + " registered user");
            } else {
                System.out.println(idVerificar + " invalid user");
            }
        }

        scanner.close();
    }
}
