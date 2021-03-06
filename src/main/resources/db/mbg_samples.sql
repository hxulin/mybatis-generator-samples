create table mbg_user
(
   id                   	bigint not null comment '主键',
   nickname               varchar(50) comment '昵称',
   auth_code             	varchar(50) comment '下载授权码',
   lan_ip             	  varchar(50) comment '局域网IP',
   last_updated           datetime comment 'IP地址最近一次更新时间',
   status                 tinyint comment '状态: 0正常, 1禁用',
   create_time          	datetime comment '创建时间',
   update_time          	datetime comment '上次修改时间',
   primary key (id),
   unique key uniq_nickname (nickname)
);

create table mbg_project
(
   id                   	bigint not null comment '主键',
   name                   varchar(50) comment '项目名称',
   entrance_url           varchar(500) comment '访问地址',
   type                   tinyint comment '项目类型: 0前端项目, 1后端项目',
   sequence               int comment '排序号',
   status                 tinyint comment '状态: 0正常, 1关闭',
   create_time          	datetime comment '创建时间',
   update_time          	datetime comment '上次修改时间',
   primary key (id)
);