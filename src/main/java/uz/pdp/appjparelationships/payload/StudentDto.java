package uz.pdp.appjparelationships.payload;

import lombok.Data;

@Data
public class StudentDto {

    private String firstName;
    private String lastName;
    private Integer groupId;
    private Integer studentId;
}

