-- 
CREATE TABLE School1.Sutdents (
    StudentID int PRIMARY KEY NOT NULL UNIQUE,
    FirstName VARCHAR(20) NOT NULL,
    MiddleName VARCHAR(20),
    FirstLastName VARCHAR(20) NOT NULL,
    SecondLastName VARCHAR(20),
    GovIDType VARCHAR(20) NOT NULL,
    GovID VARCHAR(20) NOT NULL UNIQUE,
    PersonalEmail VARCHAR(20) NOT NULL UNIQUE,
    HomeAddress VARCHAR(20) NOT NULL,
    PostalCode VARCHAR(20) NOT NULL,
    City VARCHAR(20) NOT NULL,
    SchoolEMail VARCHAR(20) UNIQUE,
    PhonePrefix VARCHAR(20),
    Phone int,
    EmergencyPhonePrefix VARCHAR(20),
    EmergencyPhone int,
    NESE LONGTEXT
);
-- 
