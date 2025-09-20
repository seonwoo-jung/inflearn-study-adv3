package stream.collectors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors3Group {

    public static void main(String[] args) {
        List<String> names = List.of("Apple", "Avocado", "Banana", "Blueberry", "Cherry");
        // 첫 글자 알파벳을 기준으로 그룹화
        Map<String, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(name -> name.substring(0, 1)));
        System.out.println("grouped = " + grouped);

        // 짝수(even)인지 여부로 분할(파티셔닝)
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("partitioned = " + partitioned);
    }
}
