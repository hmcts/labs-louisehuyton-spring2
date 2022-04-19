package uk.gov.hmcts.labs.louisehuytonspring2.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class GetWelcomeTest {

    @Autowired
    private transient MockMvc mockMvc;

    @DisplayName("Should welcome upon root request with 200 response code")
    @Test
    public void exampleSmokeTest() {
        Response response = makeRequest(
            "<html><body>Welcome to labs-louisehuyton-spring2 application</body></html>",
            Collections.emptyMap()
        );

        assertThat(textContentOf(response.getBody().asByteArray())).contains("Welcome to labs-louisehuyton-spring2 application");
    }
}
