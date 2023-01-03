/* Para o cálculo do valor a ser pago na conta de energia segue-se a seguinte regra: caso a quantidade de
quilowatts mensais seja inferior a 10, o consumidor irá pagar a tarifa mínima que é de R$ 7,00. Se o consumo
for maior ou igual a 10 quilowatts, então o consumidor irá pagar R$ 1,40 por quilowatt. Todos os
consumidores pagam taxa de iluminação pública no valor de R$ 3,50, independente de seu consumo.
Solicite o consumo do cliente em quilowatts e informe qual será o valor da conta
de energia. */

Scanner input = new Scanner (System.in);
    double quilowatt, consumoTotal;
    System.out.println("informe o consumo de quilowatt");
    quilowatt = input.nextDouble();

    if (quilowatt <10);{
    consumoTotal = quilowatt + 7.50 + 3.50;
    System.out.println ("a conta de energia será" + consumoTotal + "reais");
    }
    else {
    consumoTotal = quilowatt + 1.40 + 3.50;
    System.out.println("a conta de energia será" + consumoTotal + "reais");
    }
  }
}
