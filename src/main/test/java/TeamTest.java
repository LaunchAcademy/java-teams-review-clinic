import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TeamTest {
  private Team team;

  @BeforeEach
  public void setupTeam() {
    this.team = new Team("Boston Bruins");
  }

  @Test
  @DisplayName("A team is initialized with a name")
  public void init_name_present() {
    assertEquals("Boston Bruins", team.getName());
  }

  @Test
  @DisplayName("A team is initialized with an empty list of members")
  public void init_empty_members() {
    assertEquals(0, team.getMembers().size());
  }

  @Test
  @DisplayName("#sign will add a player to the members list")
  public void sign_member_increases() {
    Player player = new Player("Adam", "Oates", "Center");
    team.sign(player);
    assertEquals(1, team.getMembers().size());
    assertEquals(player, team.getMembers().get(0));
  }

  @Test
  @DisplayName("If the player is already a member, they will not be added to the members list.")
  public void sign_same_player_twiceNoDupe() {
    Player player = new Player("Jon", "Snow", "Center");
    team.sign(player);
    team.sign(player);
    assertEquals(1, team.getMembers().size());
  }

  @Test
  @DisplayName("#getRoster should return each members information")
  public void getRoster_name_included() {
    Player player = new Player("Jon", "Snow", "Center");
    team.sign(player);
    System.out.println(team.getRoster());
    assertTrue(team.getRoster().contains("Snow, Jon, Center"));
  }

  @Test
  @DisplayName("A member who is a captain should have that information returned also")
  public void getDirectory_captain_designated() {
    Captain capt = new Captain("Sue", "Helper", "Left Wing");
    team.sign(capt);
    assertTrue(team.getRoster().contains("Helper, Sue, Left Wing (Captain)"));

  }

//  @Test
//  @DisplayName("A team should initialize with a list that contains 4 empty lines")
//  public void init_lines_length4() {
//    assertEquals(4, team.getLines().size());
//    for (int i = 0; i < 4; i++) {
//      assertTrue(team.getLines().get(i).hasNoPlayers());
//    }
//  }
//
//  @Test
//  @DisplayName("#getOpenLines should return all the lines that are empty")
//  public void getUnassignedLines_list_length() {
//    Player player = new Player("Jon", "Snow", "Center");
//    team.getLines().get(0).assign(player);
//    assertEquals(3, team.getOpenLines().size());
//  }
}
