package machines.domain;

import java.util.*;
import lombok.*;
import machines.domain.*;
import machines.infra.AbstractEvent;

@Data
@ToString
public class UserCreate extends AbstractEvent {

    private Long midx;
    private String regiNm;
    private Date regiTm;

    public UserCreate(User aggregate) {
        super(aggregate);
    }

    public UserCreate() {
        super();
    }
}
