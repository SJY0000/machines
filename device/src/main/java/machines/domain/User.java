package machines.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import machines.DeviceApplication;
import machines.domain.UserCreate;

@Entity
@Table(name = "User_table")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long midx;

    private String regiNm;

    private Date regiTm;

    @PostPersist
    public void onPostPersist() {
        UserCreate userCreate = new UserCreate(this);
        userCreate.publishAfterCommit();
    }

    public static UserRepository repository() {
        UserRepository userRepository = DeviceApplication.applicationContext.getBean(
            UserRepository.class
        );
        return userRepository;
    }
}
