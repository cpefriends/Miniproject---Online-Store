DROP DATABASE IF EXISTS ONLINE_STORE;
CREATE DATABASE ONLINE_STORE;

DROP TABLE IF EXISTS PRODUCTS;

CREATE TABLE `PRODUCTS` (
  `PRODUCT_ID` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `PRODUCT_NAME` varchar(255) DEFAULT NULL,
  `PRODUCT_CODE` varchar(255) NOT NULL,
  `PRODUCT_PRICE` int(11) NOT NULL,
  `PRODUCT_DESCRIPTION` longtext NOT NULL,
  `PRODUCT_THUMBNAIL` varchar(255) NOT NULL,
  `PRODUCT_HIDDEN` int(11) NOT NULL,
  `TOTAL_SALES` int(11) NOT NULL,
  `PRODUCT_STOCK` int(11) NOT NULL
);

DROP TABLE IF EXISTS USERS;

CREATE TABLE `USERS`(
  `USER_ID` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `USER_NAME` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `TOTAL_ORDERS` int(11) NOT NULL
);

DROP TABLE IF EXISTS CART_ITEMS;

CREATE TABLE `CART_ITEMS`(
  `CART_ITEM_ID` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `USER_ID` int(11) NOT NULL,
  `PRODUCT_ID` int(11) NOT NULL,
  `COUNT` int(11) NOT NULL,
  FOREIGN KEY(USER_ID) REFERENCES users(USER_ID),
  FOREIGN KEY(PRODUCT_ID) REFERENCES products(PRODUCT_ID)
);

DROP TABLE IF EXISTS PAYMENT_METHODS;

CREATE TABLE `PAYMENT_METHODS`(
  `PAYMENT_METHOD_ID` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `PAYMENT_METHOD_NAME` varchar(255) NOT NULL
);

DROP TABLE IF EXISTS ORDERS;

CREATE TABLE `ORDERS`(
  `ORDER_ID` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `ORDER_CODE` varchar(255) NOT NULL,
  `ORDER_ADDRESS` varchar(255) NOT NULL,
  `TOTAL` int(11) NOT NULL,
  `DATE_ORDERED` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `DATE_DELIVERED` datetime NOT NULL,
  `STATUS` varchar(255) NOT NULL,
  `PAYMENT_METHOD` int(11) NOT NULL,
  `USER_ID` int(11) NOT NULL,
  FOREIGN KEY(PAYMENT_METHOD) REFERENCES payment_methods(PAYMENT_METHOD_ID),
  FOREIGN KEY(USER_ID) REFERENCES users(USER_ID)
);

DROP TABLE IF EXISTS ORDER_PRODUCTS;

CREATE TABLE `ORDER_PRODUCTS`(
  `ORDER_PRODUCT_ID` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `ORDER_ID` int(11) NOT NULL,
  `PRODUCT_ID` int(11) NOT NULL,
  `PRICE` int(11) NOT NULL,
  FOREIGN KEY(ORDER_ID) REFERENCES orders(ORDER_ID),
  FOREIGN KEY(PRODUCT_ID) REFERENCES products(PRODUCT_ID)
);

DROP TABLE IF EXISTS MESSAGES;

CREATE TABLE `MESSAGES`(
  `MESSAGE_ID` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `NAME` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `SUBJECT` varchar(255) NOT NULL,
  `MESSAGE` varchar(255) NOT NULL,
  `DATE_SENT` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
);

DROP TABLE IF EXISTS ADMINS;

CREATE TABLE `ADMINS`(
  `ADMIN_ID` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `USERNAME` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL
);

INSERT INTO `admins`(`USERNAME`, `PASSWORD`, `EMAIL`) VALUES ("admin", "password", "miniproject399@gmail.com");

INSERT INTO `payment_methods`(`PAYMENT_METHOD_NAME`) VALUES ("Cash on Delivery");
INSERT INTO `payment_methods`(`PAYMENT_METHOD_NAME`) VALUES ("Credit Card");