import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class SelenideRepositorySearch {

    @BeforeAll
    static void testBase() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl ="https://github.com/";
    }
}
