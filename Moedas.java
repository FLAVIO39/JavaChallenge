public class Moedas {
    private final Converte cotacao;
    private static final String API_KEY ="17ed5b0dc665cf0ab0e2ccc8";

    public Moedas(Converte cotacao)
    {
            this.cotacao = cotacao;
    }

    static String opcoes = """
                ** - Opcões de conversão de moedas - **
                
                1 - BRL PARA USD.
                2 - BRL PARA EUR.
                3 - BRL PARA CNY.
                4 - USD PARA BRL.
                5 - USD PARA EUR.
                6 - USD PARA CNY.
                7 - CNY PARA BRL.
                8 - CNY PARA USD.
                9 - CNY PARA EUR.
                0 - SAIR.
                """;
    public static void listaMoedas() {
        System.out.println(opcoes);
    }

    public void OpcaoConverte(int convertePara){
        switch (convertePara) {
            case 1:
                cotacao.converterMoeda("BRL", "USD");
                break;
            case 2:
                cotacao.converterMoeda("BRL", "EUR");
                break;
            case 3:
                cotacao.converterMoeda("BRL", "CNY");
                break;
            case 4:
                cotacao.converterMoeda("USD", "BRL");
                break;
            case 5:
                cotacao.converterMoeda("USD", "EUR");
                break;
            case 6:
                cotacao.converterMoeda("USD", "CNY");
                break;
            case 7:
                cotacao.converterMoeda("CNY", "BRL");
                break;
            case 8:
                cotacao.converterMoeda("CNY", "USD");
                break;
            case 9:
                cotacao.converterMoeda("CNY", "EUR");
                break;
            default:
                System.out.println("Essa opção não existe! verifique opções no menu!");
        }
    }
}
