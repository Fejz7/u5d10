package project.u5d10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.u5d10.entities.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
