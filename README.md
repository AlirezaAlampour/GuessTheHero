# GuessTheHero

A Java-based interactive game that guesses your chosen Dota 2 hero through a series of yes/no questions.

## Overview

**GuessTheHero** is a simple yet engaging application that uses a decision tree algorithm to determine which Dota 2 hero you're thinking of. The game asks targeted questions about hero attributes (Agility, Strength, or Intelligence) and characteristics (ranged/melee, specific abilities, etc.) to narrow down possibilities and correctly identify your hero.

## Features

- **Interactive GUI**: Uses Java Swing dialog boxes for user interaction
- **Three Hero Categories**: 
  - Agility heroes
  - Strength heroes  
  - Intelligence heroes
- **Decision Tree Logic**: Efficiently narrows down hero choices through binary questions
- **Extensible Design**: Easy to add more heroes or modify existing question logic

## Project Structure

```
GuessTheHero/
├── src/
│   ├── Main.java           # Entry point and main game flow
│   ├── MyInterface.java    # Common interface for option dialogs
│   ├── Agility.java        # Agility hero guessing logic
│   ├── Strength.java       # Strength hero guessing logic
│   ├── Intelligence.java   # Intelligence hero guessing logic
│   └── struts.xml          # Struts framework configuration
├── lib/                    # External libraries (Struts, etc.)
├── web/                    # Web application resources
└── GuessTheHero.iml        # IntelliJ IDEA module configuration
```

## Requirements

- Java Development Kit (JDK) 8 or higher
- IntelliJ IDEA (recommended) or any Java IDE
- Required libraries (included in `lib/` directory):
  - Struts 2 Framework
  - Java Swing (included with JDK)

## Setup Instructions

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Ensure all libraries in the `lib/` folder are added to the classpath
3. Build the project: `Build > Build Project`
4. Run the application: Right-click on `Main.java` → `Run 'Main.main()'`

### Command Line Compilation

```bash
# Compile all Java files
javac -cp "lib/*:." src/*.java

# Run the application
java -cp "lib/*:src" Main
```

## How to Play

1. Launch the application
2. Think of a Dota 2 hero
3. Answer the series of yes/no questions that appear in dialog boxes
4. The application will guess your hero based on your answers

## Example Questions

- "Is your hero an Agility hero?"
- "Is your hero ranged?"
- Various hero-specific characteristic questions

## Supported Heroes

The game includes heroes from all three attribute categories:

### Agility Heroes
Sniper, Luna, Mirana, Medusa, Templar Assassin, Drow Ranger, Vengeful Spirit, Venomancer, Viper, Weaver, Lone Druid, Arc Warden, TerrorBlade, and more...

### Strength Heroes
(See `Strength.java` for complete list)

### Intelligence Heroes
(See `Intelligence.java` for complete list)

## Technical Details

- **GUI Framework**: Java Swing (`JOptionPane`, `JDialog`)
- **Architecture**: Object-oriented design with separate classes for each hero attribute type
- **Pattern**: Implements a custom interface (`MyInterface`) for consistent dialog handling
- **Web Framework**: Apache Struts 2 integration ready

## Customization

### Adding New Heroes

To add new heroes, modify the respective attribute class (`Agility.java`, `Strength.java`, or `Intelligence.java`):

1. Add new question strings to the `msg` array
2. Implement new decision tree branches in the `Run()` method
3. Test thoroughly to ensure proper flow

### Modifying Questions

Edit the `msg` array in each attribute class to customize the questions asked.

## Troubleshooting

- **Dialog boxes not appearing**: Ensure Java Swing is properly configured
- **Library errors**: Verify all JAR files in `lib/` are accessible
- **Compilation errors**: Check JDK version compatibility

## License

This project is open source. Feel free to modify and distribute.

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Submit a pull request

## Acknowledgments

- Dota 2 and all hero names are trademarks of Valve Corporation
- Built with Java Swing and Apache Struts
