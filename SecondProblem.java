public class main{

public void main(String[] args){
  Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        scan.nextLine();
        String [] a= scan.nextLine().split(" ");
        long totalNumber = n*(n+1)/2;
        long total=0;
        for(int i=0;i<a.length; i++){
           total= total + Integer.parseInt(a[i].trim());
        }
        System.out.println(String.valueOf(totalNumber-total));

}
}
