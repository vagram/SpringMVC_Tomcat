package spring.mvc.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class ThingsToDo {
    private String nameToDo;
    private String contextToDo;
    private String priority;
    private Map<String, String> priorities;
    private Map<String, String> nameToDoes;

    public ThingsToDo() {
        addPriorities();
        addNameToDoes();
    }
    private void addPriorities(){
        priorities = new HashMap<>();
        priorities.put("Low priority","Low");
        priorities.put("Middle priority", "Middle");
        priorities.put("High priority", "High");
    }
    private void addNameToDoes(){
        nameToDoes = new HashMap<>();
        nameToDoes.put("Shopping", "Shopping");
        nameToDoes.put("Study Java", "Study Java");
        nameToDoes.put("Call to Mark Aurelius", "Call to Mark Aurelius");
    }
}
