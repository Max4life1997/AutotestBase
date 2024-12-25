import io.qameta.allure.Epic;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Тестовый Эпик")
public class BaseTest {

    @Test
    @DisplayName("Тест название")
    void test1() {
        System.out.printf("Hello");
    }

}
