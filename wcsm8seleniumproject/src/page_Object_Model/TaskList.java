package page_Object_Model;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskList implements IAutoConstant{
	//recorded all the webelement for create task operation
	@FindBy(xpath="//A[@class='content tasks']/IMG[@class='sizer']")private WebElement tasks;
	@FindBy(xpath="//input[@value='Create New Tasks']")private WebElement createNewTask;
	@FindBy(xpath="//select[@name='customerId']") private WebElement selectCustomer;
	@FindBy(xpath="//*[@name='projectId']") private WebElement selectProject;
	@FindBy(xpath="//TD[@id='task0.cell']/INPUT[@class='text']")private WebElement taskName;
	@FindBy(xpath="//*[@id='taskDeadline0']")private WebElement taskDeadline;
	@FindBy(xpath="//input[@name='task[0].markedToBeAddedToUserTasks']")private WebElement checkbox;
	@FindBy(xpath="//input[@value='Create Tasks']")private WebElement createTaskBtn;
	@FindBy(xpath="//a[.='Login page Test Execution']")private WebElement createdTask;
	@FindBy(xpath="//input[@value='Delete This Task']")private WebElement deleteTask;
	@FindBy(xpath="//input[@id='deleteButton']")private WebElement confirmdelete;
	
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
	
	public void createTask() throws IOException, InterruptedException
	{
		tasks.click();
		createNewTask.click();
        Select customerdrop=new Select(selectCustomer);
        Select projectdrop=new Select(selectProject);
        customerdrop.selectByVisibleText("HDFC BANK");
        projectdrop.selectByVisibleText("Android application");
        Flib flib=new Flib();
        taskName.sendKeys(flib.readPropertyData(PROP_PATH, "TaskName"));
        taskDeadline.sendKeys(flib.readPropertyData(PROP_PATH, "TaskDeadline"));
        checkbox.click();
        Thread.sleep(3000);
        createTaskBtn.click();
       }
	public void deletTask() throws InterruptedException
	{
		createdTask.click();
		Thread.sleep(2000);
		deleteTask.click();
		confirmdelete.click();
		
	}
	
	

}
