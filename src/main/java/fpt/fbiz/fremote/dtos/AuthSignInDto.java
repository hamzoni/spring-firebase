package fpt.fbiz.fremote.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthSignInDto {
    private String username;
    private String password;
}
