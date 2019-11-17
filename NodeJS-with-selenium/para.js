const {Builder, By, Key, until} = require('selenium-webdriver');
const itParam = require('mocha-param').itParam;
 
 const delay = require('delay');  
 var webdriver = require('selenium-webdriver');
 var confiXpath = require('././Config/Xpath');
var confiBase = require('././Config/Config');
var LoginData = require('././Config/LoginData');

 
 var assert = require('assert');

   let driver =   new Builder().forBrowser('firefox').build();


describe("syska_Tests", function(){
      before(function(){
       
     driver.get(confiBase.URL);

    });
 
    after(function(){
 
        return driver.quit();
 
    });
    
    beforeEach(function(){
        
        // do something before test case execution
        // no matter if there are failed cases
    
    });
 
    afterEach(function(){
 
        // do something after test case execution is finished
        // no matter if there are failed cases
 
    });
   describe('test 1',()=>{
    const data=['test@gmail.com','testi@gmail.com','testing@gmail.com']
    itParam('Test no',data,async(name)=>
    {
      await delay(5000);
      await delay(5000);
      await driver.findElement(By.xpath(confiXpath.submail)).click(); 
      await delay(5000); 
    await driver.findElement(By.xpath(confiXpath.submail)).sendKeys('testinggeeks@gmail.com', Key.RETURN);  
     await delay(5000); 
       await driver.findElement(By.xpath(confiXpath.subbtn)).click();  
       
    await delay(5000);
    
 
  });
   });

      

 });