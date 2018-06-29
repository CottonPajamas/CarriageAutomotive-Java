# [Spring Framework] Carriage Automotive Inc
Web development project created in Java using Spring Framework.

<br />
Java project created during my course of study. Objective was to develop a web application in order to improve the efficiency in managing inventory and equipment of an automotive company.


<br /><br />
<br /><br />


## Features

We explored the following aspects of Spring framework.<br />

- Spring Web MVC for the general architecture and layering of the application.<br />

- Spring Security for authentication.<br />

- Spring JPA for database access.<br />

All of which are configured with the help of Spring Boot.

Bootstrap was used for its front-end design.


<br /><br />
<br /><br />


## Setting up

1. Import the project into your STS's workspace<br />

2. Right-click the project and select "Properties". Navigate to "Java Build Path" and under "Libraries", ensure that your system library is using the appropriate Java Development Kit (Preferably JDK 1.8 and above). Otherwise select "Edit" and modify your system library settings.<br />

3. Right-click the project and select "Maven" -> "Update project..".<br />

4. Right-click the project and select "Run As" -> "Maven install".<br />

5. Creating the database. Under the imported project, expand the "SQL" folder. Right-click the sql file and select "Open With" -> "Text Editor". Copy everything in the sql file and inside your MySql workbench, create a new SQL tab and paste all your sql commands here. Select all and execute. Upon refreshing your "SCHEMAS" tab, you will find the database "carriage_automotive" and all of its tables created.<br />

6. Head back to STS. Expand the "src/main/resources" folder and open "application.properties". Here, kindly specify your database configuration details. This includes the database URL, and the appropriate credentials to access your database.<br />

7. To deploy the project, right-click the project and select "Run As" -> "Run on server". Select your desired server and click "Finish".
>>Error: Project facet Cloud Foundry Standalone Application version 1.0 is not supported.
```sh
If you encounter the following error, right-click your project, under "Properties", 
select "Project Facets" and uncheck "Cloud Foundry Standalone Application". Then hit 
"Apply" and close. Repeat step 7 again.
```

8. You will be first greeted with the login page.

![](/Screenshots/Login_page.JPG)

There are primarily two general roles that users are segregated on. Namely "admin" and "mechanic". Having administrative privileges grants admins with the ability to perform more tasks. Below are examples of accounts which you can use to access the website in accordance to their respective roles.<br /><br />

>>Username: Admin	[Administrator]<br />
>>Password: 1234<br />

<br />

>>Username: Abraham [Mechanic]<br />
>>Password: 1234<br />


<br /><br />
<br /><br />


## [Mechanic] Navigating the website

1. Entering as a mechanic brings us to this page. The mechanic is then able to browse the catalog for parts within the store by selecting the "Browse Catalogue" button.<br />

![](/Screenshots/Mechanic_home_page.JPG)

2. With the aid of a search bar and the ability to filter results by "Manufacturer", we hope to simplify the process for the user when searching the catalogue.<br />

![](/Screenshots/Mechanic_catalogue_page.JPG)

3. Example illustrating the results retrieved by using both the search and filter ability at the same time. Search can currently be done on the basis of "Part Id", "Description", "Color", "Manufacturer" and "Shelf Location". Furthermore, the user can easily add items to cart by specifying the quantitative value of a specific item he or she wishes to withdraw and selecting the "Add" button.<br />

![](/Screenshots/Mechanic_search_results.JPG)

4. To browse details for any individual parts, simply select the name of the part itself. Similarly, the user is able to add to his/her cart from the product details page as well.<br />

5. User can view his "cart" by clicking the "Record Usage" button at the side of the page. Here, the latter is able to view details of items that he/she has selected as well as "Amend" or "Delete" selected items if the latter so chooses.<br />

![](/Screenshots/Mechanic_checkout_page.JPG)

6. Once satisfied, the user simply has to input the name of the client he/she is servicing and clicking the "Record Usage" button. Doing so, brings the user to the home page with the following message.<br />

![](/Screenshots/Mechanic_checkout_success_page.JPG)


<br /><br />
<br /><br />


## [Administrator] Navigating the website

1. As mentioned above, administrators are able to perform everything that the mechanic is capable of doing and more.<br />

![](/Screenshots/Admin_home_page.JPG)

2. For instance, the latter is able to view and generate the "Product Reorder Report" by clicking the "Reorder Report" button at the side of the page, thus bringing the latter to the page below.<br />

![](/Screenshots/Admin_reorder_report_page.JPG)

3. Additionally, an admin is able to view the list of suppliers, users and make amendments if he/she desires. The latter is also capable of adding new suppliers, users and even products to the database through these pages. Here are some screenshots from these different pages.<br />

![](/Screenshots/Admin_supplier_page.JPG)

![](/Screenshots/Admin_users_page.JPG)


<br /><br />
<br /><br />


## To be improved/resolved

- Search can currently be done on the basis of "Supplier" as well, but at present it is not working perfectly well and will need to be refined.<br />

- Date filtering ability and adding to cart functionality in the product details page not working for major browsers. [Last checked, only works on IE]<br />

- Expand the use of internationalization in the web application.<br />


<br /><br />
<br /><br />


## General technical information

- Java SE Development Kit (JDK) 8 Update 151<br />

- Spring Tool Suite Version: 3.9.4.RELEASE<br />

- Pivotal tc Server Developer Edition<br />

- 5.7.20-log MySQL Community Server (GPL)<br />

- MySql Workbench 6.3<br />




<br /><br />

<br /><br />

Disclaimer: This company is a work of fiction. Any names or characters, places or addresses, events or incidents, are entirely fictitious. Any resemblance to actual persons, living or dead, or actual events is purely coincidental.












