import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LineTest {
  private Line line;
  @BeforeEach
  public void setupLine() {
    line = new Line(1);
  }

  @Test
  @DisplayName("A Line should be initialized with a rank")
  public void init_rank_present() {
    assertEquals(1, line.getRank());
  }

  @Test
  @DisplayName("A Line should be initialized with an empty list of players")
  public void init_players_empty() {
    assertEquals(0, this.line.getPlayers().size());
  }

  @Test
  @DisplayName("hasNoPlayers returns true if there are no players on the line")
  public void hasNoPlayers_checks_for_players() {
    assertTrue(this.line.hasNoPlayers());
  }

  @Test
  @DisplayName("assign will add a player to the players list")
  public void assignPlayer_players_notEmpty() {
    Player player = new Player("Sally", "Something", "Right Wing");
    this.line.assign(player);
    assertEquals(1, this.line.getPlayers().size());
    assertEquals(player, this.line.getPlayers().get(0));
  }
}
