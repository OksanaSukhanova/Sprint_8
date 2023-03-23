import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountParameterizedTest {
    private final String name;
    private final boolean check;

    public AccountParameterizedTest(String name, boolean check) {
        this.name = name;
        this.check = check;
    }

    @Parameterized.Parameters
    public static Object[][] accountData() {
        return new Object[][]{
                {"Yo", false},
                {"R o", true},
                {"Ma y", true},
                {"EighteenSymbols 12", true},
                {"NineteenSymbol Name", true},
                {"AlbusSeverus Potter1", false},
                {" Hermione", false},
                {"Harry ", false},
                {"Sirius Black", true}
        };
    }

    @DisplayName("Check format method works correctly with name")
    @Test
    public void checkNameToEmbossReturnsCorrectValue() {
        Account accountName = new Account(name);
        boolean checkName = accountName.checkNameToEmboss();
        assertEquals("Проверка завершилась некорректно", check, checkName);
    }
}
