package machines.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import machines.DeviceApplication;
import machines.domain.DeiviceCreated;

@Entity
@Table(name = "Device_table")
@Data
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long midx;

    private Long tenantId;

    private String machineCode;

    private String machineName;

    private Long standardUph;

    private String machineType;

    @Embedded
    private UserId userId;

    @PostPersist
    public void onPostPersist() {
        DeiviceCreated deiviceCreated = new DeiviceCreated(this);
        deiviceCreated.publishAfterCommit();
    }

    public static DeviceRepository repository() {
        DeviceRepository deviceRepository = DeviceApplication.applicationContext.getBean(
            DeviceRepository.class
        );
        return deviceRepository;
    }
}
