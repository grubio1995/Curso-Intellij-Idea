package br.com.alura.bytebank;

import br.com.alura.bytebank.io.LeitorCSV;
import br.com.alura.bytebank.model.Pagamento;

import java.io.IOException;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
//        new OpcoesPagamento().mensagemDeBoasVindas();

        LeitorCSV leitorCSV = new LeitorCSV();
        List<Pagamento> pagamentos = leitorCSV.ler(1);

        for (Pagamento pagamento : pagamentos) {
            Double valorComAcerescimo = pagamento.getValor() + (pagamento.getValor()) * 0.10;
            pagamento.setValor(pagamento.getValor() > 100D ? valorComAcerescimo : pagamento.getValor());
            System.out.println(pagamento);
        }
    }

}
