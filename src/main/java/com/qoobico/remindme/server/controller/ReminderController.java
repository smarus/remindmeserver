package com.qoobico.remindme.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ruslan on 1/12/17.
 */
@Controller
@RequestMapping("/remind")
public class ReminderController {

    @RequestMapping(value = "/get" , method = RequestMethod.GET)
    public @ResponseBody String getReminder(ModelMap model){
        return "My reminder";
    }
}
