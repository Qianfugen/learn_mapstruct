package collection;

import lombok.Data;

import java.util.List;

@Data
public class Hospital {
    private List<Doctor> doctors;
}
