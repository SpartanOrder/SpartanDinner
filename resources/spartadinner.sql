/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/3/30 21:38:33                           */
/*==============================================================*/


DROP TABLE IF EXISTS t_Customer;

DROP TABLE IF EXISTS t_Department;

DROP TABLE IF EXISTS t_DinningTable;

DROP TABLE IF EXISTS t_Dish;

DROP TABLE IF EXISTS t_DishType;

DROP TABLE IF EXISTS t_EmployeeInfo;

DROP TABLE IF EXISTS t_EndCarteContent;

DROP TABLE IF EXISTS t_EndCarteInfo;

DROP TABLE IF EXISTS t_MemberInfo;

DROP TABLE IF EXISTS t_MemberType;

DROP TABLE IF EXISTS t_OnAccountCarteContent;

DROP TABLE IF EXISTS t_OnAccountCarteInfo;

DROP TABLE IF EXISTS t_Power;

DROP TABLE IF EXISTS t_Region;

DROP TABLE IF EXISTS t_Restaurant;

DROP TABLE IF EXISTS t_Role;

DROP TABLE IF EXISTS t_TempCarteContent;

DROP TABLE IF EXISTS t_TempCarteInfo;

DROP TABLE IF EXISTS t_User;

/*==============================================================*/
/* Table: t_Customer                                            */
/*==============================================================*/
CREATE TABLE t_Customer (
	customer_ID INT NOT NULL                   AUTO_INCREMENT
	COMMENT '顾客ID',
	customer_Name VARCHAR(30) NOT NULL
	COMMENT '顾客姓名',
	customer_Tel VARCHAR(20) NOT NULL
	COMMENT '顾客手机',
	customer_Gender TINYINT COMMENT '顾客性别',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标记',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (customer_ID),
	UNIQUE KEY AK_customerID (customer_Tel)
);

ALTER TABLE t_Customer COMMENT '顾客信息表';

/*==============================================================*/
/* Table: t_Department                                          */
/*==============================================================*/
CREATE TABLE t_Department (
	role_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '部门ID',
	role_Name VARCHAR(100) NOT NULL
	COMMENT '部门名字',
	priority INT COMMENT '显示顺序',
	parent_Id INT COMMENT '父编号',
	parent_Ids VARCHAR(100) COMMENT '父编号列表',
	del_Flag TINYINT UNSIGNED DEFAULT 1
	COMMENT '删除标志',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (role_ID)
);

ALTER TABLE t_Department COMMENT '部门的基本信息表';

/*==============================================================*/
/* Table: t_DinningTable                                        */
/*==============================================================*/
CREATE TABLE t_DinningTable (
	table_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '餐桌ID',
	region_ID INT COMMENT '区域ID',
	table_Name VARCHAR(20) NOT NULL
	COMMENT '餐桌名字',
	table_State TINYINT UNSIGNED NOT NULL DEFAULT 0
	COMMENT '餐桌状态',
	table_Desc VARCHAR(100) COMMENT '餐桌描述',
	max_Consumer INT COMMENT '容纳人数',
	table_Remark VARCHAR(100) COMMENT '餐桌备注',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标志',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (table_ID),
	UNIQUE KEY AK_dTableName (table_Name)
);

ALTER TABLE t_DinningTable COMMENT '餐桌';

/*==============================================================*/
/* Table: t_Dish                                                */
/*==============================================================*/
CREATE TABLE t_Dish (
	dish_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '菜肴ID',
	dish_Type_ID INT COMMENT '菜肴类别ID',
	dish_Name VARCHAR(25) NOT NULL
	COMMENT '菜肴名字',
	dish_Speel VARCHAR(25) COMMENT '菜肴拼写',
	dish_Cost NUMERIC(10,2) NOT NULL
	COMMENT '菜肴进货价',
	dish_Unit VARCHAR(4) NOT NULL
	COMMENT '菜肴单位量',
	dish_Price NUMERIC(10,2) NOT NULL
	COMMENT '菜肴单价',
	dish_Description VARCHAR(100) COMMENT '菜肴描述',
	dish_Cooking VARCHAR(10) COMMENT '菜肴烹饪方式',
	dish_Img_Url VARCHAR(100) COMMENT '菜肴图片地址',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标志',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (dish_ID),
	UNIQUE KEY AK_dishName (dish_Name)
);

ALTER TABLE t_Dish COMMENT '菜肴信息表';

/*==============================================================*/
/* Table: t_DishType                                            */
/*==============================================================*/
CREATE TABLE t_DishType (
	dish_Type_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '菜肴类别ID',
	dish_Type_Name VARCHAR(20) NOT NULL
	COMMENT '菜肴类别名字',
	dish_Type_Desc VARCHAR(100) COMMENT '菜肴类别描述',
	del_Flag TINYINT NOT NULL DEFAULT 1
	COMMENT '删除标志',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (dish_Type_ID),
	UNIQUE KEY AK_dishTypeName (dish_Type_Name)
);

ALTER TABLE t_DishType COMMENT '菜肴类别';

/*==============================================================*/
/* Table: t_EmployeeInfo                                        */
/*==============================================================*/
CREATE TABLE t_EmployeeInfo (
	employee_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '员工ID',
	user_Id INT COMMENT '用户帐号ID',
	employee_Name VARCHAR(20) NOT NULL
	COMMENT '员工姓名',
	employee_Sex TINYINT NOT NULL
	COMMENT '员工性别',
	birth_Date DATE COMMENT '出生日期',
	ID_Card VARCHAR(20) NOT NULL
	COMMENT '员工身份证',
	tel VARCHAR(20) NOT NULL
	COMMENT '员工手机号码',
	fixed_Phone VARCHAR(20) COMMENT '员工固话',
	degree VARCHAR(20) COMMENT '文化程度',
	description VARCHAR(255) COMMENT '员工个人描述',
	address VARCHAR(100) COMMENT '员工地址',
	department_Id INT COMMENT '所属部门ID',
	salary INT COMMENT '薪金',
	employee_Date DATE NOT NULL
	COMMENT '聘用日期',
	fire_Date DATE NOT NULL
	COMMENT '结束日期',
	del_Flag TINYINT NOT NULL DEFAULT 1
	COMMENT '删除标志',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (employee_ID)
);

ALTER TABLE t_EmployeeInfo COMMENT '员工个人信息';

/*==============================================================*/
/* Table: t_EndCarteContent                                     */
/*==============================================================*/
CREATE TABLE t_EndCarteContent (
	ECC_ID INT UNSIGNED NOT NULL                      AUTO_INCREMENT
	COMMENT '餐单内容ID',
	ECC_Dish_ID INT NOT NULL
	COMMENT '菜肴ID',
	ECC_Dish_Num INT NOT NULL
	COMMENT '菜肴数量',
	ECC_Total_Price NUMERIC(10,2) NOT NULL
	COMMENT '菜肴总价',
	ECC_ECI_ID INT NOT NULL
	COMMENT '餐单信息ID',
	ECC_Specil_Desc VARCHAR(20) COMMENT '特殊菜式',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标记',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (ECC_ID)
);

ALTER TABLE t_EndCarteContent COMMENT '消费餐单内容';

/*==============================================================*/
/* Table: t_EndCarteInfo                                        */
/*==============================================================*/
CREATE TABLE t_EndCarteInfo (
	ECI_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '餐单信息ID',
	ECI_Swift_Number VARCHAR(20) NOT NULL
	COMMENT '餐单流水号',
	ECI_State TINYINT NOT NULL DEFAULT 0
	COMMENT '餐单状态',
	ECI_Table_ID INT COMMENT '餐桌ID',
	ECI_Waiter_ID INT COMMENT '服务员ID',
	ECI_Cashier_ID INT NOT NULL
	COMMENT '收银员ID',
	ECI_Customer_ID INT COMMENT '顾客ID',
	ECI_Mem_ID INT COMMENT '会员ID',
	ECI_Dish_Nums INT NOT NULL
	COMMENT '菜肴数量',
	ECI_Amount_Peoplo INT COMMENT '就餐人数',
	ECI_Repast_Time DATETIME COMMENT '就餐时间',
	ECI_Bill_Time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
	COMMENT '结帐时间',
	ECI_Pay_Method VARCHAR(20) COMMENT '结账方式',
	ECI_Consume_Amount NUMERIC(10,2) UNSIGNED NOT NULL
	COMMENT '消费金额',
	ECI_Discount NUMERIC(4,2) UNSIGNED COMMENT '折扣',
	ECI_Paid_Amount NUMERIC(10,2) UNSIGNED NOT NULL
	COMMENT '实收金额',
	ECI_Remark VARBINARY(100) COMMENT '餐单备注',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标记',
	last_SubTime DATETIME DEFAULT CURRENT_TIMESTAMP
	COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (ECI_ID),
	UNIQUE KEY AK_ECISwiftNumber (ECI_Swift_Number)
);

ALTER TABLE t_EndCarteInfo COMMENT '消费餐单信息';

/*==============================================================*/
/* Table: t_MemberInfo                                          */
/*==============================================================*/
CREATE TABLE t_MemberInfo (
	mem_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '会员ID',
	mem_Type_ID INT COMMENT '会员类别ID',
	mem_Name VARCHAR(20) COMMENT '会员姓名',
	mem_User_Name VARCHAR(20) NOT NULL
	COMMENT '会员账号',
	mem_Password VARCHAR(20) NOT NULL
	COMMENT '会员密码',
	mem_Tel VARCHAR(20) NOT NULL
	COMMENT '会员手机',
	mem_Phone VARCHAR(20) COMMENT '会员固话',
	mem_Address VARCHAR(50) COMMENT '会员地址',
	mem_Gender TINYINT COMMENT '会员性别',
	mem_Money NUMERIC(10,2) UNSIGNED COMMENT '会员余额',
	mem_Integral INT UNSIGNED COMMENT '会员积分',
	mem_Birthday DATE COMMENT '会员生日',
	mem_Begin_Time DATETIME COMMENT '会员开卡时间',
	mem_End_Time DATETIME COMMENT '会员卡截止期',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标志',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (mem_ID),
	UNIQUE KEY AK_memUserName (mem_User_Name),
	UNIQUE KEY AK_memTel (mem_Tel)
);

ALTER TABLE t_MemberInfo COMMENT '会员信息';

/*==============================================================*/
/* Table: t_MemberType                                          */
/*==============================================================*/
CREATE TABLE t_MemberType (
	mem_Type_ID INT UNSIGNED NOT NULL                                                                      AUTO_INCREMENT
	COMMENT '会员类别ID',
	mem_Type_Name VARCHAR(20) NOT NULL
	COMMENT '会员类别名字',
	mem_Type_Discount NUMERIC(4,2) COMMENT '会员类别折扣',
	mem_Type_Desc VARCHAR(100) COMMENT '会员类别描述',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标志',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (mem_Type_ID)
);

ALTER TABLE t_MemberType COMMENT '会员类别';

/*==============================================================*/
/* Table: t_OnAccountCarteContent                               */
/*==============================================================*/
CREATE TABLE t_OnAccountCarteContent (
	ECC_ID INT UNSIGNED NOT NULL                      AUTO_INCREMENT
	COMMENT '餐单内容ID',
	ECC_Dish_ID INT NOT NULL
	COMMENT '菜肴ID',
	ECC_Dish_Num INT NOT NULL
	COMMENT '菜肴数量',
	ECC_Total_Price NUMERIC(10,2) NOT NULL
	COMMENT '菜肴总价',
	ECC_ECI_ID INT NOT NULL
	COMMENT '餐单信息ID',
	ECC_Specil_Desc VARCHAR(20) COMMENT '特殊菜式',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标记',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (ECC_ID)
);

ALTER TABLE t_OnAccountCarteContent COMMENT '挂账餐单消费内容';

/*==============================================================*/
/* Table: t_OnAccountCarteInfo                                  */
/*==============================================================*/
CREATE TABLE t_OnAccountCarteInfo (
	ECI_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '餐单信息ID',
	ECI_Swift_Number VARCHAR(20) NOT NULL
	COMMENT '餐单流水号',
	ECI_State TINYINT NOT NULL DEFAULT 0
	COMMENT '餐单状态',
	ECI_Table_ID INT COMMENT '餐桌ID',
	ECI_Waiter_ID INT COMMENT '服务员ID',
	ECI_Cashier_ID INT NOT NULL
	COMMENT '收银员ID',
	ECI_Customer_ID INT COMMENT '顾客ID',
	ECI_Mem_ID INT COMMENT '会员ID',
	ECI_Dish_Nums INT NOT NULL
	COMMENT '菜肴数量',
	ECI_Amount_Peoplo INT COMMENT '就餐人数',
	ECI_Repast_Time DATETIME COMMENT '就餐时间',
	ECI_Bill_Time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
	COMMENT '结帐时间',
	ECI_Consume_Amount NUMERIC(10,2) UNSIGNED NOT NULL
	COMMENT '消费金额',
	ECI_Discount NUMERIC(4,2) UNSIGNED COMMENT '折扣',
	ECI_Paid_Amount NUMERIC(10,2) UNSIGNED NOT NULL
	COMMENT '实收金额',
	ECI_Remark VARBINARY(100) COMMENT '餐单备注',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标记',
	last_SubTime DATETIME DEFAULT CURRENT_TIMESTAMP
	COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (ECI_ID),
	UNIQUE KEY AK_ECISwiftNumber (ECI_Swift_Number)
);

ALTER TABLE t_OnAccountCarteInfo COMMENT '挂账餐单消费信息';

/*==============================================================*/
/* Table: t_Power                                               */
/*==============================================================*/
CREATE TABLE t_Power (
	power_Id INT UNSIGNED NOT NULL                                                                          AUTO_INCREMENT
	COMMENT '权限ID',
	power_Name VARCHAR(10) NOT NULL
	COMMENT '权限名称',
	power_Type VARCHAR(50) COMMENT '权限类型',
	priority INT COMMENT '显示顺序',
	parent_Id INT COMMENT '父编号',
	parent_Ids VARCHAR(100) COMMENT '父编号列表',
	permission VARCHAR(100) COMMENT '权限字符串',
	del_Flag TINYINT UNSIGNED DEFAULT 1
	COMMENT '删除标志',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (power_Id)
);

ALTER TABLE t_Power COMMENT '权限表';

/*==============================================================*/
/* Table: t_Region                                              */
/*==============================================================*/
CREATE TABLE t_Region (
	region_ID INT UNSIGNED NOT NULL                                                                    AUTO_INCREMENT
	COMMENT '区域ID',
	region_Name VARCHAR(30) NOT NULL
	COMMENT '区域名字',
	region_Min_Consume NUMERIC(10,2) COMMENT '区域最低消费',
	region_Max_Consumer INT COMMENT '区域容纳人数',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标记',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (region_ID),
	UNIQUE KEY AK_regName (region_Name)
);

ALTER TABLE t_Region COMMENT '区域';

/*==============================================================*/
/* Table: t_Restaurant                                          */
/*==============================================================*/
CREATE TABLE t_Restaurant (
	id INT NOT NULL                                 AUTO_INCREMENT
	COMMENT 'id',
	restaurant_Name VARCHAR(50) COMMENT '餐厅名字',
	short_Name VARCHAR(50) COMMENT '餐厅简称',
	tel VARCHAR(50) COMMENT '餐厅电话',
	adderss VARCHAR(100) COMMENT '餐厅地址',
	description VARCHAR(250) COMMENT '餐厅介绍',
	url VARCHAR(50) COMMENT '餐厅官网',
	begin_Date DATE COMMENT '开张日期',
	account VARCHAR(50) COMMENT '开户及帐号',
	tax_Registration_Certificate VARCHAR(50) COMMENT '税务登记号',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标记',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (id)
);

ALTER TABLE t_Restaurant COMMENT '餐厅的基本信息';

/*==============================================================*/
/* Table: t_Role                                                */
/*==============================================================*/
CREATE TABLE t_Role (
	role_ID INT UNSIGNED NOT NULL                                                                       AUTO_INCREMENT
	COMMENT '角色ID',
	role_Name VARCHAR(20) NOT NULL
	COMMENT '角色名字',
	description VARCHAR(100) COMMENT '角色描述',
	power_Ids VARCHAR(100) COMMENT '授权Id',
	del_Flag TINYINT UNSIGNED DEFAULT 1
	COMMENT '删除标志',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (role_ID)
);

ALTER TABLE t_Role COMMENT '分职位的表，例如经理、服务员、收银员等';

/*==============================================================*/
/* Table: t_TempCarteContent                                    */
/*==============================================================*/
CREATE TABLE t_TempCarteContent (
	TCC_ID INT UNSIGNED NOT NULL                      AUTO_INCREMENT
	COMMENT '餐单内容ID',
	TCI_Swift_Number VARCHAR(20) NOT NULL
	COMMENT '餐单流水号',
	TCC_Dish_ID INT NOT NULL
	COMMENT '菜肴ID',
	TCC_Dish_Num INT NOT NULL
	COMMENT '菜肴数量',
	TCC_Total_Price NUMERIC(10,2) NOT NULL
	COMMENT '菜肴总价',
	TCC_Specil_Desc VARCHAR(20) COMMENT '特殊菜式',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标记',
	last_SubTime DATETIME COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (TCC_ID)
);

ALTER TABLE t_TempCarteContent COMMENT '临时消费餐单内容';

/*==============================================================*/
/* Table: t_TempCarteInfo                                       */
/*==============================================================*/
CREATE TABLE t_TempCarteInfo (
	TCI_ID INT UNSIGNED NOT NULL
	COMMENT '餐单信息ID',
	TCI_Swift_Number VARCHAR(20) NOT NULL
	COMMENT '餐单流水号',
	TCI_State TINYINT NOT NULL DEFAULT 0
	COMMENT '餐单状态',
	TCI_Table_ID INT COMMENT '餐桌ID',
	TCI_Customer_ID INT COMMENT '顾客ID',
	TCI_Mem_ID INT COMMENT '会员ID',
	TCI_Waiter_ID INT COMMENT '服务员ID',
	TCI_Dish_Nums INT NOT NULL
	COMMENT '菜肴数量',
	TCI_Amount_Peoplo INT COMMENT '就餐人数',
	TCI_Repast_Time DATETIME COMMENT '就餐时间',
	TCI_Consume_Amount NUMERIC(10,2) UNSIGNED NOT NULL
	COMMENT '消费金额',
	TCI_Cost_Amount NUMERIC(10,2) UNSIGNED NOT NULL
	COMMENT '实收金额',
	TCI_Discount NUMERIC(4,2) UNSIGNED COMMENT '折扣',
	TCI_Remark VARBINARY(100) COMMENT '餐单备注',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标记',
	last_SubTime DATETIME DEFAULT CURRENT_TIMESTAMP
	COMMENT '最后提交时间',
	subBy INT COMMENT '提交人',
	PRIMARY KEY (TCI_ID),
	UNIQUE KEY AK_ECISwiftNumber (TCI_Swift_Number)
);

ALTER TABLE t_TempCarteInfo COMMENT '临时消费餐单信息';

/*==============================================================*/
/* Table: t_User                                                */
/*==============================================================*/
CREATE TABLE t_User (
	user_ID INT UNSIGNED NOT NULL                                   AUTO_INCREMENT
	COMMENT '用户ID',
	user_Name VARCHAR(20) NOT NULL
	COMMENT '用户名',
	role_ID INT COMMENT '角色ID',
	user_RealName CHAR(30) NOT NULL
	COMMENT '用户姓名',
	user_Password VARCHAR(20) NOT NULL
	COMMENT '密码',
	salt VARCHAR(50) NOT NULL
	COMMENT '盐',
	last_LoginTime DATETIME COMMENT '最后登录时间',
	last_LoginIp VARCHAR(32) COMMENT '最后登录IP',
	del_Flag TINYINT DEFAULT 1
	COMMENT '删除标志',
	last_SubTime DATETIME COMMENT '最后提交时间',
	PRIMARY KEY (user_ID)
);

ALTER TABLE t_User COMMENT '用户表';

