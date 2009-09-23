package com.sabre.hd.easysr.forms;

import org.apache.log4j.Logger;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class ServiceRequestRobot {
	
    private String baseURL;
    private String page = "/";
    protected Selenium remoteControl;
    private String easySRServerHost = "localhost";
    private int easySRServrePort = 4444;
    private String browser = "*iexplore";
    protected static Logger logger = Logger.getLogger(ServiceRequestRobot.class.getName());
    
    public ServiceRequestRobot(){
    	
    }
    
    public void load() {
    	
    	try{
    		remoteControl = new DefaultSelenium(this.getEasySRServerHost(), this.getEasySRServerPort(), this.getBrowser(),this.getBaseUrl());
    		remoteControl.start();
    		remoteControl.open(this.getPage());
    	}catch (Exception e){
    		logger.error(e);
    	}
    }
    
    public void run() {
    	//remoteControl.open("/");
    	//remoteControl.type("q", "selenium rc");
    	//remoteControl.click("btnG");
    	//remoteControl.waitForPageToLoad("90000");	          	                   	        
    }
    
    public void finish() throws Exception{
    	try{
    		remoteControl.stop();
    	}catch (Exception e){
    		logger.error(e);
    	}    	
    }    
    
    public void setBrowserAsFirefox()
    {
    	this.browser = "*firefox";    
    }
    
    public void setBrowserAsIExplorer()
    {
    	this.browser = "*iexplorer";    
    }
    
    public String getBrowser()
    {
    	return this.browser;
    }
    
    public void setEasySRServerPort(int port)
    {
    	this.easySRServrePort = port;
    }
    
    public int getEasySRServerPort()
    {
    	return this.easySRServrePort;
    }
    
    public void setEasySRServerHost(String host)
    {
    	this.easySRServerHost = host;
    }
    
    public String getEasySRServerHost()
    {
    	return this.easySRServerHost;
    }
    
    public void setPage(String page)
    {
    	this.page = page; 
    }
    
    public String getPage(){
    	return this.page;
    }
    
    public void setBaseUrl(String url)
    {
    	this.baseURL = url;
    }
    
    public String getBaseUrl(){
    	return this.baseURL;
    }
}
