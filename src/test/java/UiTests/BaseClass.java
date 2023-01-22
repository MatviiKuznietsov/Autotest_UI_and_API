package UiTests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    private final String login = "MTV";
    private final String password = "24041985";

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


    @BeforeClass
    public void preparation (){
        Configuration.baseUrl = "https://freelance.lsrv.in.ua";
        Configuration.browser = "firefox";
        Configuration.savePageSource = false;
        Configuration.holdBrowserOpen = true;
        Configuration.downloadsFolder = "target/download/";
        Configuration.timeout = 10000;
        Configuration.browserSize = "1500x800";
    }
}
