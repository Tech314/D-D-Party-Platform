package com.revature.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.model.Campaign;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String init(Model model) {
    model.addAttribute("msg", "Please Enter Your Login Details");
    return "login";
  }

  @RequestMapping(method = RequestMethod.POST)
  public String submit(Model model, @ModelAttribute("loginBean") Campaign camp) {
    if (camp != null && camp.getCampaignName() != null & camp.getCampaignPass() != null) {
      if (camp.getCampaignName().equals("") && camp.getCampaignPass().equals("")) {
        model.addAttribute("msg", camp.getCampaignName());
        return "success";
      } else {
        model.addAttribute("error", "Invalid Details");
        return "login";
      }
    } else {
      model.addAttribute("error", "Please enter Details");
      return "login";
    }
  }
}