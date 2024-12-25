package utils;

import io.qameta.allure.Attachment;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AllureUtils {

    /**
     * Прикрепляет файл с логами к Allure отчету.
     *
     * @param logFilePath путь к файлу с логами
     */
    @Attachment(value = "Тестовые логи", type = "text/plain")
    public static byte[] attachLogs(String logFilePath) {
        try {
            Path path = Paths.get(logFilePath);
            return Files.readAllBytes(path);
        } catch (Exception e) {
            return ("Не удалось прикрепить логи: " + e.getMessage()).getBytes();
        }
    }
}