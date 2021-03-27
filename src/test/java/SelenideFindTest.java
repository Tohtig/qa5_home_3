import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SelenideFindTest {
    @Test
    void shouldFindJUnit5ExampleInSelenideWikiPage(){
        open("https://github.com/selenide/selenide");
        $(byText("Wiki")).click();
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#wiki-content").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})"));
        sleep(3000);
    }
}
