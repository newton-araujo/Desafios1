import java.util.Scanner;
import java.util.Locale;

public class Calculadora {

    public static void main(String[] args) {
        
        //Recebendo dados do usuário:
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        try {

            System.out.println("Digite um número: ");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int numero2 = scanner.nextInt();

            System.out.println("Qual operação matemática você deseja fazer: ");
            String operador = scanner.next();

            //Tratando os operadores:
            if (operador == "+" || operador == "somar") 
                operador = "somar";
            else if (operador == "-" || operador == "subtrair" ) 
                operador = "subtrair";
            else if (operador == "*" || operador == "multiplicar")
                operador = "multiplicar";
            else if (operador == "/" || operador == "dividir")
                operador = "dividir";

            int resultado = calcular(numero1, numero2, operador);
            System.out.println("O resultado é: " + resultado);

            //Tratamento de Exceção;
        } catch (Exception e) {
            System.out.println("Informe todos os dados solicitados: " + e);
        }

    }
    /**
     * <h1>Metodo calcular</h1>
     * 
     * <p>Recebe dois números inteiros e um operador, e retorna um número inteiro com o resultado do calculo.</p>
     * 
     *
     * @param a
     * @param b
     * @param operador
     * 
     */

    //Metodo somar
    public static int calcular(int a, int b, String operador){
        int resultado = 0;
        
        //Condiçoes de operações;

        switch (operador) {
            case "somar":
                resultado = a + b;
                break;
            case "subtrair":
                resultado = a - b;
                break;
            case "multiplicar":
                resultado = a * b;
                break;
            case "dividir":
            
                if(b != 0)
                    resultado = a / b;
                else
                    throw new ArithmeticException("Divisão por zero");
                break;

            default:
                    throw new IllegalArgumentException("Operação inválida");
                    
        }

        return resultado;


    }


}