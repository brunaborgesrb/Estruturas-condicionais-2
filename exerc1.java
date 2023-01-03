/*A empresa XYZ Ltda. Irá conceder uma gratificação de 20% do valor do salário a todos os funcionários
com tempo de serviço na empresa igual ou superior a dez anos e de 10% aos demais. Solicitar ao usuário o tempo
 do serviço e o salário de um funcionário e calcular e exibir o valor
da gratificação que ele irá receber. */

Scanner input = new Scanner (System.in);
    double tempoServ, sal, valGrat, salTotal;
    System.out.println("informe o tempo do serviço");
    tempoServ = input.nextDouble();
    System.out.println("informe seu salário");
    sal =input.nextDouble();
      if (tempoServ >=10) {
        valGrat = 0.20 * sal;
        salTotal = valGrat + sal;
        System.out.println("você receberá R$ " + valGrat + "de gratificação");
        System.out.println("seu salário vai ser " + salTotal);
        }
      
      else {
        valGrat = 0.10 * sal;
        salTotal = valGrat + sal;
        System.out.println("você receberá R$ " + valGrat + "de gratificação");
        System.out.println("seu salário vai ser " + salTotal);
          
      }
    
  }
}
