package datatype;

import lombok.Data;

import java.util.List;

@Data
public class DoctorDto {
    private int id;
    private String name;
    private String specialization;
    private List<PatientDto> patientDtoList;
}
