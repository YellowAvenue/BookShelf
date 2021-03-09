create table product(
     id int not null primary key,
     name varchar(100),
     cost int,
     img_path text,
     short_desctiption text,
     maker_id int,
     product_type int
);

create table orders(
  id int not null primary key,
  product_id int,
  user_id int,
  order_time date,
  constraint fk_product
      foreign key (product_id)
      references product(id),
  constraint fk_user
      foreign key (user_id)
          references users(id)
);
