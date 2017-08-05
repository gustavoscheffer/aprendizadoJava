package br.com.empresa.banco;

import java.util.HashMap;
import java.util.Map;

import br.com.empresa.banco.conta.ContaCorrente;

public class TestaMapa {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(10000);

        ContaCorrente c2 = new ContaCorrente();
        c2.deposita(3000);

        // cria o mapa
        Map<String, ContaCorrente> mapaDeContas = new HashMap<String, ContaCorrente>();

        // adiciona duas chaves e seus valores
        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        // qual a conta do diretor?
        ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());
    }
}
