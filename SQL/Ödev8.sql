--1.
--test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50),
--birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

1.
drop table if exists employee;
create table employee (
	id int,
	name varchar(50),
	birthday date,
	email varchar(100)
)

--2.
--Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

2.
insert into employee (id, name, birthday, email) values (1, 'Adele', '1971-02-08', 'ageraldini0@ucla.edu');
insert into employee (id, name, birthday, email) values (2, 'Stevena', '2008-05-16', 'skobera1@ovh.net');
insert into employee (id, name, birthday, email) values (3, 'Ferdinand', '2007-01-06', 'fchetham2@cpanel.net');
insert into employee (id, name, birthday, email) values (4, 'Kerrie', '1998-12-14', 'klovelace3@youtu.be');
insert into employee (id, name, birthday, email) values (5, 'Ladonna', '1975-12-19', 'lbeelby4@sitemeter.com');
insert into employee (id, name, birthday, email) values (6, 'Waylin', '2000-02-27', 'wtitterell5@surveymonkey.com');
insert into employee (id, name, birthday, email) values (7, 'Camila', '1956-04-26', 'ccoyne6@php.net');
insert into employee (id, name, birthday, email) values (8, 'Lynelle', '1968-05-13', 'lchristene7@fotki.com');
insert into employee (id, name, birthday, email) values (9, 'Othelia', '1952-12-25', 'okubicek8@hatena.ne.jp');
insert into employee (id, name, birthday, email) values (10, 'Sara', '1957-01-14', 'srenoden9@sina.com.cn');
insert into employee (id, name, birthday, email) values (11, 'Drusi', '2009-09-07', 'dpinckneya@apache.org');
insert into employee (id, name, birthday, email) values (12, 'Eleanore', '1968-06-13', 'ebisterb@skype.com');
insert into employee (id, name, birthday, email) values (13, 'Gerhardine', '1988-08-26', 'gslorac@symantec.com');
insert into employee (id, name, birthday, email) values (14, 'Tull', '2013-06-16', 'toertzend@blogspot.com');
insert into employee (id, name, birthday, email) values (15, 'Hugh', '1989-08-28', 'hhardwickee@printfriendly.com');
insert into employee (id, name, birthday, email) values (16, 'Marven', '1957-03-03', 'mschottf@themeforest.net');
insert into employee (id, name, birthday, email) values (17, 'Chico', '1962-10-18', 'cbaumaierg@people.com.cn');
insert into employee (id, name, birthday, email) values (18, 'Tanhya', '1983-09-08', 'tmcbeithh@msn.com');
insert into employee (id, name, birthday, email) values (19, 'Penelope', '2014-03-28', 'pormei@walmart.com');
insert into employee (id, name, birthday, email) values (20, 'Ramsey', '2003-12-27', 'rbernettej@usnews.com');
insert into employee (id, name, birthday, email) values (21, 'Rozamond', '1996-09-25', 'rscrowstonk@geocities.com');
insert into employee (id, name, birthday, email) values (22, 'Clemens', '1978-02-03', 'cadiel@1688.com');
insert into employee (id, name, birthday, email) values (23, 'Penelope', '1980-03-12', 'pregorzm@intel.com');
insert into employee (id, name, birthday, email) values (24, 'Rozelle', '1999-08-07', 'rrainn@pinterest.com');
insert into employee (id, name, birthday, email) values (25, 'Sallyann', '1966-01-16', 'ssheepyo@foxnews.com');
insert into employee (id, name, birthday, email) values (26, 'Ynes', '1974-10-12', 'yjohnp@jimdo.com');
insert into employee (id, name, birthday, email) values (27, 'Ginevra', '2007-11-20', 'gcastanieq@mtv.com');
insert into employee (id, name, birthday, email) values (28, 'Marcos', '1955-06-03', 'mduggonr@gravatar.com');
insert into employee (id, name, birthday, email) values (29, 'Karena', '1982-06-04', 'kchurchyards@issuu.com');
insert into employee (id, name, birthday, email) values (30, 'Emmaline', '1958-02-13', 'eseniort@google.com');
insert into employee (id, name, birthday, email) values (31, 'Aguie', '2014-11-27', 'abattyeu@sitemeter.com');
insert into employee (id, name, birthday, email) values (32, 'Danya', '1952-08-26', 'ddouchv@csmonitor.com');
insert into employee (id, name, birthday, email) values (33, 'Vinita', '1966-02-21', 'vsantryw@nbcnews.com');
insert into employee (id, name, birthday, email) values (34, 'Merilyn', '2003-06-27', 'mstuddx@princeton.edu');
insert into employee (id, name, birthday, email) values (35, 'Xena', '2006-09-15', 'xcurtisy@deviantart.com');
insert into employee (id, name, birthday, email) values (36, 'Jamima', '1993-02-18', 'jdarmodyz@senate.gov');
insert into employee (id, name, birthday, email) values (37, 'Benyamin', '1997-08-25', 'bindgs10@amazon.com');
insert into employee (id, name, birthday, email) values (38, 'Philippine', '1957-08-09', 'pmccurry11@booking.com');
insert into employee (id, name, birthday, email) values (39, 'Yoshiko', '1950-08-01', 'yfavelle12@rakuten.co.jp');
insert into employee (id, name, birthday, email) values (40, 'Georas', '1986-01-13', 'gtilt13@sakura.ne.jp');
insert into employee (id, name, birthday, email) values (41, 'Reginauld', '1969-12-27', 'rmatteucci14@uol.com.br');
insert into employee (id, name, birthday, email) values (42, 'Sigfried', '2003-01-29', 'sminshull15@g.co');
insert into employee (id, name, birthday, email) values (43, 'Griselda', '1969-10-13', 'geddicott16@unc.edu');
insert into employee (id, name, birthday, email) values (44, 'Jaquenetta', '2009-02-06', 'jballister17@sun.com');
insert into employee (id, name, birthday, email) values (45, 'Saree', '2009-04-06', 'scurrall18@geocities.jp');
insert into employee (id, name, birthday, email) values (46, 'Kimberlee', '1974-05-27', 'kpiesold19@usatoday.com');
insert into employee (id, name, birthday, email) values (47, 'Ed', '1963-04-26', 'epieterick1a@com.com');
insert into employee (id, name, birthday, email) values (48, 'Harris', '1980-02-25', 'hhendrik1b@wordpress.com');
insert into employee (id, name, birthday, email) values (49, 'Mauricio', '1970-01-01', 'mfairbanks1c@wordpress.org');
insert into employee (id, name, birthday, email) values (50, 'Celina', '1998-04-27', 'cmatuska1d@mayoclinic.com');

--3.
--Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

3.
update employee
set name='Eddard',
	birthday='1972-07-23',
	email='eddard@gmail.com'
where id=1;

update employee
set id=53,
	birthday='2022-01-04',
	email='skode@gm.com'
where name='Stevena';

update employee
set id=103,
	name='Kaan',
	email='kaan.senel@edu'
where birthday='2007-01-06';

update employee
set id=2,
	name='Ahmet',
	birthday='2000-12-21'
where email='ccoyne6@php.net';

update employee
set name='Kerrigan',
	birthday='1999-04-21',
	email='kerrigan@youtube.com'
where id=4;

--4.
--Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

4.
delete from employee where id=53;
delete from employee where name='Saree';
delete from employee where birthday='2003-06-27';
delete from employee where email='cadiel@1688.com';
delete from employee where id=14;
