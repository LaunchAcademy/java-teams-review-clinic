import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {
  private Player player;

  @BeforeEach
  public void setupPlayer() {
    this.player = new Player("Sam", "Seaborn", "Right Wing");
  }

  @Test
  @DisplayName("When initialized, a player has a firstName")
  public void init_firstName_present() {
    Assertions.assertEquals("Sam", this.player.getFirstName());
  }

  @Test
  @DisplayName("When initialized, a player has a lastName")
  public void init_lastName_present() {
    Assertions.assertEquals("Seaborn", this.player.getLastName());
  }

  @Test
  @DisplayName("When initialized, a player has a position")
  public void init_position_present() {
    Assertions.assertEquals("Right Wing", this.player.getPosition());
  }

  @Test
  @DisplayName("getRoster returns a string with the players position")
  public void getRoster_includesPosition() {
    Assertions.assertTrue(this.player.getRosterEntry().contains(this.player.getPosition()));
  }

  @Test
  @DisplayName("getRoster returns a string with the players firstName")
  public void getRoster_includes_firstName() {
    Assertions.assertTrue(this.player.getRosterEntry().contains(this.player.getFirstName()));
  }

  @Test
  @DisplayName("getRoster returns a string with the players lastName")
  public void getRoster_includes_lastName() {
    Assertions.assertTrue(this.player.getRosterEntry().contains(this.player.getLastName()));
  }
}
