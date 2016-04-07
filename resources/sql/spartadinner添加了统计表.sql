/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/4/3 9:54:05                             */
/*==============================================================*/

# CREATE DATABASE IF NOT EXISTS `SpartanDinner`
# 	DEFAULT CHARSET utf8
# 	COLLATE utf8_general_ci;
#
# USE SpartanDinner;


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

DROP TABLE IF EXISTS t_amountTotal;

DROP TABLE IF EXISTS t_dishTotal;
/*==============================================================*/
/* Table: t_Customer                                            */
/*==============================================================*/
CREATE TABLE t_Customer
(
	customer_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '顾客ID',
	customer_Name VARCHAR(30) NOT NULL
	COMMENT '顾客姓名',
	customer_Tel VARCHAR(20) NOT NULL
	COMMENT '顾客手机',
	customer_Gender TINYINT COMMENT '顾客性别',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标记',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (customer_ID),
	UNIQUE KEY AK_customerID (customer_Tel)
);

ALTER TABLE t_Customer COMMENT '顾客信息表';

/*==============================================================*/
/* Index: customer_Name                                         */
/*==============================================================*/
CREATE INDEX customer_Name ON t_Customer
(
	customer_Name
);

/*==============================================================*/
/* Index: customer_Tel                                          */
/*==============================================================*/
CREATE INDEX customer_Tel ON t_Customer
(
	customer_Tel
);

/*==============================================================*/
/* Table: t_Department                                          */
/*==============================================================*/
CREATE TABLE t_Department
(
	department_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '部门ID',
	department_Name VARCHAR(50) NOT NULL
	COMMENT '部门名字',
	description VARCHAR(200) NOT NULL DEFAULT ''
	COMMENT '部门描述',
	remark VARCHAR(100) COMMENT '备注',
	del_Flag TINYINT UNSIGNED NOT NULL DEFAULT 0
	COMMENT '删除标志',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (department_ID)
);

ALTER TABLE t_Department COMMENT '部门的基本信息表';

/*==============================================================*/
/* Index: department_department_Name                            */
/*==============================================================*/
CREATE UNIQUE INDEX department_department_Name ON t_Department
(
	department_Name
);

/*==============================================================*/
/* Table: t_DinningTable                                        */
/*==============================================================*/
CREATE TABLE t_DinningTable
(
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
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标志',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (table_ID),
	UNIQUE KEY AK_dTableName (table_Name)
);

ALTER TABLE t_DinningTable COMMENT '餐桌';

/*==============================================================*/
/* Index: dinningTable_TableName                                */
/*==============================================================*/
CREATE UNIQUE INDEX dinningTable_TableName ON t_DinningTable
(
	table_Name
);

/*==============================================================*/
/* Table: t_Dish                                                */
/*==============================================================*/
CREATE TABLE t_Dish
(
	dish_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '菜肴ID',
	ddish_Type_ID INT NOT NULL
	COMMENT '菜肴类别ID',
	dish_Name VARCHAR(25) NOT NULL
	COMMENT '菜肴名字',
	dish_Speel VARCHAR(25) NOT NULL
	COMMENT '菜肴拼写',
	dish_Cost NUMERIC(10,2) COMMENT '菜肴进货价',
	dish_Unit VARCHAR(4) COMMENT '菜肴单位量',
	dish_Price NUMERIC(10,2) NOT NULL
	COMMENT '菜肴单价',
	dish_Description VARCHAR(100) NOT NULL DEFAULT ''
	COMMENT '菜肴描述',
	dish_Cooking VARCHAR(10) COMMENT '菜肴烹饪方式',
	dish_Img_Url VARCHAR(100) NOT NULL DEFAULT ''
	COMMENT '菜肴图片地址',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标志',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (dish_ID),
	UNIQUE KEY AK_dishName (dish_Name)
);

ALTER TABLE t_Dish COMMENT '菜肴信息表';

/*==============================================================*/
/* Index: dish_Dish_Name                                        */
/*==============================================================*/
CREATE UNIQUE INDEX dish_Dish_Name ON t_Dish
(
	dish_Name
);

/*==============================================================*/
/* Index: dish_dishType_Id                                      */
/*==============================================================*/
CREATE INDEX dish_dishType_Id ON t_Dish
(
	ddish_Type_ID
);

/*==============================================================*/
/* Index: dish_Dish_Price                                       */
/*==============================================================*/
CREATE INDEX dish_Dish_Price ON t_Dish
(
	dish_Price
);

/*==============================================================*/
/* Table: t_DishType                                            */
/*==============================================================*/
CREATE TABLE t_DishType
(
	dish_Type_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '菜肴类别ID',
	dish_Type_Name VARCHAR(20) NOT NULL
	COMMENT '菜肴类别名字',
	dish_Type_Desc VARCHAR(100) COMMENT '菜肴类别描述',
	dish_Type_Status TINYINT NOT NULL DEFAULT 0
	COMMENT '菜肴类别显示状态',
	dish_Type_orderId INT NOT NULL DEFAULT 0
	COMMENT '菜肴类别排序ID',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标志',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (dish_Type_ID),
	UNIQUE KEY AK_dishTypeName (dish_Type_Name)
);

ALTER TABLE t_DishType COMMENT '菜肴类别';

/*==============================================================*/
/* Index: dishType_dishType_Name                                */
/*==============================================================*/
CREATE UNIQUE INDEX dishType_dishType_Name ON t_DishType
(
	dish_Type_Name
);

/*==============================================================*/
/* Table: t_EmployeeInfo                                        */
/*==============================================================*/
CREATE TABLE t_EmployeeInfo
(
	employee_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '员工ID',
	user_Id INT NOT NULL
	COMMENT '用户帐号ID',
	employee_Name VARCHAR(20) NOT NULL
	COMMENT '员工姓名',
	employee_Sex TINYINT NOT NULL
	COMMENT '员工性别',
	birth_Date DATE NOT NULL
	COMMENT '出生日期',
	ID_Card VARCHAR(20) NOT NULL
	COMMENT '员工身份证',
	tel VARCHAR(20) NOT NULL
	COMMENT '员工手机号码',
	fixed_Phone VARCHAR(20) COMMENT '员工固话',
	degree VARCHAR(20) NOT NULL
	COMMENT '文化程度',
	description VARCHAR(255) COMMENT '员工个人描述',
	address VARCHAR(100) COMMENT '员工地址',
	department_Id INT NOT NULL
	COMMENT '所属部门ID',
	salary INT COMMENT '薪金',
	employee_Date DATE NOT NULL
	COMMENT '聘用日期',
	fire_Date DATE COMMENT '结束日期',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标志',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (employee_ID)
);

ALTER TABLE t_EmployeeInfo COMMENT '员工个人信息';

/*==============================================================*/
/* Index: employeeinfo_user_id                                  */
/*==============================================================*/
CREATE UNIQUE INDEX employeeinfo_user_id ON t_EmployeeInfo
(
	user_Id
);

/*==============================================================*/
/* Index: employeeinfo_employee_Name                            */
/*==============================================================*/
CREATE INDEX employeeinfo_employee_Name ON t_EmployeeInfo
(
	employee_Name
);

/*==============================================================*/
/* Index: employeeinfo_tel                                      */
/*==============================================================*/
CREATE UNIQUE INDEX employeeinfo_tel ON t_EmployeeInfo
(
	tel
);

/*==============================================================*/
/* Table: t_EndCarteContent                                     */
/*==============================================================*/
CREATE TABLE t_EndCarteContent
(
	TCC_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '餐单内容ID',
	TCC_TCI_ID INT NOT NULL
	COMMENT '餐单信息ID',
	TCC_Dish_ID INT NOT NULL
	COMMENT '菜肴ID',
	TCC_Dish_Num INT NOT NULL
	COMMENT '菜肴数量',
	TCC_Total_Price NUMERIC(10,2) NOT NULL
	COMMENT '菜肴总价',
	TCC_Specil_Desc VARCHAR(20) COMMENT '特殊菜式',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标记',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (TCC_ID)
);

ALTER TABLE t_EndCarteContent COMMENT '消费餐单内容';

/*==============================================================*/
/* Index: Index_TCCTCIID                                        */
/*==============================================================*/
CREATE INDEX Index_TCCTCIID ON t_EndCarteContent
(
	TCC_TCI_ID
);

/*==============================================================*/
/* Table: t_EndCarteInfo                                        */
/*==============================================================*/
CREATE TABLE t_EndCarteInfo
(
	TCI_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '餐单信息ID',
	TCI_Swift_Number VARCHAR(20) NOT NULL
	COMMENT '餐单流水号',
	TCI_State TINYINT NOT NULL DEFAULT 0
	COMMENT '餐单状态',
	TCI_Table_ID INT COMMENT '餐桌ID',
	TCI_Waiter_ID INT COMMENT '服务员ID',
	TCI_Cashier_ID INT NOT NULL
	COMMENT '收银员ID',
	TCI_Customer_ID INT COMMENT '顾客ID',
	TCI_Mem_ID INT COMMENT '会员ID',
	TCI_Dish_Nums INT NOT NULL
	COMMENT '菜肴数量',
	TCI_Amount_Peoplo INT COMMENT '就餐人数',
	TCI_Repast_Time TIMESTAMP COMMENT '就餐时间',
	TCI_Bill_Time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
	COMMENT '结帐时间',
	TCI_Pay_Method VARCHAR(20) COMMENT '结账方式',
	TCI_Consume_Amount NUMERIC(10,2) UNSIGNED NOT NULL
	COMMENT '消费金额',
	TCI_Discount NUMERIC(4,2) UNSIGNED COMMENT '折扣',
	TCI_Paid_Amount NUMERIC(10,2) UNSIGNED NOT NULL
	COMMENT '实收金额',
	TCI_Remark VARCHAR(100) COMMENT '餐单备注',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标记',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (TCI_ID),
	UNIQUE KEY AK_TCISwiftNumber (TCI_Swift_Number)
);

ALTER TABLE t_EndCarteInfo COMMENT '消费餐单信息';

/*==============================================================*/
/* Index: TCI_TCISwiftNumber                                    */
/*==============================================================*/
CREATE UNIQUE INDEX TCI_TCISwiftNumber ON t_EndCarteInfo
(
	TCI_Swift_Number
);

/*==============================================================*/
/* Index: TCI_TCITableID                                        */
/*==============================================================*/
CREATE INDEX TCI_TCITableID ON t_EndCarteInfo
(
	TCI_Table_ID
);

/*==============================================================*/
/* Index: TCI_TCIWaiterId                                       */
/*==============================================================*/
CREATE INDEX TCI_TCIWaiterId ON t_EndCarteInfo
(
	TCI_Waiter_ID
);

/*==============================================================*/
/* Index: TCI_TCICashierId                                      */
/*==============================================================*/
CREATE INDEX TCI_TCICashierId ON t_EndCarteInfo
(
	TCI_Cashier_ID
);

/*==============================================================*/
/* Index: TCI_TCIRepastTime                                     */
/*==============================================================*/
CREATE INDEX TCI_TCIRepastTime ON t_EndCarteInfo
(
	TCI_Repast_Time
);

/*==============================================================*/
/* Index: TCI_TCIBillTime                                       */
/*==============================================================*/
CREATE INDEX TCI_TCIBillTime ON t_EndCarteInfo
(
	TCI_Bill_Time
);

/*==============================================================*/
/* Index: TCI_TCIConsumeAmount                                  */
/*==============================================================*/
CREATE INDEX TCI_TCIConsumeAmount ON t_EndCarteInfo
(
	TCI_Consume_Amount
);

/*==============================================================*/
/* Index: TCI_TCIPaidAmount                                     */
/*==============================================================*/
CREATE INDEX TCI_TCIPaidAmount ON t_EndCarteInfo
(
	TCI_Paid_Amount
);

/*==============================================================*/
/* Table: t_MemberInfo                                          */
/*==============================================================*/
CREATE TABLE t_MemberInfo
(
	mem_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '会员ID',
	mem_Type_ID INT NOT NULL
	COMMENT '会员类别ID',
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
	mem_Begin_Time DATE NOT NULL
	COMMENT '会员开卡时间',
	mem_End_Time DATE NOT NULL
	COMMENT '会员卡截止期',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标志',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (mem_ID),
	UNIQUE KEY AK_memUserName (mem_User_Name),
	UNIQUE KEY AK_memTel (mem_Tel)
);

ALTER TABLE t_MemberInfo COMMENT '会员信息';

/*==============================================================*/
/* Index: memberinfo_Name                                       */
/*==============================================================*/
CREATE INDEX memberinfo_Name ON t_MemberInfo
(
	mem_Name
);

/*==============================================================*/
/* Index: memberinfo_UserName                                   */
/*==============================================================*/
CREATE UNIQUE INDEX memberinfo_UserName ON t_MemberInfo
(
	mem_User_Name
);

/*==============================================================*/
/* Index: memberinfo_memtel                                     */
/*==============================================================*/
CREATE UNIQUE INDEX memberinfo_memtel ON t_MemberInfo
(
	mem_Tel
);

/*==============================================================*/
/* Table: t_MemberType                                          */
/*==============================================================*/
CREATE TABLE t_MemberType
(
	mem_Type_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '会员类别ID',
	mem_Type_Name VARCHAR(20) NOT NULL
	COMMENT '会员类别名字',
	mem_Type_Discount NUMERIC(4,2) COMMENT '会员类别折扣',
	mem_Type_Desc VARCHAR(100) COMMENT '会员类别描述',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标志',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (mem_Type_ID)
);

ALTER TABLE t_MemberType COMMENT '会员类别';

/*==============================================================*/
/* Table: t_OnAccountCarteContent                               */
/*==============================================================*/
CREATE TABLE t_OnAccountCarteContent
(
	OCC_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '餐单内容ID',
	OCC_OCI_ID INT NOT NULL
	COMMENT '餐单信息ID',
	OCC_Dish_ID INT NOT NULL
	COMMENT '菜肴ID',
	OCC_Dish_Num INT NOT NULL
	COMMENT '菜肴数量',
	OCC_Total_Price NUMERIC(10,2) NOT NULL
	COMMENT '菜肴总价',
	OCC_Specil_Desc VARCHAR(20) COMMENT '特殊菜式',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标记',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (OCC_ID)
);

ALTER TABLE t_OnAccountCarteContent COMMENT '挂账餐单消费内容';

/*==============================================================*/
/* Index: OCC_OCCOCIID                                          */
/*==============================================================*/
CREATE INDEX OCC_OCCOCIID ON t_OnAccountCarteContent
(
	OCC_OCI_ID
);

/*==============================================================*/
/* Table: t_OnAccountCarteInfo                                  */
/*==============================================================*/
CREATE TABLE t_OnAccountCarteInfo
(
	OCI_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '餐单信息ID',
	OCI_Swift_Number VARCHAR(20) NOT NULL
	COMMENT '餐单流水号',
	OCI_State TINYINT NOT NULL DEFAULT 0
	COMMENT '餐单状态',
	OCI_Table_ID INT NOT NULL
	COMMENT '餐桌ID',
	OCI_Waiter_ID INT COMMENT '服务员ID',
	OCI_Cashier_ID INT COMMENT '收银员ID',
	OCI_Customer_ID INT COMMENT '顾客ID',
	OCI_Mem_ID INT COMMENT '会员ID',
	OCI_Dish_Nums INT NOT NULL
	COMMENT '菜肴数量',
	OCI_Amount_Peoplo INT COMMENT '就餐人数',
	OCI_Repast_Time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
	COMMENT '就餐时间',
	OCI_Consume_Amount NUMERIC(10,2) UNSIGNED NOT NULL
	COMMENT '消费金额',
	OCI_Discount NUMERIC(4,2) UNSIGNED COMMENT '折扣',
	OCI_Paid_Amount NUMERIC(10,2) UNSIGNED NOT NULL
	COMMENT '实收金额',
	OCI_Remark VARCHAR(100) COMMENT '餐单备注',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标记',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (OCI_ID),
	UNIQUE KEY AK_TCISwiftNumber (OCI_Swift_Number)
);

ALTER TABLE t_OnAccountCarteInfo COMMENT '挂账餐单消费信息';

/*==============================================================*/
/* Index: OCI_OCISwiftNumber                                    */
/*==============================================================*/
CREATE UNIQUE INDEX OCI_OCISwiftNumber ON t_OnAccountCarteInfo
(
	OCI_Swift_Number
);

/*==============================================================*/
/* Index: OCI_OCITableId                                        */
/*==============================================================*/
CREATE INDEX OCI_OCITableId ON t_OnAccountCarteInfo
(
	OCI_Table_ID
);

/*==============================================================*/
/* Index: OCI_OCIWaiterID                                       */
/*==============================================================*/
CREATE INDEX OCI_OCIWaiterID ON t_OnAccountCarteInfo
(
	OCI_Table_ID
);

/*==============================================================*/
/* Table: t_Power                                               */
/*==============================================================*/
CREATE TABLE t_Power
(
	power_Id INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '权限ID',
	power_Name VARCHAR(30) NOT NULL
	COMMENT '权限名称',
	power_Type VARCHAR(50) NOT NULL
	COMMENT '权限类型',
	priority INT NOT NULL
	COMMENT '显示顺序',
	parent_Id INT NOT NULL
	COMMENT '父编号',
	parent_Ids VARCHAR(100) NOT NULL
	COMMENT '父编号列表',
	permission VARCHAR(100) NOT NULL
	COMMENT '权限字符串',
	del_Flag TINYINT UNSIGNED NOT NULL DEFAULT 0
	COMMENT '删除标志',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (power_Id)
);

ALTER TABLE t_Power COMMENT '权限表';

/*==============================================================*/
/* Table: t_Region                                              */
/*==============================================================*/
CREATE TABLE t_Region
(
	region_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '区域ID',
	region_Name VARCHAR(30) NOT NULL
	COMMENT '区域名字',
	region_Min_Consume NUMERIC(10,2) COMMENT '区域最低消费',
	region_Max_Consumer INT COMMENT '区域容纳人数',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标记',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (region_ID),
	UNIQUE KEY AK_regName (region_Name)
);

ALTER TABLE t_Region COMMENT '区域';

/*==============================================================*/
/* Index: region_region_Name                                    */
/*==============================================================*/
CREATE UNIQUE INDEX region_region_Name ON t_Region
(
	region_Name
);

/*==============================================================*/
/* Table: t_Restaurant                                          */
/*==============================================================*/
CREATE TABLE t_Restaurant
(
	id INT NOT NULL AUTO_INCREMENT
	COMMENT '餐厅id',
	restaurant_Name VARCHAR(50) NOT NULL
	COMMENT '餐厅名字',
	short_Name VARCHAR(50) COMMENT '餐厅简称',
	tel VARCHAR(50) NOT NULL
	COMMENT '餐厅电话',
	adderss VARCHAR(100) NOT NULL
	COMMENT '餐厅地址',
	description VARCHAR(250) COMMENT '餐厅介绍',
	url VARCHAR(50) NOT NULL
	COMMENT '餐厅官网',
	begin_Date DATE COMMENT '开张日期',
	account VARCHAR(50) COMMENT '开户及帐号',
	tax_Registration_Certificate VARCHAR(50) COMMENT '税务登记号',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标记',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (id)
);

ALTER TABLE t_Restaurant COMMENT '餐厅的基本信息';

/*==============================================================*/
/* Table: t_Role                                                */
/*==============================================================*/
CREATE TABLE t_Role
(
	role_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '角色ID',
	role_Name VARCHAR(20) NOT NULL
	COMMENT '角色名字',
	department_ID INT NOT NULL
	COMMENT '所属部门ID',
	description VARCHAR(100) NOT NULL DEFAULT ''
	COMMENT '角色描述',
	power_Ids VARCHAR(100) NOT NULL DEFAULT ''
	COMMENT '授权Id',
	del_Flag TINYINT UNSIGNED NOT NULL DEFAULT 0
	COMMENT '删除标志',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后e提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (role_ID)
);

ALTER TABLE t_Role COMMENT '分职位的表，例如经理、服务员、收银员等';

/*==============================================================*/
/* Index: Index_roleName                                        */
/*==============================================================*/
CREATE UNIQUE INDEX Index_roleName ON t_Role
(
	role_Name
);


/*==============================================================*/
/* Table: t_TempCarteContent                                    */
/*==============================================================*/
CREATE TABLE t_TempCarteContent
(
	TCC_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '餐单内容ID',
	TCC_TCI_ID INT NOT NULL
	COMMENT '餐单信息ID',
	TCC_Dish_ID INT NOT NULL
	COMMENT '菜肴ID',
	TCC_Dish_Num INT NOT NULL
	COMMENT '菜肴数量',
	TCC_Total_Price NUMERIC(10,2) NOT NULL
	COMMENT '菜肴总价',
	TCC_Specil_Desc VARCHAR(20) COMMENT '特殊菜式',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标记',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (TCC_ID)
);

ALTER TABLE t_TempCarteContent COMMENT '临时消费餐单内容';

/*==============================================================*/
/* Index: TCI_TCITCCID                                          */
/*==============================================================*/
CREATE INDEX TCI_TCITCCID ON t_TempCarteContent
(
	TCC_TCI_ID
);


/*==============================================================*/
/* Table: t_TempCarteInfo                                       */
/*==============================================================*/
CREATE TABLE t_TempCarteInfo
(
	TCI_ID INT UNSIGNED NOT NULL
	COMMENT '餐单信息ID',
	TCI_Swift_Number VARCHAR(20) NOT NULL
	COMMENT '餐单流水号',
	TCI_State TINYINT NOT NULL DEFAULT 0
	COMMENT '餐单状态',
	TCI_Table_ID INT NOT NULL
	COMMENT '餐桌ID',
	TCI_Customer_ID INT COMMENT '顾客ID',
	TCI_Mem_ID INT COMMENT '会员ID',
	TCI_Waiter_ID INT COMMENT '服务员ID',
	TCI_Dish_Nums INT NOT NULL
	COMMENT '菜肴数量',
	TCI_Amount_Peoplo INT COMMENT '就餐人数',
	TCI_Repast_Time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
	COMMENT '就餐时间',
	TCI_Consume_Amount NUMERIC(10,2) UNSIGNED NOT NULL
	COMMENT '消费金额',
	TCI_Cost_Amount NUMERIC(10,2) UNSIGNED NOT NULL
	COMMENT '实收金额',
	TCI_Discount NUMERIC(4,2) UNSIGNED COMMENT '折扣',
	TCI_Remark VARCHAR(100) COMMENT '餐单备注',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标记',
	last_SubTime DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (TCI_ID),
	UNIQUE KEY AK_TCISwiftNumber (TCI_Swift_Number)
);

ALTER TABLE t_TempCarteInfo COMMENT '临时消费餐单信息';

/*==============================================================*/
/* Index: TCI_TCISwiftNumber                                    */
/*==============================================================*/
CREATE UNIQUE INDEX TCI_TCISwiftNumber ON t_TempCarteInfo
(
	TCI_Swift_Number
);

/*==============================================================*/
/* Index: TCI_TCITableId                                        */
/*==============================================================*/
CREATE INDEX TCI_TCITableId ON t_TempCarteInfo
(
	TCI_Table_ID
);

/*==============================================================*/
/* Index: TCI_TCIWaiterId                                       */
/*==============================================================*/
CREATE INDEX TCI_TCIWaiterId ON t_TempCarteInfo
(
	TCI_Waiter_ID
);

/*==============================================================*/
/* Table: t_User                                                */
/*==============================================================*/
CREATE TABLE t_User
(
	user_ID INT UNSIGNED NOT NULL AUTO_INCREMENT
	COMMENT '用户ID',
	user_Name VARCHAR(20) NOT NULL
	COMMENT '用户名',
	role_ID INT COMMENT '角色ID',
	user_state TINYINT NOT NULL DEFAULT 0
	COMMENT '登录状态',
	user_Password VARCHAR(20) NOT NULL
	COMMENT '密码',
	salt VARCHAR(50) NOT NULL
	COMMENT '盐',
	last_LoginIp VARCHAR(15) NOT NULL
	COMMENT '最后登录IP',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标志',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后
提交时间',
	subby INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (user_ID)
);

ALTER TABLE t_User COMMENT '用户表';

/*==============================================================*/
/* Index: user_user_Name                                        */
/*==============================================================*/
CREATE UNIQUE INDEX user_user_Name ON t_User
(
	user_Name
);

/*==============================================================*/
/* Table: t_amountTotal                                         */
/*==============================================================*/
CREATE TABLE t_amountTotal
(
	total_Id INT NOT NULL AUTO_INCREMENT
	COMMENT '统计表id',
	total_Year INT NOT NULL
	COMMENT '统计年份',
	total_Month INT NOT NULL
	COMMENT '统计月份',
	total_Day INT NOT NULL
	COMMENT '统计日',
	total_DayTime INT NOT NULL
	COMMENT '统计日时段',
	total_Num INT NOT NULL
	COMMENT '餐单数量',
	total__End_Num INT NOT NULL
	COMMENT '结账数量',
	total__OnAccount_Num INT NOT NULL
	COMMENT '挂账数量',
	total_Amount NUMERIC(10,2) NOT NULL
	COMMENT '餐单总金额',
	total_End_Amount NUMERIC(10,2) NOT NULL
	COMMENT '结账金额',
	total_OnAccount_Amount NUMERIC(10,2) NOT NULL
	COMMENT '挂账金额',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标记',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (total_Id),
	UNIQUE KEY AK_Key_2 (total_Year,total_Month,total_Day,total_DayTime)
);

ALTER TABLE t_amountTotal COMMENT '统计表';

/*==============================================================*/
/* Index: total_totalMonth                                      */
/*==============================================================*/
CREATE INDEX total_totalMonth ON t_amountTotal
(
	total_Month
);

/*==============================================================*/
/* Index: total_totalDay                                        */
/*==============================================================*/
CREATE INDEX total_totalDay ON t_amountTotal
(
	total_Day
);

/*==============================================================*/
/* Table: t_dishTotal                                           */
/*==============================================================*/
CREATE TABLE t_dishTotal
(
	dishtotal_Id INT NOT NULL AUTO_INCREMENT
	COMMENT '统计表id',
	dishtotal_dishId INT NOT NULL
	COMMENT '统计菜肴id',
	dishtotal_Year INT NOT NULL
	COMMENT '统计年份',
	dishtotal_Month INT NOT NULL
	COMMENT '统计月份',
	dishtotal_Day INT NOT NULL
	COMMENT '统计日',
	dishtotal_DayTime INT NOT NULL
	COMMENT '统计日时段',
	total_Amount NUMERIC(10,2) NOT NULL
	COMMENT '消费金额',
	del_Flag TINYINT NOT NULL DEFAULT 0
	COMMENT '删除标记',
	last_SubTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后提交时间',
	subBy INT NOT NULL
	COMMENT '提交人',
	PRIMARY KEY (dishtotal_Id),
	UNIQUE KEY AK_Key_2 (dishtotal_dishId,dishtotal_Year,dishtotal_Month,dishtotal_Day,dishtotal_DayTime)
);

ALTER TABLE t_dishTotal COMMENT '菜肴统计表';

/*==============================================================*/
/* Index: dishtotal_totalMonth                                  */
/*==============================================================*/
CREATE INDEX dishtotal_totalMonth ON t_dishTotal
(
	dishtotal_Month
);

/*==============================================================*/
/* Index: dishtotal_totalDay                                    */
/*==============================================================*/
CREATE INDEX dishtotal_totalDay ON t_dishTotal
(
	dishtotal_Day
);

/*==============================================================*/
/* Index: dishtotal_dishId                                      */
/*==============================================================*/
CREATE INDEX dishtotal_dishId ON t_dishTotal
(
	dishtotal_dishId
);
