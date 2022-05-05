import java.util.regex.Pattern;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name == null) return false;

        return Pattern.matches("^[a-zA-Zа-яА-Я]+\\s?+[a-zA-Zа-яА-Я]+$", name)
                && name.length()>=3
                && name.length()<=19;
    }

}