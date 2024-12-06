<p align="left">
  <img src="media/Codamine.png" alt="MyLogo" width="100" height="70">
</p>

# Tic Tac Toe Game

This is a simple implementation of the classic **Tic Tac Toe** game, written in **Java**. The game supports two modes:
- **Human vs. Human**
- **Human vs. AI**

The project demonstrates the use of object-oriented principles, including inheritance and abstraction, to create a playable and extendable game.

---

## Features

- **Game Modes**:
  - Play against another human player.
  - Challenge an AI opponent.
- **Simple CLI Interface**: Interact with the game through a text-based console.
- **Robust Input Validation**: Ensures valid moves and provides feedback for invalid inputs.
- **Dynamic Board Display**: Updates the game board after each move.
- **Win/Draw Detection**: Identifies winners or declares a draw when the board is full.

---
## Technology Stack

- **Language**: Java

---

## Classes and Structure

| Class        | Description                                                                                  |
|--------------|----------------------------------------------------------------------------------------------|
| `Game`       | Entry point of the application. Handles game mode selection and manages game flow.          |
| `TicTacToe`  | Manages the game board, token placement, and win/draw logic.                                |
| `Player`     | Abstract class for players, with methods for move validation.                               |
| `HumanPlayer`| Implements the `Player` class for human players, allowing them to make moves via input.     |
| `AIPlayer`   | Implements the `Player` class for AI players, using random moves.                           |


---

## Game Rules

1. The game is played on a 3x3 grid.
2. Players take turns placing their token (`X`or `O`) on an empty cell.
3. A player wins by aligning three tokens:
	- Horizontally
	- Vertically
	- Diagonally
4. The game ends in a draw if all cells are filled without a winner.

---

## Example Gameplay

### Startup
```mathematica
Choose Game Mode:
1. For Human vs. Human
2. For Human vs. AI
```

### During the Game
```sql
Player_1 Turn
Enter The Row And The Col:
0 0
-------------
| X |   |   |
-------------
|   |   |   |
-------------
|   |   |   |
-------------
```

