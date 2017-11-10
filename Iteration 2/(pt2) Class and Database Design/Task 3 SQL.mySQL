CREATE TABLE CustomerDB (
  IDNum int NOT NULL PRIMARY KEY,
  CustomerName varchar(255),
  Address varchar(255),
  PhoneNum varchar(12)
);

INSERT INTO CustomerDB
VALUES (00001, 'Bob Doe', '1234 Clover Lane', '555-554-5125');
       

CREATE TABLE OrderDB (
  IDNum int NOT NULL PRIMARY KEY,
  TotalCost decimal(15,2),
  OrderDate date,
  PaymentType ENUM('Cash', 'Credit', 'Debit'),
  CustomerID int NOT NULL,
  FOREIGN KEY (CustomerID) REFERENCES CustomerDB (IDNum)
);

INSERT INTO OrderDB
VALUES (00001, 11.12, '2017-01-17', 'Debit', 0001);

CREATE TABLE ProductDB (
  IDNum int NOT NULL PRIMARY KEY,
  ProductName varchar(255),
  NumAvailable int,
  Price decimal(15,2),
  VendorNum int,
  Expiration date,
  Description varchar(255)
);

INSERT INTO ProductDB
VALUES (00001, 'Apples', 30, 0.99, 12, '2017-01-17', 'Red Fruit'), 
       (00002, 'Oranges', 20, 1.50, 15, '2017-01-17', 'Orange Fruit'),
       (00003, 'Bananas', 40, 0.95, 09, '2017-01-17', 'Yellow Fruit'),
       (00004, 'Plums', 15, 1.25, 21, '2017-01-17', 'Purple Fruit'),
       (00005, 'Peaches', 20, 1.29, 5, '2017-01-17', 'Sweet, Orange Fruit');
       
CREATE TABLE EmployeeDB (
  IDNum int NOT NULL PRIMARY KEY,
  Name varchar(255),
  Address varchar(255),
  Role ENUM('Cashier', 'Manager'),
  PhoneNum varchar(12)
);

INSERT INTO EmployeeDB
VALUES (00001, 'Tung Nguyen', 'Auburn', 'Manager', '555-not-sure'),
       (00002, 'Chris', '141 Hemlock Drive', 'Cashier', '678-542-7636'),
       (00003, 'Harshill', 'Auburn', 'Cashier', '256-343-8050');

CREATE TABLE BusinessReportInfoDB (
  IDNum int NOT NULL PRIMARY KEY,
  ProductID int NOT NULL,
  NumSold int,
  OrderID int NOT NULL,
  FOREIGN KEY (ProductID) REFERENCES ProductDB (IDNum),
  FOREIGN KEY (OrderID) REFERENCES OrderDB (IDNum)
);

INSERT INTO BusinessReportInfoDB
VALUES  (00001, 00001, 3, 00001),
        (00002, 00003, 4, 00001),
        (00003, 00005, 2, 00001);