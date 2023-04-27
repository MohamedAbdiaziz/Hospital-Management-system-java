-- hospital management System database table
-- the syntax of this sql is MSSQL server
-- database name 'hms'
-- created at 2023-04-(23-24);
CREATE TABLE Nurse (
    NurseID INT Identity(1,1) PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    Gender VARCHAR(10),
    Address VARCHAR(100),
    PhoneNumber VARCHAR(20),
    Email VARCHAR(50),
    DepartmentID INT,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);

CREATE TABLE Department (
    DepartmentID INT IDENTITY(1,1) PRIMARY KEY,
    DepartmentName VARCHAR(50),
    HeadOfDepartment VARCHAR(50),
    PhoneNumber VARCHAR(20),
    Email VARCHAR(50)
);

CREATE TABLE Doctor (
    DoctorID INT IDENTITY(1,1) PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    Gender VARCHAR(10),
    Address VARCHAR(100),
    PhoneNumber VARCHAR(20),
    Email VARCHAR(50),
    DepartmentID INT,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);

CREATE TABLE Drugs (
    DrugID INT IDENTITY(1,1) PRIMARY KEY,
    DrugName VARCHAR(50),
    Dosage VARCHAR(20),
    Frequency VARCHAR(20),
    RouteOfAdministration VARCHAR(50),
    DatePrescribed DATE,
    PatientID INT,
    FOREIGN KEY (PatientID) REFERENCES Patients(PatientID)
);

CREATE TABLE Room (
    RoomID INT IDENTITY(1,1) PRIMARY KEY,
    RoomNumber VARCHAR(10),
    RoomType VARCHAR(20),
    BedCount INT,
    FloorNumber INT,
    DepartmentID INT,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);

CREATE TABLE Financial (
    FinancialID INT IDENTITY(1,1) PRIMARY KEY,
    PatientID INT,
    BillAmount DECIMAL(10, 2),
    PaymentAmount DECIMAL(10, 2),
    PaymentDate DATE,
    FOREIGN KEY (PatientID) REFERENCES Patients(PatientID)
);

CREATE TABLE Block (
    BlockID INT IDENTITY(1,1) PRIMARY KEY,
    BlockName VARCHAR(50),
    FloorNumber INT,
    DepartmentID INT,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);

CREATE TABLE Patient (
    PatientID INT IDENTITY(1,1) PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    Gender CHAR(1),
    Address VARCHAR(100),
    PhoneNumber VARCHAR(20),
    Email VARCHAR(50)
);

CREATE TABLE Appointments (
    AppointmentID INT IDENTITY(1,1) PRIMARY KEY,
    PatientID INT,
    AppointmentDate DATE DEFAULT GETDATE(),
    AppointmentTime TIME,
    AppointmentType VARCHAR(50),
    AppointmentStatus VARCHAR(50),
    FOREIGN KEY (PatientID) REFERENCES Patients(PatientID)
);

SELECT COUNT(DISTINCT PatientID) AS NumPatients FROM Appointments WHERE AppointmentDate = CAST(GETDATE() AS DATE);

CREATE TABLE Employee (
    EmployeeID INT IDENTITY(1,1) PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(50),
    Phone VARCHAR(20),
    HireDate DATE,
    Salary DECIMAL(10,2),
    DepartmentID INT,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);
