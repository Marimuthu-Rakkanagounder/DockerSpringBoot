package com.srm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerDetailsController {
	
	
	@RequestMapping("/displaycustdtls")
	public String displayCustomerDetails() {
		
	  return "S.R.Marimuthu /n"
	  		+ "S/O,Rakkanagounder /n"
	  		+ "106,Singannallur(Post) /n"
	  		+ "Kavindapadi(Vai) /n"
	  		+ "Erode(Dt) - 638455";
				
	}

}
