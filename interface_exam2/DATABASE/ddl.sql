--drop table tbl_orders;
create table TBL_ORDERS (
	ORD_NO	    number primary key,			
	CUSTOMER    varchar2(20),
	ORD_DTTM    date,		
	ORD_GOODS   varchar2(8),
	ORD_CNT     number(8),
	ORD_PRICE   number
);

CREATE SEQUENCE ORDERNO_SEQ
START WITH 1
INCREMENT BY 1
NOMAXVALUE
NOMINVALUE;
