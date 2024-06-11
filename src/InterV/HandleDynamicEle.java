

HANDLE FRAME
driver.switchTo().frame(“iframeName”);
WebElement dynamicElement = driver.findElement(By.id(“elementInFrame”));

MULTIPLE ATTRIBUTES
WebElement element = 
driver.findElement(By.xpath(“//button[starts-with(@id, ‘save’) and contains(@class, ‘publish’)]”));
		
**********Retrying Mechanism
		boolean isDynamicElementPresent = false;
		int attempts = 0;
		WebDriverWait wait = new WebDriverWait(driver, 10);  // Adjust the timeout as needed

while (!isDynamicElementPresent && attempts < 3) {
try {
dynamicElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(“dynamicElementId”)));
		        isDynamicElementPresent = true;
		    } catch (NoSuchElementException e) {
		        attempts++;
		    }
		}