-- 
CREATE TABLE Students (
    StudentID INT AUTO_INCREMENT NOT NULL PRIMARY KEY, 
    FirstName VARCHAR(20) NOT NULL, 
    MiddleName VARCHAR(20), 
    FirstLastName VARCHAR(20) NOT NULL, 
    SecondLastName VARCHAR(20), 
    GovIDType VARCHAR(20) NOT NULL, 
    GovID VARCHAR(20) NOT NULL UNIQUE, 
    PersonalEmail VARCHAR(50) NOT NULL UNIQUE,
    AdressStreetType VARCHAR(20) NOT NULL,
    AdressStreetName VARCHAR(20) NOT NULL,
    AdressStreetNumber int NOT NULL,
    AdressStreetExtra VARCHAR(20) NOT NULL,
    PostalCode VARCHAR(20) NOT NULL, 
    City VARCHAR(20) NOT NULL, 
    SchoolEMail VARCHAR(50) UNIQUE, 
    PhonePrefix VARCHAR(20), 
    Phone INT, 
    EmergencyPhonePrefix VARCHAR(20), 
    EmergencyPhone INT, 
    NESE LONGTEXT
);
--
INSERT INTO Students (FirstName, FirstLastName, SecondLastName, GovIDType, GovID, PersonalEmail, HomeAddress, PostalCode, City, SchoolEMail, PhonePrefix, Phone, EmergencyPhonePrefix, EmergencyPhone)
VALUES ("Unai", "Pujol", "Ovejero", "DNI", "12345678A", "unaipujol@email.com", "Av. Jaume I, 37", "43201", "Reus", "unaipujol@insbaixcamp.cat", "(+34)", "612345678", "(+34)", "998765432");
--
