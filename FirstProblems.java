public class main{

public void main(String[] args){
       Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        System.out.print(n);
        while(n!=1){
            if(n%2==0){
                n=n/2;
                System.out.print(" " + n);
            } else{
                n=(n*3)+1;
                System.out.print(" " +n);
            }
       }

}
}
