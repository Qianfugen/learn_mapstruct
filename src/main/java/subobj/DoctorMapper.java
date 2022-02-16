package subobj;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PatientMapper.class})
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    @Mappings({
            @Mapping(source = "doctor.specialty", target = "specialization"),
            @Mapping(source = "doctor.patientList", target = "patientDtoList")
    })
    DoctorDto toDto(Doctor doctor);
}
