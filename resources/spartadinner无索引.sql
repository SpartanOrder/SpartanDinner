/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/3/29 13:54:39                           */
/*==============================================================*/


drop table if exists t_Customer;

drop table if exists t_Department;

drop table if exists t_DinningTable;

drop table if exists t_Dish;

drop table if exists t_DishType;

drop table if exists t_EmployeeInfo;

drop table if exists t_EndCarteContent;

drop table if exists t_EndCarteInfo;

drop table if exists t_MemberInfo;

drop table if exists t_MemberType;

drop table if exists t_OnAccountCarteContent;

drop table if exists t_OnAccountCarteInfo;

drop table if exists t_Power;

drop table if exists t_Region;

drop table if exists t_Restaurant;

drop table if exists t_Role;

drop table if exists t_TempCarteContent;

drop table if exists t_TempCarteInfo;

drop table if exists t_User;

/*==============================================================*/
/* Table: t_Customer                                            */
/*==============================================================*/
create table t_Customer
(
   customerID           int unsigned not null auto_increment,
   customerName         varchar(30) not null,
   customerTel          varchar(20) not null,
   customerGender       tinyint,
   delFlag              tinyint default 1,
   lastSubTime          datetime,
   subBy                int,
   primary key (customerID),
   unique key AK_customerID (customerTel)
);

alter table t_Customer comment '顾客信息表';

/*==============================================================*/
/* Table: t_Department                                          */
/*==============================================================*/
create table t_Department
(
   roleID               int unsigned not null auto_increment,
   roleName             varchar(100) not null,
   priority             int,
   parentId             bigint,
   parentIds            varchar(100),
   delFlag              tinyint unsigned default 1,
   lastSubTime          datetime,
   subBy                int,
   primary key (roleID)
);

alter table t_Department comment '部门的基本信息表';

/*==============================================================*/
/* Table: t_DinningTable                                        */
/*==============================================================*/
create table t_DinningTable
(
   dTableID             int unsigned not null auto_increment,
   regionID             tinyint,
   dTableName           varchar(20) not null,
   dTableState          tinyint unsigned not null default 0,
   dTableDesc           varchar(100),
   dMaxConsumer         int,
   dTableRemark         varchar(100),
   delFlag              tinyint default 1,
   lastSubTime          datetime,
   subBy                int,
   primary key (dTableID),
   unique key AK_dTableName (dTableName)
);

alter table t_DinningTable comment '餐桌';

/*==============================================================*/
/* Table: t_Dish                                                */
/*==============================================================*/
create table t_Dish
(
   dishID               int unsigned not null auto_increment,
   dishTypeID           tinyint,
   dishName             varchar(25) not null,
   dishSpeel            varchar(25),
   dishCost             numeric(10,2) not null,
   dishUnit             varchar(4) not null,
   dishPrice            numeric(10,2) not null,
   dishDescription      varchar(100),
   dishCooking          varchar(10),
   dishImgUrl           varchar(100),
   delFlag              tinyint default 1,
   lastSubTime          datetime,
   subBy                int,
   primary key (dishID),
   unique key AK_dishName (dishName)
);

alter table t_Dish comment '菜肴信息表';

/*==============================================================*/
/* Table: t_DishType                                            */
/*==============================================================*/
create table t_DishType
(
   dishTypeID           tinyint unsigned not null auto_increment,
   dishTypeName         varchar(20) not null,
   dishTypeDesc         varchar(100),
   delFlag              tinyint not null default 1,
   lastSubTime          datetime,
   subBy                int,
   primary key (dishTypeID),
   unique key AK_dishTypeName (dishTypeName)
);

alter table t_DishType comment '菜肴类别';

/*==============================================================*/
/* Table: t_EmployeeInfo                                        */
/*==============================================================*/
create table t_EmployeeInfo
(
   employeeID           int unsigned not null,
   userId               int,
   employeeName         varchar(20) not null,
   employeeSex          tinyint not null,
   birthDate            date,
   IDCard               varchar(20) not null,
   tel                  varchar(20) not null,
   fixedPhone           varchar(20),
   degree               varchar(20),
   description          varchar(255),
   address              varchar(100),
   departmentId         int,
   salary               int,
   employeeDate         date not null,
   fireDate             date not null,
   delFlag              tinyint not null default 1,
   lastSubTime          datetime,
   subBy                int
);

alter table t_EmployeeInfo comment '员工个人信息';


/*==============================================================*/
/* Table: t_EndCarteContent                                     */
/*==============================================================*/
create table t_EndCarteContent
(
   ECCID                int unsigned not null auto_increment,
   ECCDishID            int not null,
   ECCDishNum           tinyint not null,
   ECCTotalPrice        numeric(10,2) not null,
   ECCECIID             int not null,
   ECCSpecilDesc        varchar(20),
   delFlag              tinyint default 1,
   lastSubTime          datetime,
   subBy                int,
   primary key (ECCID)
);

alter table t_EndCarteContent comment '消费餐单内容';

/*==============================================================*/
/* Table: t_EndCarteInfo                                        */
/*==============================================================*/
create table t_EndCarteInfo
(
   ECIID                int unsigned not null auto_increment,
   ECISwiftNumber       varchar(20) not null,
   ECIState             tinyint not null default 0,
   ECIdTableID          int,
   ECIWaiterID          int,
   ECICashierID         int not null,
   ECICustomerID        int,
   ECIMemID             int,
   ECIDishNums          int not null,
   ECIAmountPeoplo      int,
   ECIRepastTime        datetime,
   ECIBillTime          datetime not null default CURRENT_TIMESTAMP,
   ECIPayMethod         varchar(20),
   ECIConsumeAmount     numeric(10,2) unsigned not null,
   ECIDiscount          numeric(4,2) unsigned,
   ECIPaidAmount        numeric(10,2) unsigned not null,
   ECIRemark            varbinary(100),
   delFlag              tinyint default 1,
   lastSubTime          datetime default CURRENT_TIMESTAMP,
   subBy                int,
   primary key (ECIID),
   unique key AK_ECISwiftNumber (ECISwiftNumber)
);

alter table t_EndCarteInfo comment '消费餐单信息';

/*==============================================================*/
/* Table: t_MemberInfo                                          */
/*==============================================================*/
create table t_MemberInfo
(
   memID                int unsigned not null auto_increment,
   memTypeID            int,
   memName              varchar(20),
   memUserName          varchar(20) not null,
   memPassword          varchar(20) not null,
   memTel               varchar(20) not null,
   memPhone             varchar(20),
   memAddress           varchar(50),
   memGender            tinyint,
   memMoney             numeric(10,2) unsigned,
   memIntegral          int unsigned,
   memBirthday          date,
   memBeginTime         datetime,
   memEndTime           datetime,
   delFlag              tinyint default 1,
   lastSubTime          datetime,
   subBy                int,
   primary key (memID),
   unique key AK_memUserName (memUserName),
   unique key AK_memTel (memTel)
);

alter table t_MemberInfo comment '会员信息';

/*==============================================================*/
/* Table: t_MemberType                                          */
/*==============================================================*/
create table t_MemberType
(
   memTypeID            int unsigned not null auto_increment,
   memTypeName          varchar(20) not null,
   memTypeDiscount      numeric(4,2),
   memTypeDesc          varchar(100),
   delFlag              tinyint default 1,
   lastSubTime          datetime,
   subBy                int,
   primary key (memTypeID)
);

alter table t_MemberType comment '会员类别';

/*==============================================================*/
/* Table: t_OnAccountCarteContent                               */
/*==============================================================*/
create table t_OnAccountCarteContent
(
   ECCID                int unsigned not null auto_increment,
   ECCDishID            int not null,
   ECCDishNum           tinyint not null,
   ECCTotalPrice        numeric(10,2) not null,
   ECCECIID             int not null,
   ECCSpecilDesc        varchar(20),
   delFlag              tinyint default 1,
   lastSubTime          datetime,
   subBy                int,
   primary key (ECCID)
);

alter table t_OnAccountCarteContent comment '挂账餐单消费内容';

/*==============================================================*/
/* Table: t_OnAccountCarteInfo                                  */
/*==============================================================*/
create table t_OnAccountCarteInfo
(
   ECIID                int unsigned not null auto_increment,
   ECISwiftNumber       varchar(20) not null,
   ECIState             tinyint not null default 0,
   ECIdTableID          int,
   ECIWaiterID          int,
   ECICashierID         int not null,
   ECICustomerID        int,
   ECIMemID             int,
   ECIDishNums          int not null,
   ECIAmountPeoplo      int,
   ECIRepastTime        datetime,
   ECIBillTime          datetime not null default CURRENT_TIMESTAMP,
   ECIConsumeAmount     numeric(10,2) unsigned not null,
   ECIDiscount          numeric(4,2) unsigned,
   ECIPaidAmount        numeric(10,2) unsigned not null,
   ECIRemark            varbinary(100),
   delFlag              tinyint default 1,
   lastSubTime          datetime default CURRENT_TIMESTAMP,
   subBy                int,
   primary key (ECIID),
   unique key AK_ECISwiftNumber (ECISwiftNumber)
);

alter table t_OnAccountCarteInfo comment '挂账餐单消费信息';

/*==============================================================*/
/* Table: t_Power                                               */
/*==============================================================*/
create table t_Power
(
   powerId              tinyint unsigned not null auto_increment,
   powerName            varchar(10) not null,
   powerType            varchar(50),
   priority             int,
   parentId             bigint,
   parentIds            varchar(100),
   permission           varchar(100),
   delFlag              tinyint unsigned default 1,
   lastSubTime          datetime,
   subBy                int not null,
   primary key (powerId)
);

alter table t_Power comment '权限表';

/*==============================================================*/
/* Table: t_Region                                              */
/*==============================================================*/
create table t_Region
(
   regionID             tinyint unsigned not null auto_increment,
   regionName           varchar(30) not null,
   regionMinConsume     numeric(10,2),
   regionMaxConsumer    int,
   delFlag              tinyint default 1,
   lastSubTime          datetime,
   subBy                int,
   primary key (regionID),
   unique key AK_regName (regionName)
);

alter table t_Region comment '区域';

/*==============================================================*/
/* Table: t_Restaurant                                          */
/*==============================================================*/
create table t_Restaurant
(
   id                   int not null auto_increment,
   restaurantName       varchar(50),
   shortName            varchar(50),
   tel                  varchar(50),
   adderss              varchar(100),
   description          varchar(250),
   url                  varchar(50),
   beginDate            date,
   account              varchar(50),
   taxRegistrationCertificate varchar(50),
   delFlag              tinyint default 1,
   lastSubTime          datetime,
   subBy                int,
   primary key (id)
);

alter table t_Restaurant comment '餐厅的基本信息';

/*==============================================================*/
/* Table: t_Role                                                */
/*==============================================================*/
create table t_Role
(
   roleID               tinyint unsigned not null auto_increment,
   roleName             varchar(20) not null,
   description          varchar(100),
   powerIds             varchar(100),
   delFlag              tinyint unsigned default 1,
   lastSubTime          datetime,
   subBy                int not null,
   primary key (roleID)
);

alter table t_Role comment '分职位的表，例如经理、服务员、收银员等';

/*==============================================================*/
/* Table: t_TempCarteContent                                    */
/*==============================================================*/
create table t_TempCarteContent
(
   TCCID                int unsigned not null auto_increment,
   TCISwiftNumber       varchar(20) not null,
   TCCDishID            int not null,
   TCCDishNum           tinyint not null,
   TCCTotalPrice        numeric(10,2) not null,
   TCCSpecilDesc        varchar(20),
   delFlag              tinyint default 1,
   lastSubTime          datetime,
   subBy                int,
   primary key (TCCID)
);

alter table t_TempCarteContent comment '临时消费餐单内容';

/*==============================================================*/
/* Table: t_TempCarteInfo                                       */
/*==============================================================*/
create table t_TempCarteInfo
(
   TCIID                int unsigned not null,
   TCISwiftNumber       varchar(20) not null,
   TCIState             tinyint not null default 0,
   TCIdTableID          int,
   TCICustomerID        int,
   TCIMemID             int,
   TCIWaiterID          int,
   TCIDishNums          int not null,
   TCIAmountPeoplo      int,
   TCIRepastTime        datetime,
   TCIConsumeAmount     numeric(10,2) unsigned not null,
   TCICostAmount        numeric(10,2) unsigned not null,
   TCIDiscount          numeric(4,2) unsigned,
   TCIRemark            varbinary(100),
   delFlag              tinyint default 1,
   lastSubTime          datetime default CURRENT_TIMESTAMP,
   subBy                int,
   primary key (TCIID),
   unique key AK_ECISwiftNumber (TCISwiftNumber)
);

alter table t_TempCarteInfo comment '临时消费餐单信息';

/*==============================================================*/
/* Table: t_User                                                */
/*==============================================================*/
create table t_User
(
   userID               int unsigned not null auto_increment,
   userName             varchar(20) not null,
   roleID               tinyint,
   userRealName         char(30) not null,
   userPassword         varchar(20) not null,
   salt                 varchar(50) not null,
   lastLoginTime        datetime,
   lastLoginIp          varchar(32),
   delFlag              tinyint default 1,
   lastSubTime          datetime,
   primary key (userID)
);

alter table t_User comment '用户表';

