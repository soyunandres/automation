package pages;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;

import java.io.IOException;

public class ToolBarOpenApp extends  BasePage {
    private String toolBarLayoutPath = "src/main/resources/images/ToolBarOpenAppImages/Layout/Toolbar/";
    public ToolBarOpenApp() {
        super(driver);
    }
    public void windowsKey(String key) throws FindFailed, IOException {
        sendKeys(key);
        mapOfPathOfImages(toolBarLayoutPath);

    }
    public void writeKeys(String keys) throws FindFailed {
        sendKeys(keys);
    }

    public void enterKey(String Key) throws FindFailed {
        sendKeys(Key);
    }
}
