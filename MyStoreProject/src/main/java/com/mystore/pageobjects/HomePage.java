/**
 * 
 */
package com.mystore.pageobjects;

import com.mystore.base.Baseclass;

/**
 * @author  mortuja
 *
 */
public class HomePage extends Baseclass {

	
	public String getCurrentURL() {
		
		String homePageURL=driver.getCurrentUrl();
		
		return homePageURL;
		
		
	}
}
