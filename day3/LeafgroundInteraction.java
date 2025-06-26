package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundInteraction {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		//System.out.println(title);
		if(title.equals("Dashboard")) {
			System.out.println("The titlename is :" + "Dashboard");
		}
		else {
			System.out.println("not the expected title");
		}
		driver.get("https://leafground.com/button.xhtml");
		WebElement element = driver.findElement(By.xpath("//span[text()='Disabled']/ancestor::button"));
		boolean element1 = element.isEnabled();
		System.out.println(element1);
		
		WebElement submitposition = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		System.out.println("The postion of the element is: " + submitposition.getLocation());
		
		WebElement savebuttoncolor = driver.findElement(By.xpath("(//span[text()='Save'])/ancestor::button"));
		String colorValue = savebuttoncolor.getCssValue("background-color");
		System.out.println("The color of the elements is: " + colorValue);
		
		WebElement heightwidth = driver.findElement(By.xpath("(//span[text()='Submit']/ancestor::button)[2]"));
		Dimension heightandwidth = heightwidth.getSize();
		System.out.println("The height and width of the element is: " + heightandwidth);
		driver.close();
	}

	

}
