package collection;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class HospitalDto {
    private List<DoctorDto> doctors;

    public void addDoctor(DoctorDto doctorDto) {
        if (doctors == null) {
            doctors = new ArrayList<>();
        }
        doctors.add(doctorDto);
    }
}
