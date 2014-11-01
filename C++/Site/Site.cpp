// Name: J.R. Villari
// Course: CSC 415
// Semester: Spring 2014
// Instructor: Dr. Pulimood
// Exercise : Assignment 3 - Introduction to C++
// Description: This is the Site class that allows the user to access and store the attributes of a site.  
// Filename: Site.cpp
// Last modified on: 3/3/2014

#include <iostream>
#include <fstream>
#include <cmath>
#include <string>
#include "Site.h"

using namespace std;

Site::Site() //constructor that creates a Site object
{
    siteID = "NA";
    siteName = "NA";
    siteStatus = "NA";
    remedStatus = "NA";
    typeContam = "NA";
    xCoor = "NA";
    yCoor = "NA";
}

void Site::addSite(string id, string name, string status, string rStatus, string contam, string x, string y) //populates the site object with data
{
    siteID = id;
    siteName = name;
    siteStatus = status;
    remedStatus = rStatus;
    typeContam = contam;
    xCoor = x;
    yCoor = y;
    return;
    
}

string Site::getSiteID()
{
    return siteID;
}
void Site::setSiteID(string id)
{
    siteID = id;
    return;
}


string Site::getSiteName()
{
    return siteName;
}
void Site::setSiteName(string name)
{
    siteName = name;
    return;
}


string Site::getSiteStatus()
{
    return siteStatus;
}
void Site::setSiteStatus(string status)
{
    siteStatus = status;
    return;
}


string Site::getRemedStatus()
{
    return remedStatus;
}
void Site::setRemedStatus(string rStatus)
{
    remedStatus = rStatus;
}


string Site::getTypeContam()
{
    return typeContam;
}
void Site::setTypeContam(string contam)
{
    typeContam = contam;
    return;
}


string Site::getXCoor()
{
    return xCoor;
}
void Site::setXCoor(string x)
{
    xCoor = x;
    return;
}


string Site::getYCoor()
{
    return yCoor;
}
void Site::setYCoor(string y)
{
    yCoor = y;
    return;
}
