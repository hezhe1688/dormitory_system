```mysql
create table t_repair
(
   id int auto_increment comment 'id',
   floor varchar(10) null comment '公寓栋数',
   hostelNum varchar(10) null comment '宿舍号',
   type varchar(16) null comment '类型',
   repairTime date null comment '报修日期',
   `describe` varchar(255) null comment '描述信息',
   constraint t_repair_pk
      primary key (id)
)
comment '报修管理表';
```

```mysql
create table t_notice
(
   id int auto_increment comment 'id',
   noticeName varchar(255) null comment '公告标题',
   noticeAuthor varchar(10) null comment '发布者',
   noticeStatus int null comment '发布状态',
   newsTime date null comment '发布日期',
   content varchar(255) null comment '内容',
   constraint t_notice_pk
      primary key (id)
)
comment '公告管理表';
```

