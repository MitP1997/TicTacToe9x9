# TicTacToe9x9

A 9x9 tic tac toe game developed using java swings

**Rules**:
- The entire game has 9 - 3x3 grids
- The first person is free to play anywhere on the 9x9 grid
- The next person has to play in the grid which is highlighted. He is not allowed to play in any other grid
  - This is decided based on the cell where the player 1 plays the first chance
  - Say for example the player plays in the bottom right cell of any of the main 3x3 grids then the next player is forced to play in the bottom right 3x3 grid only
- The player winning one of the 3x3 grid reserves the grid for himself.
- The winner is decided based on the player who succeeds in winning a line in the outer grid.
