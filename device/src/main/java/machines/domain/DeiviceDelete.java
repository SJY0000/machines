package machines.domain;

import java.util.*;
import lombok.*;
import machines.domain.*;
import machines.infra.AbstractEvent;

@Data
@ToString
public class DeiviceDelete extends AbstractEvent {

    private Long id;

    public DeiviceDelete(Device aggregate) {
        super(aggregate);
    }

    public DeiviceDelete() {
        super();
    }
}
