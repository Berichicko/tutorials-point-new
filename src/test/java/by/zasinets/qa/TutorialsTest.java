package by.zasinets.qa;

import org.junit.Assert;
import org.junit.Test;

public class TutorialsTest extends Base {
    @Test
    public void testText() {
        Assert.assertTrue(homePage.getText());
    }

    @Test
    public void testTitle() {
        Assert.assertTrue(homePage.getTitle());
    }
}
