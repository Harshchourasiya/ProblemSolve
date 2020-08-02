public class main{

public void main(String[] args){

Scanner scan = new Scanner(System.in);
        String[] a = scan.nextLine().split("");
        Long b = Long.valueOf(1);
        ArrayList<Long> arrayList = new ArrayList<>();
        if(a.length>0){
            for(int i=0; i<a.length; i++) {
                if(i!=a.length-1) {
                    if (a[i].equals(a[i + 1])) {
                        b = b + 1;
                    } else {
                        arrayList.add(b);
                        b = Long.valueOf(1);
                    }
                }else {
                    if(a.length>1) {
                        if (a[i].equals(a[i - 1])) {
                            arrayList.add(b);
                        }
                    }
                }
            }
        } else {
            arrayList.add(b);
        }
        Collections.sort(arrayList);
        if(arrayList.size()>1) {
            System.out.println(arrayList.get(arrayList.size() - 1));
        }
        else if(arrayList.size()==0){
            System.out.println(b);
        }
        else {
            System.out.println(arrayList.get(0));
        }
}
}
