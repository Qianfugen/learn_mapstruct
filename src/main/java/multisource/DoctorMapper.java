package multisource;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);


    @Mappings({
            @Mapping(source = "doctor.specialty", target = "specialization"),
            @Mapping(source = "education.degreeName", target = "degree")
    })
    DoctorDto toDto(Doctor doctor, Education education);
}
