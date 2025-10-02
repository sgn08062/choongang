package api.lambda.basic2;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<100;i++){
            list.add(new Random().nextInt(100) + 1);
        }

        System.out.println(list.toString());
        System.out.println();
        System.out.println("--------------------------------------------------------");

        // 중복제거
        list.stream().distinct().forEach(s->System.out.print(s + " "));
        System.out.println();
        System.out.println("--------------------------------------------------------");

        // 정렬
        list.stream().sorted().forEach(s->System.out.print(s + " "));
        System.out.println();
        System.out.println("--------------------------------------------------------");

        // 필터링 filter
        list.stream().filter( x-> x>=50).forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("--------------------------------------------------------");

        // map 새로운 리스트로 반환
        list.stream().map(s -> s%2 == 0 ? "짝" : "홀").forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("--------------------------------------------------------");

        // mapToX 다른 스트림타입으로 형변환
        long count = list.stream().mapToDouble(s -> s*s).count(); // count메서드는 반환값이 long == 최종처리
        System.out.println("리스트 개수: " + count);
        System.out.println("--------------------------------------------------------");

        // 집계함수 sum
        int sum = list.stream().mapToInt(x -> x).sum();
        System.out.println("리스트 합계: " + sum);
        System.out.println("--------------------------------------------------------");

        // average
        OptionalDouble average = list.stream().mapToInt(x->x).average();
        double avg = average.getAsDouble();
        System.out.println("리스트 평균: " + avg);
        System.out.println("--------------------------------------------------------");

        Optional<Integer> result2 = list.stream().max((x, y) -> x.compareTo(y));
        int max = result2.get();
        System.out.println("리스트 안에서 가장 큰 값: " + max);
        System.out.println("--------------------------------------------------------");

        // collect() - 새로운 타입의 컬렉션으로 집계할 때 사용함
        List<Integer> newList = list.stream().filter(i -> i>=80).collect(Collectors.toList());
        System.out.println(newList.toString());
        System.out.println("--------------------------------------------------------");

        // 배열에서 중복을 제거하고 이름순으로 정렬
        String[] arr = {"hong", "lee", "kim", "choi", " park", "kim"};
        List<String> nameList = Arrays.asList(arr);
        nameList.stream().distinct().sorted().forEach(s -> System.out.print(s + " "));
    }
}
