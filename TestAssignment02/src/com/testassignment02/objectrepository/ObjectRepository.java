package com.testassignment02.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ObjectRepository {

	public static WebDriver oBrowser;
//	public static ObjectRepository oPage=new ObjectRepository(oBrowser);
	public ObjectRepository(WebDriver oBrowser)
	{
		
		PageFactory.initElements(oBrowser, this);
		
	}
	
	
	
	@FindBy(xpath="//*[@class='brand-global-nav-action-search-Search__label--3PRUD']")
	private WebElement searchbox;
	public WebElement getsearch()
	{
		return searchbox;
	}
	private WebElement mainSearch;
	public WebElement getclickonsearchicon()
	{
		return mainSearch;
	}
	@FindBy(xpath="//*[@id='SEARCH_BUTTON_CONTENT']")
	private WebElement osearchbutton;
	public WebElement getclickOnSearchButton()
	{
		return osearchbutton;
	}

	@FindBy(xpath="//*[text()='Club Mahindra Madikeri, Coorg']")
	private WebElement clickonfristsearch;
	public WebElement getclickonfristsearch()
	{
		return clickonfristsearch;
	}
	@FindBy(xpath="//*[text()='Write a review']")
	private WebElement writereview;
	public WebElement getwritereview()
	{
		return writereview;
	}
	@FindBy(xpath="//*[@name='ReviewText']")
	private WebElement writeReviewOnTextfield;
	public WebElement getwriteReviewOnTextfield()
	{
		return writeReviewOnTextfield;
	}
	@FindBy(xpath="//*[@name='ReviewTitle']")
	private WebElement writeReviewOnTexttitle;
	public WebElement getwriteReviewOnTexttitle()
	{
		return writeReviewOnTexttitle;
	}
	@FindBy(xpath="//*[text()='Hotel Ratings']")
	private WebElement searchhotelsectionreview;
	public WebElement getsearchhotelsectionreview()
	{
		return searchhotelsectionreview;
	}
	
	private WebElement qid12_bubbles;
	public WebElement getservice()
	{
		return qid12_bubbles;
	}
	@FindBy(xpath="//*[@type='checkbox']")
	private WebElement submitrating;
	public WebElement getsubmitrating()
	{
		return submitrating;
	}

	
	
	
}


