package stereotype_annotation.model;

import org.springframework.stereotype.Component;

@Component
public class DataStructure{

    private ExtraHours extraHours;

    public DataStructure(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }


    public void  getTotalHours() {
        System.out.println("Total Hours DataStructure: " + (25 + extraHours.getHours()));
    }
}
