package updatemodel;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PatientMapper.class})
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    @Mappings({
            @Mapping(source = "doctorDto.patientDtoList", target = "patientList"),
            @Mapping(source = "doctorDto.specialization", target = "specialty")
    })
    void updateModel(DoctorDto doctorDto, @MappingTarget Doctor doctor);
}
