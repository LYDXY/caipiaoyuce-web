/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50162
Source Host           : localhost:3306
Source Database       : cpycdb

Target Server Type    : MYSQL
Target Server Version : 50162
File Encoding         : 65001

Date: 2015-12-20 15:54:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_caipiao_six_one`
-- ----------------------------
DROP TABLE IF EXISTS `tb_caipiao_six_one`;
CREATE TABLE `tb_caipiao_six_one` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `qishu` int(11) NOT NULL,
  `first` int(11) NOT NULL,
  `second` int(11) NOT NULL,
  `third` int(11) NOT NULL,
  `fourth` int(11) NOT NULL,
  `fifth` int(11) NOT NULL,
  `sixth` int(11) NOT NULL,
  `seventh` int(11) NOT NULL,
  `sum` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2015130 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_caipiao_six_one
-- ----------------------------
INSERT INTO `tb_caipiao_six_one` VALUES ('2015107', '2015107', '5', '38', '21', '25', '13', '40', '17', '159');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015108', '2015108', '5', '22', '17', '25', '27', '3', '46', '145');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015109', '201519', '9', '41', '4', '17', '1', '35', '37', '144');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015110', '2015110', '25', '43', '11', '2', '36', '12', '10', '139');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015111', '2015111', '10', '16', '15', '24', '4', '28', '49', '146');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015112', '2015112', '37', '43', '6', '18', '16', '15', '2', '137');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015113', '2015113', '46', '28', '10', '23', '9', '37', '24', '187');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015114', '2015114', '39', '30', '16', '10', '40', '8', '6', '149');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015115', '2015115', '32', '2', '22', '7', '9', '46', '26', '144');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015116', '2015116', '17', '40', '8', '28', '34', '39', '14', '180');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015117', '2015117', '22', '36', '46', '4', '35', '21', '40', '204');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015118', '2015118', '34', '30', '4', '33', '1', '22', '26', '150');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015119', '2015119', '17', '30', '34', '18', '33', '26', '29', '187');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015120', '2015120', '33', '48', '2', '19', '12', '34', '24', '172');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015121', '2015121', '46', '15', '38', '39', '7', '11', '25', '181');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015122', '2015122', '25', '48', '16', '40', '14', '1', '17', '161');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015123', '2015123', '27', '34', '18', '45', '35', '28', '2', '189');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015124', '2015124', '33', '20', '22', '44', '31', '39', '10', '199');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015125', '2015125', '31', '32', '5', '46', '4', '6', '47', '161');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015126', '2015126', '28', '4', '48', '37', '10', '42', '8', '177');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015127', '2015127', '38', '12', '25', '7', '13', '34', '15', '144');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015128', '2015128', '25', '44', '11', '5', '27', '10', '7', '129');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015129', '2015129', '6', '16', '34', '44', '48', '27', '1', '176');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015130', '2015130', '47', '4', '43', '28', '42', '14', '3', '181');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015131', '2015131', '10', '24', '28', '45', '33', '20', '19', '179');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015132', '2015132', '13', '15', '45', '28', '41', '24', '20', '186');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015133', '2015133', '33', '13', '47', '31', '35', '12', '21', '192');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015134', '2015134', '15', '40', '41', '13', '48', '25', '19', '201');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015135', '2015135', '33', '30', '38', '20', '39', '9', '37', '206');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015136', '2015136', '44', '17', '21', '41', '36', '22', '38', '219');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015137', '2015137', '44', '10', '39', '17', '25', '26', '7', '168');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015138', '2015138', '31', '25', '28', '24', '15', '21', '48', '192');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015139', '2015139', '8', '10', '33', '32', '9', '40', '28', '150');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015140', '2015140', '42', '14', '41', '4', '44', '11', '10', '166');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015141', '2015141', '19', '16', '35', '6', '34', '46', '9', '165');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015142', '2015142', '49', '25', '10', '9', '40', '48', '32', '213');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015143', '2015143', '9', '29', '24', '47', '32', '34', '42', '217');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015144', '2015144', '16', '42', '44', '27', '35', '18', '33', '215');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015145', '2015145', '18', '41', '40', '48', '49', '22', '42', '260');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015146', '2015146', '20', '36', '24', '18', '45', '44', '39', '226');
