
INSERT INTO CUSTOMERORDER (custname, custcontact, custlocpin, custorddetails, ordertime, priority, units, price, deliverycharge, paytype, paystatus,delcentnameaddress,delcentcustdist,taskassignstatus, delboyidassigned ) 
	VALUES ('Umesh','9832498334', '19.1234556N, 12.31454W','Southe meals -1, Orange_juice-2','2020-12-05 14:30','Medium',1, 200, 25,'CreditCard','Paid','Vijayanagar-Bangalore','2.5 Kms','30 mins', 1);
INSERT INTO CUSTOMERORDER (custname, custcontact, custlocpin, custorddetails,ordertype, ordertime, priority, units, price,deliverycharge, paytype, paystatus,delcentnameaddress,delcentcustdist,delstatus, taskassignstatus  ) 
	VALUES ('Ravi','7403433', '19.194655N, 12.41234W','North Thali -2, Masala-pappad-2','Cancelled','2020-12-06 13:30','Urgent',1, 300, 35,'Cash','NotPaid','Koramangala-Bangalore','4 Kms','Delivered','45 mins');
INSERT INTO CUSTOMERORDER (custname, custcontact, custlocpin, custorddetails,ordertime,  units, price,deliverycharge,  paytype, paystatus,delcentnameaddress,delcentcustdist,taskassignstatus  ) 
	VALUES ('Shankar','745298334', '19.2343445N, 12.145344W','BisiBeleBath -3, Idli-5','2020-12-06 08:30',1, 300, 25,'Cash','Paid','Banashankari-Bangalore','2 Kms','15 mins');
INSERT INTO CUSTOMERORDER (custname, custcontact, custlocpin, custorddetails, ordertime, units, price,deliverycharge, paytype, paystatus,delcentnameaddress,delcentcustdist, taskassignstatus  ) 
	VALUES ('Rekha','89998334', '19.54556N, 12.423454W','MasalaDosa-2, Upma-2','2020-12-06 17:30',1, 200, 25,'CreditCard','NotPaid','Marathahalli-Bangalore','2 Kms','40 mins');


INSERT INTO DELBOYDETAILS (dboyid,dname,dcontact,oidassigned,ostatus,timestart,timeend, timetakentocomplete, vehiclename) 
	VALUES(1,'Varun','88989822',1,'InProgress','2020-12-06 10:30','2020-12-06 10:50', '','Activa');
INSERT INTO DELBOYDETAILS (dboyid,dname,dcontact,oidassigned,ostatus,timestart,timeend, timetakentocomplete,vehiclename) 
	VALUES(2,'Laxman','6786789234',4,'Completed','2020-12-06 14:20','2020-12-06 14:50', '30 mins','Honda');
INSERT INTO DELBOYDETAILS (dboyid,dname,dcontact,oidassigned,ostatus,timestart,timeend, timetakentocomplete,vehiclename) 
	VALUES(3,'Ravi','6576898676',2,'Available','','','','Scooty');
INSERT INTO DELBOYDETAILS (dboyid,dname,dcontact,oidassigned,ostatus,timestart,timeend, timetakentocomplete,vehiclename) 
	VALUES(4,'Aditya','456898897',3,'Not Available','','','','Kawasaki');