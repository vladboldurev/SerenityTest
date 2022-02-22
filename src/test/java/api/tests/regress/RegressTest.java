package api.tests.regress;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@ExtendWith(SerenityJUnit5Extension.class)
@Tag("regress1")
public class RegressTest {



    @BeforeAll
    public static void setUp() {

    }

    @Test
    @Title("Regress 01")
    public void reg1SmokeTest() {
    }

    @Test
    @Title("Regress 02")
    public void reg2SmokeTest() {
    }

    @Test
    @Disabled
    @Title("Regress 3")
    public void reg3SmokeTest() {
    }
}