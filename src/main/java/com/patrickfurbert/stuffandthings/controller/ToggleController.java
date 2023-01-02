package com.patrickfurbert.stuffandthings.controller;

import com.patrickfurbert.stuffandthings.data.Info;
import com.patrickfurbert.stuffandthings.service.getstate.GetStateService;
import com.patrickfurbert.stuffandthings.service.togglestate.ToggleStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToggleController {

    ToggleStateService toggleStateService;
    GetStateService getStateService;
    @Autowired
    ToggleController(ToggleStateService toggleStateService,
           GetStateService getStateService){
        this.toggleStateService = toggleStateService;
        this.getStateService = getStateService;
    }

    @GetMapping(value="/toggle")
    @ResponseBody
    public String toggle(){
        Info infoPreToggle = getStateService.getInfo();
        toggleStateService.toggleState();
        Info infoPostToggle = getStateService.getInfo();
        return infoPreToggle.getToggleState().equals(infoPostToggle.getToggleState()) ? "oops, something went wrong" : "successfully toggled";
    }

    @GetMapping(value="/getInfo")
    @ResponseBody
    public Info getInfo(){
        return getStateService.getInfo();
    }
}
