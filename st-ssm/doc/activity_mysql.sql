/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50509
Source Host           : localhost:3306
Source Database       : activity_mysql

Target Server Type    : MYSQL
Target Server Version : 50509
File Encoding         : 65001

Date: 2018-07-21 08:56:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_activity_info`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_activity_info`;
CREATE TABLE `tbl_activity_info` (
  `activity_uuid` varchar(32) NOT NULL,
  `activity_title` varchar(64) DEFAULT NULL,
  `activity_content` varchar(2048) DEFAULT NULL,
  `begin_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `address` varchar(64) DEFAULT NULL,
  `contact_tel` varchar(24) DEFAULT NULL,
  `deadline_time` datetime DEFAULT NULL,
  `person_limit` int(11) DEFAULT NULL,
  `poster_img_uuid` varchar(32) DEFAULT NULL,
  `activity_imgs` varchar(512) DEFAULT NULL,
  `necessary` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`activity_uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_activity_info
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_activity_user`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_activity_user`;
CREATE TABLE `tbl_activity_user` (
  `activity_uuid` varchar(32) NOT NULL,
  `user_uuid` varchar(32) NOT NULL,
  PRIMARY KEY (`activity_uuid`,`user_uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_activity_user
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_img`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_img`;
CREATE TABLE `tbl_img` (
  `img_uuid` varchar(32) NOT NULL,
  `img_path` varchar(128) NOT NULL,
  PRIMARY KEY (`img_uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_img
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_user_info`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user_info`;
CREATE TABLE `tbl_user_info` (
  `user_uuid` varchar(32) NOT NULL,
  `login_id` varchar(32) DEFAULT NULL,
  `login_pwd` varchar(32) DEFAULT NULL,
  `user_name` varchar(24) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `tel_no` varchar(24) DEFAULT NULL,
  `identify_id` varchar(24) DEFAULT NULL,
  `remark` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`user_uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user_info
-- ----------------------------
INSERT INTO `tbl_user_info` VALUES ('1', '1', '1', '1', '1', '1', '1', '1');
