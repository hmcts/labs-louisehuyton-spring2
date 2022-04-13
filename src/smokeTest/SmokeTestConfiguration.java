package uk.gov.hmcts.labs.louisehuytonspring2.smoketests;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ComponentScan("uk.gov.hmcts.labs-louisehuyton-spring2.smoketests")
@PropertySource("application.properties")
public class SmokeTestConfiguration {
    @Test
    public void exampleSmokeTest() {
        Response response = makeRequest(
            "<html><body>Welcome to labs-louisehuyton-spring2 application</body></html>",
            Collections.emptyMap()
        );

        assertThat(textContentOf(response.getBody().asByteArray())).contains("Welcome to labs-louisehuyton-spring2 application");
    }
}
