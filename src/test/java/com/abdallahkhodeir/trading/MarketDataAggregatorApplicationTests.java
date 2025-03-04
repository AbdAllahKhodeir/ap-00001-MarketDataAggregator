package com.abdallahkhodeir.trading;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // Ensure the "test" profile is being used
class MarketDataAggregatorApplicationTests {

    @Autowired
    private Environment environment;

    @Test
    void contextLoads() {
        System.out.println("✅ Active Profiles: " + String.join(", ", environment.getActiveProfiles()));
    }
}