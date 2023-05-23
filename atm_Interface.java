
import java.util.ArrayList;
import java.util.Scanner;
public class atm_Interface {

    static ArrayList<String> list= new ArrayList<String>();
    static Scanner input = new Scanner(System.in);
    static int choose,back;
    static double withdraw,balance,deposit,depos,post;
    static String us,username="admin",ps,password="admin";
    static int []array;
    public static void main(String[] args) {
        System.out.println("\n\t Welcome Visitors!\n");
        start();
    }//end of main
    public static void hello(){
        System.out.println("\n\t\tHello: "+username);
        options();
    }
    public static void start(){
        try{
            System.out.print("\tEnter Your UserName: ");
            us=input.nextLine();
            System.out.println();
            if(us.equalsIgnoreCase(username)){
                password();
            }
            else{
                System.err.println("Incorrect Username\n");
                start();
            }
        }//end of try
        catch(Exception a){
            System.err.print("\t Invalid Input");
            start();
        }//end of catch(Exception a)
    }//end of  public static void start()
    public static void password(){
        System.out.print("\tEnter Your Password: ");
        ps=input.nextLine();
        if(ps.equalsIgnoreCase(password)){
            hello();
        }
        else{
            System.err.println("Incorrect Password");
            password();
        }
    }
    public static void depot(){
        array=new int[1];
        System.out.println();
        System.out.print("Input Amount to Deposit: ");
        deposit=input.nextDouble();
        System.out.println();
        System.out.println("Successfully Deposited ");
        System.out.println("\t $"+deposit+" in your account  ");
        System.out.println("\t------------------------------------------------------------------");
        System.out.println();
        calculateDepot(deposit);
        options();
    }//end of static void deposit();
    public static void calculateDepot(double depot){
        balance=balance+depot;
        calculateHist(deposit);
        options();
    }//end of public static void calculateDepot(double depot)
    public static void withd(){
        System.out.print("Input Amount to Withdraw: ");
        withdraw=input.nextDouble();
        if(withdraw>balance){
            System.out.println();
            System.err.println("\t--------------------------------------------------------");
            System.err.println("\t Sorry You Don't Have        ");
            System.err.println("\t Enough Balance to Withdraw \n \t First Check Your Balance!");
            System.err.println("\t---------------------------------------------------------");
            System.out.println();
            withd();
        }
        else{
            System.out.println();
            System.out.println("\t------------------------------------------------\n");
            System.out.println("\t Successfully Withdraw");
            System.out.println("\t $"+withdraw+" in your account\n");
            System.out.println("\t-------------------------------------------------");
            System.out.println();
            calculateWithd(withdraw);
            options();
        }
    }//end of static void withdraw
    public static void calculateWithd(double withd){
        balance=balance-withd;
        calculateHist2(withd);
        options();
    }//end of public static void calculateWithd(double withd)
    public static void bal(){
        System.out.println();
        System.out.println("\t----------------------------------------------------------");
        System.out.print("\t Your Total Balance is: ");
        System.out.println("\t $"+balance);
        System.out.println("\t-------------------------------------------------------");
        System.out.println();
        options();
    }//end of static void balance
    public static void calculateHist(double depot){
        list.add("Deposited - "+Double.toString(depot));
        
        options();
    }
    public static void calculateHist2(double withdraw){
        list.add("WithDrawled - "+Double.toString(withdraw));
        
        options();
    }
    public static void exit(){
        System.out.println("Run the Process Again!");
        System.out.println("Thank You for Using ATM Interface Program\n\n");
    }

    public static void hist(){
        // list.add(Double.toString(depot));
        System.out.print("\t"+list);
        options();
    }//end of static void history
    public static void options(){
        System.out.println();
        System.out.println("\t Choose Your Option");
        try{
            System.out.println("\t  [1] Deposit          ");
            System.out.println("\t  [2] Withdraw         ");
            System.out.println("\t  [3] Balance          ");
            System.out.println("\t  [4] History          ");
            System.out.println("\t  [5] Exit             ");
            System.out.print("Input here ---->  ");
            choose=input.nextInt();
            if(choose==1){
                depot();
            }//end of if(choose==1)

            else if(choose==2){
                if(balance==0){
                    System.err.println();
                    System.err.println("\t|------------------------------|");
                    System.err.println("\t| Sorry Your Account is Empty! |");
                    System.err.println("\t|------------------------------|");
                    System.err.println();
                    options();
                }
                else{
                withd();}
            }//end of else if(choose==2)
            else if(choose==3){
                bal();
            }//end of else if(choose==3)
            else if(choose==4){
                hist();
            }//end of else if(choose==4)
            else if(choose==5){
                System.out.println();
                System.out.println("\t| GoodBye! Thank You |");
                System.out.println();
                exit();
                // System.out.print("\nEnter UserName : ");
                main(null);
                System.exit(0);
            }//end of else if(choose==5)
            else if(choose<=6){
                System.err.print("\t| Invalid Input |");
                options();
            }//end of else if(choose<5)
        }//end of try
        catch(Exception b){
            System.err.print("\t| Invalid Input |");
            // input.nextLine();
            // options();
        }//end of catch
    }//end of static void option
}