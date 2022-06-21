@Test
	public void baselineSymptoms() throws Exception {
		WebElementManager elementManager = new WebElementManager();
		ExtentTest test = extent.createTest("Symptoms").assignCategory("Functional Test").assignDevice("EdgeDriver");
		test.info("Enter the Diagnosis Date");
int i=1;
		while (i<=7) {
			while (i % 2 != 0) {
			
		System.out.println(i);
				String bodySym = elementManager.clickRandomOptionjsOtherSymptoms(driver, "[test-id=\"test_dd_input_Symptom"+j+"_options\"].multiselect__content-wrapper>.multiselect__content>li>span", 
				"div:nth-of-type("+i+") > .input-container.select-container > .select > .multiselect > .multiselect__select", 7, 1, "input[name='SpecifyOther"+i+"]", 
				"Symptoms", 6, "FIELD FORMAT(if applicable)", 17, Constants.Field_Label_Verification, 
				Constants.Verified);
		System.out.println(bodySym);
		String input =bodySym;
		int y=i+1;
		
		switch(input) {
		
		case "Dermatologic":  
			
			elementManager.clickRandomOptionjsOtherSym(driver, "[test-id=\"test_dd_input_SymDerma"+i+"_options\"].multiselect__content-wrapper>.multiselect__content>li>span", "div:nth-of-type("+(i+1)+") > .input-container.select-container > .select > .multiselect > .multiselect__select", 3, 1);
			break;
		case "General":
			elementManager.clickRandomOptionjsOtherSym(driver, "[test-id=\"test_dd_input_SymGen"+i+"_options\"].multiselect__content-wrapper>.multiselect__content>li>span", "div:nth-of-type("+(i+1)+") > .input-container.select-container > .select > .multiselect > .multiselect__select", 3, 1);
			break;	 
		case "Respiratory":
			elementManager.clickRandomOptionjsOtherSym(driver, "[test-id=\"test_dd_input_SymResp"+i+"_options\"].multiselect__content-wrapper>.multiselect__content>li>span", "div:nth-of-type("+(i+1)+") > .input-container.select-container > .select > .multiselect > .multiselect__select", 3, 1);
			break;	
		case "Sinonasal":
			elementManager.clickRandomOptionjsOtherSym(driver, "[test-id=\"test_dd_input_SymSino"+i+"_options\"].multiselect__content-wrapper>.multiselect__content>li>span", "div:nth-of-type("+(i+1)+") > .input-container.select-container > .select > .multiselect > .multiselect__select", 3, 1);
		break;
		case "Gastrointestinal": 
			elementManager.clickRandomOptionjsOtherSym(driver, "[test-id=\"test_dd_input_SymGastro"+i+"_options\"].multiselect__content-wrapper>.multiselect__content>li>span", "div:nth-of-type("+(i+1)+") > .input-container.select-container > .select > .multiselect > .multiselect__select", 3, 1);
		break;
		case "Cardiovascular": 
			elementManager.clickRandomOptionjsOtherSym(driver, "[test-id=\"test_dd_input_SymCardio"+i+"_options\"].multiselect__content-wrapper>.multiselect__content>li>span", "div:nth-of-type("+(i+1)+") > .input-container.select-container > .select > .multiselect > .multiselect__select", 3, 1);
		break;
		case "Urinary/Bladder": 
			elementManager.clickRandomOptionjsOtherSym(driver, "[test-id=\"test_dd_input_SymUrinary"+i+"_options\"].multiselect__content-wrapper>.multiselect__content>li>span", "div:nth-of-type("+(i+1)+") > .input-container.select-container > .select > .multiselect > .multiselect__select", 3, 1);
		break;
		default: 
			System.out.println("default");
		}
		i=i+1;
		}
			i++;
		}
		
		
		
}}
