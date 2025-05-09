package edu.fisa.ce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Step07Cicd1ApplicationTests {

    @Test
    void contextLoads() {
        // 기본 테스트
    }
    
    // 중복 코드 1: 사용자 데이터 처리 메소드들 - 비슷한 패턴 반복
    @Test
    void testUserData1() {
        String userName = "user1";
        String email = "user1@example.com";
        int age = 25;
        
        // 긴 중복 코드 블록 시작
        System.out.println("Processing user data");
        if (userName != null && !userName.isEmpty()) {
            System.out.println("User name is valid");
            if (email != null && email.contains("@")) {
                System.out.println("Email is valid");
                if (age > 0 && age < 120) {
                    System.out.println("Age is valid");
                    // 사용자 데이터 저장 로직
                    System.out.println("Saving user: " + userName);
                    System.out.println("With email: " + email);
                    System.out.println("Age: " + age);
                } else {
                    System.out.println("Invalid age");
                }
            } else {
                System.out.println("Invalid email");
            }
        } else {
            System.out.println("Invalid username");
        }
        // 긴 중복 코드 블록 끝
    }
    
    @Test
    void testUserData2() {
        String userName = "user2";
        String email = "user2@example.com";
        int age = 30;
        
        // 위와 동일한 코드 반복
        System.out.println("Processing user data");
        if (userName != null && !userName.isEmpty()) {
            System.out.println("User name is valid");
            if (email != null && email.contains("@")) {
                System.out.println("Email is valid");
                if (age > 0 && age < 120) {
                    System.out.println("Age is valid");
                    // 사용자 데이터 저장 로직
                    System.out.println("Saving user: " + userName);
                    System.out.println("With email: " + email);
                    System.out.println("Age: " + age);
                } else {
                    System.out.println("Invalid age");
                }
            } else {
                System.out.println("Invalid email");
            }
        } else {
            System.out.println("Invalid username");
        }
    }
    
    // 중복 코드 2: 계산 메소드들 - 유사한 계산 로직 반복
    private double calculateTax1(double amount) {
        // 복잡한 세금 계산 로직
        double baseRate = 0.1;
        double additionalRate = 0.05;
        double threshold = 1000.0;
        
        double tax = 0;
        if (amount <= 0) {
            return 0;
        }
        
        if (amount <= threshold) {
            tax = amount * baseRate;
        } else {
            tax = threshold * baseRate + (amount - threshold) * (baseRate + additionalRate);
        }
        
        // 반올림 처리
        tax = Math.round(tax * 100) / 100.0;
        
        return tax;
    }
    
    private double calculateTax2(double amount) {
        // 거의 동일한 세금 계산 로직 (약간 다른 변수명)
        double baseRate = 0.1;
        double additionalRate = 0.05;
        double threshold = 1000.0;
        
        double taxAmount = 0;
        if (amount <= 0) {
            return 0;
        }
        
        if (amount <= threshold) {
            taxAmount = amount * baseRate;
        } else {
            taxAmount = threshold * baseRate + (amount - threshold) * (baseRate + additionalRate);
        }
        
        // 반올림 처리
        taxAmount = Math.round(taxAmount * 100) / 100.0;
        
        return taxAmount;
    }
    
    // 중복 코드 3: 유효성 검사 메소드들
    private boolean validateUser1(String userName, String email) {
        // 중복되는 유효성 검사 로직
        if (userName == null || userName.trim().isEmpty()) {
            System.out.println("Username cannot be empty");
            return false;
        }
        
        if (userName.length() < 3 || userName.length() > 50) {
            System.out.println("Username must be between 3 and 50 characters");
            return false;
        }
        
        if (email == null || email.trim().isEmpty()) {
            System.out.println("Email cannot be empty");
            return false;
        }
        
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid email format");
            return false;
        }
        
        return true;
    }
    
    private boolean validateUser2(String userName, String email) {
        // 위와 거의 동일한 유효성 검사 로직
        if (userName == null || userName.trim().isEmpty()) {
            System.out.println("Username cannot be empty");
            return false;
        }
        
        if (userName.length() < 3 || userName.length() > 50) {
            System.out.println("Username must be between 3 and 50 characters");
            return false;
        }
        
        if (email == null || email.trim().isEmpty()) {
            System.out.println("Email cannot be empty");
            return false;
        }
        
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid email format");
            return false;
        }
        
        return true;
    }
    
    // 중복 코드 4: 반복되는 긴 if-else 체인
    @Test
    void processData1() {
        String status = "PENDING";
        
        // 긴 if-else 체인 시작
        if ("PENDING".equals(status)) {
            System.out.println("Processing pending request");
            // ... 추가 로직
            for (int i = 0; i < 5; i++) {
                System.out.println("Attempt " + (i+1));
                // 복잡한 로직
                if (i > 2) {
                    System.out.println("Progress: " + (i+1)*20 + "%");
                }
            }
        } else if ("APPROVED".equals(status)) {
            System.out.println("Request approved");
            // ... 추가 로직
            for (int i = 0; i < 3; i++) {
                System.out.println("Finalizing step " + (i+1));
            }
        } else if ("REJECTED".equals(status)) {
            System.out.println("Request rejected");
            // ... 추가 로직
        } else if ("IN_REVIEW".equals(status)) {
            System.out.println("Request is being reviewed");
            // ... 추가 로직
        } else {
            System.out.println("Unknown status");
        }
        // 긴 if-else 체인 끝
    }
    
    @Test
    void processData2() {
        String status = "APPROVED";
        
        // 위와 거의 동일한 if-else 체인
        if ("PENDING".equals(status)) {
            System.out.println("Processing pending request");
            // ... 추가 로직
            for (int i = 0; i < 5; i++) {
                System.out.println("Attempt " + (i+1));
                // 복잡한 로직
                if (i > 2) {
                    System.out.println("Progress: " + (i+1)*20 + "%");
                }
            }
        } else if ("APPROVED".equals(status)) {
            System.out.println("Request approved");
            // ... 추가 로직
            for (int i = 0; i < 3; i++) {
                System.out.println("Finalizing step " + (i+1));
            }
        } else if ("REJECTED".equals(status)) {
            System.out.println("Request rejected");
            // ... 추가 로직
        } else if ("IN_REVIEW".equals(status)) {
            System.out.println("Request is being reviewed");
            // ... 추가 로직
        } else {
            System.out.println("Unknown status");
        }
    }
}
