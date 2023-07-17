package OrangeHRM.pageObjects.modules.admin;

import OrangeHRM.pageObjects.global.GlobalPageObjects;
import OrangeHRM.utilities.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static org.openqa.selenium.Keys.CONTROL;

public class AdminOrganization extends GlobalPageObjects {
    WebDriver driver;
    WebElement OrgResults;

    public AdminOrganization(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //TODO - Admin Organization PageObjects
    @FindBy(xpath = "//span[normalize-space()='Organization']")
    private WebElement organization;

    @FindBy(xpath = "//a[normalize-space()='General Information']")
    private WebElement generalinformation;

    @FindBy(xpath = "//a[normalize-space()='Locations']")
    private WebElement locations;

    @FindBy(xpath = "//a[normalize-space()='Structure']")
    private WebElement structure;

    //TODO - Admin General Information PageObjects
    @FindBy(css = ".oxd-switch-input--active")
    private WebElement generaleditcheckbox;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement generalorganizationname;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    private WebElement generalregistrationnumber;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
    private WebElement generaltaxid;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
    private WebElement generalphonenumber;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[6]")
    private WebElement generalfax;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[7]")
    private WebElement generalemail;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[8]")
    private WebElement generaladdressstreet1;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[9]")
    private WebElement generaladdressstreet2;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[10]")
    private WebElement generalcity;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[11]")
    private WebElement generalprovince;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[12]")
    private WebElement generalpostalcode;

    @FindBy(css = ".oxd-select-text--active")
    private List<WebElement> generalcountry;

    @FindBy(css = ".oxd-textarea")
    private WebElement generalnotes;

    @FindBy(css = ".oxd-button--medium")
    private WebElement save;

    //TODO - Admin Locations Search PageObjects
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement locationsname;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    private WebElement locationscity;

    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
    private WebElement locationscountry;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    private WebElement country;

    @FindBy(xpath = "//div[@role='option']")
    private List<WebElement> selectscountry;

    @FindBy(css = ".orangehrm-left-space")
    private WebElement search;

    @FindBy(css = ".oxd-button--ghost")
    private WebElement reset;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    private WebElement addlocation;

    //TODO - Admin Add Location Page Objects
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here ...'])[1]")
    private WebElement locationname;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here ...'])[2]")
    private WebElement locationcity;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here ...'])[3]")
    private WebElement locationprovince;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here ...'])[4]")
    private WebElement locationpostalcode;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here ...'])[5]")
    private WebElement locationphone;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here ...'])[6]")
    private WebElement locationfax;

    @FindBy(xpath = "(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical' and @placeholder='Type here ...'])[1]")
    private WebElement locationaddress;

    @FindBy(xpath = "(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical' and @placeholder='Type here ...'])[1]")
    private WebElement locationnotes;

    @FindBy(xpath = ".orangehrm-left-space")
    private WebElement locationsave;

    //TODO - Admin Organization Structure Page Objects

    @FindBy(xpath = "//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--pastel-white org-structure-card --edit']")
    private List<WebElement> structureElements;

    By strDelete = By.xpath("(//div[@class='org-action']/button[@class='oxd-icon-button org-action-icon'])[1]");

    By strEdit = By.xpath("(//div[@class='org-action']/button[@class='oxd-icon-button org-action-icon'])[2]");

    By strAddUnit = By.xpath("(//div[@class='org-action']/button[@class='oxd-icon-button org-action-icon'])[3]");

    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-left']")
    private WebElement organizationedit;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary org-structure-add']")
    private WebElement addorganization;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement addunitid;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    private WebElement addunitname;

    @FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
    private WebElement addunitdesc;

    @FindBy(xpath = ".orangehrm-left-space")
    private WebElement unitsave;

    @FindBy(css = ".oxd-dialog-close-button-position")
    private WebElement xclose;

    public void selectCountry(String SelectedCountry) {
        country.click();
        WebElement countryresult = selectscountry.stream().filter(country -> country.getText().contains(SelectedCountry)).findFirst().orElse(null);
        System.out.println(countryresult);
        countryresult.click();
    }

    public void accessAndEditGeneralInformation(String GeneralORGName, String GeneralRegistrationNumber, String GeneralTaxID, String GeneralPhone, String GeneralFax, String GeneralAddress1, String GeneralCity, String GeneralProvince, String GeneralPostal, String SelectedCountry, String GeneralNotes) throws InterruptedException {
        organization.click();
        Waits.shortPause();
        generalinformation.click();
        Waits.shortPause();
        generaleditcheckbox.click();
        Waits.shortPause();
        generalorganizationname.sendKeys(CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        generalorganizationname.sendKeys(GeneralORGName);
        Waits.shortPause();
        generalregistrationnumber.sendKeys(GeneralRegistrationNumber);
        Waits.shortPause();
        generaltaxid.sendKeys(GeneralTaxID);
        Waits.shortPause();
        generalphonenumber.sendKeys(GeneralPhone);
        Waits.shortPause();
        generalfax.sendKeys(GeneralFax);
        Waits.shortPause();
        generaladdressstreet1.sendKeys(GeneralAddress1);
        Waits.shortPause();
        generalcity.sendKeys(GeneralCity);
        Waits.shortPause();
        generalprovince.sendKeys(CONTROL, "a", Keys.DELETE);
        Waits.shortPause();
        generalprovince.sendKeys(GeneralProvince);
        Waits.shortPause();
        generalpostalcode.sendKeys(GeneralPostal);
        Waits.shortPause();
        selectCountry(SelectedCountry);
        Waits.shortPause();
        generalnotes.sendKeys(GeneralNotes);
        Waits.shortPause();
        save.click();
    }

    public void searchLocations(String LocationName, String SelectedCountry) throws InterruptedException {
        organization.click();
        Waits.shortPause();
        locations.click();
        Waits.shortPause();
        locationname.sendKeys(LocationName);
        Waits.shortPause();
        selectCountry(SelectedCountry);
        Waits.shortPause();
        search.click();
    }

    public void addLocation(String Name, String City, String Province, String SelectedCountry, String Phone, String Fax, String sendAddress, String LocationNotes) throws InterruptedException {
        organization.click();
        Waits.shortPause();
        locations.click();
        addlocation.click();
        Waits.shortPause();
        locationname.sendKeys(Name);
        Waits.shortPause();
        locationcity.sendKeys(City);
        Waits.shortPause();
        locationprovince.sendKeys(Province);
        Waits.shortPause();
        selectCountry(SelectedCountry);
        Waits.shortPause();
        locationphone.sendKeys(Phone);
        Waits.shortPause();
        locationfax.sendKeys(Fax);
        Waits.shortPause();
        locationaddress.sendKeys(sendAddress);
        Waits.shortPause();
        locationnotes.sendKeys(LocationNotes);
        Waits.shortPause();
        save.click();
    }

    public WebElement searchORGStructure(String DeptName) {
        WebElement OrgStructureResults = structureElements.stream().filter(orgresult -> orgresult.getText().contains(DeptName)).findFirst().orElse(null);
        return OrgStructureResults;
    }

    public void changeOrganizationStructure(String DeptName, String UnitOperation) throws InterruptedException {
        organization.click();
        Waits.shortPause();
        structure.click();
        Waits.shortPause();
        generaleditcheckbox.click();
        Waits.shortPause();
        OrgResults = searchORGStructure(DeptName);
        Waits.shortPause();
        if (UnitOperation.contains("Delete")) {
            OrgResults.findElement(strDelete);
        } else if (UnitOperation.contains("Edit")) {
            OrgResults.findElement(strEdit);
        } else if (UnitOperation.contains("AddUnit")) {
            OrgResults.findElement(strAddUnit);
        } else {
            System.out.println("Entered Value is not match");
            Assert.fail("Entered Value is not match");
        }
    }

    public void addOrganizationUnit(String UnitID, String UnitName, String UnitDesc) throws InterruptedException {
        organization.click();
        Waits.shortPause();
        structure.click();
        Waits.shortPause();
        generaleditcheckbox.click();
        Waits.shortPause();
        addorganization.click();
        Waits.shortPause();
        addunitid.sendKeys(UnitID);
        Waits.shortPause();
        addunitname.sendKeys(UnitName);
        Waits.shortPause();
        addunitdesc.sendKeys(UnitDesc);
        Waits.shortPause();
        unitsave.click();
    }
}