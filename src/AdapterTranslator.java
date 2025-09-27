public class AdapterTranslator implements AlliedCommunication {
    private final RussianSoldier russianSoldier;

    public AdapterTranslator(RussianSoldier russianSoldier) {
        this.russianSoldier = russianSoldier;
    }

    @Override
    public void sendMessage(String message) {
        String translated = translateToRussian(message);
        russianSoldier.soobchienie(message + " (Перевод: " + translated + ")");
    }

    private String translateToRussian(String englishMessage) {
        switch (englishMessage.toLowerCase()) {
            case "attack":
                return "Атаковать";
            case "backup":
                return "Отступать";
            case "hold position":
                return "Удерживать позицию";
            default:
                return "Неизвестная команда";
        }
    }
}
