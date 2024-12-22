import java.util.Scanner; 
public class GrossPayCalculator {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      double hourlyRate, basicPay, overtimePay, grossPay; 
      String employee,ans; 
      int workinghours, overtime; 
      
      System.out.print("Enter employee name: ");
      employee = scan.nextLine();
                
      System.out.print("Press F for full time or P for part time: ");
      ans = scan.nextLine();
      
      if(ans.equals("P")) {
          System.out.println("--- Part Time Employee ---");
          System.out.print("Enter rate per hour: ");
          hourlyRate = scan.nextDouble();
          System.out.print("Enter no. of hours worked: ");
          workinghours = scan.nextInt();
          System.out.print("Enter no. of overtime: ");
          overtime = scan.nextInt();
          basicPay = hourlyRate * workinghours;
          overtimePay = overtime * (hourlyRate * 1.25);
          grossPay = basicPay + overtimePay;
          System.out.println("__________________________");
          System.out.println("Employee name: " + employee);
          System.out.println("Basic Pay: " + basicPay);
          System.out.println("Overtime Pay: " + overtimePay);
          System.out.println("__________________________");
          System.out.println("Gross Pay: " + grossPay);
        }
      
        else if(ans.equals("F")) {
            System.out.println("---Full Time Employee---");
            System.out.print("Enter Basic Pay: ");
            basicPay = scan.nextDouble();
            System.out.println("__________________________");
            System.out.println("Employee name: " + employee);
            System.out.println("Basic Pay: " + basicPay);
            System.out.println("__________________________");
            System.out.println("Gross Pay: " + basicPay);
      }
    }
}
