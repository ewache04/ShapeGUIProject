Here’s a README file template for your project **ShapeGUIProject** that you can use in your GitHub repository:

```markdown
# ShapeGUIProject

**ShapeGUIProject** is a Java-based graphical application that allows users to draw various geometric shape (shape.Circle, shape.Rectangle, shape.Triangle, shape.Ellipse, shape.Square, Pentagon, shape.Hexagon, and shape.Star) on a canvas using a graphical user interface (GUI). The project demonstrates the use of object-oriented principles, event handling, and Java Swing for GUI components.

## Features

- **Interactive GUI**: Users can input the name of the shape they wish to create and display it on the canvas.
- **Multiple Shapes**: The following shape can be drawn:
  - shape.Circle
  - shape.Rectangle
  - shape.Triangle
  - shape.Ellipse
  - shape.Square
  - Pentagon
  - shape.Hexagon
  - shape.Star
- **Color Randomization**: Each shape is displayed with a random color.
- **shape.Shape Display**: Shapes are centered on the canvas when added.
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

- **shape.Shape Input**: Type the name of the shape (e.g., "shape.Circle", "shape.Rectangle") into the input field.
- **Add shape.Shape**: Click the "Add shape.Shape" button to draw the shape.
- **Clear Canvas**: Click the "Clear Window" button to remove the current shape from the canvas.
- **Quit**: Click the "Quit" button to exit the application.

## Example

Upon running the application, the user can type a shape name (such as "shape.Circle") and see the shape rendered in a random color at the center of the canvas.

## Project Structure

```plaintext
ShapeGUIProject/
├── src/
│   ├── shape/
│   │   ├── BaseShape.java         # Abstract class for shapes
│   │   ├── Circle.java            # Class for Circle shape
│   │   ├── Ellipse.java           # Class for Ellipse shape
│   │   ├── Hexagon.java           # Class for Hexagon shape
│   │   ├── Pentagon.java          # Class for Pentagon shape
│   │   ├── Rectangle.java         # Class for Rectangle shape
│   │   ├── Square.java            # Class for Square shape
│   │   ├── Star.java              # Class for Star shape
│   │   ├── Triangle.java          # Class for Triangle shape
│   ├── Main.java                  # Main class to run the application
│   ├── ShapeGUI.java              # Main GUI class for rendering shapes
├── README.md                     # Project documentation
├── LICENSE                       # License information (optional)
└── structure.txt                 # Project structure file


```

## Contributing

If you'd like to contribute to this project, feel free to fork the repository and submit a pull request. Please ensure that your contributions align with the project’s goals and follow the general coding style.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Thanks to the open-source community for their contributions to Java Swing and object-oriented design.

---

Feel free to customize the README to include more specific details or instructions based on your preferences! You can add screenshots, project goals, or other relevant sections as needed.