/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/1/28 ������ ���� 2:37:34                     */
/*==============================================================*/
DROP database IF EXISTS qsj;
CREATE database qsj DEFAULT CHARACTER SET 'utf8';
use qsj;
set names utf8;


drop table if exists publish_info;

drop table if exists user_info;

drop table if exists collections;

drop table if exists dictionarys;

drop table if exists advertisement;

/*==============================================================*/
/* Table: publish_info                                          */
/*==============================================================*/
create table publish_info
(
   id                   int not null auto_increment,
   publish_man         varchar(50) comment '������--����ǰ�û�',
   user_id              int comment '�û�id',
   title                varchar(50) comment '��������',
   job_type                 varchar(50) comment '����',
   adderss              varchar(50) comment '����',
   expiry_date          timestamp comment '��ֹ����',
   link_man             varchar(20) comment '��ϵ��',
   link_phone           varchar(30) comment '��ϵ����',
   qq                   varchar(30) comment 'QQ��΢��',
   email                varchar(50) comment '����',
   number               int comment '��Ƹ����',
   salary               float comment 'н��',
   salary_type          varchar(50) comment '薪资类型',
   note                 text comment '��ϸ����',
   publish_date			timestamp comment '��ֹ����',
   status               int comment '0 审核中  1 已审核    2 已过时',
   flag                 int comment '0 不置顶   1 置顶    ',
   primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table user_info
(

   user_id              int not null auto_increment comment '�û�id',
   user_name            varchar(40) comment '�û�����',
   code		            varchar(40) comment '微信用户id 唯一性',
   flag                 int comment '0 不是管理者   1 是管理者    ',
   primary key (user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into user_info (user_name,code,flag) values ('15005089593','15005089593',1);

/*==============================================================*/
/* Table: collections       中间表                 用户 和 job 是多对多              */
/*==============================================================*/
create table collections
(
   id              	  int not null auto_increment comment '主键id',
   user_id            int comment '��Ƹ����',
   job_id             int comment '��Ƹ����',
   primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: dictionarys      数据字典表                            */
/*==============================================================*/
create table dictionarys
(
   id              	  int not null auto_increment comment '主键id',
   keyword            varchar(40) comment '�û�����',
   name           	  varchar(40) comment '�û�����',
   primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into dictionarys (keyword,name) values ('job','促销');
insert into dictionarys (keyword,name) values ('job','安保');
insert into dictionarys (keyword,name) values ('job','礼仪');
insert into dictionarys (keyword,name) values ('job','促销');
insert into dictionarys (keyword,name) values ('job','翻译');
insert into dictionarys (keyword,name) values ('job','客服');
insert into dictionarys (keyword,name) values ('job','演出');
insert into dictionarys (keyword,name) values ('job','家教');
insert into dictionarys (keyword,name) values ('job','模特');
insert into dictionarys (keyword,name) values ('job','派单');
insert into dictionarys (keyword,name) values ('job','文员');
insert into dictionarys (keyword,name) values ('job','设计');
insert into dictionarys (keyword,name) values ('job','校内');
insert into dictionarys (keyword,name) values ('job','临时工');
insert into dictionarys (keyword,name) values ('job','服务员');
insert into dictionarys (keyword,name) values ('job','其他');


insert into dictionarys (keyword,name) values ('adderss','鲤城');
insert into dictionarys (keyword,name) values ('adderss','丰泽');
insert into dictionarys (keyword,name) values ('adderss','洛江');
insert into dictionarys (keyword,name) values ('adderss','泉港');
insert into dictionarys (keyword,name) values ('adderss','石狮');
insert into dictionarys (keyword,name) values ('adderss','晋江');
insert into dictionarys (keyword,name) values ('adderss','南安');
insert into dictionarys (keyword,name) values ('adderss','惠安');
insert into dictionarys (keyword,name) values ('adderss','安溪');
insert into dictionarys (keyword,name) values ('adderss','永春');
insert into dictionarys (keyword,name) values ('adderss','德化');
insert into dictionarys (keyword,name) values ('adderss','金门');


/*==============================================================*/
/* Table: advertisement      数据字典表                            */
/*==============================================================*/
create table advertisement
(
   id                   int not null auto_increment,
   company_name         varchar(50) comment '������--����ǰ�û�',
   company_url          varchar(250) comment '��������',
   image_url             varchar(200) comment '��ϵ��',
   weight               int comment '权重',
   note                 text comment '��ϸ����',
   create_date			timestamp comment '��ֹ����',
   status               int comment '0 无效  1 有效',
   primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;