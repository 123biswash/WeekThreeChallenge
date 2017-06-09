use RobotResume;
create table RoboResume(
	ID int not null auto_increment,
	UsernName varchar(100),
    email varchar(100),
    education varchar(1000),
    experience varchar(2000),
    skills varchar(2000),
    primary key (ID)
    );
    
create table BasicInfo(
	ID int not null auto_increment,
    UserName varchar(1000),
	Email varchar(1000),
    primary key (ID)
    );