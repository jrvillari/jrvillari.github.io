  ___ _ _           _             _         _      ___                              
 / __(_) |_ ___    /_\  _ _  __ _| |_  _ __(_)___ | _ \_ _ ___  __ _ _ _ __ _ _ __  
 \__ \ |  _/ -_)  / _ \| ' \/ _` | | || (_-< (_-< |  _/ '_/ _ \/ _` | '_/ _` | '  \ 
 |___/_|\__\___| /_/ \_\_||_\__,_|_|\_, /__/_/__/ |_| |_| \___/\__, |_| \__,_|_|_|_|
------------------------------------|__/-----------------------|___/----------------              

To use the Site Analysis Program, the user must first enter the name of a file that 
they wish to populate the database of sites with. Then they will be prompted with a 
menu that allows them to either add a new site, predict a site's status, output the 
data to a file, or exit the program. The user can then choose by entering a number 
corresponding to their decision. Adding a new site provides the user with a series 
of prompts asking for the site ID, name…etc. It will not allow a site to be entered
with the same name as a pre-existing site. The site is then stored in the database.
Predict site status asks the user to provide positive x and y coordinates and outputs
that site's status if the site exists in the database. If not, it finds the five 
closest sites and predicts the site's likely status based on the statuses of the five
sites. Output the data outputs the data in the database to a user-specified file. 
Exit terminates the program. 
