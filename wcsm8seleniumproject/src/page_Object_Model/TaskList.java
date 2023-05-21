package page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	@FindBy(xpath="//A[@class='content tasks']/IMG[@class='sizer']")private WebElement tasks;
	@FindBy(xpath="//input[@value='Create New Tasks']")private WebElement createNewTask;
	@FindBy(xpath="//TABLE[@width='580']/TBODY/TR[2]/TD[@align='left']") private WebElement selectCustomer;
	@FindBy(xpath="//*[@name='projectId']") private WebElement selectProject;
	@FindBy(xpath="//TD[@id='task0.cell']/INPUT[@class='text']")private WebElement taskName;
	@FindBy(xpath="//*[@id='taskDeadline0']")private WebElement taskDeadline;
	@FindBy(xpath="//input[@value='Create Tasks']")private WebElement createTaskBtn;
	
	public TaskList(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getTasks() {
		return tasks;
	}
	public WebElement getCreateNewTask() {
		return createNewTask;
	}
	public WebElement getSelectCustomer() {
		return selectCustomer;
	}
	public WebElement getSelectProject() {
		return selectProject;
	}
	public WebElement getTaskName() {
		return taskName;
	}
	public WebElement getTaskDeadline() {
		return taskDeadline;
	}
	public WebElement getCreateTaskBtn() {
		return createTaskBtn;
	}
	
	

}
