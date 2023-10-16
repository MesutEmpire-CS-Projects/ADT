import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

class Main {
    public static void main(String[] args) {
//        Date mydate = new Date(12, 12, 2004);
//        Integer[] initial = {2,1,3,4};
//        ArrayList<Integer> mylist = new ArrayList<>(initial);
//        System.out.println(mydate.getDate());
//        System.out.println(Arrays.toString(mylist.getArray()));
//        mylist.add(2,13);
//        System.out.println(Arrays.toString(mylist.getArray()));
//        mylist.remove(4);
//        System.out.println(Arrays.toString(mylist.getArray()));
//
//        Transaction t = new Transaction(10, new Date());

        StringBuilder sb = new StringBuilder();
        int n = 10;
        for (int i = 0 ;i<n;i++){
            System.out.println(i);
            sb.append(String.valueOf(i));
        }
        System.out.println(sb);

        ArrayList<String> l = new ArrayList<>();
        l.add("Sam");
        l.add("Kevin");
        for (String s:l){
            System.out.println(s);
        }


    }
}