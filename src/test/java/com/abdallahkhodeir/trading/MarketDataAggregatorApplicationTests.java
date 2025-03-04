package com.abdallahkhodeir.trading;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class MarketDataAggregatorApplicationTests {

	@Autowired
	private Environment env;
	@Test
	void contextLoads() {
		System.out.println("✅ Active Profiles: " + String.join(", ", env.getActiveProfiles()));
	}

}
