package machines.domain;

import java.util.*;
import lombok.*;
import machines.domain.*;
import machines.infra.AbstractEvent;

@Data
@ToString
public class UserUpdate extends AbstractEvent {

    private Long midx;
    private String modiNm;
    private Date modiTm;

    public UserUpdate(User aggregate) {
        super(aggregate);
    }

    public UserUpdate() {
        super();
    }
}
