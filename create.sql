
create database project_crowd character set UTF8mb4;

create user project_crowd identified by 'Project_crowd1!';

grant all privileges on project_crowd.* to project_crowd;


-- switch to user project_crowd
use project_crowd;

create table t_admin (
    id int not null auto_increment,
    login_acct varchar(255) not null,
    user_pswd char(32) not null,
    user_name varchar(255) not null,
    email varchar(255) not null,
    create_time char(19),
    primary key (id)
);