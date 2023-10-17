package week06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceLowerCase {

	public static void main(String[] args) {
        List<String> listOfNames = Arrays.asList("Apple", "Banana", "Cherry");

        // 리스트를 받아 소문자로 변환하고 새로운 리스트로 반환하는 람다식
        List<String> lowercaseList = listOfNames.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        // 결과 출력
        System.out.println(listOfNames);
        System.out.println(lowercaseList);
        }

}
