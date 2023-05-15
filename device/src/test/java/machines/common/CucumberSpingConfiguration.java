package machines.common;

import io.cucumber.spring.CucumberContextConfiguration;
import machines.DeviceApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeviceApplication.class })
public class CucumberSpingConfiguration {}
