public class Calculadora{
    public double calcularDivision(double numero1, double numero2) throws Exception{
        double resultado = 0;

        if(numero2 != 0){
            resultado = numero1 / numero2;
        }
        else{
            throw new Exception("Conflicto: denominador distinto de cero");
        }
        return resultado;
    }
}