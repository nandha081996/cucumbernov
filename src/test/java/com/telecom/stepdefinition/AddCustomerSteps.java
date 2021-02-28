package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps {
	
	public static WebDriver driver;
	@Given("User launches telecom application")
	public void user_launches_telecom_application() {
	   WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http:/www.demo.guru99.com/telecom/index.html");
	  driver.manage().window().maximize();
	}

	@Given("User click on add customer button")
	public void user_click_on_add_customer_button() {
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("User enters the values in fields")
	public void user_enters_the_values_in_fields() {
	   driver.findElement(By.xpath("//label[@for='done']")).click();
	   driver.findElement(By.id("fname")).sendKeys("nandha");
	   driver.findElement(By.id("lname")).sendKeys("kumar");
	   driver.findElement(By.id("email")).sendKeys("nandhakumarsubbaiah@gmail.com");
	   driver.findElement(By.name("addr")).sendKeys("am here to join");
	   driver.findElement(By.id("telephoneno")).sendKeys("7845699817");
	}
	@When("User enters the values in fields by using one dimensional list")
	public void user_enters_the_values_in_fields_by_using_one_dimensional_list(io.cucumber.datatable.DataTable dataTable) {
		List<String> dataa = dataTable.asList();
		 driver.findElement(By.xpath("//label[@for='done']")).click();
		   driver.findElement(By.id("fname")).sendKeys(dataa.get(0));
		   driver.findElement(By.id("lname")).sendKeys(dataa.get(1));
		   driver.findElement(By.id("email")).sendKeys(dataa.get(2));
		   driver.findElement(By.name("addr")).sendKeys(dataa.get(3));
		   driver.findElement(By.id("telephoneno")).sendKeys(dataa.get(4));
	}
	@When("User enters the values in fields by using one dimensional map")
	public void user_enters_the_values_in_fields_by_using_one_dimensional_map(io.cucumber.datatable.DataTable dataTable) {
	Map<String, String> dataa = dataTable.asMap(String.class, String.class);
		 driver.findElement(By.xpath("//label[@for='done']")).click();
		   driver.findElement(By.id("fname")).sendKeys(dataa.get("fname"));
		   driver.findElement(By.id("lname")).sendKeys(dataa.get("lname"));
		   driver.findElement(By.id("email")).sendKeys(dataa.get("email"));
		   driver.findElement(By.name("addr")).sendKeys(dataa.get("addr"));
		   driver.findElement(By.id("telephoneno")).sendKeys(dataa.get("phneno"));
	}
	@When("User enters the values in fields by using two dimensional list")
	public void user_enters_the_values_in_fields_by_using_two_dimensional_list(io.cucumber.datatable.DataTable dataTable) {
List<List<String>> dataa = dataTable.asLists();
		 driver.findElement(By.xpath("//label[@for='done']")).click ();
		   driver.findElement(By.id("fname")).sendKeys(dataa.get(0).get(1));
		   driver.findElement(By.id("lname")).sendKeys(dataa.get(1).get(1));
		   driver.findElement(By.id("email")).sendKeys(dataa.get(2).get(2));
		   driver.findElement(By.name("addr")).sendKeys(dataa.get(1).get(0));
		   driver.findElement(By.id("telephoneno")).sendKeys(dataa.get(2).get(4));
	}
	@When("User click on submit button")
	public void user_click_on_submit_button() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("User should be displayed customer id is generated")
	public void user_should_be_displayed_customer_id_is_generated() {
	driver.findElement(By.xpath("(//td[@align='center'])[2]")).getAttribute("align");
	}
}
