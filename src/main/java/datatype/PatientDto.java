package datatype;

import lombok.Data;

import java.util.Date;

@Data
public class PatientDto {
    private int id;
    private String name;
    private Date dateOfBirth;
    private Float tall;
}
