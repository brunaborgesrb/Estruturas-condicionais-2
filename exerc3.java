/*A média de um aluno em uma disciplina é a média aritmética das notas de suas duas avaliações parciais.
Se a média do aluno for maior ou igual a 7 (sete), o aluno está aprovado. Caso a média do aluno seja maior
ou igual a 3 (três), ele fará exame final. Se o aluno obtiver média menor que 3,0, ele está reprovado.
Programa para ler as notas das duas avaliações parciais de um aluno, calcular sua média em
uma determinada disciplina e informar a sua situação. */

Scanner input = new Scanner (System.in);
    double av1, av2, mediaArit;
    System.out.println("digite a nota da primeira avaliação");
    av1 = input.nextDouble();
    System.out.println("digite a nota da segunda avaliação");
    av2 = input.nextDouble();
    
    mediaArit = (av1 + av2)/2;
    System.out.println(mediaArit);
    
       if (mediaArit >=7) {
         
         System.out.println("o aluno está aprovado");
       }
      else if (mediaArit >=3){
        System.out.println("o aluno fará o exame final");
      }
      else {
         System.out.println("o aluno está reprovado");
      }
  }
}
