import io.qameta.allure.Step;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    @Step("Check that name {name} has correct format")
    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        return name.length() >= 3 && name.length() <= 19 && !name.startsWith(" ") && !name.endsWith(" ") && name.contains(" ");
    }

}