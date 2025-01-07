import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {

        //Q1
//        List<Integer> num = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
//
//        List<Integer> newnum = num.stream().filter(n->n%2==0).collect(Collectors.toUnmodifiableList());
//        System.out.println(newnum);

        //Q2
//        List<Integer> num= Arrays.asList(23,2,42,5,6,75,4,32,45,79,88);
//
//        List<Integer> newnum= num.stream().map(n->n*2).collect(Collectors.toUnmodifiableList());;
//        System.out.println(newnum);

        //Q3
//        List<Integer> num= Arrays.asList(1,2,3,4,5);
//
//        int all= num.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(all);

       //Q4
//        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9);
//
//        List<Integer> newnum = num.stream().map(n->n*2).collect(Collectors.toList());
//        System.out.println(newnum);

        //Q5
//        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
//
//        List<Integer> newnum = num.stream().filter(n->n%2==0).collect(Collectors.toUnmodifiableList());
//        System.out.println(newnum);

        //Q6
//        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7);
//
//        int mnum= num.stream()
//                .max(Integer::compareTo)
//                .get();
//        System.out.println(mnum);


        //Q7
//        List<String> name= Arrays.asList("babc","abdhw","dhbxh","cwdjk");
//
//        List<String> newname= name.stream().sorted().collect(Collectors.toUnmodifiableList());
//        System.out.println(newname);

        //Q8
//        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8);
//
//        List<Integer> even= num.stream().filter(n->n%2==0).collect(Collectors.toUnmodifiableList());
//        List<Integer> odd= num.stream().filter(n->n%2!=0).collect(Collectors.toUnmodifiableList());
//        System.out.println("even[]="+even+",odd[]="+odd);

        //Q9
//        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7);
//        int newnum= num.stream().max(Integer::compareTo).get();
//        System.out.println(newnum);

        //Q10
//        List<Integer> num= Arrays.asList(1,2,3,4,5);
//        String newnum= num.stream().map(String::valueOf).collect(Collectors.joining(","));
//        System.out.println(newnum);

        
    }
}
