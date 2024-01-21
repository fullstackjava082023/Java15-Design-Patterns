import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

      /*  //I will get the salary and make the calculation
        float salary = 1000f;
        Calculator calculator = getTaxCalculator();
        float tax = calculator.calculateTax(salary);
        System.out.println("the tax is : " + tax);*/

        ///Singleton

      /*  Root root1 = new Root();//1
        Root root2 = new Root();//2*/

        Root root1 = Root.getInstance();
        Root root2 = Root.getInstance();
        System.out.println(root2.equals(root1));
    }























    public static Calculator getTaxCalculator() {
        return  new TaxCalculator2023();
    }

}