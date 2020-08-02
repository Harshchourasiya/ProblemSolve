public class main{

public void main(String[] args){
 Scanner scan = new Scanner(System.in);
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int t = scan.nextInt();
        scan.nextLine();
        int i = 0;
        long[] x = new long[t];
        long[] y = new long[t];
        while (i != t) {
            try {
                String line = reader.readLine();
                String[] array = line.split(" ");
                y[i] = Long.parseLong(array[0].trim());
                x[i] = Long.parseLong(array[1].trim());
                i =i+1;
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        for (int a = 0; a < x.length; a++) {
            long col = x[a];
            long row = y[a];
            if (row <= col) {
                if (col % 2 == 0) {
                    long b = ((col - 1) * (col - 1)) + 1;
                    long ans = b + (row - 1);
                    System.out.println(ans);
                } else {
                    long b = ((col) * (col));
                    long ans = b - (row - 1);
                    System.out.println(ans);
                }
            } else {
                long colNew = col + (row-col);
                if(colNew%2 ==0){
                    long b = ((colNew-1)*(colNew-1))+1;
                    long ans = (b + (row-1))+(row-col);
                    System.out.println(ans);
                } else {
                    long b = ((colNew)*(colNew));
                    long ans = (b - (row-1))-(row-col);
                    System.out.println(ans);
                }
            }
        }
}
}
