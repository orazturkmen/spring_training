package stereotype_annotation.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
@Data
public class DataStructure{

    @NonNull
    private ExtraHours extraHours;

    /*public DataStructure(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }*/


    public void  getTotalHours() {
        System.out.println("Total Hours DataStructure: " + (25 + extraHours.getHours()));
    }
}
