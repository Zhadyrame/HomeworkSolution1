# MainGame Project 🎮

## Description
MainGame is a console-based text RPG where the player fights enemies, collects items, and progresses through levels. The game is designed following SOLID principles, making it extensible and easy to maintain.

## Core Mechanics
- **Player Management**: Health, experience, inventory.
- **Combat System**: Battles against enemies, taking damage.
- **Items**: Collecting and using items (potions, coins, scrolls).
- **Level Progression**: Advancing to the next level with new enemies and items.

## Installation
1. Ensure you have **JDK** (Java Development Kit) installed.
2. Clone the repository:
   ```bash
   git clone https://github.com/user/repository.git
   ```
3. Open the project in IntelliJ IDEA or any other Java-supported IDE.
4. Configure JDK if it's not detected in the project.

## Running the Game
Run the game via the command line:
```bash
java MainGame
```

## Project Structure
```
├── src/
│   ├── MainGame.java          # Main game class
│   ├── Player.java            # Player management
│   ├── Enemy.java             # Enemy entity
│   ├── ItemManager.java       # Item management
│   ├── CombatManager.java     # Combat system
│   ├── LevelManager.java      # Level progression
│   ├── items/
│   │   ├── GoldCoin.java      # Coins
│   │   ├── HealthElixir.java  # Potions
│   │   ├── MagicScroll.java   # Magic scrolls
```

## SOLID Principles Applied
- **SRP (Single Responsibility Principle)**: Each entity manages its own domain (player, combat, items, levels).
- **OCP (Open/Closed Principle)**: New enemies and items can be added without modifying existing code.
- **DIP (Dependency Inversion Principle)**: Interfaces are used for flexibility.
- **LSP (Liskov Substitution Principle)**: Subclasses can replace parent classes without altering logic.
- **ISP (Interface Segregation Principle)**: No large interfaces; each system is isolated.

## Authors
- 👨‍💻 [Zhadyrame](https://github.com/Zhadyrame)

