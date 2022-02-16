package collection;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Mapper
public interface DoctorMapper {

    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    @Mapping(source = "doctor.specialty", target = "specialization")
    DoctorDto toDto(Doctor doctor);

    List<DoctorDto> listConvert(List<Doctor> doctors);

    Set<DoctorDto> setConvert(Set<Doctor> doctors);

    Map<String, DoctorDto> mapConvert(Map<String, Doctor> doctors);
}
