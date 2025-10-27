from selenium import webdriver

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/")
   # element = driver.find_element(By.TAG_NAME, "About Us")
    print("Page title is: ", driver.title)
    driver.quit()   
