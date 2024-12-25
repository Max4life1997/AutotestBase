
import com.codeborne.selenide.Configuration;
import configs.Config;
import io.qameta.allure.Epic;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.open;

@Epic("Тестовый Эпик")
public class BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);

    @BeforeAll
    static void setup() {
        // Установка базового URL
        Configuration.baseUrl = Config.getInstance("local").getProperty("selenide.base.url");

        // Указание браузера (например, Chrome, Firefox)
        Configuration.browser = Config.getInstance("local").getProperty("selenide.browser");

        // Задание времени ожидания (в миллисекундах)
        Configuration.timeout = Long.parseLong(Config.getInstance("local").getProperty("selenide.timeout"));

        // Включение/выключение автоматического закрытия браузера после тестов
        Configuration.holdBrowserOpen = Boolean.parseBoolean(Config.getInstance("local").getProperty("selenide.browser.holdBrowserOpen"));

        // Указание папки для сохранения скриншотов и отчетов
        Configuration.reportsFolder = Config.getInstance("local").getProperty("selenide.reportsFolder");

        // Если требуется запуск в headless режиме
        Configuration.headless = Boolean.parseBoolean(Config.getInstance("local").getProperty("selenide.browser.headless"));

        // Установка версии браузера
        Configuration.browserVersion = Config.getInstance("local").getProperty("selenide.browser.browserVersion");

        // Установка размера окна браузера
        Configuration.browserSize = Config.getInstance("local").getProperty("selenide.browser.browserSize");

        // Установка времени ожидания загрузки страницы
        Configuration.pageLoadTimeout = Long.parseLong(Config.getInstance("local").getProperty("selenide.browser.pageLoadTimeout"));

        // Включение быстрой установки значений в полях ввода
        Configuration.fastSetValue = Boolean.parseBoolean(Config.getInstance("local").getProperty("selenide.browser.fastSetValue"));

        // Включение логов WebDriver
        Configuration.webdriverLogsEnabled = Boolean.parseBoolean(Config.getInstance("local").getProperty("selenide.webdriverLogsEnabled"));

        // Указание папки для скачиваемых файлов
        Configuration.downloadsFolder = Config.getInstance("local").getProperty("selenide.downloadsFolder");

        // Включение/выключение скриншотов при ошибках
        Configuration.screenshots = Boolean.parseBoolean(Config.getInstance("local").getProperty("selenide.screenshots"));

        // Включение/выключение сохранения исходного кода страницы при ошибках
        Configuration.savePageSource = Boolean.parseBoolean(Config.getInstance("local").getProperty("selenide.savePageSource"));
    }

    @Test
    @DisplayName("Тест название")
    void test1() {
        Logger logger = LoggerFactory.getLogger(BaseTest.class);
        logger.info("Hello World");
//        open("/text-box");
    }
}
