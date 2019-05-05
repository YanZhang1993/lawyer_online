CREATE TABLE `lowyer_online`.`user`(
  `name` VARCHAR(20) NOT NULL COMMENT '姓名',
  `user_id` INT NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `age` INT NOT NULL COMMENT '年龄',
  `sex` ENUM('1','2') COMMENT '性别：1男：2女',
  `mobile` INT NOT NULL COMMENT '手机号',
  `address` VARCHAR(100) COMMENT '居住地址',
  PRIMARY KEY (`user_id`)
) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_general_ci;