package service;

import interfaces.Tributavel;

public class CalculadorImposto {

    public void calcular(Tributavel tributavel) {
        double imposto = tributavel.getValorImposto();
        System.out.printf("Valor do imposto a pagar: R$ %.2f%n", imposto);
    }
}
