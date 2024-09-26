import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class cardapio {
    public static void main(String[] args) {
        //?Variáveis
        String continuar = "s";
        double total = 0.0;
        String mensagem = "";
        String nomeCliente;
        List<String> pedidos = new ArrayList<>();

        //?Boas Vindas ao Cliente
        JOptionPane.showMessageDialog(null, "BEM VINDO A PADARIA DO MAR", "GARÇOM", JOptionPane.PLAIN_MESSAGE);
        nomeCliente = JOptionPane.showInputDialog(null, "Qual o seu nome?", "GARÇOM", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Aqui está o cardapio " + nomeCliente, "GARÇOM", JOptionPane.PLAIN_MESSAGE);

        while (continuar.equalsIgnoreCase("s")) {

            //?Menu principal
            String[] opcoesMenu = {"Salgado", "Doces", "Bebidas", "Pedidos", "Sair"};
            String escolhaMenu = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma categoria:",
                "Cardápio",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoesMenu,
                opcoesMenu[0]);

            if (escolhaMenu == null || escolhaMenu.equals("Sair")) {
                break;
            }

            switch (escolhaMenu) {    
                case "Salgado":
                    //?Menu dos salgados
                    boolean voltarSalgado = false;
                    while (!voltarSalgado) {
                        String[] opcoesSalgado = {"Pastel - R$6,50", "Coxinha - R$5,00", "Risoles - R$6,00", "Voltar"};
                        String escolhaSalgado = (String) JOptionPane.showInputDialog(
                            null,
                            "Escolha um salgado:",
                            "Salgados",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opcoesSalgado,
                            opcoesSalgado[0]);

                        if (escolhaSalgado == null || escolhaSalgado.equals("Voltar")) {
                            voltarSalgado = true;
                        } else {

                            switch (escolhaSalgado) {
                                case "Pastel - R$6,50":
                                    JOptionPane.showMessageDialog(null, "Um Pastel adicionado aos pedidos!");
                                    total += 6.50;
                                    pedidos.add("Pastel: R$6,50");
                                    break;
                                case "Coxinha - R$5,00":
                                    JOptionPane.showMessageDialog(null, "Uma Coxinha adicionada aos pedidos!");
                                    total += 5.00;
                                    pedidos.add("Coxinha: R$5,00");
                                    break;
                                case "Risoles - R$6,00":
                                    JOptionPane.showMessageDialog(null, "Um Risoles adicionado aos pedidos!");
                                    total += 6.00;
                                    pedidos.add("Risoles: R$6,00");
                                    break;
                            }
                        }
                    }
                    //?Guarda os salgados pedidos
                    for(int i = 0; i < pedidos.size(); i++) {
                        mensagem += pedidos.get(i) + "\n";
                    }
                    pedidos.clear();
                    break;

                case "Doces":
                    //?Menu dos doces
                    boolean voltarDoce = false;
                    while (!voltarDoce) {
                        String[] opcoesDoce = {"Paçoca - R$3,50", "Amansa Sogra - R$6,50", "Cocada - R$4,00", "Voltar"};
                        String escolhaDoce = (String) JOptionPane.showInputDialog(
                            null,
                            "Escolha um doce:",
                            "Doces",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opcoesDoce,
                            opcoesDoce[0]);

                        if (escolhaDoce == null || escolhaDoce.equals("Voltar")) {
                            voltarDoce = true;
                        } else {

                            switch (escolhaDoce) {
                                case "Paçoca - R$3,50":
                                    JOptionPane.showMessageDialog(null, "Uma Paçoca adicionada aos pedidos!");
                                    total += 3.50;
                                    pedidos.add("Paçoca: R$3,50");
                                    break;
                                case "Amansa Sogra - R$6,50":
                                    JOptionPane.showMessageDialog(null, "Uma Amansa Sogra adicionada aos pedidos!");
                                    total += 6.50;
                                    pedidos.add("Amansa Sogra: R$6,50");
                                    break;
                                case "Cocada - R$4,00":
                                    JOptionPane.showMessageDialog(null, "Uma Cocada adicionada aos pedidos!");
                                    total += 4.00;
                                    pedidos.add("Cocada: R$4,00");
                                    break;
                            }
                        }
                    }
                    //?Guarda os doces pedidos
                    for(int i = 0; i < pedidos.size(); i++) {
                        mensagem += pedidos.get(i) + "\n";
                    }
                    pedidos.clear();
                    break;

                case "Bebidas":
                    //?Menu das Bebidas
                    boolean voltarBebida = false;
                    while (!voltarBebida) {
                        String[] opcoesBebida = {"Coca-cola - R$10,00", "Suco natural - R$10,00", "Água - R$4,00", "Voltar"};
                        String escolhaBebida = (String) JOptionPane.showInputDialog(
                            null,
                            "Escolha uma bebida:",
                            "Bebidas",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opcoesBebida,
                            opcoesBebida[0]);

                        if (escolhaBebida == null || escolhaBebida.equals("Voltar")) {
                            voltarBebida = true;
                        } else {

                            switch (escolhaBebida) {
                                case "Coca-cola - R$10,00":
                                    JOptionPane.showMessageDialog(null, "Uma Coca-cola adicionada aos pedidos!");
                                    total += 10.00;
                                    pedidos.add("Coca-Cola: R$10,00");
                                    break;
                                case "Suco natural - R$10,00":
                                    JOptionPane.showMessageDialog(null, "Um Suco natural adicionado aos pedidos!");
                                    total += 10.00;
                                    pedidos.add("Suco Natural: R$10,00");
                                    break;
                                case "Água - R$4,00":
                                    JOptionPane.showMessageDialog(null, "Uma Água adicionada aos pedidos!");
                                    total += 4.00;
                                    pedidos.add("Água: R$4,00");
                                    break;
                            }
                        }
                    }
                    //?Guarda as bebidas pedidas
                    for(int i = 0; i < pedidos.size(); i++) {
                        mensagem += pedidos.get(i) + "\n";
                    }
                    pedidos.clear();
                    break;
                //?Mostra os pedidos selecionados
                case "Pedidos":
                    boolean voltarPedidos = false;
                    if (!voltarPedidos) {
                        JOptionPane.showMessageDialog(null, mensagem, "Pedidos", JOptionPane.PLAIN_MESSAGE);
                    }else{
                        voltarPedidos = true;
                }
            }
        }
        //?Mostra a nota fiscal com os pedidos e o total a pagar
        String notaFiscal = String.format(
            "NOSSO ENDEREÇO: CASA DO MESTRE KAME\n" +
            "NOSSO TELEFONE: 81 4002-8922\n" +
            "=================\n" +
            "CLIENTE: "+ nomeCliente +
            "\n=================\n" +
            "PEDIDOS:\n" + mensagem +
            "=================\n" +
            "VALOR TOTAL: %.2f", total);
        JOptionPane.showMessageDialog(null, notaFiscal, "PADARIA DO MAR", JOptionPane.PLAIN_MESSAGE);

    }
}