package collection;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("qianfg111");
        doctor.setSpecialty("special111");
        Doctor doctor2 = new Doctor();
        doctor2.setId(2);
        doctor2.setName("qianfg222");
        doctor2.setSpecialty("special222");
        //list
        List<Doctor> doctorList = Arrays.asList(doctor, doctor2);
        List<DoctorDto> doctorDtoList = DoctorMapper.INSTANCE.listConvert(doctorList);
        System.out.println(doctorDtoList);
        //set
        HashSet<Doctor> doctorSet = new HashSet<>();
        doctorSet.add(doctor);
        doctorSet.add(doctor2);
        Set<DoctorDto> doctorDtoSet = DoctorMapper.INSTANCE.setConvert(doctorSet);
        System.out.println(doctorDtoSet);
        //map
        Map<String, Doctor> doctorMap = new HashMap<>();
        doctorMap.put(doctor.getName(), doctor);
        doctorMap.put(doctor2.getName(), doctor2);
        Map<String, DoctorDto> doctorDtoMap = DoctorMapper.INSTANCE.mapConvert(doctorMap);
        System.out.println(doctorDtoMap);
    }
}
