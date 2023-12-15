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
        throw new RuntimeException("Fail Test");
    }

    @Test
    void testSuccess() {
        System.out.println("Success Test");
    }
}
