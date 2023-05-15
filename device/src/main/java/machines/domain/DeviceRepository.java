package machines.domain;

import machines.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "devices", path = "devices")
public interface DeviceRepository
    extends PagingAndSortingRepository<Device, Long> {}
