package multisource;

public class Test {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("qianfg");
        doctor.setSpecialty("special");
        Education education = new Education();
        education.setDegreeName("degree111");
        education.setInstitute("institute111");
        education.setYearOfPassing(10);
        DoctorDto doctorDto = DoctorMapper.INSTANCE.toDto(doctor, education);
        System.out.println(doctorDto);
    }
}
