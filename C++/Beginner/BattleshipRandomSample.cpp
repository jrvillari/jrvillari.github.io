#include <cstdlib>
#include <iostream>

using namespace std;



void printArray(int board[][10])
{
    int row = 0;
    int col = 0;
    cout << "   0|1|2|3|4|5|6|7|8|9" << endl;
    cout << "----------------------" << endl;
    while (row < 10)
    {
        cout << row << "| ";
        while (col < 10)
        {
            if (board[row][col] == 0)
            {
                cout << " ";
            }
            else if (board[row][col] == 1)
            {
                cout << "X";
            }
            else if (board[row][col] == 2)
            {
                cout << "O";
            }
            if (col != 9)
            {
                cout << "|";
            }
            col = col + 1;
        }
        cout << endl;
        row = row + 1;
        col = 0;
    }
    return;
}

void clearBoard(int board[][10])
{
    int row=0;
    int col=0;
    int empty=0;
    while (row<10)
    {
        while (col<10)
        {
            board[row][col]=empty;
            col++;
        }
        row++;
        col=0;
    }
    return;
}

int main(int argc, char *argv[])
{
    int board[10][10] = {
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0}
    };
    int row = 0;
    int col = 0;
    int hit = 1;
    int miss = 2;
    int repeat = 0;
    int choice = 0;
    while (choice != 5)
    {
        cout << "---- Welcome to Battleyachts! ----" << endl;
        cout << "1) Play game 1" << endl;
        cout << "2) Play game 2" << endl;
        cout << "3) Play game 3" << endl;
        cout << "4) Play game 4" << endl;
        cout << "5) Exit" << endl;
        cout << "Please choose an option by entering the number corresponding to your decision: " << endl;
        cin >> choice;
        while (choice > 5 || choice < 1)
        {
            cout << "Please enter a number between 1 and 5: " << endl;
            cin >> choice;
        }
        
        if (choice == 1)
        {
            printArray(board);
            while (repeat < 38)
            {
                cout << "Which row would you like?" << endl;
                cin >> row;
                while (row > 9 || row < 0)
                {
                    cout << "Please choose a row between 0 and 9: " << endl;
                    cin >> row;
                }
                cout << "Which column would you like?" << endl;
                cin >> col;
                while (col > 9 || col < 0)
                {
                    cout << "Please choose a column between 0 and 9: " << endl;
                    cin >> col;
                }
                while (board[row][col] == hit || board[row][col] == miss)
                {
                    cout << "You have already chosen this coordinate. Please choose again." << endl;
                    cout << "Which row would you like?" << endl;
                    cin >> row;
                    while (row > 9 || row < 0)
                    {
                        cout << "Please choose a row between 0 and 9: " << endl;
                        cin >> row;
                    }
                    cout << "Which column would you like?" << endl;
                    cin >> col;
                    while (col > 9 || col < 0)
                    {
                        cout << "Please choose a column between 0 and 9: " << endl;
                        cin >> col;
                    }
                }
                
                if (row == 0 && col == 0)
                {board[row][col] = hit;
                    if (board [0][0] == hit && board[0][1] == hit && board[0][2] == hit && board[0][3] == hit && board[0][4] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 0 && col == 1)
                {board[row][col] = hit;
                    if (board [0][0] == hit && board[0][1] == hit && board[0][2] == hit && board[0][3] == hit && board[0][4] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 0 && col == 2)
                {board[row][col] = hit;
                    if (board [0][0] == hit && board[0][1] == hit && board[0][2] == hit && board[0][3] == hit && board[0][4] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 0 && col == 3)
                {board[row][col] = hit;
                    if (board [0][0] == hit && board[0][1] == hit && board[0][2] == hit && board[0][3] == hit && board[0][4] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 0 && col == 4)
                {board[row][col] = hit;
                    if (board [0][0] == hit && board[0][1] == hit && board[0][2] == hit && board[0][3] == hit && board[0][4] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                
                
                else if (row == 0 && col == 9)
                {board[row][col] = hit;
                    if (board[0][9] == hit && board[1][9] == hit && board[2][9] == hit && board[3][9] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                else if (row == 1 && col == 9)
                {board[row][col] = hit;
                    if (board[0][9] == hit && board[1][9] == hit && board[2][9] == hit && board[3][9] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                else if (row == 2 && col == 9)
                {board[row][col] = hit;
                    if (board[0][9] == hit && board[1][9] == hit && board[2][9] == hit && board[3][9] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                else if (row == 3 && col == 9)
                {board[row][col] = hit;
                    if (board[0][9] == hit && board[1][9] == hit && board[2][9] == hit && board[3][9] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                
                
                else if (row == 9 && col == 7)
                {board[row][col] = hit;
                    if (board[9][7] == hit && board[9][8] == hit && board[9][9] == hit)
                        cout << "You have sunk the Submarine!" << endl;}
                else if (row == 9 && col == 8)
                {board[row][col] = hit;
                    if (board[9][7] == hit && board[9][8] == hit && board[9][9] == hit)
                        cout << "You have sunk the Submarine!" << endl;}
                else if (row == 9 && col == 9)
                {board[row][col] = hit;
                    if (board[9][7] == hit && board[9][8] == hit && board[9][9] == hit)
                        cout << "You have sunk the Submarine!" << endl;}
                
                
                else if (row == 9 && col == 0)
                {board[row][col] = hit;
                    if (board[9][0] == hit && board[9][1] == hit && board[9][2] == hit)
                        cout << "You have sunk the Cruiser!" << endl;}
                else if (row == 9 && col == 1)
                {board[row][col] = hit;
                    if (board[9][0] == hit && board[9][1] == hit && board[9][2] == hit)
                        cout << "You have sunk the Cruiser!" << endl;}
                else if (row == 9 && col == 2)
                {board[row][col] = hit;
                    if (board[9][0] == hit && board[9][1] == hit && board[9][2] == hit)
                        cout << "You have sunk the Cruiser!" << endl;}
                
                
                else if (row == 4 && col == 0)
                {board[row][col] = hit;
                    if (board[4][0] == hit && board[5][0] == hit)
                        cout << "You have sunk the Destroyer!" << endl;}
                else if (row == 5 && col == 0)
                {board[row][col] = hit;
                    if (board[4][0] == hit && board[5][0] == hit)
                        cout << "You have sunk the Destroyer!" << endl;}
                
                else
                    board[row][col] = miss;
                
                printArray(board);
                
                if (board[0][0] == hit && board[0][1] == hit && board[0][2] == hit && board[0][3] == hit && board[0][4] == hit && board[0][9] == hit && board[1][9] == hit && board[2][9] == hit && board[3][9] == hit && board[9][7] == hit && board[9][8] == hit && board[9][9] == hit && board[9][0] == hit && board[9][1] == hit && board[9][2] == hit && board[4][0] == hit && board[5][0] == hit)
                {
                    cout << "*** Congratulations! You have won! ***" << endl;
                    repeat = 38;
                }
                if (repeat == 37)
                    cout << "No more turns left! You have lost!" << endl;
                
                repeat ++;
            }
            
            repeat = 0;
            clearBoard(board);
        }
        
        else if (choice == 2)
        {
            printArray(board);
            while (repeat < 38)
            {
                cout << "Which row would you like?" << endl;
                cin >> row;
                while (row > 9 || row < 0)
                {
                    cout << "Please choose a row between 0 and 9: " << endl;
                    cin >> row;
                }
                cout << "Which column would you like?" << endl;
                cin >> col;
                while (col > 9 || col < 0)
                {
                    cout << "Please choose a column between 0 and 9: " << endl;
                    cin >> col;
                }
                while (board[row][col] == hit || board[row][col] == miss)
                {
                    cout << "You have already chosen this coordinate. Please choose again." << endl;
                    cout << "Which row would you like?" << endl;
                    cin >> row;
                    while (row > 9 || row < 0)
                    {
                        cout << "Please choose a row between 0 and 9: " << endl;
                        cin >> row;
                    }
                    cout << "Which column would you like?" << endl;
                    cin >> col;
                    while (col > 9 || col < 0)
                    {
                        cout << "Please choose a column between 0 and 9: " << endl;
                        cin >> col;
                    }
                }
                
                
                if (row == 0 && col == 5)
                {board[row][col] = hit;
                    if (board [0][5] == hit && board[1][5] == hit && board[2][5] == hit && board[3][5] == hit && board[4][5] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 1 && col == 5)
                {board[row][col] = hit;
                    if (board [0][5] == hit && board[1][5] == hit && board[2][5] == hit && board[3][5] == hit && board[4][5] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 2 && col == 5)
                {board[row][col] = hit;
                    if (board [0][5] == hit && board[1][5] == hit && board[2][5] == hit && board[3][5] == hit && board[4][5] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 3 && col == 5)
                {board[row][col] = hit;
                    if (board [0][5] == hit && board[1][5] == hit && board[2][5] == hit && board[3][5] == hit && board[4][5] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 4 && col == 5)
                {board[row][col] = hit;
                    if (board [0][5] == hit && board[1][5] == hit && board[2][5] == hit && board[3][5] == hit && board[4][5] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                
                
                else if (row == 6 && col == 4)
                {board[row][col] = hit;
                    if (board[6][4] == hit && board[7][4] == hit && board[8][4] == hit && board[9][4] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                else if (row == 7 && col == 4)
                {board[row][col] = hit;
                    if (board[6][4] == hit && board[7][4] == hit && board[8][4] == hit && board[9][4] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                else if (row == 8 && col == 4)
                {board[row][col] = hit;
                    if (board[6][4] == hit && board[7][4] == hit && board[8][4] == hit && board[9][4] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                else if (row == 9 && col == 4)
                {board[row][col] = hit;
                    if (board[6][4] == hit && board[7][4] == hit && board[8][4] == hit && board[9][4] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                
                
                else if (row == 2 && col == 3)
                {board[row][col] = hit;
                    if (board[2][3] == hit && board[3][3] == hit && board[4][3] == hit)
                        cout << "You have sunk the Submarine!" << endl;}
                else if (row == 3 && col == 3)
                {board[row][col] = hit;
                    if (board[2][3] == hit && board[3][3] == hit && board[4][3] == hit)
                        cout << "You have sunk the Submarine!" << endl;}
                else if (row == 4 && col == 3)
                {board[row][col] = hit;
                    if (board[2][3] == hit && board[3][3] == hit && board[4][3] == hit)
                        cout << "You have sunk the Submarine!" << endl;}
                
                
                else if (row == 4 && col == 8)
                {board[row][col] = hit;
                    if (board[4][8] == hit && board[5][8] == hit && board[6][8] == hit)
                        cout << "You have sunk the Cruiser!" << endl;}
                else if (row == 5 && col == 8)
                {board[row][col] = hit;
                    if (board[4][8] == hit && board[5][8] == hit && board[6][8] == hit)
                        cout << "You have sunk the Cruiser!" << endl;}
                else if (row == 6 && col == 8)
                {board[row][col] = hit;
                    if (board[4][8] == hit && board[5][8] == hit && board[6][8] == hit)
                        cout << "You have sunk the Cruiser!" << endl;}
                
                
                else if (row == 5 && col == 1)
                {board[row][col] = hit;
                    if (board[5][1] == hit && board[6][1] == hit)
                        cout << "You have sunk the Destroyer!" << endl;}
                else if (row == 6 && col == 1)
                {board[row][col] = hit;
                    if (board[5][1] == hit && board[6][1] == hit)
                        cout << "You have sunk the Destroyer!" << endl;}
                
                else
                    board[row][col] = miss;
                
                printArray(board);
                
                if (board [0][5] == hit && board[1][5] == hit && board[2][5] == hit && board[3][5] == hit && board[4][5] == hit && board[6][4] == hit && board[7][4] == hit && board[8][4] == hit && board[9][4] == hit && board[2][3] == hit && board[3][3] == hit && board[4][3] == hit && board[4][8] == hit && board[5][8] == hit && board[6][8] == hit && board[5][1] == hit && board[6][1] == hit)
                {
                    cout << "*** Congratulations! You have won! ***" << endl;
                    repeat = 38;
                }
                if (repeat == 37)
                    cout << "No more turns left! You have lost!" << endl;
                
                repeat ++;
            }
            
            repeat = 0;
            clearBoard(board);
        }
        
        else if (choice == 3)
        {
            printArray(board);
            while (repeat < 38)
            {
                cout << "Which row would you like?" << endl;
                cin >> row;
                while (row > 9 || row < 0)
                {
                    cout << "Please choose a row between 0 and 9: " << endl;
                    cin >> row;
                }
                cout << "Which column would you like?" << endl;
                cin >> col;
                while (col > 9 || col < 0)
                {
                    cout << "Please choose a column between 0 and 9: " << endl;
                    cin >> col;
                }
                while (board[row][col] == hit || board[row][col] == miss)
                {
                    cout << "You have already chosen this coordinate. Please choose again." << endl;
                    cout << "Which row would you like?" << endl;
                    cin >> row;
                    while (row > 9 || row < 0)
                    {
                        cout << "Please choose a row between 0 and 9: " << endl;
                        cin >> row;
                    }
                    cout << "Which column would you like?" << endl;
                    cin >> col;
                    while (col > 9 || col < 0)
                    {
                        cout << "Please choose a column between 0 and 9: " << endl;
                        cin >> col;
                    }
                }
                
                if (row == 9 && col == 5)
                {board[row][col] = hit;
                    if (board [9][5] == hit && board[9][6] == hit && board[9][7] == hit && board[9][8] == hit && board[9][9] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 9 && col == 6)
                {board[row][col] = hit;
                    if (board [9][5] == hit && board[9][6] == hit && board[9][7] == hit && board[9][8] == hit && board[9][9] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 9 && col == 7)
                {board[row][col] = hit;
                    if (board [9][5] == hit && board[9][6] == hit && board[9][7] == hit && board[9][8] == hit && board[9][9] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 9 && col == 8)
                {board[row][col] = hit;
                    if (board [9][5] == hit && board[9][6] == hit && board[9][7] == hit && board[9][8] == hit && board[9][9] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 9  && col == 9)
                {board[row][col] = hit;
                    if (board [9][5] == hit && board[9][6] == hit && board[9][7] == hit && board[9][8] == hit && board[9][9] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                
                
                else if (row == 6 && col == 3)
                {board[row][col] = hit;
                    if (board[6][3] == hit && board[6][4] == hit && board[6][5] == hit && board[6][6] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                else if (row == 6 && col == 4)
                {board[row][col] = hit;
                    if (board[6][3] == hit && board[6][4] == hit && board[6][5] == hit && board[6][6] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                else if (row == 6 && col == 5)
                {board[row][col] = hit;
                    if (board[6][3] == hit && board[6][4] == hit && board[6][5] == hit && board[6][6] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                else if (row == 6 && col == 6)
                {board[row][col] = hit;
                    if (board[6][3] == hit && board[6][4] == hit && board[6][5] == hit && board[6][6] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                
                
                else if (row == 4 && col == 4)
                {board[row][col] = hit;
                    if (board[4][4] == hit && board[4][5] == hit && board[4][6] == hit)
                        cout << "You have sunk the Submarine!" << endl;}
                else if (row == 4 && col == 5)
                {board[row][col] = hit;
                    if (board[4][4] == hit && board[4][5] == hit && board[4][6] == hit)
                        cout << "You have sunk the Submarine!" << endl;}
                else if (row == 4 && col == 6)
                {board[row][col] = hit;
                    if (board[4][4] == hit && board[4][5] == hit && board[4][6] == hit)
                        cout << "You have sunk the Submarine!" << endl;}
                
                
                else if (row == 2 && col == 1)
                {board[row][col] = hit;
                    if (board[2][1] == hit && board[2][2] == hit && board[2][3] == hit)
                        cout << "You have sunk the Cruiser!" << endl;}
                else if (row == 2 && col == 2)
                {board[row][col] = hit;
                    if (board[2][1] == hit && board[2][2] == hit && board[2][3] == hit)
                        cout << "You have sunk the Cruiser!" << endl;}
                else if (row == 2 && col == 3)
                {board[row][col] = hit;
                    if (board[2][1] == hit && board[2][2] == hit && board[2][3] == hit)
                        cout << "You have sunk the Cruiser!" << endl;}
                
                
                else if (row == 0 && col == 0)
                {board[row][col] = hit;
                    if (board[0][0] == hit && board[0][1] == hit)
                        cout << "You have sunk the Destroyer!" << endl;}
                else if (row == 0 && col == 1)
                {board[row][col] = hit;
                    if (board[0][0] == hit && board[0][1] == hit)
                        cout << "You have sunk the Destroyer!" << endl;}
                
                
                else
                    board[row][col] = miss;
                
                printArray(board);
                
                if (board [9][5] == hit && board[9][6] == hit && board[9][7] == hit && board[9][8] == hit && board[9][9] == hit && board[6][3] == hit && board[6][4] == hit && board[6][5] == hit && board[6][6] == hit && board[4][4] == hit && board[4][5] == hit && board[4][6] == hit && board[2][1] == hit && board[2][2] == hit && board[2][3] == hit && board[0][0] == hit && board[0][1] == hit)
                {
                    cout << "*** Congratulations! You have won! ***" << endl;
                    repeat = 38;
                }
                if (repeat == 37)
                    cout << "No more turns left! You have lost!" << endl;
                
                repeat ++;
            }
            
            repeat = 0;
            clearBoard(board);
        }
        
        else if (choice == 4)
        {
            printArray(board);
            while (repeat < 38)
            {
                cout << "Which row would you like?" << endl;
                cin >> row;
                while (row > 9 || row < 0)
                {
                    cout << "Please choose a row between 0 and 9: " << endl;
                    cin >> row;
                }
                cout << "Which column would you like?" << endl;
                cin >> col;
                while (col > 9 || col < 0)
                {
                    cout << "Please choose a column between 0 and 9: " << endl;
                    cin >> col;
                }
                while (board[row][col] == hit || board[row][col] == miss)
                {
                    cout << "You have already chosen this coordinate. Please choose again." << endl;
                    cout << "Which row would you like?" << endl;
                    cin >> row;
                    while (row > 9 || row < 0)
                    {
                        cout << "Please choose a row between 0 and 9: " << endl;
                        cin >> row;
                    }
                    cout << "Which column would you like?" << endl;
                    cin >> col;
                    while (col > 9 || col < 0)
                    {
                        cout << "Please choose a column between 0 and 9: " << endl;
                        cin >> col;
                    }
                }
                
                
                if (row == 3 && col == 2)
                {board[row][col] = hit;
                    if (board [3][2] == hit && board[3][3] == hit && board[3][4] == hit && board[3][5] == hit && board[3][6] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 3 && col == 3)
                {board[row][col] = hit;
                    if (board [3][2] == hit && board[3][3] == hit && board[3][4] == hit && board[3][5] == hit && board[3][6] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 3 && col == 4)
                {board[row][col] = hit;
                    if (board [3][2] == hit && board[3][3] == hit && board[3][4] == hit && board[3][5] == hit && board[3][6] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 3 && col == 5)
                {board[row][col] = hit;
                    if (board [3][2] == hit && board[3][3] == hit && board[3][4] == hit && board[3][5] == hit && board[3][6] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                else if (row == 3  && col == 6)
                {board[row][col] = hit;
                    if (board [3][2] == hit && board[3][3] == hit && board[3][4] == hit && board[3][5] == hit && board[3][6] == hit)
                        cout << "You have sunk the Aircraft Carrier!" << endl;}
                
                
                else if (row == 1 && col == 8)
                {board[row][col] = hit;
                    if (board[1][8] == hit && board[2][8] == hit && board[3][8] == hit && board[4][8] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                else if (row == 2 && col == 8)
                {board[row][col] = hit;
                    if (board[1][8] == hit && board[2][8] == hit && board[3][8] == hit && board[4][8] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                else if (row == 3 && col == 8)
                {board[row][col] = hit;
                    if (board[1][8] == hit && board[2][8] == hit && board[3][8] == hit && board[4][8] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                else if (row == 4 && col == 8)
                {board[row][col] = hit;
                    if (board[1][8] == hit && board[2][8] == hit && board[3][8] == hit && board[4][8] == hit)
                        cout << "You have sunk the Battleship!" << endl;}
                
                
                else if (row == 1 && col == 2)
                {board[row][col] = hit;
                    if (board[1][2] == hit && board[1][3] == hit && board[1][4] == hit)
                        cout << "You have sunk the Submarine!" << endl;}
                else if (row == 1 && col == 3)
                {board[row][col] = hit;
                    if (board[1][2] == hit && board[1][3] == hit && board[1][4] == hit)
                        cout << "You have sunk the Submarine!" << endl;}
                else if (row == 1 && col == 4)
                {board[row][col] = hit;
                    if (board[1][2] == hit && board[1][3] == hit && board[1][4] == hit)
                        cout << "You have sunk the Submarine!" << endl;}
                
                
                else if (row == 5 && col == 2)
                {board[row][col] = hit;
                    if (board[5][2] == hit && board[5][3] == hit && board[5][4] == hit)
                        cout << "You have sunk the Cruiser!" << endl;}
                else if (row == 5 && col == 3)
                {board[row][col] = hit;
                    if (board[5][2] == hit && board[5][3] == hit && board[5][4] == hit)
                        cout << "You have sunk the Cruiser!" << endl;}
                else if (row == 5 && col == 4)
                {board[row][col] = hit;
                    if (board[5][2] == hit && board[5][3] == hit && board[5][4] == hit)
                        cout << "You have sunk the Cruiser!" << endl;}
                
                
                else if (row == 5 && col == 7)
                {board[row][col] = hit;
                    if (board[5][7] == hit && board[6][7] == hit)
                        cout << "You have sunk the Destroyer!" << endl;}
                else if (row == 6 && col == 7)
                {board[row][col] = hit;
                    if (board[5][7] == hit && board[6][7] == hit)
                        cout << "You have sunk the Destroyer!" << endl;}
                
                
                else
                    board[row][col] = miss;
                
                
                printArray(board);
                
                if (board [3][2] == hit && board[3][3] == hit && board[3][4] == hit && board[3][5] == hit && board[3][6] == hit && board[1][8] == hit && board[2][8] == hit && board[3][8] == hit && board[4][8] == hit && board[1][2] == hit && board[1][3] == hit && board[1][4] == hit && board[5][2] == hit && board[5][3] == hit && board[5][4] == hit && board[5][7] == hit && board[6][7] == hit)
                { 
                    cout << "*** Congratulations! You have won! ***" << endl;
                    repeat = 38;
                }
                if (repeat == 37)
                    cout << "No more turns left! You have lost!" << endl;
                
                repeat ++;
            }
            
            repeat = 0;
            clearBoard(board);
        }
        
        else if (choice == 5)
        {
            system("PAUSE");
            return EXIT_SUCCESS;
        }
        
    }
    
    system("PAUSE");
    return EXIT_SUCCESS;
}