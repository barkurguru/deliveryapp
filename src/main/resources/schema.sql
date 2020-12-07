
DROP TABLE IF EXISTS CUSTOMERORDER;
 
CREATE TABLE CUSTOMERORDER (
  oid INT AUTO_INCREMENT  PRIMARY KEY,
  custname VARCHAR(60) NOT NULL,
  custcontact VARCHAR(20) NOT NULL,
  custlocpin VARCHAR(30) NULL,
  custorddetails VARCHAR(200) NOT NULL,
  ordertype VARCHAR(20) NOT NULL default 'New',
  ordertime VARCHAR(40) NOT NULL,
  priority VARCHAR(30) DEFAULT 'Low',
  shortestdist VARCHAR(30) NULL,
  exptimetocomplete INT DEFAULT 0,
  units INT NOT NULL,
  price  VARCHAR(20) NOT NULL,
  totalprice  VARCHAR(20) DEFAULT 0.0,
  deliverycharge VARCHAR(20) NOT NULL,
  paytype VARCHAR(20) NOT NULL,
  paystatus VARCHAR(25) NOT NULL,
  custreturn VARCHAR(15) NOT NULL default 'No',
  refamount VARCHAR(15) DEFAULT 0.0,
  delcentnameaddress VARCHAR(100) NOT NULL,
  delcentexeid VARCHAR(70)  NULL,
  delcentexename VARCHAR(70)  NULL,
  delcentcustdist VARCHAR(20)  NULL,
  delstatus VARCHAR(30) NOT NULL default 'Not Delivered',
  delboyidassigned INT DEFAULT 0,
  taskassignstatus VARCHAR(10) NOT NULL
  
);



DROP TABLE IF EXISTS DELBOYDETAILS;
 
CREATE TABLE DELBOYDETAILS(
  dboyid INT NOT NULL,
  dname VARCHAR(150) NOT NULL,
  dcontact VARCHAR(50) NOT NULL,
  oidassigned  VARCHAR(50) NOT NULL,
  ostatus VARCHAR(30) NOT NULL,
  timestart varchar(25) NULL,
  timeend varchar(25) NULL,
  timetakentocomplete varchar(100) NULL,
  vehiclename varchar(50) NOT NULL,
  vehiclenum varchar(50) NULL
);