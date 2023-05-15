package machines.domain;

import java.util.*;
import lombok.*;
import machines.domain.*;
import machines.infra.AbstractEvent;

@Data
@ToString
public class DeiviceCreated extends AbstractEvent {

    private Long id;

    public DeiviceCreated(Device aggregate) {
        super(aggregate);
    }

    public DeiviceCreated() {
        super();
    }
}
