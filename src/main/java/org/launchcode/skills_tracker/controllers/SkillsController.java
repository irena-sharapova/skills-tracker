package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String startingPage(){
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h2>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "<li> Python </li>" +
                "</ol>" +
                "<p> Click <a href= '/form'> here </a> to select your favorite </p>"+
                "</body>" +
                "</html>";
    }

    //handler localhost:8080/form
@GetMapping("/form")
    public String displayForm() {
        return "<html>" +
                "<body>" +
                "<form actions= '/form' method='POST'>" +
                "<label> Name: </label>" + "<br />"+
                "<input type= 'text' name= 'userName' /> <br />" +
                "<label> My favorite language: </label>" + "<br />"+
                "<select name='choice1'>" +
                "<option value= 'Java'> Java </option>" +
                "<option value= 'JavaScript'> JavaScript </option>" +
                "<option value= 'Python'> Python </option>" +
                "</select>" + "<br />"+

                "<label> My second favorite language: </label>" + "<br />"+
                "<select name='choice2'>" + "<br />"+
                "<option value= 'Java'> Java </option>" +
                "<option value= 'JavaScript'> JavaScript </option>" +
                "<option value= 'Python'> Python </option>" +
                "</select>" + "<br />"+


                "<label> My third favorite language: </label>" + "<br />"+
                "<select name='choice3'>" +
                "<option value= 'Java'> Java </option>" +
                "<option value= 'JavaScript'> JavaScript </option>" +
                "<option value= 'Python'> Python </option>" +
                "</select>" + "<br />"+
                "<input type= 'submit' value='Submit' />" +

                "</form>" +
                "</body>" +
                "</html>";
}

@PostMapping("/form")
    public String putDataForm (@RequestParam String userName, String choice1, String choice2, String choice3) {
        return "<html>" +
                "<body>" +
                "<h1>" + userName + "<br / >" +
                "<ol>" +
                "<li>" + choice1 + "<br / >" +
                "<li>" + choice2 + "<br / >" +
                "<li>" + choice3 + "<br / >" +
                "</ol>"+
        "</body>"+
        "</html>";


}


}
