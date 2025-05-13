package edu.fisa.ce;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Step07Cicd1Application {

    // 미사용 변수들 (코드 스멜)
    private static String unusedVariable1 = "This is unused";
    private static String unusedVariable2 = "This is also unused";
    private static String unusedVariable3 = "One more unused variable";
    
    // 하드코딩된 비밀번호 (보안 취약점)
    private static final String API_KEY = "1234567890abcdef";
    private static final String DB_PASSWORD = "admin123";
    
    public static void main(String[] args) {
        // 불필요한 객체 생성 (메모리 낭비)
        List<String> unusedList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            unusedList.add("Item " + i);
        }
        
        SpringApplication.run(Step07Cicd1Application.class, args);
        
        // 복잡한 중첩 루프 (복잡도 증가)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(i + j + k);
                }
            }
        }
    }
    
    // 중복 메소드 1 (중복 코드)
    public static void duplicateMethod1() {
        System.out.println("Processing data...");
        System.out.println("Step 1: Loading");
        System.out.println("Step 2: Validating");
        System.out.println("Step 3: Transforming");
        System.out.println("Step 4: Saving");
        System.out.println("Process completed");
    }
    
    // 중복 메소드 2 (중복 코드)
    public static void duplicateMethod2() {
        System.out.println("Processing data...");
        System.out.println("Step 1: Loading");
        System.out.println("Step 2: Validating");
        System.out.println("Step 3: Transforming");
        System.out.println("Step 4: Saving");
        System.out.println("Process completed");
    }
    
    // 너무 긴 메소드 (복잡도 증가)
    public static void veryLongMethod() {
        System.out.println("Step 1");
        System.out.println("Step 2");
        System.out.println("Step 3");
        // ... 반복 ...
        System.out.println("Step 25");
        System.out.println("Step 26");
        System.out.println("Step 27");
        System.out.println("Step 28");
        System.out.println("Step 29");
        System.out.println("Step 30");
    }
}