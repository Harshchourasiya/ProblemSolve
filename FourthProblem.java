public class main{

public void main(String[] args){
Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        scan.nextLine();
        String[] NewNumbers = scan.nextLine().split(" ");
        long[] numbers = new long[NewNumbers.length];
        for(int i =0; i<NewNumbers.length; i++){
            if(!NewNumbers[i].equals("")) {
                numbers[i] = Integer.parseInt(NewNumbers[i].trim());
            }
        }
        long a =0;
        for(int i=0; i<n-1;i++){
            if(numbers[i]>numbers[i+1]){
                a= a+(numbers[i]-numbers[i+1]);
                numbers[i+1]=numbers[i+1]+(numbers[i]-numbers[i+1]);
            }
        }
        System.out.println(a);
    }

}
}
