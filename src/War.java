
public class War {
    public static void main(String[] args) {
        RussianSoldier russian = new RussianSoldier();
        AlliedCommunication translator = new AdapterTranslator(russian);

        translator.sendMessage("attack");
        translator.sendMessage("backup");
        translator.sendMessage("hold position");
    }
}
