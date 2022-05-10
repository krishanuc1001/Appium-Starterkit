import constants.TestGroups;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.apidemos.home.APIDemosHomePage;

public class AndroidTest extends BaseTest {

    @Test(groups = {TestGroups.ANDROID})
    public void testLogText() {
        String logText = new APIDemosHomePage(this.driver)
                .openText()
                .tapOnLogTextBox()
                .tapOnAddButton()
                .getLogText();

        Assert.assertEquals(logText, "This is a test");
    }
}
