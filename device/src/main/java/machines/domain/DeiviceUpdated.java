package machines.domain;

import java.util.*;
import lombok.*;
import machines.domain.*;
import machines.infra.AbstractEvent;

@Data
@ToString
public class DeiviceUpdated extends AbstractEvent {

    private Long id;

    public DeiviceUpdated(Device aggregate) {
        super(aggregate);
    }

    public DeiviceUpdated() {
        super();
    }
}
