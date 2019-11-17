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
            
    });
 
    afterEach(function(){
 
    });

  function makeid(length) {
   var result           = '';
   var characters       = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
   var charactersLength = characters.length;
    for ( var i = 0; i < length; i++ ) {
      result += characters.charAt(Math.floor(Math.random() * charactersLength));
    }
  return result+'@gmail.com';
  }

  describe('test 1',()=>{
    const data=['test@gmail.com','testi@gmail.com','testing@gmail.com']
    itParam('Test no',data,async(name)=>{
      await delay(5000);
      await delay(5000);
      await driver.findElement(By.xpath(confiXpath.submail)).click(); 
      await delay(5000); 
      await driver.findElement(By.xpath(confiXpath.submail)).sendKeys(makeid(6), Key.RETURN);  
      await delay(5000); 
      await driver.findElement(By.xpath(confiXpath.subbtn)).click();   
      await delay(5000);   
    });
  });
});