CREATE TABLE `users` (
  `USER_ID` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `NAME` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `TOTAL_ORDERS` int(11) NOT NULL)