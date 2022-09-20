package jcastaneda.bediscussion.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {

    private Integer id;
    private String fullName;
}
