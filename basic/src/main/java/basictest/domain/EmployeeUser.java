package basictest.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeUser {

    private Long id;

    private String name;

    private String phoneNo;

    private String address;
}
