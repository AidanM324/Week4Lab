package ie.atu.week4lab;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @NotBlank(message="You must enter a name")
    private String name;
    @NotBlank(message="You must enter a title")
    private String title;
    @Min(value=1, message="Must be greater or equal to 1")
    private int id;
    @Min(value=1, message="Must be greater or equal to 1")
    private int age;
    @Email(message="You must enter a valid E-mail")
    private String email;
    @NotBlank(message="You must enter your position")
    private String position;
    @NotBlank(message="You must enter your department")
    private String department;
}
