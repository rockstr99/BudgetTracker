package com.rockstr99.budget_tracker.controller;

import com.rockstr99.budget_tracker.dao.SourceDao;
import com.rockstr99.budget_tracker.entity.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sourceMasterController")
public class SourceMasterController {

    @Autowired
    SourceDao sourceDao;

    List<Source> sources = new ArrayList<>();

    @GetMapping("/addNewMaster")
    public String getMasterSetup(Model masterSetupModel) {
        masterSetupModel.addAttribute("masterSetup", new Source());
        return "sourceJSPs/masterSetup";
    }
    @PostMapping("/submit")
    public String addMasterSetup(@ModelAttribute Source sourceDataFromUser, Model masterSetupModel) {
        boolean isSourceAdded = sourceDao.addNewSource(sourceDataFromUser);
        masterSetupModel.addAttribute("masterSetup", sourceDataFromUser);
        return "sourceJSPs/addedSources";
    }

    @GetMapping("/getAllSourceDetails")
    public String getAllSources(Model model)
    {
        model.addAttribute("sources", sourceDao.getAllSources());
        return "sourceJSPs/masterSourceDetails";
    }



}
