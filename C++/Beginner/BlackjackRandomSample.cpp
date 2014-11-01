#include <iostream>
#include <cstdlib>
#include <iomanip>
#include <cmath>

using namespace std;

int main(int argc, char *argv[])
{
    int c1 = 0;
    int c1value = 0;
    int c2 = 0;
    int c2value = 0;
    int c3 = 0;
    int c3value = 0;
    int total = 0;
    int repeat = 0;
    
    srand((unsigned)time(0));
    while (repeat < 5)
        
    {
        c1 = rand() % 13 + 1;
        
        c2 = rand() % 13 + 1;
        
        c3 = rand() % 13 + 1;
        
        c1value = c1;
        
        c2value = c2;
        
        c3value = c3;
        
        if (c1 > 10)
            c1value = 10;
        
        if (c2 > 10)
            c2value = 10;
        
        if (c3 > 10)
            c3value = 10;
        
        if (c1 == 1)
            c1value = 11;
        
        if (c2 == 1)
            c2value = 11;
        
        if (c3 == 1)
            c3value = 11;
        
        if (c1 > 1 && c1 < 11 && c2 > 1 && c2 < 11 && c3 > 1 && c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", " << c2 << " and " << c3 << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 1 && c3 > 1 and c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Ace and " << c3 << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 11 && c3 > 1 and c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Jack and " << c3 << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 12 && c3 > 1 and c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Queen and " << c3 << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 13 && c3 > 1 and c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", King and " << c3 << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 > 1 && c2 < 11 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", " << c2 << " and Ace" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 > 1 && c2 < 11 && c3 == 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", " << c2 << " and Jack" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 > 1 && c2 < 11 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", " << c2 << " and Queen" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 > 1 && c2 < 11 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", " << c2 << " and King" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 1 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Ace and Ace" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 11 && c3 == 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Jack and Jack" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 12 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Queen and Queen" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 13 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", King and King" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 1 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Ace and King" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 1 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Ace and Queen" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 1 && c3 == 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Ace and Jack" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 11 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Jack and King" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 11 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Jack and Queen" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 11 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Jack and Ace" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 12 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Queen and King" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 12 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Queen and Queen" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 12 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", Queen and Ace" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 13 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", King and King" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 13 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", King and Queen" << endl;
            
        }
        
        else if (c1 > 1 && c1 < 11 && c2 == 13 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << c1 << ", King and Ace" << endl;
            
        }
        
        else if (c1 == 1 && c2 > 1 && c2 < 11 && c3 > 1 && c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, " << c2 << " and " << c3 << endl;
            
        }
        
        else if (c1 == 1 && c2 == 1 && c3 > 1 and c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Ace and " << c3 << endl;
            
        }
        
        else if (c1 == 1 && c2 == 11 && c3 > 1 and c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Jack and " << c3 << endl;
            
        }
        
        else if (c1 == 1 && c2 == 12 && c3 > 1 and c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Queen and " << c3 << endl;
            
        }
        
        else if (c1 == 1 && c2 == 13 && c3 > 1 and c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, King and " << c3 << endl;
            
        }
        
        else if (c1 == 1 && c2 > 1 && c2 < 11 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, " << c2 << " and Ace" << endl;
            
        }
        
        else if (c1 == 1 && c2 > 1 && c2 < 11 && c3 == 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, " << c2 << " and Jack" << endl;
            
        }
        
        else if (c1 == 1 && c2 > 1 && c2 < 11 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, " << c2 << " and Queen" << endl;
            
        }
        
        else if (c1 == 1 && c2 > 1 && c2 < 11 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, " << c2 << " and King" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 1 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Ace and Ace" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 11 && c3 == 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Jack and Jack" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 12 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Queen and Queen" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 13 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, King and King" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 1 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Ace and King" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 1 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Ace and Queen" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 1 && c3 == 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Ace and Jack" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 11 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Jack and King" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 11 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Jack and Queen" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 11 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Jack and Ace" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 12 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Queen and King" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 12 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Queen and Queen" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 12 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, Queen and Ace" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 13 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, King and King" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 13 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, King and Queen" << endl;
            
        }
        
        else if (c1 == 1 && c2 == 13 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Ace, King and Ace" << endl;
            
        }
        
        else if (c1 == 11 && c2 > 1 && c2 < 11 && c3 > 1 && c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, " << c2 << " and " << c3 << endl;
            
        }
        
        else if (c1 == 11 && c2 == 1 && c3 > 1 and c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Ace and " << c3 << endl;
            
        }
        
        else if (c1 == 11 && c2 == 11 && c3 > 1 and c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Jack and " << c3 << endl;
            
        }
        
        else if (c1 == 11 && c2 == 12 && c3 > 1 and c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Queen and " << c3 << endl;
            
        }
        
        else if (c1 == 11 && c2 == 13 && c3 > 1 and c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, King and " << c3 << endl;
            
        }
        
        else if (c1 == 11 && c2 > 1 && c2 < 11 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, " << c2 << " and Ace" << endl;
            
        }
        
        else if (c1 == 11 && c2 > 1 && c2 < 11 && c3 == 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, " << c2 << " and Jack" << endl;
            
        }
        
        else if (c1 == 11 && c2 > 1 && c2 < 11 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, " << c2 << " and Queen" << endl;
            
        }
        
        else if (c1 == 11 && c2 > 1 && c2 < 11 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, " << c2 << " and King" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 1 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Ace and Ace" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 11 && c3 == 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Jack and Jack" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 12 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Queen and Queen" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 13 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, King and King" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 1 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Ace and King" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 1 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Ace and Queen" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 1 && c3 == 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Ace and Jack" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 11 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Jack and King" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 11 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Jack and Queen" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 11 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Jack and Ace" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 12 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Queen and King" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 12 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Queen and Queen" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 12 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, Queen and Ace" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 13 && c3 == 13)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, King and King" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 13 && c3 == 12)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, King and Queen" << endl;
            
        }
        
        else if (c1 == 11 && c2 == 13 && c3 == 1)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Jack, King and Ace" << endl;
            
        }
        
        
        
        
        
        
        
        else if (c1 == 12 && c2 > 1 && c2 < 11 && c3 > 1 && c3 < 11)
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, " << c2 << " and " << c3 << endl;
            
        }
        
        else if (c1 == 12 && c2 == 1 && c3 > 1 and c3 < 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Ace and " << c3 << endl;
            
        }
        
        else if (c1 == 12 && c2 == 11 && c3 > 1 and c3 < 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Jack and " << c3 << endl;
            
        }
        
        else if (c1 == 12 && c2 == 12 && c3 > 1 and c3 < 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Queen and " << c3 << endl;
            
        }
        
        else if (c1 == 12 && c2 == 13 && c3 > 1 and c3 < 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, King and " << c3 << endl;
            
        }
        
        else if (c1 == 12 && c2 > 1 && c2 < 11 && c3 == 1)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, " << c2 << " and Ace" << endl;
            
        }
        
        else if (c1 == 12 && c2 > 1 && c2 < 11 && c3 == 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, " << c2 << " and Jack" << endl;
            
        }
        
        else if (c1 == 12 && c2 > 1 && c2 < 11 && c3 == 12)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, " << c2 << " and Queen" << endl;
            
        }
        
        else if (c1 == 12 && c2 > 1 && c2 < 11 && c3 == 13)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, " << c2 << " and King" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 1 && c3 == 1)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Ace and Ace" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 11 && c3 == 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Jack and Jack" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 12 && c3 == 12)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Queen and Queen" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 13 && c3 == 13)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, King and King" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 1 && c3 == 13)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Ace and King" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 1 && c3 == 12)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Ace and Queen" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 1 && c3 == 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Ace and Jack" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 11 && c3 == 13)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Jack and King" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 11 && c3 == 12)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Jack and Queen" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 11 && c3 == 1)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Jack and Ace" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 12 && c3 == 13)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Queen and King" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 12 && c3 == 12)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Queen and Queen" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 12 && c3 == 1)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, Queen and Ace" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 13 && c3 == 13)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, King and King" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 13 && c3 == 12)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, King and Queen" << endl;
            
        }
        
        else if (c1 == 12 && c2 == 13 && c3 == 1)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "Queen, King and Ace" << endl;
            
        }
        
        else if (c1 == 13 && c2 > 1 && c2 < 11 && c3 > 1 && c3 < 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, " << c2 << " and " << c3 << endl;
            
        }
        
        else if (c1 == 13 && c2 == 1 && c3 > 1 and c3 < 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Ace and " << c3 << endl;
            
        }
        
        else if (c1 == 13 && c2 == 11 && c3 > 1 and c3 < 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Jack and " << c3 << endl;
            
        }
        
        else if (c1 == 13 && c2 == 12 && c3 > 1 and c3 < 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Queen and " << c3 << endl;
            
        }
        
        else if (c1 == 13 && c2 == 13 && c3 > 1 and c3 < 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, King and " << c3 << endl;
            
        }
        
        else if (c1 == 13 && c2 > 1 && c2 < 11 && c3 == 1)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, " << c2 << " and Ace" << endl;
            
        }
        
        else if (c1 == 13 && c2 > 1 && c2 < 11 && c3 == 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, " << c2 << " and Jack" << endl;
            
        }
        
        else if (c1 == 13 && c2 > 1 && c2 < 11 && c3 == 12)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, " << c2 << " and Queen" << endl;
            
        }
        
        else if (c1 == 13 && c2 > 1 && c2 < 11 && c3 == 13)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, " << c2 << " and King" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 1 && c3 == 1)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Ace and Ace" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 11 && c3 == 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Jack and Jack" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 12 && c3 == 12)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Queen and Queen" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 13 && c3 == 13)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, King and King" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 1 && c3 == 13)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Ace and King" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 1 && c3 == 12)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Ace and Queen" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 1 && c3 == 11)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Ace and Jack" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 11 && c3 == 13)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Jack and King" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 11 && c3 == 12)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Jack and Queen" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 11 && c3 == 1)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Jack and Ace" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 12 && c3 == 13)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Queen and King" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 12 && c3 == 12)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Queen and Queen" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 12 && c3 == 1)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, Queen and Ace" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 13 && c3 == 13)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, King and King" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 13 && c3 == 12)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, King and Queen" << endl;
            
        }
        
        else if (c1 == 13 && c2 == 13 && c3 == 1)
            
            
        {
            
            cout << "You were dealt the following three cards: " << endl;
            
            cout << "King, King and Ace" << endl;
            
        }
        
        total = c1value + c2value + c3value;
        
        if (c1 == 1 && total > 21)
            
        {
            
            c1value = 1;
            
            if (c1 == 1 && c2 == 1 && total > 21)
                
            {
                
                c1value = 1;
                
                c2value = 1;
                
                if (c1 == 1 && c2 == 1 && c3 == 1 and total > 21)
                    
                {
                    
                    c1value = 11;
                    
                    c2value = 1;
                    
                    c3value = 1;
                    
                }
                
            }
            
        }
        
        if (c2 == 1 && total > 21)
            
        {
            
            c2value = 1;
            
            if (c1 == 1 && c2 == 1 && total > 21)
                
            {
                
                c1value = 1;
                
                c2value = 1;
                
                if (c1 == 1 && c2 == 1 && c3 == 1 and total > 21)
                    
                {
                    
                    c1value = 11;
                    
                    c2value = 1;
                    
                    c3value = 1;
                    
                }
                
            }
            
        }
        
        if (c3 == 1 && total > 21)
            
        {
            
            c3value = 1;
            
            if (c1 == 1 && c3 == 1 && total > 21)
                
            {
                
                c1value = 1;
                
                c3value = 1;
                
                if (c1 == 1 && c2 == 1 && c3 == 1 and total > 21)
                    
                {
                    
                    c1value = 11;
                    
                    c2value = 1;
                    
                    c3value = 1;
                    
                }
                
            }
            
        }
        if (c3 == 1 && total > 21)
            
        {
            
            c3value = 1;
            
            if (c2 == 1 && c3 == 1 && total > 21)
                
            {
                
                c2value = 1;
                
                c3value = 1;
                
                if (c1 == 1 && c2 == 1 && c3 == 1 and total > 21)
                    
                {
                    
                    c1value = 11;
                    
                    c2value = 1;
                    
                    c3value = 1;
                    
                }
                
            }
            
        }
        
        
        
        
        total = c1value + c2value + c3value;
        
        cout << "Your total is: " << total << endl;
        
        if (total > 21)
            
            cout << "You Lose!" << endl;
        
        cout << endl;
        
        repeat++;
        
    }
    
    
    return 0;
}


