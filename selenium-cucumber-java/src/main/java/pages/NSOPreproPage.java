package pages;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;

public class NSOPreproPage extends BasePage {
    private String NSOPreproDirectAccess = "src/main/resources/images/NSOPreproImages/nsoPreproDirectAccess.png";
    private String acceptUserAccountControl= "src/main/resources/images/NSOPreproImages/acceptUserAccountControl.png";
    private String acceptUserAccountControlButtonYes = "src/main/resources/images/NSOPreproImages/acceptUserAccountControlButtonYes.png";
    private String loginNSO = "src/main/resources/images/NSOPreproImages/loginNSO.png";
    private String loginNSOAcceptButton = "src/main/resources/images/NSOPreproImages/loginNSOAcceptButton.png";
    public NSOPreproPage() {
        super(driver);
    }
    public void findNSOPreproDirectAccess() throws FindFailed {
        findImage(NSOPreproDirectAccess);
        clickInImage();
    }
    public void doubleclickInNSOPreproDirectAccess() throws FindFailed {
        dobleClickInImage();
    }
    public void acceptUserAccountControl() throws FindFailed {
        findImageInImage(acceptUserAccountControl, acceptUserAccountControlButtonYes);
        clickInImage();
    }
    public void logIn(String user, String pass) throws FindFailed, InterruptedException {
        findImage(loginNSO);
        clickInImage();
        sendKeys(user);
        sendKeys(Key.TAB);
        sendKeys(pass);
        Thread.sleep(20000);
    }
    public void clickInAcceptButtonOfLoginNSOPrepro() throws FindFailed {
        findImageInImage(loginNSO,loginNSOAcceptButton);
        clickInImage();
    }

}
