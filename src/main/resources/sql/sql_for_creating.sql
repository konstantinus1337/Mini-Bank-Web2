create table user_cred(
                          id int PRIMARY KEY generated by default as identity,
                          username varchar(50) unique not null,
                          password varchar(64) not null
);

create table bank_account(
                             id int PRIMARY KEY generated by default as identity,
                             full_name varchar(150) not null,
                             passport_number varchar(10) unique not null,
                             date_of_birth date not null,
                             address varchar(200) not null,
                             phone_number varchar(10) unique,
                             email varchar(95) unique not null,
                             user_id int references user_cred(id) on delete cascade

);

create table card(
                     id int primary key generated by default as identity,
                     bank_account int references bank_account(id) on delete cascade,
                     card_num varchar(16) unique not null,
                     balance decimal(10,2),
                     open_date date not null,
                     Status VARCHAR(10)
);

create table credit(
                       id int primary key generated by default as identity,
                       bank_account int references bank_account(id) on delete cascade,
                       credit_num varchar(24) unique not null,
                       loan_debt decimal(10,2),
                       interest decimal(2,1) not null,
                       open_date date not null ,
                       end_date date not null,
                       Status VARCHAR(10)
);

create table deposit(
                        id int primary key generated by default as identity,
                        bank_account int references bank_account(id) on delete cascade,
                        deposit_num varchar(24) unique not null,
                        balance decimal(10,2),
                        interest decimal(2,1) not null,
                        open_date date not null,
                        end_date timestamp not null,
                        Status VARCHAR(10) not null
)