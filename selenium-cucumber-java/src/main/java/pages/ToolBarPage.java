package pages;

import org.sikuli.script.FindFailed;

import java.io.IOException;

public class ToolBarPage extends  BasePage {
    private String toolBarLayoutPath = "src/main/resources/images/ToolBarOpenAppImages/Layout/Toolbar/";
    private String windowsButton = "src/main/resources/images/ToolBarOpenAppImages/WindowsButton/8gTHnR079I.png";
    private String remoteDesktopConection = "src/main/resources/images/ToolBarOpenAppImages/RemoteDesktopConection/mstsc_3B591LqKfV.png";
    public ToolBarPage() {
        super(driver);
    }
    public void windowsKey(String key) throws FindFailed, IOException {
        sendKeys(key);
        bringmeAllPathsOfImages(toolBarLayoutPath);

    }
    public void writeKeys(String keys) throws FindFailed {
        sendKeys(keys);
    }

    public void enterKey(String Key) throws FindFailed {
        sendKeys(Key);
    }

    public void findWindowsButton() throws FindFailed {
        findImage(windowsButton);
    }
    public void findRemoteDesktopConection() throws FindFailed {
        findImage(remoteDesktopConection);
    }


}
