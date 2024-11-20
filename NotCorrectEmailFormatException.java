public class NotCorrectEmailFormatException extends RuntimeException {
    public NotCorrectEmailFormatException(String email) {
        super(email); // Передаем сообщение об ошибке
    }
}
