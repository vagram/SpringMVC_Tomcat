package spring.mvc.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mvc.example.dto.ThingsToDo;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
@RequestMapping("/todo")
public class MyController {
    @RequestMapping("")
    public String showForm(Model model){
        model.addAttribute("thingsToDo", new ThingsToDo());
        return "home";
    }

    @RequestMapping("info")
    public String showToDo(@ModelAttribute("thingsToDo") ThingsToDo thingsToDo){
        thingsToDo.setNameToDo("VIP" + " --- " + thingsToDo.getNameToDo());
        thingsToDo.setContextToDo("VIP" + " --- " + thingsToDo.getContextToDo());
        if (Objects.equals(thingsToDo.getPriority(), "High priority")){
            thingsToDo.setPriority("VIP" + " --- " + thingsToDo.getPriority());
        }
        return "show-to-do";
    }

}
