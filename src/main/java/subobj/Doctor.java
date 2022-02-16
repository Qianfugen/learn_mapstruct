package subobj;

import lombok.Data;

import java.util.List;

@Data
public class Doctor {
    private int id;
    private String name;
    private String specialty;
    private List<Patient> patientList;
}
