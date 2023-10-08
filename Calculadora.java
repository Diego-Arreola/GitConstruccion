public class Calculadora{
    public double calcularDivision(double numero1, double numero2) throws Exception{
        double numerador = numero1;
        double denominador = numero2;
        double resultado = 0;

        if(denominador != 0){
            resultado = numerador / denominador;
        }
        else{
            throw new Exception("Conflicto: denominador distinto de cero");
        }
        return resultado;
    }
}