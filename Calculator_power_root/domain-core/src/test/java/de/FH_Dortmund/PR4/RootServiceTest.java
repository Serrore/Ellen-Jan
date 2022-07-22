package de.FH_Dortmund.PR4;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class RootServiceTest {

    RootService cut;

    @BeforeEach
    void init() {
        cut = new RootService();
    }

    @Nested
    class Given_number_is_4 {

        double number;

        @BeforeEach
        void arrange() {
            number = 4;
        }

        @Nested
        class When_root_is_called {
            double result;

            @BeforeEach
            void act() {
                result = cut.root(4,0);
            }

            @Test
            void then_result_is_not_null() {

                assertThat(result).isNotNull();
            }

            @Test
            void then_result_is_2() {

                assertThat(result).isEqualTo(2);
            }
        }
    }
}