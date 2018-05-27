# [Spring Framework] Carriage-Automotive-Inc
Web development project created in Java using Spring Framework.

<br />
Java project created during my course of study with my fellow group mates. Our objective was to develop a web application for an automotive company, so as to simplify their inventory management processes.

<br />
<br />
Features:<br />


<br />
<br />
Setting up:<br />
1. Import the project into your STS's workspace<br />
2. Right-click the project and select "Properties". Navigate to "Java Build Path" and under "Libraries", ensure that your system library is using the appropriate Java Development Kit (Preferably JDK 1.8 and above). Otherwise select "Edit" and modify your system library settings.<br />
3. Right-click the project and select "Maven" -> "Update project..".<br />
4. Right-click the project and select "Run As" -> "Maven install".<br />
5. Creating the database. Under the imported project, expand the "SQL" folder. Right-click the sql file and select "Open With" -> "Text Editor". Copy everything in the sql file and inside your MySql workbench, create a new SQL tab and paste all your sql commands here. Select all and execute. Upon refreshing your "SCHEMAS" tab, you will find the database "carriage_automotive" and all of its tables created.<br />
6. Head back to STS. Expand the "src/main/resources" folder and open "application.properties". Here, kindly specify your database configuration details. This includes the database URL, and the appropriate credentials to access your database.<br />
7. [Deploying your project] Right-click the project and select "Run As" -> "Run on server". Select your desired server and click "Finish".<br />
8. You will be first greeted with the login page. There are primarily two general roles that users are segregated on. Namely "admin" and "mechanic". Having administrative privileges grants admins with the ability to perform more tasks. Here are examples of each role which you can access the website by.<br /><br />

>>Username: Admin	[Administrator]<br />
>>Password: 1234<br />
<br />
>>Username: Abraham [Mechanic]<br />
>>Password: 1234<br />

<br />
<br />
Navigating the website [Mechanic]<br />
