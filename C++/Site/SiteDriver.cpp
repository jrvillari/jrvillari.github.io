// Name: J.R. Villari
// Course: CSC 415
// Semester: Spring 2014
// Instructor: Dr. Pulimood
// Exercise : Assignment 3 - Introduction to C++
// Description: This is the driver that allows the user to directly interact with the database of sites.
// Filename: SiteDriver.cpp
// Last modified on: 3/3/2014

#include <iostream>
#include <fstream>
#include <cmath>
#include <string>
#include <limits>
#include "Site.h"

using namespace std;

int main()
{
    SiteList manipArray; // SiteList object that allows the user to manipulate the array
    int choice = 0; //represents the action the user chooses
    
    cout << endl;
    cout << "******************* SITE DATABASE ANALYSIS PROGRAM ***********************" << endl; //heading
    
    manipArray.populateArray(); 
    cout << endl;
    cout << "The system has been populated with data from the file. Would you like to: " << endl;
    
    while (choice != 4) //allows the user to continously manipulate the array until they want to exit
    {
        cout << "1) Add a New Site" << endl;
        cout << "2) Predict Site Status " << endl;
        cout << "3) Output the Data" << endl;
        cout << "4) Exit " << endl;
        cout << "Please enter a number corresponding to the desired action: " << endl;
        
        cin >> choice;
        while (cin.fail() || choice > 4 || choice < 1) //ensures the user only chooses a number between 1 and 4
        {
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(),'\n');
            cout << "Invalid Option. Please choice a choice between 1 and 4: " << endl;
            cin >> choice;
        }
        
        if (choice == 1)
            manipArray.newSite();
        else if (choice == 2)
            manipArray.predictStatus();
        else if (choice == 3)
            manipArray.outputData();
    }
    
    return 0;
}
