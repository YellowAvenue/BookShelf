create table product_types(
                              id BIGINT not null primary key,
                              name varchar(100)
);

create table makers(
                       id BIGINT not null primary key,
                       name varchar(100)
);

create table products(
                        id BIGINT not null primary key,
                        name varchar(100),
                        cost int,
                        img_path text,
                        short_description text,
                        maker_id bigint,
                        constraint fk_maker_id
                            foreign key (maker_id)
                                references makers(id),
                        product_type bigint,
                        constraint fk_product_type
                            foreign key (product_type)
                                references product_types(id)
);

create table users(
                      id bigint not null primary key,
                      name varchar(100),
                      age int,
                      phone_number varchar(12),
                      address text,
                      have_account boolean
);

create table orders(
                       id bigint not null primary key,
                       product_id bigint,
                       user_id bigint,
                       order_time date,
                       constraint fk_product_id
                           foreign key (product_id)
                               references product(id),
                       constraint fk_user_id
                           foreign key (user_id)
                               references users(id)
);
