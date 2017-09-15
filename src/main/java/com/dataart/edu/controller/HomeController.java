package com.dataart.edu.controller;

import com.dataart.edu.model.RoomType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by akuzmenko on 3/3/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("roomTypes", RoomType.values());
        return "home";
    }
}
