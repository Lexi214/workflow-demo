-- ----------------------------
-- Table structure for staff_info
-- ----------------------------
DROP TABLE IF EXISTS `staff_info`;
CREATE TABLE `staff_info` (
	`id` BIGINT NOT NULL COMMENT '用户ID',
	`username` VARCHAR ( 60 ) COMMENT '用户名',
	`password` VARCHAR ( 60 ) COMMENT '密码（加密存储）',
	`staff_no` VARCHAR ( 60 ) COMMENT '员工号',
	`level` TINYINT COMMENT '职级',
	`leader_id` BIGINT DEFAULT NULL COMMENT '上级ID',
	PRIMARY KEY ( `id` ) USING BTREE,
	UNIQUE KEY `staff_no` ( `staff_no` ) USING BTREE
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT = '用户信息表';

-- ----------------------------
-- Records of staff_info
-- ----------------------------
INSERT INTO `staff_info` VALUES (1, '王总', '$2a$10$EHkq/r6PTCCYEDOQYNi/ZORb8S.G8yxu4jsxqvjGWEytyrrPx5FVS', 'N0001', 1, NULL);
INSERT INTO `staff_info` VALUES (2, '栗经理', '$2a$10$EHkq/r6PTCCYEDOQYNi/ZORb8S.G8yxu4jsxqvjGWEytyrrPx5FVS', 'N0002', 2, 1);
INSERT INTO `staff_info` VALUES (3, '主管1', '$2a$10$EHkq/r6PTCCYEDOQYNi/ZORb8S.G8yxu4jsxqvjGWEytyrrPx5FVS', 'N0003', 3, 2);
INSERT INTO `staff_info` VALUES (4, '主管2', '$2a$10$EHkq/r6PTCCYEDOQYNi/ZORb8S.G8yxu4jsxqvjGWEytyrrPx5FVS', 'N0004', 3, 2);
INSERT INTO `staff_info` VALUES (5, '员工1-1', '$2a$10$EHkq/r6PTCCYEDOQYNi/ZORb8S.G8yxu4jsxqvjGWEytyrrPx5FVS', 'N0005', 4, 2);
INSERT INTO `staff_info` VALUES (6, '员工2-1', '$2a$10$EHkq/r6PTCCYEDOQYNi/ZORb8S.G8yxu4jsxqvjGWEytyrrPx5FVS', 'N0006', 4, 3);
INSERT INTO `staff_info` VALUES (7, '员工2-2', '$2a$10$EHkq/r6PTCCYEDOQYNi/ZORb8S.G8yxu4jsxqvjGWEytyrrPx5FVS', 'N0007', 4, 3);