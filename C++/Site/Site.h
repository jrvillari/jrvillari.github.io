// Name: J.R. Villari
// Course: CSC 415
// Semester: Spring 2014
// Instructor: Dr. Pulimood
// Exercise : Assignment 3 - Introduction to C++
// Description: This is the header file that encapsulates the data in Site.cpp and SiteList.cpp 
// Filename: Site.h
// Last modified on: 3/3/2014

// 	The Site class has the following public methods (member functions)
//
//-----------------------------------------------------------------------------------
//
//	Site ()
//
//	Parameters:	None
//	Post-condition: The constructor allows the programmer to create a Site object
//
//-----------------------------------------------------------------------------------
//
//	void addSite (string, string, string, string, string, string, string)
//
//	Parameters:	id, string, represents the site ID, passed by value
//			name, string, represents the site name, passed by value
//			status, string, represents the site status, passed by value
//          rStatus, string, represents the site remediation status, passed by value
//			contam, string, represents the site contamination type, passed by value
//			x, string, represents the site x coordinate, passed by value
//          y, string, represents the site y coordinate, passed by value
//	
//	This function allows a site object's attributes to be added
//-----------------------------------------------------------------------------------
//
//	string getSiteID ()
//
//	This function returns the site ID.
//
//	Parameters:	None
//
//-----------------------------------------------------------------------------------
//
//	void setSiteID (string)
//
//	This function sets the site ID.
//
//	Parameters:	id, string, represents the site ID, passed by value
//
//-----------------------------------------------------------------------------------
//
//	string getSiteName ()
//
//	This function returns the site name.
//
//	Parameters:	None
//
//-----------------------------------------------------------------------------------
//
//	void setSiteName (string)
//
//	This function sets the site name.
//
//	Parameters:	name, string, represents the site name, passed by value
//
//-----------------------------------------------------------------------------------
//
//	string getSiteStatus ()
//
//	This function returns the site status.
//
//	Parameters:	None
//
//-----------------------------------------------------------------------------------
//
//	void setSiteStatus (string)
//
//	This function sets the site status.
//
//	Parameters:	status, string, represents the site status, passed by value
//
//-----------------------------------------------------------------------------------
//
//	string getRemedStatus ()
//
//	This function returns the site remediation status.
//
//	Parameters:	None
//
//-----------------------------------------------------------------------------------
//
//	void setRemedStatus (string)
//
//	This function sets the site remediation status.
//
//	Parameters: rStatus, string, represents the site remediation status, passed by value
//
//-----------------------------------------------------------------------------------
//
//	string getTypeContam ()
//
//	This function returns the type of contamination (if any) of a site.
//
//	Parameters:	None
//
//-----------------------------------------------------------------------------------
//
//	void setTypeContam (string)
//
//	This function sets the type of contamination of a site.
//
//	Parameters:	contam, string, represents the contamination of a site, passed by value
//
//-----------------------------------------------------------------------------------
//
//	string getXCoor ()
//
//	This function returns the site's x coordinate.
//
//	Parameters:	None
//
//-----------------------------------------------------------------------------------
//
//	void setXCoor (string)
//
//	This function sets the site's X coordinate.
//
//	Parameters:	x, string, represents the site's x coordinate, passed by value
//
//-----------------------------------------------------------------------------------
//
//	string getYCoor ()
//
//	This function returns the site's y coordinate.
//
//	Parameters:	None
//
//-----------------------------------------------------------------------------------
//
//	void setYCoor (string)
//
//	This function sets the site's y coordinate.
//
//	Parameters:	y, string, represents the site's y coordinate, passed by value.
//
//-----------------------------------------------------------------------------------

// 	The SiteList class has the following public methods (member functions)
//
//-----------------------------------------------------------------------------------
//
//	SiteList ()
//
//	Parameters:	None
//	Post-condition: The constructor allows the programmer to create a SiteList object
//
//-----------------------------------------------------------------------------------
//
//	void populateArray ()
//
//	Parameters:	None
//	
//	This function allows the siteArray to be populated with the contents of a specified file
//
//-----------------------------------------------------------------------------------
//	void newSite ()
//
//	Parameters:	None
//	
//	This function allows the user to enter in attributes and create a new site object as
//  long as no site exists with the same name
//
//-----------------------------------------------------------------------------------
//
//	void predictStatus ()
//
//	Parameters:	None
//	
//	This function allows the user to enter an x and y coordinate for a site. If the site
//  exists in the database, the status of that site is returned. If the site does not
//  exist, a simplified version of the nearest neighbor algorithm is used to calculate
//  approximate distances of existing sites in the database in comparison to one another.
//  If 3 or more sites are clear, the site is predicted to be clear. Otherwise, the site
//  is predicted to be likey contaminated.
//
//-----------------------------------------------------------------------------------
//
//	void outputData ()
//
//	Parameters:	None
//
//	This function allows the user to output the array of sites to a specified output file
//
//-----------------------------------------------------------------------------------

#if !defined (SITE_H)
#define SITE_H

#include <string>
using namespace std;

class Site
{
public:
    Site();
    void addSite(string, string, string, string, string, string, string);
    string getSiteID();
    void setSiteID(string);
    string getSiteName();
    void setSiteName(string);
    string getSiteStatus();
    void setSiteStatus(string);
    string getRemedStatus();
    void setRemedStatus(string);
    string getTypeContam();
    void setTypeContam(string);
    string getXCoor();
    void setXCoor(string);
    string getYCoor();
    void setYCoor(string);
private:
    string siteID;
    string siteName;
    string siteStatus;
    string remedStatus;
    string typeContam;
    string xCoor;
    string yCoor;

};

class SiteList
{
public:
    SiteList();
    void populateArray();
    void newSite();
    void predictStatus();
    void outputData();
private:
    Site siteArray[600];
    int numSites;
};
#endif