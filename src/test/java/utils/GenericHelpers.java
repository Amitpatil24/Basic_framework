package utils;

import org.openqa.selenium.WebElement;

public class GenericHelpers {

    public void setText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
        System.out.println("Text is :"+element.getAttribute("value"));

    }
}







//
//    public void setText(WebElement element, String text){
//        element.clear();
//        element.sendKeys(text);
//        System.out.println("Text Set : " + element.getAttribute("value"));
//    }
//
//    public void clickElement(WebElement element){
//        element.click();
//        System.out.println("Clicked");
//    }
//
//    public String getString(WebElement element){
//        String str = element.getText();
//        System.out.println("Text is : " + str);
//        return str;
//    }


