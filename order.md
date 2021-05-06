## Java Teams Review

We are going to be building out all the classes necessary to maintain or very own Hockey team! Make sure to follow
the order of operations below when deciding what class to work on next.
Tests have been provided as well, so be sure to use those to guide your work.

## Order of Operations

- Player
    - This class should have a constructor that takes in a string `firstName`, string `lastName`, and a string `position`.
    - Create a `getRosterEntry` method that will return a formatted string containing the players `firstName`,
      `lastName` and `position`
- Captain
    - This class should have a constructor that is inherited from the `Player` class
    - The `getRosterEntry` method should also include `"(Captain)"`
- Line
    - This class should have a constructor that takes in an integer `rank`
    - A line should start with an empty list of Players.
    - Create an `assign` method that will add a player to the players list.  
    - Create a method `hasNoPlayers` that will return true when the list of players is empty.
      - It should return false if it is not empty
    
- Team
    - This class should have a constructor that takes in a string `name`.
    - A team is initialized with an empty list of members
    - Create a `sign` method that will take a player as an argument and add them to the members list.
      - If the player is already a member, they should not be added to the list
    - Create a `getRoster` method that should return each member's information.
      
    **Non Core**
    - There are two tests commented out that can be commented back in for the `TeamTest` file.
    - A team should initialize with a list of lines that starts with 4 empty lines.
    - Create a `getOpenLines` method that should find and return all the lines that are empty.
