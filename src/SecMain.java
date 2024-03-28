public class SecMain {
    public static void main(String[]args){
        int result= calculateResult(5,7);
        System.out.println(result);
        double miles =  kilometersToMiles(10);
        System.out.println(miles);
        int resultCompare= isAboveANumber(5,7);
        if(resultCompare==1){
            System.out.println("first number is greater");
        }
        if(resultCompare==-1){
            System.out.println("second number is greater");
        }
        System.out.println("My character attacked with a hit of 10, the bonus is: "+bonusCalculator(10));
        testScope();

        int stringLength = doSomething("");
        System.out.println(stringLength);

    }

    public static int doSomething(String arg){
        return arg.length();
    }

    public static void addNumbers(int number1, int number2){
        System.out.println(number1+number2);
    }
    public static void addNumbers(int number1){
        System.out.println(number1+5);
    }
    public static int calculateResult(int number1,int number2){
        return number1+number2;
    }
    //miles=kilometers×0.621371
    public static double kilometersToMiles(double kilometers){
        return kilometers*0.621371;
    }
    public static int isAboveANumber(int number1,int number2){
        int result = -1;
        if(number1>number2){
            result= 1;
        }
        if(number2>number1){
            result = -1;
        }
        if(number2==number1){
            result= 0;
        }
        return result;
    }
    public static double bonusCalculator(double attackDmg){
        double bonus = 0;
        if(attackDmg > 5){
            bonus = 0.5;
        }else if(attackDmg > 10){
            bonus = 1;
        }else if(attackDmg>20){
            bonus = 2;
        }else{
            bonus = 0;
        }
        return bonus;
    }
    public static void testScope(){
        double calculatedBonus = bonusCalculator(10);
        System.out.println("test scope: "+calculatedBonus);


    }
    public static void log(){
        System.out.println("something.....");
    }
}
