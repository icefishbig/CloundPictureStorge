-- 创建库
create database if not exists yu_picture;

-- 切换库
use yu_picture;

-- 用户表
create table if not exists user
(
    id           bigint auto_increment comment 'id' primary key,
    userAccount  varchar(256)                           not null comment '账号',
    userPassword varchar(512)                           not null comment '密码',
    userName     varchar(256)                           null comment '用户昵称',
    userAvatar   varchar(1024)                          null comment '用户头像',
    userProfile  varchar(512)                           null comment '用户简介',
    userRole     varchar(256) default 'user'            not null comment '用户角色：user/admin/VIP',
    editTime     datetime     default CURRENT_TIMESTAMP not null comment '编辑时间',
    createTime   datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
#     当数据修改时，自动更新该字段
    updateTime   datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete     tinyint      default 0                 not null comment '是否删除',
    #VIP字段
    vipExpireTime datetime     null comment '会员过期时间',
    vipCode       varchar(128) null comment '会员兑换码',
    vipNumber     bigint       null comment '会员编号',
    #邀请链接
    shareCode     varchar(20)  DEFAULT NULL COMMENT '分享码',
    inviteUser    bigint       DEFAULT NULL COMMENT '邀请用户 id',
    #唯一约束 ——> 唯一索引
    UNIQUE KEY uk_userAccount (userAccount),
    #创建索引
    INDEX idx_userName (userName)
) comment '用户' collate = utf8mb4_unicode_ci;
