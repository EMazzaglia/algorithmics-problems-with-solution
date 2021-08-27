package DynamicProgrammin;

import java.util.ArrayList;
import java.util.List;

public class FibonnaciAsList {

    public static void main(String[] args) {
        List<Integer> result = fib(5);
        for (Integer number: result) {
            System.out.println(number);
        }
    }


    public static List<Integer> fib(Integer number){ // 8
        List<Integer> result = new ArrayList<>();

        if(number == 0){
            return result;
        }

        if(number == 1){
            result.add(0);
            result.add(1);
            return result;
        }

        result.add(0);
        result.add(1);

        for(int i=2; i<number; i++){
            result.add(result.get(i-1) + result.get(i-2));
        }

        return result;
    }
}

