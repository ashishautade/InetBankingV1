package com.InetBankingV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage 
{
	public  WebDriver driver;
	
	public AddCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"dob\"]")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
	@CacheLookup
	WebElement txtpinno;
	
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
	@CacheLookup
	WebElement txttelephoneno;
	
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
	@CacheLookup
	WebElement txtemailid;
	
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")
	@CacheLookup
	WebElement btnsubmit;
	
	
	
	
	public void clickAddNewCustomer()
	{
		lnkAddNewCustomer.click();
	}
	
	public void custName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void custgender()
	{
		rdGender.click();
	}
	
	public void custdob(String mm,String dd,String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custaddress(String caddress)
	{
		txtaddress.sendKeys(caddress);
	}
	
	public void custcity(String ccity)
	{
		txtcity.sendKeys(ccity);
	}
	
	public void custstate(String cstate)
	{
		txtstate.sendKeys(cstate);
	}
	
	public void custpinno(String cpinno)
	{
		txtpinno.sendKeys(cpinno);
	}
	
	public void custtelephoneno(String ctelephoneno)
	{
		txttelephoneno.sendKeys(ctelephoneno);
	}
	
	public void cemailid(String cemailid)
	{
		txtemailid.sendKeys(cemailid);	
	}
	
	public void custpassword(String cpassword)
	{
		txtpassword.sendKeys(cpassword);
	}
	
	public void custsubmit()
	{
		btnsubmit.click();
	}
}
