public class main{

public void main(String[] args){
Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        if (n > 3) {
            if(n%2==0) {
                for (int i = n / 2; i >= 1; i--) {
                    System.out.print(i + " " + n + " ");
                    n = n - 1;
                }
            } else {
                int imp = n;
                for (int i =n/2; i>=1; i--){
                    if(i!=n/2) {
                        System.out.print(i + " " + n + " ");
                        n = n - 1;
                    } else {
                        System.out.print(n-n/2 + " " + n +  " ");
                        n = n - 1;
                    }
                }
                System.out.print(imp/2);
            }
        } else {
            if (n == 1) {
                System.out.println(1);
            } else {
                System.out.println("NO SOLUTION");
            }
        }
}
}
