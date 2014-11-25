package com.looksmart.pages;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
	public String browser;
	public String appUrl;
	public String loginId;
	public String loginPassword;	
	public static WebDriver driver;	
	public static String screenShotPath;
	public String dbUrl;
	public String dbname;
	public String dbUserName;
	public String dbPassword;
	public String jdbcDriver;
	public String loginTextFieldId;
	public String loginpasswordTextFieldId;
	public String queryA;
	public String logInButtonXpath;
	public String admenuXpath;
	public String adMenuText;
	public String createAdGroupIconXpath;
	public String adGroupNameFieldId;
	public String titleFieldId;
	public String descritionFieldId;
	public String displayUrlFieldId;
	public String destinationUrlField;
	public String continueButtonXpath;
	public String exactMatchTextId;
	public String broadMatchTextId;
	public String submitButtonId;
	public String signOutIconXpath;
	public String adGroupNameFieldData;
	public String titleFieldData;
	public String descriptionFieldData;
	public String displayUrlFieldData;
	public String destinationUrlFieldData;
	public String exactMatchFieldData;
	public String broadMatchFieldData;
	public String exactMatchTextData;
	public String broadMatchTextData;
	public String emailTextFieldId;
	public String phoneTextFieldId;
	public String websiteUrlTextFieldId;
	public String getStartedButtonId;
	public String signuppasswordTextFieldId;
	public String confirmPasswordTextFieldId;
	public String nextButtonXpath;
	public String monthlyBudgetTextFieldId;
	public String submitButtonXpath;
	public String emailTextFieldData;
	public String phoneTextFieldData;
	public String websiteUrlTextFieldData;
	public String signuppasswordTextFieldData;
	public String confirmPasswordTextFieldData;
	public String monthlyBudgetTextFieldData;
	Properties looksmartproperties = new Properties();
	Properties objectrepositoryproperties=new Properties();
	Properties datasets=new Properties();
	Properties queries=new Properties();
	

	public BaseClass() {
		try {
			looksmartproperties.load(new FileInputStream("files/looksmartproperties"));
			objectrepositoryproperties.load(new FileInputStream("files/objectrepositoryproperties"));
			datasets.load(new FileInputStream("files/datasets"));
			queries.load(new FileInputStream(("files/queries")));
			
			browser = looksmartproperties.getProperty("Browser");
			appUrl = looksmartproperties.getProperty("Server.url");			
			dbUrl = looksmartproperties.getProperty("DB.URL");
			dbname = looksmartproperties.getProperty("DB.NAME");
			dbUserName = looksmartproperties.getProperty("DB.USERID");
			dbPassword = looksmartproperties.getProperty("DB.PASSWD");
			jdbcDriver=looksmartproperties.getProperty("JDBC.DRIVER");
			screenShotPath=looksmartproperties.getProperty("ScreenShotPath");
			
			
			loginId = looksmartproperties.getProperty("LoginId");
			loginPassword = looksmartproperties.getProperty("LoginPassword");
		
			
			
			
		
		System.out.println("broweser is :"+ browser +"Screendhot is:" + screenShotPath + "url is:" + appUrl);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getLoginId() {
		return loginId;
	}

	public void browserSelection(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "");
			driver = new ChromeDriver();
			// driver = new FirefoxDriver();

			driver.manage().window().maximize();
			// driver.get("http://staging.healthkartplus.com/")

		}
		else {
			driver = new FirefoxDriver();

		}
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	

	public void startUrl(String browser) {
		System.out.println(appUrl);
		browserSelection(browser);
		
		driver.get(appUrl);
	}

	public void getObjectRepository() {
		System.out.println("Id is"+loginTextFieldId+"password is"+loginpasswordTextFieldId+"Button is"+logInButtonXpath);
		loginTextFieldId=objectrepositoryproperties.getProperty("LoginTextFieldId");
		loginpasswordTextFieldId=objectrepositoryproperties.getProperty("LoginPasswordTextFieldId");
		logInButtonXpath=objectrepositoryproperties.getProperty("LogInButtonXpath");
		admenuXpath=objectrepositoryproperties.getProperty("AdmenuXpath");
		adMenuText=objectrepositoryproperties.getProperty("AdMenuText");
		createAdGroupIconXpath=objectrepositoryproperties.getProperty("CreateAdGroupIconXpath");
		adGroupNameFieldId=objectrepositoryproperties.getProperty("AdGroupNameFieldId");
		titleFieldId=objectrepositoryproperties.getProperty("TitleFieldId");
		descritionFieldId=objectrepositoryproperties.getProperty("DescritionFieldId");
		displayUrlFieldId=objectrepositoryproperties.getProperty("DisplayUrlFieldId");
		destinationUrlField=objectrepositoryproperties.getProperty("DestinationUrlField");
		continueButtonXpath=objectrepositoryproperties.getProperty("ContinueButtonXpath");
		exactMatchTextId=objectrepositoryproperties.getProperty("ExactMatchTextId");
		broadMatchTextId=objectrepositoryproperties.getProperty("BroadMatchTextId");
		submitButtonId=objectrepositoryproperties.getProperty("SubmitButtonId");
		signOutIconXpath=objectrepositoryproperties.getProperty("SignOutIconXpath");
		exactMatchTextData=objectrepositoryproperties.getProperty("ExactMatchTextData");
		broadMatchTextData=objectrepositoryproperties.getProperty("BroadMatchTextData");
		emailTextFieldId=objectrepositoryproperties.getProperty("EmailTextFieldId");
		phoneTextFieldId=objectrepositoryproperties.getProperty("PhoneTextFieldId");
		websiteUrlTextFieldId=objectrepositoryproperties.getProperty("WebsiteUrlTextFieldId");
		getStartedButtonId=objectrepositoryproperties.getProperty("GetStartedButtonId");
		signuppasswordTextFieldId=objectrepositoryproperties.getProperty("SignUpPasswordTextFieldId");
		confirmPasswordTextFieldId=objectrepositoryproperties.getProperty("ConfirmPasswordTextFieldId");
		nextButtonXpath=objectrepositoryproperties.getProperty("NextButtonXpath");
		monthlyBudgetTextFieldId=objectrepositoryproperties.getProperty("MonthlyBudgetTextFieldId");
		submitButtonXpath=objectrepositoryproperties.getProperty("submitButtonXpath");
		
		
		
		
		
		System.out.println(loginTextFieldId);
	}
	public void getDataSets()
	{
		adGroupNameFieldData=datasets.getProperty("AdGroupNameFieldData");
		titleFieldData=datasets.getProperty("TitleFieldData");
		descriptionFieldData=datasets.getProperty("DescriptionFieldData");
		displayUrlFieldData=datasets.getProperty("DisplayUrlFieldData");
		destinationUrlFieldData=datasets.getProperty("DestinationUrlFieldData");
		exactMatchFieldData=datasets.getProperty("ExactMatchFieldData");
		broadMatchFieldData=datasets.getProperty("BroadMatchFieldData");
		emailTextFieldData=datasets.getProperty("EmailTextFieldData");
		phoneTextFieldData=datasets.getProperty("PhoneTextFieldData");
		websiteUrlTextFieldData=datasets.getProperty("WebsiteUrlTextFieldData");
		signuppasswordTextFieldData=datasets.getProperty("SignUpPasswordTextFieldData");
		confirmPasswordTextFieldData=datasets.getProperty("ConfirmPasswordTextFieldData");
		monthlyBudgetTextFieldData=datasets.getProperty("MonthlyBudgetTextFieldData");
		submitButtonXpath=datasets.getProperty("submitButtonXpath");
				
	}
	public void getQuery()
	{
		queryA=queries.getProperty("QueryA");
	}
}
