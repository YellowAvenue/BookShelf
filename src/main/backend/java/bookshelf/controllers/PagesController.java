package bookshelf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PagesController {
    @GetMapping("/aboutUs")
    public String getAboutUs(){
        return "doc/AboutUs";
    }

    @GetMapping("/classic")
    public String getClassic(){
        return "doc/Classic";
    }

    @GetMapping("/school")
    public String getSchool(){
        return "doc/School";
    }

    @GetMapping("/mainPage")
    public String getMainPage(){
        return "doc/MainPage";
    }

    @GetMapping("/stationery")
    public String getStationery(){
        return "doc/Stationery";
    }

}
