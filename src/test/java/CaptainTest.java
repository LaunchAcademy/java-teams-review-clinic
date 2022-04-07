import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CaptainTest {

  private Captain capt;

  @BeforeEach
  public void setUpCaptain() {
    capt = new Captain("Sam", "Helperton", "Center");
  }

  @Test
  @DisplayName("Captain inherits from the Player class")
  public void capt_inherits_player() {
    Assertions.assertTrue(this.capt instanceof Player);
  }

  @Test
  @DisplayName("#getRosterEntry also contains the captains designation")
  public void getRosterEntry_has_designation() {
    Assertions.assertTrue((this.capt.getRosterEntry().contains("(Captain)")));
  }
}
