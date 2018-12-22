/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : webwork

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 22/12/2018 21:31:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for message_info
-- ----------------------------
DROP TABLE IF EXISTS `message_info`;
CREATE TABLE `message_info`  (
  `message_content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `message_time` datetime(0) NULL DEFAULT NULL,
  `message_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of message_info
-- ----------------------------
INSERT INTO `message_info` VALUES ('sadsdasf', '2018-12-22 21:31:18', '1000000330954398');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `user_account` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `user_pwd` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `user_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('7447747', '77777777', '1000001515699842');
INSERT INTO `user_info` VALUES ('123', '123', '1000000330954398');
INSERT INTO `user_info` VALUES ('', '', '1000000986026185');

SET FOREIGN_KEY_CHECKS = 1;
