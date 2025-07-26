import java.util.*;


 public class conditions {
                                        //    IF ELSE
   
    public static void main(String args[]){

    // Scanner sc = new Scanner(System.in);      
    // int age = sc.nextInt();
    // if(age>18){
    //     System.out.println("ADULT");
    // }
    // else{
    //     System.out.println("NOT ADULT");
    // }
     
    // Scanner sc = new Scanner(System.in);
    // int num= sc.nextInt();
    // if(num%2==0){
    //     System.out.println("EVEN");
    // }
    // else{
    //     System.out.println("ODD");
    // }

                                                //   IF ELSE IF ELSE
    // Scanner sc = new Scanner(System.in);
    // int a=sc.nextInt();
    // int b=sc.nextInt();
    //     if(a==b){
    //         System.out.println("Equal");
    //     }else if(a>b){
    //         System.out.println("a is greater");}
    //     else{
    //         System.out.println("a is smaller");
    //     }
       
    // Scanner sc = new Scanner(System.in);
    //     int button=sc.nextInt();
    //     if(button==1){
    //         System.out.println("HELLO");
    //     }
    //     else if(button==2){
    //         System.out.println("NAMASTE");
    //     }else if(button==3){
    //         System.out.println("BONJOU");
    //     }
    //     else{
    //         System.out.println("INVALID BUTTON");
    //     }
    
    // Scanner sc = new Scanner(System.in);
    //   int button=sc.nextInt();
    //     switch(button){
        //     case 1:
        //     System.out.println("HELLO");
        //     break;
        //     case 2:
        //     System.out.println("NAMASTE");
        //     break;
        //     case 3:
        //     System.out.println("BONJOU");
        //     break;
        //     default:
        //     System.out.println("INVALID NUMBER");
        // }
      
    
    // MONTHS
    Scanner sc =new Scanner(System.in);
    int number=sc.nextInt();
    switch(number){
        case 1:
        System.out.println("JANUARY");
        break;
        case 2:
        System.out.println("FEBRUARY");
        break;
        case 3:
        System.out.print("MARCH");
        break;
        case 4:
        System.out.println("APRIL");
        break;
        case 5:
        System.out.println("MAY");
        break;
        case 6:
        System.out.println("JUNE");
        break;
        case 7:
        System.out.println("JULY");
        break;
        case 8:
        System.out.println("AUGUST");
        break;
        case 9:
        System.out.println("SEPTEMBER");
        break;
        case 10:
        System.out.println("OCTOBER");
        break;
        case 11:
        System.out.println("NOVEMBER");
        break;
        case 12:
        System.out.println("DECEMBER");
        break;
        default:
        System.out.println("INVALID NUMBER");
    }
    }
}