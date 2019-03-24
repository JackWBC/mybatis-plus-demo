drop table t_coffee if exists;
drop table t_order if exists;
drop table t_order_coffee if exists;

create table t_coffee (
    id bigint auto_increment,
    create_time timestamp default current_timestamp ,
    update_time timestamp default current_timestamp on update current_timestamp ,
    name varchar(255),
    price bigint,
    inventory bigint,
    version int,
    primary key (id)
);

create table t_coffee_order (
    id bigint auto_increment,
    create_time timestamp default current_timestamp ,
    update_time timestamp default current_timestamp on update current_timestamp ,
    customer varchar(255),
    state integer not null,
    primary key (id)
);

create table t_order_coffee_rel (
    id bigint auto_increment,
    create_time timestamp default current_timestamp ,
    update_time timestamp default current_timestamp on update current_timestamp ,
    coffee_order_id bigint not null,
    coffee_id bigint not null,
    amount int not null,
    primary key (id)
);
