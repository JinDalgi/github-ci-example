package my.githubciexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubCiExampleApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testFail() {
        throw new RuntimeException("실패");
    }

    @Test
    void testSuccuss() {
        System.out.println("성공");
    }
}
