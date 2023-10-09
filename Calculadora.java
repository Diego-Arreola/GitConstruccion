public class Calculadora{
    public double calcularDivision(double numerador, double denominador) throws Exception{
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