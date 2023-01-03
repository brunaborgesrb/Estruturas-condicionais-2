/*A empresa Bons Amigos decidiu dar a seus funcionários uma gratificação de Natal. A gratificação é
baseada em dois critérios: o número de horas extras trabalhadas e o número de horas que o funcionário faltou
ao trabalho. A empresa resolveu utilizar a seguinte fórmula para calcular o prêmio: subtrair dois terços das
horas que o funcionário faltou de suas horas extras trabalhadas e distribuir o prêmio de acordo com a tabela
abaixo:

Total = Horas Extras - 2/3 x Horas
que faltou

Prêmio em R$
Total > 40 horas 200,00
30 < Total  40 175,00
20 < Total  30 150,00
10 < Total  20 125,00
Total  10 horas 100,00

Solicitar ao usuário o número de horas extras trabalhadas e o número de horas
que o funcionário faltou ao trabalho, e calcular o valor de seu prêmio. O programa deverá exibir a seguinte
frase: */

Scanner input = new Scanner (System.in);
		int hExtra, hFaltou;
		double premio, total;
		System.out.println("horas extras trabalhadas: ");
		hExtra = input.nextInt();
		System.out.println("horas que faltou ao trabalho: ");
		hFaltou = input.nextInt();
		total = hExtra - 2.0/3 * hFaltou;  
		
		if (total >40) {
			System.out.println("O funcionário receberá R$ 200,00 de gratificação de Natal.");
			}
		
		else if (total >30) {
			System.out.println("O funcionário receberá R$ 175,00 de gratificação de Natal.");
			
		}
		else if (total >20) {
			System.out.println("O funcionário receberá R$ 150,00 de gratificação de Natal.");
			
		}
		else if (total >10) {
			System.out.println("O funcionário receberá R$ 125,00 de gratificação de Natal.");
			
		}
		else {
			System.out.println("O funcionário receberá R$ 100,00 de gratificação de Natal.");
			
		}
		
		
	}

}

