// Name: J.R. Villari
// Course: CSC 415
// Semester: Spring 2014
// Instructor: Dr. Pulimood
// Exercise : Assignment 3 - Introduction to C++
// Description: This is the SiteList class that creates a SiteList object and allows you to manipulate the siteArray.
// Filename: SiteList.cpp
// Last modified on: 3/4/2014

#include <iostream>
#include <fstream>
#include <cmath>
#include <limits>
#include "Site.h"

using namespace std;

SiteList::SiteList() //constructor that creates a SiteList object
{
    numSites = 0; //keeps track of the number of sites
}

void SiteList::populateArray()
{
    string fileName;
    string firstLine;
    string id;
    string name, status, rStatus, contam;
    string x;
    string y;
    
    cout << "Please enter the file name you would like to use: " << endl;
    cin >> fileName; //allows the user to choose any file
    
    ifstream fin;
    fin.open(fileName.c_str());
    getline(fin,firstLine,'\n');
    
    for(int i = 0; i < 503; i++)
    {
        getline(fin, id, ',');
        getline(fin, name, ',');
        getline(fin, status, ',');
        getline(fin, rStatus, ',');
        getline(fin, contam, ',');
        getline(fin, x, ',');
        getline(fin, y, '\n');
        siteArray[i].addSite(id, name, status, rStatus, contam, x, y);
        numSites++;
    }
    fin.close();
    return;
    
}

void SiteList::newSite()
{

    string id, name, status, rStatus, contam, x, y, placeHolder;
    
    getline(cin, placeHolder); //discards the first line with the labels
    cout << "Please Enter Site ID: " << endl;
    getline(cin, id);
    cout << "Please Enter Site Name: " << endl;
    getline(cin, name);
    for (int i = 0; i < numSites; i++) //ensures that the name entered is not the same as any of the pre-existing sites
    {
        while (name == siteArray[i].getSiteName())
        {
            cout << "A site with the name " << name << " already exists in the system. Please enter a different name: " << endl;
            getline(cin, name);
        }
    }
    cout << "Please Enter Site Status: " << endl;
    getline(cin, status);
    cout << "Please Enter Site Remediation Status: " << endl;
    getline(cin, rStatus);
    cout << "Please Enter Contamination Type: " << endl;
    getline(cin, contam);
    cout << "Please Enter X-Coordinate: " << endl;
    getline(cin, x);
    cout << "Please Enter Y-Coordinate: " << endl;
    getline(cin, y);
    
    if (numSites < 600) //only allows a site to be added it can fit in the array
    {
        siteArray[numSites].addSite(id, name, status, rStatus, contam, x, y);
        
        cout << "You just added a site with the following details: " << endl; //lets the user know what they created
        cout << siteArray[numSites].getSiteID() << " ";
        cout << siteArray[numSites].getSiteName() << " ";
        cout << siteArray[numSites].getSiteStatus() << " ";
        cout << siteArray[numSites].getRemedStatus() << " ";
        cout << siteArray[numSites].getTypeContam() << " ";
        cout << siteArray[numSites].getXCoor() << " ";
        cout << siteArray[numSites].getYCoor() << endl;
        
        numSites++;
        
    }
    else
        cout << "Too many sites added." << endl;
}

void SiteList::predictStatus()
{
    double x = 0; //coordinate entered by the user
    double y = 0; //coordinate entered by the user
    double distance = 0; //calculated distance
    
    double temp = 1000000; //temporary value used for calculations 
    double temp2 = 1000000; //set to a large number to ensure that the loop executes at least once
    double temp3 = 1000000;
    double temp4 = 1000000;
    double temp5 = 1000000;
    
    Site closestSite; //site objects that are closest to the entered coordinates
    Site closestSite2;
    Site closestSite3;
    Site closestSite4;
    Site closestSite5;
    
    string siteStat, siteStat2, siteStat3, siteStat4, siteStat5;//status of the closest sites
    int clearCount = 0; //count of how many closest sites are clear
    
    bool exists = false; //determines whether the coordinate exists in the database already or not
    
    cout << "Please Enter X-Coordinate: " << endl;
    cin >> x;
    while(cin.fail() || x < 0) //ensures that the user enters a positive number 
    {
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(),'\n');
        cout << "Invalid Coordinate. Please enter an integer greater than zero: " << endl;
        cin >> x;
    }
    cout << "Please Enter Y-Coordinate: " << endl;
    cin >> y;
    while(cin.fail() || y < 0) //ensures that the user enters a positive number
    {
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(),'\n');
        cout << "Invalid Coordinate. Please enter an integer greater than zero: " << endl;
        cin >> y;
    }
    cout << endl;
    for (int i = 0; i < numSites; i++) //checks if the site exists in the database, if so, outputs that site's status
    {
        if (x == atoi((siteArray[i].getXCoor()).c_str()) && y == atoi((siteArray[i].getYCoor()).c_str()))
        {
            cout << "Site Found." << endl;
            cout << "Site Status: " << siteArray[i].getSiteStatus() << endl;
            cout << endl;
            exists = true;
        }
    }
    
    if (exists == false) //executes if the site does not exist and finds the 5 closest sites to the entered coordinates and predicts whether the site is likely to be clear or contaminated
    {
        for (int i = 0; i < numSites; i++)
        {
            double num1 = abs(x - atoi(siteArray[i].getXCoor().c_str())); //converts the coordinate from a string to a double
            double num2 = abs(y - atoi(siteArray[i].getYCoor().c_str()));
            
            distance = sqrt((num1*num1)+(num2*num2)); //simplified nearest neighbor algorithm
            
            if (distance < temp) //ensures that the closest site is found
            {
                temp = distance;
                closestSite = siteArray[i];
            }
        }
        cout << "The closest site is: " << closestSite.getSiteID() << " which is " << temp << " units away and is " << closestSite.getSiteStatus() << "." << endl;
        
        for (int i = 0; i < numSites; i++)
        {
            double num1 = abs(x - atoi(siteArray[i].getXCoor().c_str()));
            double num2 = abs(y - atoi(siteArray[i].getYCoor().c_str()));
            
            distance = sqrt((num1*num1)+(num2*num2)); 
            
            if (distance < temp2 && distance > temp)
            {
                temp2 = distance;
                closestSite2 = siteArray[i];
            }
        }
        cout << "The second closest site is: " << closestSite2.getSiteID() << " which is " << temp2 << " units away and is " << closestSite2.getSiteStatus() << "." << endl;
        
        for (int i = 0; i < numSites; i++)
        {
            double num1 = abs(x - atoi(siteArray[i].getXCoor().c_str()));
            double num2 = abs(y - atoi(siteArray[i].getYCoor().c_str()));
            
            distance = sqrt((num1*num1)+(num2*num2));
            
            if (distance < temp3 && distance > temp2)
            {
                temp3 = distance;
                closestSite3 = siteArray[i];
            }
        }
        cout << "The third closest site is: " << closestSite3.getSiteID() << " which is " << temp3 << " units away and is " << closestSite3.getSiteStatus() << "." << endl;
        
        for (int i = 0; i < numSites; i++)
        {
            double num1 = abs(x - atoi(siteArray[i].getXCoor().c_str()));
            double num2 = abs(y - atoi(siteArray[i].getYCoor().c_str()));
            
            distance = sqrt((num1*num1)+(num2*num2));
            
            if (distance < temp4 && distance > temp3)
            {
                temp4 = distance;
                closestSite4 = siteArray[i];
            }
        }
        cout << "The fourth closest site is: " << closestSite4.getSiteID() << " which is " << temp4 << " units away and is " << closestSite4.getSiteStatus() << "." << endl;
        
        for (int i = 0; i < numSites; i++)
        {
            double num1 = abs(x - atoi(siteArray[i].getXCoor().c_str()));
            double num2 = abs(y - atoi(siteArray[i].getYCoor().c_str()));
            
            distance = sqrt((num1*num1)+(num2*num2));
            
            if (distance < temp5 && distance > temp4)
            {
                temp5 = distance;
                closestSite5 = siteArray[i];
            }
        }
        cout << "The fifth closest site is: " << closestSite5.getSiteID() << " which is " << temp5 << " units away and is " << closestSite5.getSiteStatus() << "." << endl;
        cout << endl;
        
        siteStat = closestSite.getSiteStatus(); //gets each of the five closest sites' statuses
        siteStat2 = closestSite2.getSiteStatus();      
        siteStat3 = closestSite3.getSiteStatus();
        siteStat4 = closestSite4.getSiteStatus();
        siteStat5 = closestSite5.getSiteStatus();
        
        if (siteStat == "Clear")
            clearCount++;
        if (siteStat2 == "Clear")
            clearCount++;
        if (siteStat3 == "Clear")
            clearCount++;
        if (siteStat4 == "Clear")
            clearCount++;
        if (siteStat5 == "Clear")
            clearCount++;
        
        if (clearCount >= 3) //if three or more sites are clear, predicts that the site is likely clear
            cout << "Based on the statuses of the above sites, it is highly likely that the site at " << x << " and " << y << " is clear." << endl;
        else //otherwise, predicts that the site is likely contaminated
            cout << "Based on the statuses of the above sites, it is highly likely that the site at " << x << " and " << y << " is contaminated to some extent." << endl;
        
        cout << endl;
    }
        
}

void SiteList::outputData()
{
    string fileName;
    
    cout << "Please enter a name for the output file: " << endl;
    cin >> fileName; //allows the user to choose any name for the output file that they wish
    
    ofstream fout;
    fout.open(fileName.c_str());
    fout << "Site ID,Site Name,Remediation Status,Type of Contamination,X Coord,Y Coord" << endl; //recreates the heading in the output file
    for(int i = 0; i < numSites; i++) //outputs each site object to the output file
        fout << siteArray[i].getSiteID() << "," << siteArray[i].getSiteName() << "," << siteArray[i].getSiteStatus() << "," << siteArray[i].getRemedStatus() << "," << siteArray[i].getTypeContam() << "," << siteArray[i].getXCoor() << "," << siteArray[i].getYCoor() << endl;
    fout.close();
    return;
}
