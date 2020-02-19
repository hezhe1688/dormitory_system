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

```mysql
create table t_dormitory
(
   id int auto_increment comment 'id',
   floor int null comment '楼栋',
   dormitories int null comment '宿舍间数',
   num int null comment '居住人数',
   bedtime varchar(10) null comment '熄灯时间',
   checkTime varchar(10) null comment '就寝时间',
   periphery varchar(255) null comment '寝室楼周边描述',
   constraint t_dormitory_pk
      primary key (id)
)
comment '宿舍楼表';
```

```mysql
create table t_students
(
   id int auto_increment comment 'id',
   stuName varchar(10) null comment '姓名',
   sex varchar(4) null comment '性别',
   sid varchar(20) null comment '学号',
   stuClass varchar(20) null comment '班级
',
   floor int null comment '楼栋',
   hostelNum int null comment '宿舍号',
   isIn boolean null comment '是否归寝',
   checkInTime varchar(10) null comment '签到时间',
   isLate boolean null comment '是否迟到',
   constraint t_students_pk
      primary key (id)
)
comment '学生信息表';
```

```mysql
create table t_user
(
   id int auto_increment comment 'id',
   username varchar(10) null comment '用户名',
   password varchar(30) null comment '密码',
   uNum varchar(20) null comment '学生或老师号',
   constraint t_user_pk
      primary key (id)
)
comment '用户表';
```

