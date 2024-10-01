package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String skills() {
        return "<html>" +
                    "<body>" +
                        "<h1>" +
                            "Skills Tracker" +
                        "</h1>" +
                        "<h2>" +
                            "We have a few skills we would like to learn. Here is the list!" +
                        "</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String form() {
        return "<html>" +
                    "<head>" +
                        "<style>" +
                            "body{width:70vw;margin:auto;}" +
                            "form{display:flex;flex-wrap:wrap;}" +
                            "div{width:100%;margin:1rem 0;}" +
                            "select{width:25%;}" +
                            "label{width:100%;margin-top:0.5rem;}" +
                        "</style>" +
                    "</head>" +
                    "<body>" +
                        "<form action='/form' method='POST'>" +
                            "<label>Name: </label>" +
                            "<input type='text' name = 'name'><br />" +
                            "<label>My favorite language:</label>" +
                                "<select name='first' id='language1-select'>" +
                                    "<option value= 'python'>Python</option>" +
                                    "<option value= 'javascript'>JavaScript</option>" +
                                    "<option value= 'Java'>Java</option>" +
                                "</select><br />" +
                            "<label>My second favorite language:</label>" +
                                "<select name='second' id='language2-select'>"  +
                                    "<option value= 'python'>Python</option>" +
                                    "<option value= 'javascript'>JavaScript</option>" +
                                    "<option value= 'Java'>Java</option>" +
                                "</select><br />" +
                            "<label>My third favorite language:</label>" +
                                "<select name='third' id='language3-select'>" +
                                    "<option value= 'python'>Python</option>" +
                                    "<option value= 'javascript'>JavaScript</option>" +
                                    "<option value= 'Java'>Java</option>" +
                                "</select><br />" +
                            "<input type= 'submit' value= 'Submit'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    public String filledForm(@RequestParam String name, String first, String second, String third) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<h2>Favorite Languages</h2>" +
                            "<ol>" +
                                "<li>" + first + "</li>" +
                                "<li>" + second + "</li>" +
                                "<li>" + third + "</li>" +
                            "</ol>" +
                    "</body>" +
                "</html>";
    }

}
