create sequence hibernate_sequence start 6 increment 1;

create table organization (
    id int8 not null,
    address varchar(2048) not null,
    city varchar(255) not null,
    name varchar(2048) not null,
    reg varchar(13) not null,
    region varchar(255) not null,
    tax varchar(10) not null,
    primary key (id)
);

alter table if exists organization
    add constraint organization_name unique (name);

alter table if exists organization
    add constraint organization_reg unique (reg);

alter table if exists organization
    add constraint organization_tax unique (tax);