package com.assignments.assignment6.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Controller;

@Controller
public class ActuatorInfoExample implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("ExampleKey", "example value");
    }
}
