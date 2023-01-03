/*Dado o valor dos coeficientes A, B e C, calcular e exibir o valor das raízes
reais de uma equação do 2o grau da forma AX2+BX+C=0.
Lembrete:  = B2 – 4AC
Se delta < 0, então não existe raiz real.
Se delta = 0, então X1 = X2 = -B / 2A.
Se delta > 0, então */

Scanner input = new Scanner (System.in);
double A, B, C, X1, X2, delta;
System.out.println("digite o valor de A");
A = input.nextDouble();
System.out.println("digite o valor de B");
B = input.nextDouble();
System.out.println("digite o valor de C");
C = input.nextDouble();

        
if (A != 0) {
    delta = Math.pow(B, 2) - 4 * A * C;
    if (delta <0) {
        System.out.println("não existem raízes reais");
    }
    else if (delta == 0) {
        X1 = -B / (2*A);
        System.out.println("X1 = X2" + X1);
    }
    else {
        X1 = (-B - Math.sqrt(delta))/ 2*A;
        X1 = (-B + Math.sqrt(delta))/ 2*A;
        System.out.println("X1 =" + X1 + "X2 =" + X2);
    }
        }

else {
    System.out.println("não é uma equação de segundo grau");
}


}
}
