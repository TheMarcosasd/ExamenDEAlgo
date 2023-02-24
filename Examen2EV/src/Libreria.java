public class Libreria {
    /**
     * Calculadora menos que basica
     * @param num1 el primer numero
     * @param num2 eñ segundo numero
     */
    //Suma
    public static float suma(float num1, float num2){
        try{
            float res=num1+num2;
            return res;
        }catch (Exception e){
            System.out.println("Horror");
            return 0;
        }
    }
    //Resta
    public static float resta(float num1, float num2){
        try{
            float res=num1-num2;
            return res;
        }catch (Exception e){
            System.out.println("Horror");
            return 0;
        }
    }
    //Multiplicacion
    public static float multi(float num1, float num2){
        try{
            float res=num1*num2;
            return res;
        }catch (Exception e){
            System.out.println("Horror");
            return 0;
        }
    }
    //Division
    public static float div(float num1, float num2){
        try{
            float res=num1/num2;
            return res;
        }catch (Exception e){
            System.out.println("Horror");
            return 0;
        }
    }
    //Raiz
    public static double raz(double n1, double n2){
        try{
            //Raiz Cuadrada
            double raizCuadrada=Math.sqrt(n1);
            double raizCuadrada2=Math.sqrt(n2);
            //Tecnicamente Raiz Editable
            double raizes = Math.pow(n1, (double) 1 / n2);
            return raizes;
        }catch (Exception e){
            System.out.println("Error");
            return 0;
        }
    }
}
