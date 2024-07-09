package LoveDale;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class AppTest {
  public static WebDriver driver;
  public static void main(String args[]) throws InterruptedException {
	  
	  String[] testData = {"rashida", "dilkash", "sachin", "sonu", "blesson"};

	// Iterate through the test process
      for (String data : testData) {
          // Perform your test process with the current data
    	  registration(data);
      }
  }
  
  public static void registration(String testData) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("TYPE URL HERE");//SMARTCAMPUS TESTING SERVER
	
	driver.findElement(By.id("inputUsername")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("passwd");
    driver.findElement(By.id("inputUsername")).click();
    driver.findElement(By.name("submitBtn")).click();
	Thread.sleep(5000);
	
    driver.findElement(By.cssSelector(".triggerSidebar")).click();
	Thread.sleep(5000);

    driver.findElement(By.cssSelector(".list-group:nth-child(1) #registration h6")).click();
    
    driver.findElement(By.linkText("Registration")).click();
    {
      WebElement dropdown = driver.findElement(By.id("admissionSoughtFor"));
      dropdown.findElement(By.xpath("//option[. = 'Play (Play)']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("admissionSoughtFor"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("admissionSoughtFor"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("admissionSoughtFor"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    {
      WebElement dropdown = driver.findElement(By.id("modeOfExamination"));
      dropdown.findElement(By.xpath("//option[. = 'Written']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("modeOfExamination"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("modeOfExamination"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("modeOfExamination"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    {
      WebElement dropdown = driver.findElement(By.id("choiceOfLanguage"));
      dropdown.findElement(By.xpath("//option[. = 'Malayalam']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("choiceOfLanguage"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("choiceOfLanguage"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("choiceOfLanguage"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    
    
    
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).sendKeys(testData);
    driver.findElement(By.id("lastName")).click();
    driver.findElement(By.id("lastName")).sendKeys("gt");
    Thread.sleep(7000);//photo
    
    
    {
      WebElement dropdown = driver.findElement(By.id("religionId"));
      dropdown.findElement(By.xpath("//option[. = 'Islam']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("religionId"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("religionId"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("religionId"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    {
      WebElement dropdown = driver.findElement(By.id("casteId"));
      dropdown.findElement(By.xpath("//option[. = 'Muslim']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("casteId"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("casteId"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("casteId"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    {
      WebElement dropdown = driver.findElement(By.id("categoryId"));
      dropdown.findElement(By.xpath("//option[. = 'General']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("categoryId"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("categoryId"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("categoryId"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    Thread.sleep(8000);//for dob selection
    
    {
      WebElement dropdown = driver.findElement(By.id("nationality"));
      dropdown.findElement(By.xpath("//option[. = 'Indian']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("nationality"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("nationality"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("nationality"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    {
      WebElement dropdown = driver.findElement(By.id("stateId"));
      dropdown.findElement(By.xpath("//option[. = 'Kerala']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("stateId"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("stateId"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("stateId"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    {
      WebElement dropdown = driver.findElement(By.id("gender"));
      dropdown.findElement(By.xpath("//option[. = 'Male']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("gender"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("gender"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("gender"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    {
      WebElement dropdown = driver.findElement(By.id("bloodGroup"));
      dropdown.findElement(By.xpath("//option[. = 'A-']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("bloodGroup"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("bloodGroup"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("bloodGroup"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".row:nth-child(9) .form-row:nth-child(4)")).click();
    {
      WebElement dropdown = driver.findElement(By.id("foodPreference"));
      dropdown.findElement(By.xpath("//option[. = 'Vegetarian']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("foodPreference"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("foodPreference"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("foodPreference"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    Thread.sleep(3000);//scroll for save into view
    
    driver.findElement(By.name("action")).click();
    driver.switchTo().alert().accept();//upto save student details
    driver.switchTo().alert().accept();
    
    Thread.sleep(5000);//for loading next page
    
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("drdr@yygy.tdtd");
    Thread.sleep(3000);
    driver.findElement(By.id("phone")).click();
    driver.findElement(By.id("phone")).sendKeys("9888888888");
    driver.findElement(By.id("permanentAddress")).click();
    driver.findElement(By.id("permanentAddress")).sendKeys("rdtrdtrdtr");
    driver.findElement(By.id("presentAdress")).click();
    driver.findElement(By.id("presentAdress")).sendKeys("rdtrdtr");
    driver.findElement(By.id("guardianName")).click();
    driver.findElement(By.id("guardianName")).sendKeys("trdrdtrdt");
    {
      WebElement dropdown = driver.findElement(By.id("relationship"));
      dropdown.findElement(By.xpath("//option[. = 'Father']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("relationship"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("relationship"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("relationship"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("contact")).click();
    driver.findElement(By.id("contact")).sendKeys("8777777777");
    driver.findElement(By.id("whatsappNumber")).click();
    driver.findElement(By.id("whatsappNumber")).sendKeys("9876666666");
    
    Thread.sleep(4000);//for scroll into view
    driver.findElement(By.cssSelector("#contactDetails .col-md-12 .btn")).click();
    
    driver.switchTo().alert().accept();
    driver.switchTo().alert().accept();
    Thread.sleep(4000);//for loading next page

    {
      WebElement dropdown = driver.findElement(By.id("monthlyIncome"));
      dropdown.findElement(By.xpath("//option[. = '₹21,000 - ₹40,000']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("monthlyIncome"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("monthlyIncome"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("monthlyIncome"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("fatherName")).click();
    driver.findElement(By.id("motherName")).click();
    driver.findElement(By.id("motherName")).sendKeys("tyrytr");
    {
      WebElement dropdown = driver.findElement(By.id("fatherOccupation"));
      dropdown.findElement(By.xpath("//option[. = 'AC Mechanic']")).click();
    }
    {
      WebElement element = driver.findElement(By.id("fatherOccupation"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("fatherOccupation"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("fatherOccupation"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    {
      WebElement dropdown = driver.findElement(By.id("motherOccupation"));
      dropdown.findElement(By.xpath("//option[. = 'Carpenter']")).click();
    }
    Thread.sleep(4000);//for mother occupation
    driver.findElement(By.id("motherMobile")).click();
    driver.findElement(By.id("motherMobile")).sendKeys("7655555555");
    Thread.sleep(4000);//for scroll into view
    driver.findElement(By.cssSelector("#familyDetails .col-md-12 .btn")).click();
    driver.switchTo().alert().accept();

    driver.switchTo().alert().accept();
    driver.findElement(By.linkText("Certificate Uploads")).click();
    driver.findElement(By.id("fatherAadharNo")).click();
    driver.findElement(By.id("fatherAadharNo")).sendKeys("8777-7777-7777");
    driver.findElement(By.id("motherAadharNo")).click();
    driver.findElement(By.id("motherAadharNo")).sendKeys("6555-5555-5555");
    Thread.sleep(10000);//for aadhar pdf
    Thread.sleep(6000);//for pdf

    driver.findElement(By.cssSelector(".btn-warning")).click();
    driver.switchTo().alert().accept();
    driver.switchTo().alert().accept();
  }

  }

