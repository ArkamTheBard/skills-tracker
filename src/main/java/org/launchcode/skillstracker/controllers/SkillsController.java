package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/")
public class SkillsController {


    @GetMapping()
    public String rootDisplay(){
        return "<html>" +
                "<body>" +
                "<h1 style='text-align: center'>Skills Tracker</h1>" +
                "<h2 style='text-align: center'>Currently known programming languages:</h2>" +
                "<ol style='text-align: center; list-style-position: inside'>" +
                "<li>Javascript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method=RequestMethod.POST, value="form")
    public String updatedRootDisplay(@RequestParam String name, @RequestParam String skill1, @RequestParam String skill2
    ,@RequestParam String skill3){
        return "<html>" +
                "<body>" +
                "<h1 style='text-align: center'>" + name + "</h1>" +
                "<table style='margin-left: auto; margin-right: auto; border: 1px solid black; border-collapse: collapse'>" +
                "<tr>" +
                "<th style='border-collapse:collapse; border: 1px solid black'>Skill 1</th>" +
                "<th style='border-collapse:collapse; border: 1px solid black'>Skill 2</th>" +
                "<th style='border-collapse:collapse; border: 1px solid black'>Skill 3</th>" +
                "</tr>" +
                "<tr>" +
                "<td style='border-collapse:collapse; border: 1px solid black'>"+ skill1 + "</td>" +
                "<td style='border-collapse:collapse; border: 1px solid black'>" + skill2 + "</td>" +
                "<td style='border-collapse:collapse; border: 1px solid black'>" + skill3 + "</td>" +
 //                "<ol style='text-align: center; list-style-position: inside'>" +
//                "<li>" + skill1 +"</li>" +
//                "<li>"+ skill2 + "</li>" +
//                "<li>"+ skill3 +"</li>" +
//                "</ol>" +
                "</tr>"+
                "</table>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form method='post' action='form'>" +
                "<label for='name'>Name:</label>" +
                "<input type='text' name='name' id='name'> <br/>" +
                "<label for='skill1'>Skill 1:</label>" +
                "<select name='skill1' id='skill1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select> <br/>"+
                "<label for='skill2'>Skill 2:</label>" +
                "<select name='skill2' id='skill2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select> <br/>" +
                "<label for='skill3'>Skill 3:</label>" +
                "<select name='skill3' id='skill3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<input type='submit' value='submit'>"+
                "</form>" +
                "</body>" +
                "</html>";
    }
}
