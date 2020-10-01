package com.csis3275.controller_gra_84;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.csis3275.model_gra_84.Party_gra_84;

@Controller
@RequestMapping("/party")

public class PartyController_gra_84 {
	
	@RequestMapping(method = RequestMethod.GET )
	public String newProfileCostumer(ModelMap model) {
		Party_gra_84 party = new Party_gra_84();
		model.addAttribute("party", party);
		return "party";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveProfile(Party_gra_84 party, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "party";
		}
		model.addAttribute("success", "Dear " + party.getFirstName() +" , your registration done successfully");
		model.addAttribute("party", party);
		return "success";
	}
	
//	@RequestMapping(method = RequestMethod.POST)
//	public String saveProfileclaculation(Party_gra_84 party, BindingResult result, ModelMap model) {
//		
//		model.addAttribute("totalnumber","Total Amount" + party.getTotalCount() );
//		model.addAttribute("party", party);
//		return "totalnumber";
//	}
	

	
	@ModelAttribute("typeOfPlate")
	public List<String> initializeplate() {
		List<String> typePlate = new ArrayList<String>();
		typePlate.add("Big Plate");
		typePlate.add("Medium Plate");
		typePlate.add("Small Plate");
		typePlate.add("Shahi Plate");
		return typePlate;
	}
	@ModelAttribute("TypeInfo")
	public List<String> initializetype() {
		List<String> partyTypeInfo = new ArrayList<String>();
		partyTypeInfo.add("Birthday party");
		partyTypeInfo.add("Surprise party");
		partyTypeInfo.add("Dinner party");
		partyTypeInfo.add("Garden party");
		partyTypeInfo.add("Cocktail party");
		partyTypeInfo.add("Tea party");
		partyTypeInfo.add("Other");
		return partyTypeInfo;
	}
}
