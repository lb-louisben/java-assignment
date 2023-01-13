package A2;

class FooCorporation{
    public static void Employee(double basePay, double hoursWorked){
        double totalPay;
        if (basePay < 8.0) {
            System.out.println("Error! The base pay must be greater than $8.00");
        } else if (hoursWorked <= 40){
            totalPay = basePay * hoursWorked;
            System.out.println("total pay is " + totalPay);
        } else if (hoursWorked >40 && hoursWorked <= 60){
            totalPay = 40*basePay + basePay*1.5*(hoursWorked-40);
            System.out.println("total pay is " + totalPay);
        } else if (hoursWorked > 60) {
            System.out.println("The max work hours is 60!!");
        }
    }


    public static void main(String[] args) {
        Employee(7.5, 35);
        Employee(8.2, 47);
        Employee(10, 73);
    }
}
