package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called Once!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }

    // will have a clean object before each test
    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld2() {
        System.out.println(greeting.helloWorld("Alex"));
    }

    @Test
    void helloWorld3() {
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each.......");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After - I am only called Once!!");
    }
}