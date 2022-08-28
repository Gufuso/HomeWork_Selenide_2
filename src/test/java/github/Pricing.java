package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Pricing {

    @Test
    public void pricing() {
        open("https://github.com/");
        $(byTagAndText("summary", "Pricing")).hover();
        $(byText("Compare plans")).click();
        $(".h2-mktg").shouldHave(text("Get the complete developer platform."));
    }
}
