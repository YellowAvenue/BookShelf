create table product_types(
                              id int not null primary key,
                              name varchar(100)
);

create table makers(
                       id int not null primary key,
                       name varchar(100)
);

create table product(
                        id int not null primary key,
                        name varchar(100),
                        cost int,
                        img_path text,
                        short_description text,
                        maker_id int,
                        constraint fk_maker_id
                            foreign key (maker_id)
                                references makers(id),
                        product_type int,
                        constraint fk_product_type
                            foreign key (product_type)
                                references product_types(id)
);

create table users(
                      id int not null primary key,
                      name varchar(100),
                      age int,
                      phone_number varchar(12),
                      address text,
                      have_account boolean
);

create table orders(
                       id int not null primary key,
                       product_id int,
                       user_id int,
                       order_time date,
                       constraint fk_product_id
                           foreign key (product_id)
                               references product(id),
                       constraint fk_user_id
                           foreign key (user_id)
                               references users(id)
);
