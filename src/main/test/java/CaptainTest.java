import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaptainTest {

  @Test
  public void getRoster_has_designation() {
    Captain capt = new Captain("Sam", "Helperton", "Center");
    Assertions.assertTrue((capt.getRosterEntry().contains("(Captain)")));
  }
}
