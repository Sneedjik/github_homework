import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class SelenideRepositorySearchTest {


    @Test
    void shouldFindSelenideRepositoryAtTheTop() {

        open("https://github.com/");
        $(".header-search-button").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("[data-testid=results-list] div").first().$("a").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));

    }
}
