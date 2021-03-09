drop schema if exists bookshelf CASCADE;

--Создаём схему
create schema bookshelf;
--Подтверждаем транзакцию

create table bookshelf.product(
     id int not null PRIMARY KEY,
     name varchar(100),
     cost int,
     img_path text,
     short_desctiption text,
     maker_id int,
     product_type int
);
commit;