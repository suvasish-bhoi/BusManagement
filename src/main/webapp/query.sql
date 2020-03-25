DROP table route;
DROP table bus;
DROP table users;

create table users(
    ID number NOT NULL PRIMARY KEY,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    UserNAME varchar(255),
    EmailID  varchar(255)
);

create table bus(
ID number NOT NULL PRIMARY KEY,
Model number(20),
Seater number(20),
BusNo number(20) UNIQUE 
);

create table route(
ID number NOT NULL PRIMARY KEY,
StartTO varchar(255),
EndFrom varchar(255),
Day varchar(255),
DepartureTiming timestamp,
ArrivalTiming timestamp,
CreatedBy number(20),
BusID number REFERENCES bus(ID)
);