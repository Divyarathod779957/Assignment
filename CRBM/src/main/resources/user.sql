--------------------------------------
--
-- Table structure for table `users`
--
--------------------------------------

CREATE TABLE crbm.users (
    id int AUTO_INCREMENT PRIMARY KEY ,
    name VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    address VARCHAR(500) NOT NULL,
    city VARCHAR(100) NOT NULL,
    contact VARCHAR(20) NOT NULL
);

--------------------------------------
--
-- Dumping data for table `users`
--
--------------------------------------
INSERT INTO crbm.users (name, password, email, address, city, contact) VALUES
('001', '001', '001@crem.com', 'College CreateRoom Booking Management', 'London', '4412345678'),
('002', '002', '002@crem.com', 'College CreateRoom Booking Management', 'London', '4412345679'),
('003', '003', '003@crem.com', 'College CreateRoom Booking Management', 'London', '4412345680');
--------------------------------------
