# dungeon
Simple text-based dungeon crawler.

Methods you should know about:
  * DungeonCharacter.modifyHitPoints() - Accepts a positive or negative int.
                                          Make sure to use this for all damage/healing.
  * ViewController.updateView() - Accepts a DungeonCharacter and either an int (damage/healing) or String (statuses/actions).
                                  Used to display changes to the game state.
  * Dungeon.doAction() - Accepts a Hero, a Monster, and the Hero's choice from their action list.
                         Performs the requested action using method reflection.
