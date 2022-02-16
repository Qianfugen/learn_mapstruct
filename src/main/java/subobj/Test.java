package subobj;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
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
        doctor.setPatientList(Arrays.asList(p1, p2));
        DoctorDto doctorDto = DoctorMapper.INSTANCE.toDto(doctor);
        System.out.println(doctorDto);
    }
}
