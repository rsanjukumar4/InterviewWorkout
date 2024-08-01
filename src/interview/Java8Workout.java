package interview;

import java.util.List;

public class Java8Workout {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
