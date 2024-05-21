Sudoku Solver

Overview

The Sudoku Solver is a Java program that aims to solve a given Sudoku puzzle using a backtracking algorithm. It checks for the validity of each move and recursively fills in the empty cells until a solution is found.

Features

Solves Sudoku puzzles of standard 9x9 size.
Uses a backtracking algorithm to efficiently find solutions.
Checks for the validity of each move to ensure correctness.


Usage

Clone or download the repository to your local machine.
Compile the sudoku.java file using the following command:
Copy code
javac sudoku.java
Run the compiled program using the following command:
Copy code


java sudoku
The Sudoku puzzle to be solved is defined within the main method of the sudoku.java file.
Modify the Sudoku puzzle by changing the values in the Sudoku game array.
Run the program to solve the Sudoku puzzle.
The solved Sudoku puzzle will be printed on the console.


Implementation Details

The program defines a Sudoku class containing methods to check the validity of moves and solve the puzzle.
It uses a backtracking algorithm to recursively explore possible solutions.
The program checks each row, column, and 3x3 subgrid for the presence of a number to ensure the validity of each move.
Once a solution is found, it is printed to the console.
