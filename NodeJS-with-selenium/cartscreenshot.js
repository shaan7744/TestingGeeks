const {Builder, By, Key, until} = require('selenium-webdriver');
const delay = require('delay');  
var webdriver = require('selenium-webdriver');
var confiXpath = require('././Config/Xpath');
var confiBase = require('././Config/Config');
var LoginData = require('././Config/LoginData');
var log4js = require('log4js'); // include log4js 
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
   
  it('Syska Product to cart Test', async () => {
    try{   
      await delay(5000);    
      await driver.findElement(By.xpath(confiXpath.homeap)).click();  
      await delay(5000);
      await driver.findElement(By.xpath(confiXpath.viewprod)).click();  
      await delay(5000);
      await driver.findElement(By.xpath(confiXpath.iron)).click();  
      await delay(5000);
      await driver.findElement(By.xpath(confiXpath.cart)).click();  
      await delay(5000);
      await driver.getTitle().then( function(the_title){
      assert.equal("Syska3", the_title);
      });
      await delay(5000);
    }
    catch(e){
      driver.takeScreenshot().then(
        function(image, err) {
          require('fs').writeFile('out.jpg', image, 'base64', function(err) {
            console.log(err);
          });
        }
      );
     }    
  });   
});