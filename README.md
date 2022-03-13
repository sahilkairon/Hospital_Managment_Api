# Hospital_Managment_Api
This is a Hospital Management API. 

To use this Api follow the following steps: -
Create a database in sql with the name of patients.  (If you create the database with anyother name than please update it in the application.properties files),
And update the sql username and password in the application.properties file.

This application can perform following tasks: -
Login Api:- 
Staff can signup using signup api,
Staff can login using Login Api.

Patients Record Api:-
Adding new Patient ,
Changing the status of the patient(from Admitted to Discharged),
Getting the list of all the admitted patients,
Getting the list of all the discharged patients,
Getting details of specific patient by name,
Deleting the record of the specific patient. 


Each patient have the following details: -
Patient_id(Auto Generated),
name,
age,
room,
doctor_name,
admit_date,
expenses,
status.


Each staff member have following details: -
username,
password,
name,
role ,
status.


Swagger Documentation(Html):- 
http://localhost:9191/swagger-ui/index.html

