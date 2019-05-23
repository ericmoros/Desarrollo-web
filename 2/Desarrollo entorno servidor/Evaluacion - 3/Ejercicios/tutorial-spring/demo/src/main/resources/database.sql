-- Create a new database called 'TutorialSpring'
-- Connect to the 'master' database to run this snippet
USE master
GO
-- Create the new database if it does not exist already
IF NOT EXISTS (
    SELECT name
FROM sys.databases
WHERE name = N'TutorialSpring'
)
CREATE DATABASE TutorialSpring
GO

--Login Credentials
-- CREATE LOGIN [TutorialSpring] WITH PASSWORD=N'TutorialSpring' MUST_CHANGE, DEFAULT_DATABASE=[master], CHECK_EXPIRATION=ON, CHECK_POLICY=ON
-- GO
CREATE USER [TutorialSpring] FOR LOGIN [TutorialSpring]
GO
ALTER SERVER ROLE [sysadmin] ADD MEMBER [TutorialSpring]
GO


-- Definition
-- Drop the table if it already exists
IF OBJECT_ID('UsersChickenBreasts', 'U') IS NOT NULL
DROP TABLE UsersChickenBreasts
GO
-- Drop the table if it already exists
IF OBJECT_ID('Users', 'U') IS NOT NULL
    DROP TABLE Users
    GO
-- Drop the table if it already exists
IF OBJECT_ID('ChickenBreasts', 'U') IS NOT NULL
    DROP TABLE ChickenBreasts
    GO

-- Create a new table called 'Users' in schema 'main'
-- Create the table in the specified schema
CREATE TABLE Users
(
    -- primary key column
    UserId INT NOT NULL PRIMARY KEY,
    Username [NVARCHAR](50) NOT NULL,
    Email [NVARCHAR](50) NOT NULL
    -- specify more columns here
)
    GO

-- Create a new table called 'ChickenBreasts' in schema 'SchemaName'
-- Create the table in the specified schema
CREATE TABLE ChickenBreasts
(
    -- primary key column
    ChickenBreastId INT NOT NULL PRIMARY KEY,
    BreastName [NVARCHAR](50) NOT NULL,
    Stock INTEGER NOT NULL,
    UnitPrice DECIMAL(16, 2) NOT NULL
    -- specify more columns here
)
    GO

-- Create a new table called 'UsersChickenBreasts' in schema 'SchemaName'
-- Create the table in the specified schema
CREATE TABLE UsersChickenBreasts
(
    ChickenBreastId INT NOT NULL,
    -- primary key column
    UserId INT NOT NULL,
    -- primary key column
    Quantity INT NOT NULL,
    CONSTRAINT AK_Password UNIQUE (ChickenBreastId, UserId),
    CONSTRAINT FK_UsersChickenBreasts_Users FOREIGN KEY (UserId)
        REFERENCES Users (UserId),
    CONSTRAINT FK_UsersChickenBreasts_ChickenBreasts FOREIGN KEY (ChickenBreastId)
        REFERENCES ChickenBreasts (ChickenBreastId)
    -- specify more columns here
)
GO


-- Population
-- Delete data from 'Users'
DELETE Users
-- Insert rows into table 'Users'
INSERT INTO Users
    ( -- columns to insert data into
    UserId, Username, Email
    )
VALUES
    ( -- first row: values for the columns in the list above
        1, 'eric', 'eric@micasa.fun'
    ),
    (
        2, 'pepe', 'pepe@micasa.fun'
    )
    -- add more rows here
    GO

-- Delete data from 'ChickenBreasts'
DELETE ChickenBreasts
-- Insert rows into table 'ChickenBreasts'
INSERT INTO ChickenBreasts
    ( -- columns to insert data into
    ChickenBreastId, BreastName, Stock, UnitPrice
    )
VALUES
    ( -- first row: values for the columns in the list above
        1, 'orange', 14567, 1
    ),
    ( -- second row: values for the columns in the list above
        2, 'white', 43123, CAST(0.75 AS DECIMAL(16,2))
    )
    -- add more rows here
    GO

-- Delete data from 'UsersChickenBreasts'
DELETE UsersChickenBreasts
-- Insert rows into table 'UsersChickenBreasts'
INSERT INTO UsersChickenBreasts
    ( -- columns to insert data into
    ChickenBreastId, UserId, Quantity
    )
VALUES
    ( -- first row: values for the columns in the list above
        1, 1, 4
    ),
    ( -- second row: values for the columns in the list above
        2, 1, 4
    ),
    ( -- third row: values for the columns in the list above
        1, 2, 8
    )
-- add more rows here
GO


-- Sample queries
SELECT *
FROM Users

SELECT *
FROM ChickenBreasts

SELECT *
FROM UsersChickenBreasts