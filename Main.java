import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String Apikey = "17ed5b0dc665cf0ab0e2ccc8";
        Converte cotacao = new Converte(Apikey);
        Moedas moeda = new Moedas(cotacao);
    try {
        while (true)
        {
            int menu = Integer.parseInt(leitura.nextLine());
            moeda.listaMoedas();
            if(menu == 0)
            {
                System.out.println("Obrigado!");
                return;
            }
            moeda.OpcaoConverte(menu);
        }
    }catch (Exception e) {
        System.out.println("Erro: " + e.getMessage());
    }

    }
}
