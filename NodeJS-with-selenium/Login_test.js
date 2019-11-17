
 const {Builder, By, Key, until} = require('selenium-webdriver');
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
   
 
    it('Syska Login Test', async () => {
      try{ 
  
     
    await delay(5000);
        
    await driver.findElement(By.xpath(confiXpath.LoginLink)).click();  
    await delay(5000);
    await driver.findElement(By.xpath(confiXpath.emailID)).sendKeys('testinggeeks2372@gmail.com', Key.RETURN);  
     
await delay(5000);
     await driver.findElement(By.xpath(confiXpath.password)).sendKeys('Testinggeeks2372', Key.RETURN);  
await delay(5000);
     await driver.findElement(By.xpath(confiXpath.loginClick)).click(); 
 
     await driver.getTitle().then( function(the_title){
    assert.equal("Syska", the_title);
   });
 
    await delay(5000);

      }
  catch(e){
      
           
     }    
    });
     
 });