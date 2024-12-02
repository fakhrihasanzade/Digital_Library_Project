package com.digital_library.Digital_Library_Project1.user.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequestForAdmin {


    String userName;

    String fullName;

    Integer age;

    String gmail;

    String password;

    String phoneNumber;

    String adress;

    String role;

}
