CREATE TABLE company(
id int(11) PRIMARY KEY auto_increment,
comp_name VARCHAR(40) NOT NULL COMMENT "公司名称",
contact_name VARCHAR(20) COMMENT "联系人姓名",
contact_mobile VARCHAR(14) COMMENT "联系人手机号码",
contact_tel VARCHAR (14) COMMENT "固定电话",
address VARCHAR(60) COMMENT '公司地址',
home_page VARCHAR(60) COMMENT '公司主页',
create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT'创建时间',
update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
);