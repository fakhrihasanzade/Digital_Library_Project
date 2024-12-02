package com.digital_library.Digital_Library_Project1.user.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponseForAdmin {

    Long id;

    String userName;

    String fullName;

    Integer age;

    String gmail;

    String phoneNumber;

    String adress;

    String role;

}
