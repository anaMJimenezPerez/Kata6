public class Calculator {

    public int sum (int num1, int num2){
        return num1 + num2;
    }
    public int substraction (int num1, int num2){
        return num1 - num2;
    }
    public int multiplication (int num1, int num2){
        return num1 * num2;
    }

    public double division(int num1, int num2){
        if(num2 == 0){
            throw  new IllegalArgumentException("No se puede dividir entre 0");
        }
        return (double)num1/num2;
    }


}
