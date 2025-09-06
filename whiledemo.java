import java.util.*;
class Whiledemo {
    public static void main(String[]args){
        int n, i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        while(i<=n){
            if (i%2==1){
            System.out.println(i);
            }
            i++;
    }
    
}
}
