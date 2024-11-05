Here’s a README file template for your project **ShapeGUIProject** that you can use in your GitHub repository:

```markdown
# ShapeGUIProject

**ShapeGUIProject** is a Java-based graphical application that allows users to draw various geometric shapes (Circle, Rectangle, Triangle, Ellipse, Square, Pentagon, Hexagon, and Star) on a canvas using a graphical user interface (GUI). The project demonstrates the use of object-oriented principles, event handling, and Java Swing for GUI components.

## Features

- **Interactive GUI**: Users can input the name of the shape they wish to create and display it on the canvas.
- **Multiple Shapes**: The following shapes can be drawn:
  - Circle
  - Rectangle
  - Triangle
  - Ellipse
  - Square
  - Pentagon
  - Hexagon
  - Star
- **Color Randomization**: Each shape is displayed with a random color.
- **Shape Display**: Shapes are centered on the canvas when added.
- **Clear & Quit Options**: Users can clear the canvas or quit the application using provided buttons.

## Getting Started

### Prerequisites

- Java 8 or higher
- An IDE or text editor to edit and run the Java code (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code)

### Clone the Repository

To get started with the project, clone this repository to your local machine:

```bash
git clone https://github.com/ewache04/ShapeGUIProject.git
```

### Running the Application

1. Open the project folder in your IDE.
2. Locate and run the `ShapeGUI.java` class, which contains the main method to start the application.

### Usage

- **Shape Input**: Type the name of the shape (e.g., "Circle", "Rectangle") into the input field.
- **Add Shape**: Click the "Add Shape" button to draw the shape.
- **Clear Canvas**: Click the "Clear Window" button to remove the current shape from the canvas.
- **Quit**: Click the "Quit" button to exit the application.

## Example

Upon running the application, the user can type a shape name (such as "Circle") and see the shape rendered in a random color at the center of the canvas.

## Project Structure

```plaintext
ShapeGUIProject/
│
├── src/
│   ├── Circle.java           # Class for Circle shape
│   ├── Rectangle.java        # Class for Rectangle shape
│   ├── Shape.java            # Abstract class for shapes
│   ├── ShapeGUI.java         # Main GUI class
│   ├── Square.java           # Class for Square shape
│   ├── Triangle.java         # Class for Triangle shape
│   ├── Ellipse.java          # Class for Ellipse shape
│   ├── Pentagon.java         # Class for Pentagon shape
│   ├── Hexagon.java          # Class for Hexagon shape
│   └── Star.java             # Class for Star shape
│
├── README.md                # Project documentation (this file)
└── LICENSE                  # License information (optional)
```

## Contributing

If you'd like to contribute to this project, feel free to fork the repository and submit a pull request. Please ensure that your contributions align with the project’s goals and follow the general coding style.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Thanks to the open-source community for their contributions to Java Swing and object-oriented design.

---

Feel free to customize the README to include more specific details or instructions based on your preferences! You can add screenshots, project goals, or other relevant sections as needed.