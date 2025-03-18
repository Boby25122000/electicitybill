//WAJP to print a electricity bill.

import java.util.Scanner;

class ElectricityBill {
    static String customer_name;
    static int consumer_no;
    static int new_unit;
    static int old_unit;
    static int used_unit;
    static float rate;
    static double cost;
    public static void main(String[] args) {
        Details();
        Calulate();
        Display();
    }
    public static void Details() {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Consumer No. : ");
        consumer_no=obj.nextInt();
        System.out.println("Enter Consumer Name: ");
        obj.nextLine();
        customer_name=obj.nextLine();
        System.out.println("Enter Old Unit: ");
        old_unit=obj.nextInt();
        System.out.println("Enter New Unit: ");
        new_unit=obj.nextInt();
        used_unit=new_unit-old_unit;
    }
    public static void Calulate() {
        if(used_unit<=50) {
            rate=3;
        }
        else if(used_unit<=75) {
            rate=5;
        }
        else if(used_unit<=100) {
            rate=7;
        }
        else {
            rate=10;
        }
        cost=used_unit*rate;
    }
    public static void Display() {
        System.out.println("\n******* ELECTRICITY BILL *******");
        System.out.println("\n");
        System.out.println("Consumer No.:\t"+consumer_no);
        System.out.println("Cosumer Name:\t"+customer_name);
        System.out.println("Old Unit:\t"+old_unit);
        System.out.println("New Unit:\t"+new_unit);
        System.out.println("Used Unit:\t"+used_unit);
        System.out.println("Rate per Unit:\t"+rate);
        System.out.println("Cost:\t\t"+cost);
        System.out.println("GST: \t\t20%");
        System.out.println("Total Cost:\t"+cost+(cost*0.20));
        System.out.println("\n_________________________\n");
        System.out.println("    Rate of Units \n");
        System.out.println("upto 50 unit:\t3.00 Rs/unit\n51 - 75 unit:\t5.00 Rs/unit\n76 - 100 unit:\t7.00 Rs/unit\nabove 100 unit:\t10.00 Rs/unit\n");
        System.out.println("_________________________\n");
        System.out.println("******* Thank You *******");
    }
}