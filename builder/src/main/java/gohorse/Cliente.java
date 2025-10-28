package gohorse;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("Configurando Relatório 1:");
        System.out.println("Confuso, o que é 'false'? O que é 'null' ?");
        RelatorioConfig config1 = new RelatorioConfig("Vendas 2024", "admin", null, true, false);
        System.out.println(config1);

        RelatorioConfig config2 = new RelatorioConfig("Estoque", "guest", "Itens por Categoria");
        System.out.println(config2);
    }

}