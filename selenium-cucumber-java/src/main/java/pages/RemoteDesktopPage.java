package pages;

import org.sikuli.script.FindFailed;

public class RemoteDesktopPage extends  BasePage {
    private String  openRemoteDesktop= "src/main/resources/images/RemoteDesktopImages/mstsc_o3BowaPkaU.png";
    private  String conectionToRemoteDesktop = "src/main/resources/images/RemoteDesktopImages/idea64_y3RSmt3LMJ.png";
    private String conectionButton = "src/main/resources/images/RemoteDesktopImages/conectionButton.png";
    private String confidenceConection = "src/main/resources/images/RemoteDesktopImages/confidenceConection.png";
    private String conectionButtonConfidence = "src/main/resources/images/RemoteDesktopImages/conectionButtonConfidence.png";
    private String certificateOfConection = "src/main/resources/images/RemoteDesktopImages/certificateOfConection.png";
    private String certificateOfConectionYesButton = "src/main/resources/images/RemoteDesktopImages/certificateOfConectionYesButton.png";
    private String remoteDesktop = "src/main/resources/images/RemoteDesktopImages/remoteDesktop.png";
    private String verticalBar = "src/main/resources/images/RemoteDesktopImages/verticalBar.png";
    private String downButtonVerticalBar = "src/main/resources/images/RemoteDesktopImages/downButtonVerticalBar.png";

    public RemoteDesktopPage() {
        super(driver);
    }

    public void openRemoteDesktop() throws FindFailed {
        findImage(openRemoteDesktop);

    }
    public void conectionToRemoteDesktop() throws FindFailed {
        findImageInImage(conectionToRemoteDesktop,conectionButton);
        clickInImage();
    }
    public void conectionToConfidenceConection() throws FindFailed {
        findImageInImage(confidenceConection,conectionButtonConfidence);
        clickInImage();
    }

    public void conectWithCertificate() throws FindFailed {
        findImageInImage(certificateOfConection,certificateOfConectionYesButton);
        clickInImage();
    }

    public boolean  screenOfTheRemoteDesktop() throws FindFailed {
        if(findImage(remoteDesktop).isObserving()){
            region.highlight(1);
            return true;
        } else {
            return false;
        }

    }
    public void moveDownVerticalBar() throws FindFailed {
        findImage(verticalBar);
        region.drag(region.getTarget());
        region.dropAt(screen.find(downButtonVerticalBar).getTarget());

        }



}
