public class math {
    
 int number;

 public math(){
     number = 0;
     System.out.println("Number is at:" + number);
 }

public int add (int num1, int num2) {
    return num1 + num2;
}

public int subtract (int num1, int num2) {
    return num1 - num2;
}

public int multiply (int num1, int num2) {
    return num1*num2;
}

public int divide (int num1, int num2) {
    return num1/num2;
}


public static void main(String args[]) {

    math m = new math();

    int num1 = m.add(10, 10);
    System.out.println("10 plus 10 is: " + num1);
    int num2 = m.subtract(25, 10);
    System.out.println("25 minus 10 is: " + num2);
    int num3 = m.divide(25, 5);
    System.out.println("25 divided by 5 is: " + num3);
    int num4 = m.multiply(5, 10);
    System.out.println("5 times 10 is:" + num4);

}


}
