package updatemodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //entity
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("qianfg");
        doctor.setSpecialty("special");
        Patient p1 = new Patient();
        p1.setId(1001);
        p1.setName("zhangsan");
        Patient p2 = new Patient();
        p2.setId(1002);
        p2.setName("lisi");
        List<Patient> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        doctor.setPatientList(list);
        //dto
        DoctorDto doctorDto = new DoctorDto();
        doctorDto.setId(1);
        doctorDto.setName("qianfg111");
        doctorDto.setSpecialization("special111");
        PatientDto p11 = new PatientDto();
        p11.setId(1001);
        p11.setName("zhangsan111");
        PatientDto p22 = new PatientDto();
        p22.setId(1002);
        p22.setName("lisi111");
        doctorDto.setPatientDtoList(Arrays.asList(p11, p22));

        //dto覆盖更新entity
        DoctorMapper.INSTANCE.updateModel(doctorDto, doctor);
        System.out.println(doctor);
    }
}
