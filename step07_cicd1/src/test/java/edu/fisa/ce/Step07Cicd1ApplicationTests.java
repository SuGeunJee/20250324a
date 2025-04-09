package edu.fisa.ce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Step07Cicd1ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testAddition() {
		int result = 2 + 3;
		System.out.println("실행");
		assertEquals(5, result); // 성공: 5 == 5
		System.out.println("성공");
	}

}
