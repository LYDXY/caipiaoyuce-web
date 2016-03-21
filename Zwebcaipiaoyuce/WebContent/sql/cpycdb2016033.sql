/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50162
Source Host           : localhost:3306
Source Database       : cpycdb

Target Server Type    : MYSQL
Target Server Version : 50162
File Encoding         : 65001

Date: 2016-03-21 10:43:14
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
) ENGINE=InnoDB AUTO_INCREMENT=2016034 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_caipiao_six_one
-- ----------------------------
INSERT INTO `tb_caipiao_six_one` VALUES ('2015071', '2015071', '12', '46', '11', '35', '24', '4', '3', '135');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015072', '2015072', '34', '16', '12', '48', '31', '42', '37', '220');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015073', '2015073', '33', '42', '26', '3', '10', '46', '44', '204');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015074', '2015074', '40', '28', '49', '26', '1', '5', '15', '164');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015075', '2015075', '43', '41', '9', '8', '33', '18', '15', '167');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015076', '2015076', '21', '27', '12', '14', '38', '43', '15', '170');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015077', '2015077', '11', '4', '48', '44', '23', '32', '49', '211');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015078', '2015078', '47', '34', '9', '32', '24', '43', '35', '224');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015079', '2015079', '40', '28', '29', '38', '19', '9', '33', '196');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015080', '2015080', '17', '22', '5', '28', '2', '27', '37', '138');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015081', '2015081', '7', '10', '13', '38', '20', '8', '5', '101');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015082', '2015082', '38', '35', '22', '18', '23', '16', '25', '177');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015083', '2015083', '20', '23', '13', '24', '46', '47', '39', '212');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015084', '2015084', '42', '41', '15', '19', '14', '4', '10', '145');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015085', '2015085', '45', '49', '40', '33', '10', '43', '38', '258');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015086', '2015086', '15', '11', '28', '30', '4', '26', '13', '127');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015087', '2015087', '32', '25', '33', '35', '34', '12', '45', '216');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015088', '2015088', '11', '48', '24', '17', '5', '4', '46', '155');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015089', '2015089', '32', '47', '14', '31', '28', '20', '18', '190');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015090', '2015090', '15', '13', '5', '9', '21', '23', '12', '98');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015091', '2015091', '23', '41', '40', '22', '42', '35', '16', '219');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015092', '2015092', '12', '25', '46', '10', '42', '19', '37', '191');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015093', '2015093', '27', '26', '47', '22', '28', '36', '12', '198');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015094', '2015094', '21', '24', '22', '8', '4', '1', '46', '126');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015095', '2015095', '2', '6', '30', '33', '25', '13', '20', '129');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015096', '2015096', '43', '17', '49', '7', '34', '41', '1', '192');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015097', '2015097', '18', '4', '44', '5', '23', '32', '6', '132');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015098', '2015098', '32', '2', '37', '36', '26', '31', '12', '176');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015099', '2015099', '41', '42', '39', '16', '15', '3', '36', '192');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015100', '2015100', '29', '9', '39', '13', '30', '45', '48', '213');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015101', '2015101', '9', '32', '37', '39', '22', '28', '47', '214');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015102', '2015102', '31', '10', '5', '36', '8', '6', '17', '113');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015103', '2015103', '16', '45', '34', '12', '36', '42', '41', '226');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015104', '2015104', '15', '40', '26', '36', '20', '16', '46', '199');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015105', '2015105', '22', '4', '41', '1', '13', '32', '26', '139');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015106', '2015106', '11', '1', '36', '13', '35', '23', '34', '153');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015107', '2015107', '5', '38', '21', '25', '13', '40', '17', '159');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015108', '2015108', '5', '22', '17', '25', '27', '3', '46', '145');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015109', '2015109', '9', '41', '4', '17', '1', '35', '37', '144');
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
INSERT INTO `tb_caipiao_six_one` VALUES ('2015147', '2015147', '43', '45', '20', '16', '6', '11', '21', '162');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015148', '2015148', '44', '36', '38', '11', '28', '48', '26', '231');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015149', '2015149', '18', '20', '12', '33', '47', '28', '25', '183');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015150', '2015150', '37', '1', '8', '42', '47', '33', '7', '175');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015151', '2015151', '30', '38', '33', '20', '3', '5', '28', '157');
INSERT INTO `tb_caipiao_six_one` VALUES ('2015152', '2015152', '22', '24', '11', '25', '2', '12', '3', '99');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016001', '2015153', '6', '34', '8', '41', '32', '11', '47', '179');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016002', '2015154', '18', '45', '2', '5', '7', '30', '11', '118');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016003', '2015155', '29', '11', '9', '47', '43', '6', '8', '153');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016004', '2015156', '15', '8', '30', '45', '18', '4', '38', '158');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016005', '2015157', '8', '13', '44', '45', '35', '15', '47', '207');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016006', '2015158', '23', '49', '32', '2', '1', '10', '26', '144');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016007', '2015159', '2', '6', '1', '43', '37', '40', '24', '153');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016008', '2015160', '39', '25', '30', '8', '20', '18', '13', '153');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016009', '2015161', '33', '40', '47', '2', '12', '45', '9', '188');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016010', '2015162', '14', '32', '23', '8', '12', '7', '5', '101');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016011', '2015163', '9', '40', '5', '27', '22', '26', '13', '142');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016012', '2015164', '30', '48', '8', '42', '34', '20', '36', '218');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016013', '2015165', '1', '39', '29', '32', '44', '5', '4', '154');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016014', '2015166', '36', '28', '34', '18', '33', '30', '2', '181');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016015', '2015167', '7', '38', '13', '35', '15', '45', '32', '185');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016016', '2015168', '11', '21', '13', '19', '15', '29', '41', '149');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016017', '2015169', '4', '35', '3', '30', '47', '17', '10', '146');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016018', '2015170', '43', '8', '36', '14', '29', '24', '31', '185');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016019', '2015171', '42', '43', '22', '34', '21', '18', '24', '204');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016020', '2015172', '20', '41', '38', '13', '45', '39', '46', '242');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016021', '2015173', '47', '49', '39', '20', '44', '12', '45', '256');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016022', '2015174', '15', '27', '45', '44', '9', '24', '47', '211');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016023', '2015175', '3', '47', '22', '45', '24', '6', '7', '154');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016024', '2015176', '27', '6', '11', '20', '44', '9', '42', '159');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016025', '2015177', '30', '21', '11', '16', '19', '33', '31', '161');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016026', '2015178', '16', '5', '45', '7', '2', '1', '33', '109');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016027', '2015179', '29', '48', '49', '17', '26', '32', '40', '241');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016028', '2015180', '16', '34', '4', '30', '3', '39', '14', '140');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016029', '2015181', '9', '48', '30', '33', '24', '14', '43', '201');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016030', '2015182', '41', '23', '49', '36', '33', '3', '2', '187');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016031', '2015183', '1', '6', '41', '19', '28', '26', '39', '160');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016032', '2015184', '8', '16', '15', '3', '17', '38', '35', '132');
INSERT INTO `tb_caipiao_six_one` VALUES ('2016033', '2015185', '25', '23', '39', '35', '42', '43', '14', '221');

-- ----------------------------
-- Table structure for `tb_shuang_se_qiu`
-- ----------------------------
DROP TABLE IF EXISTS `tb_shuang_se_qiu`;
CREATE TABLE `tb_shuang_se_qiu` (
  `id` int(11) NOT NULL DEFAULT '0',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_shuang_se_qiu
-- ----------------------------
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015001', '2015001', '1', '7', '9', '16', '20', '23', '6', '76');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015002', '2015002', '7', '15', '16', '25', '28', '32', '5', '123');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015003', '2015003', '10', '15', '20', '23', '24', '31', '15', '123');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015004', '2015004', '2', '14', '15', '16', '23', '24', '10', '94');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015005', '2015005', '7', '10', '16', '17', '18', '32', '15', '100');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015006', '2015006', '1', '10', '11', '29', '31', '33', '13', '115');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015007', '2015007', '1', '7', '9', '17', '20', '33', '8', '87');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015008', '2015008', '4', '7', '10', '16', '20', '22', '3', '79');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015009', '2015009', '4', '7', '14', '17', '21', '25', '14', '88');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015010', '2015010', '1', '2', '3', '8', '21', '31', '9', '66');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015011', '2015011', '4', '14', '15', '17', '18', '20', '15', '88');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015012', '2015012', '3', '5', '22', '23', '29', '31', '6', '113');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015013', '2015013', '8', '9', '24', '25', '26', '29', '1', '121');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015014', '2015014', '2', '12', '16', '19', '27', '30', '11', '106');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015015', '2015015', '1', '7', '20', '24', '25', '33', '4', '110');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015016', '2015016', '2', '6', '10', '15', '17', '31', '13', '81');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015017', '2015017', '13', '18', '20', '25', '27', '33', '12', '136');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015018', '2015018', '6', '9', '12', '14', '28', '29', '9', '98');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015019', '2015019', '2', '6', '11', '19', '25', '26', '4', '89');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015020', '2015020', '1', '4', '7', '19', '22', '23', '4', '76');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015021', '2015021', '14', '15', '16', '17', '27', '28', '8', '117');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015022', '2015022', '4', '7', '10', '16', '23', '25', '10', '85');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015023', '2015023', '8', '9', '10', '13', '29', '30', '1', '99');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015024', '2015024', '9', '11', '16', '18', '23', '24', '10', '101');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015025', '2015025', '10', '11', '12', '15', '27', '32', '14', '107');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015026', '2015026', '2', '13', '17', '21', '22', '33', '13', '108');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015027', '2015027', '5', '7', '9', '16', '26', '29', '7', '92');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015028', '2015028', '4', '7', '10', '26', '27', '28', '14', '102');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015029', '2015029', '7', '14', '15', '19', '21', '28', '7', '104');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015030', '2015030', '8', '11', '14', '15', '16', '26', '7', '90');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015031', '2015031', '1', '5', '7', '22', '26', '32', '11', '93');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015032', '2015032', '11', '14', '16', '18', '29', '32', '16', '120');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015033', '2015033', '3', '6', '21', '29', '31', '32', '5', '122');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015034', '2015034', '12', '13', '17', '18', '20', '27', '13', '107');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015035', '2015035', '1', '8', '9', '22', '24', '33', '3', '97');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015036', '2015036', '4', '6', '16', '17', '26', '33', '3', '102');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015037', '2015037', '5', '7', '12', '18', '28', '31', '3', '101');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015038', '2015038', '5', '6', '11', '12', '14', '33', '14', '81');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015039', '2015039', '1', '13', '15', '26', '29', '30', '12', '114');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015040', '2015040', '13', '16', '18', '27', '30', '32', '16', '136');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015041', '2015041', '4', '9', '11', '17', '21', '25', '6', '87');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015042', '2015042', '9', '10', '19', '21', '23', '32', '8', '114');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015043', '2015043', '11', '12', '15', '24', '26', '27', '15', '115');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015044', '2015044', '2', '3', '4', '13', '14', '16', '2', '52');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015045', '2015045', '1', '5', '13', '22', '30', '31', '7', '102');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015046', '2015046', '5', '7', '10', '14', '23', '31', '1', '90');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015047', '2015047', '2', '3', '20', '24', '26', '27', '9', '102');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015048', '2015048', '13', '16', '17', '22', '25', '27', '10', '120');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015049', '2015049', '7', '12', '14', '17', '20', '23', '5', '93');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015050', '2015050', '3', '9', '12', '16', '17', '31', '4', '88');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015051', '2015051', '4', '10', '24', '26', '28', '32', '9', '124');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015052', '2015052', '2', '4', '11', '16', '25', '26', '12', '84');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015053', '2015053', '3', '7', '17', '22', '32', '33', '10', '114');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015054', '2015054', '1', '2', '7', '10', '22', '26', '7', '68');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015055', '2015055', '1', '10', '15', '18', '19', '28', '2', '91');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015056', '2015056', '1', '7', '8', '16', '18', '20', '14', '70');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015057', '2015057', '9', '20', '24', '25', '26', '32', '4', '136');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015058', '2015058', '2', '9', '10', '18', '19', '20', '15', '78');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015059', '2015059', '2', '6', '9', '16', '25', '32', '14', '90');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015060', '2015060', '1', '3', '18', '27', '31', '32', '13', '112');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015061', '2015061', '6', '18', '22', '26', '32', '33', '4', '137');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015062', '2015062', '9', '14', '15', '18', '21', '26', '16', '103');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015063', '2015063', '1', '7', '9', '16', '22', '32', '12', '87');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015064', '2015064', '11', '12', '14', '17', '23', '27', '1', '104');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015065', '2015065', '8', '10', '14', '19', '26', '29', '12', '106');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015066', '2015066', '5', '8', '11', '17', '24', '28', '16', '93');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015067', '2015067', '2', '5', '8', '24', '25', '31', '14', '95');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015068', '2015068', '6', '15', '18', '21', '26', '27', '10', '113');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015069', '2015069', '1', '13', '17', '18', '23', '30', '15', '102');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015070', '2015070', '1', '7', '13', '19', '21', '29', '15', '90');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015071', '2015071', '8', '18', '20', '28', '29', '31', '8', '134');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015072', '2015072', '1', '3', '5', '20', '21', '31', '5', '81');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015073', '2015073', '1', '2', '17', '22', '26', '27', '4', '95');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015074', '2015074', '4', '7', '21', '25', '26', '29', '8', '112');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015075', '2015075', '6', '11', '13', '19', '21', '32', '4', '102');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015076', '2015076', '1', '9', '10', '19', '23', '27', '9', '89');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015077', '2015077', '1', '6', '8', '10', '13', '27', '16', '65');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015078', '2015078', '3', '7', '20', '22', '26', '29', '2', '107');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015079', '2015079', '9', '14', '15', '20', '26', '32', '11', '116');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015080', '2015080', '14', '17', '25', '27', '28', '30', '2', '141');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015081', '2015081', '13', '20', '22', '26', '28', '31', '13', '140');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015082', '2015082', '2', '8', '9', '14', '28', '30', '7', '91');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015083', '2015083', '6', '7', '16', '18', '29', '32', '5', '108');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015084', '2015084', '15', '18', '20', '22', '28', '29', '15', '132');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015085', '2015085', '2', '8', '25', '27', '28', '29', '5', '119');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015086', '2015086', '5', '6', '8', '16', '18', '22', '12', '75');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015087', '2015087', '9', '15', '16', '19', '20', '28', '11', '107');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015088', '2015088', '2', '12', '20', '24', '29', '31', '9', '118');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015089', '2015089', '12', '14', '19', '27', '28', '29', '1', '129');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015090', '2015090', '10', '12', '14', '22', '25', '33', '15', '116');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015091', '2015091', '5', '7', '17', '19', '22', '31', '11', '101');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015092', '2015092', '9', '15', '19', '21', '26', '27', '1', '117');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015093', '2015093', '1', '3', '13', '21', '25', '31', '8', '94');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015094', '2015094', '1', '4', '6', '13', '16', '17', '10', '57');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015095', '2015095', '4', '15', '21', '28', '30', '31', '4', '129');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015096', '2015096', '6', '16', '17', '23', '24', '31', '7', '117');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015097', '2015097', '9', '12', '14', '20', '26', '27', '4', '108');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015098', '2015098', '6', '9', '13', '26', '27', '33', '1', '114');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015099', '2015099', '6', '7', '10', '11', '14', '22', '9', '70');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015100', '2015100', '2', '3', '11', '17', '19', '21', '8', '73');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015101', '2015101', '8', '16', '22', '24', '28', '29', '5', '127');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015102', '2015102', '7', '9', '12', '14', '21', '23', '6', '86');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015103', '2015103', '6', '8', '13', '26', '30', '32', '14', '115');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015104', '2015104', '9', '18', '21', '23', '25', '26', '1', '122');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015105', '2015105', '9', '10', '16', '19', '20', '26', '12', '100');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015106', '2015106', '1', '3', '4', '23', '31', '32', '13', '94');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015107', '2015107', '7', '14', '16', '18', '21', '25', '8', '101');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015108', '2015108', '2', '12', '19', '22', '24', '27', '15', '106');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015109', '2015109', '1', '8', '9', '16', '32', '33', '13', '99');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015110', '2015110', '5', '7', '16', '17', '22', '23', '4', '90');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015111', '2015111', '8', '14', '16', '18', '20', '30', '12', '106');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015112', '2015112', '1', '3', '10', '19', '20', '27', '11', '80');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015113', '2015113', '1', '5', '7', '8', '19', '27', '12', '67');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015114', '2015114', '4', '7', '9', '13', '21', '26', '1', '80');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015115', '2015115', '1', '7', '8', '14', '24', '32', '3', '86');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015116', '2015116', '4', '6', '15', '23', '26', '28', '11', '102');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015117', '2015117', '4', '11', '12', '18', '26', '32', '12', '103');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015118', '2015118', '1', '4', '11', '21', '23', '31', '12', '91');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015119', '2015119', '2', '8', '10', '18', '23', '31', '8', '92');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015120', '2015120', '16', '21', '24', '26', '27', '29', '16', '143');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015121', '2015121', '1', '3', '20', '21', '28', '29', '12', '102');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015122', '2015122', '5', '7', '11', '16', '22', '25', '7', '86');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015123', '2015123', '5', '8', '9', '12', '22', '28', '7', '84');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015124', '2015124', '2', '3', '5', '12', '18', '27', '1', '67');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015125', '2015125', '5', '13', '22', '27', '30', '33', '10', '130');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015126', '2015126', '10', '11', '15', '20', '23', '29', '12', '108');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015127', '2015127', '7', '10', '19', '22', '27', '33', '6', '118');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015128', '2015128', '1', '3', '8', '11', '22', '28', '6', '73');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015129', '2015129', '5', '8', '11', '16', '18', '27', '4', '85');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015130', '2015130', '6', '14', '15', '16', '17', '22', '10', '90');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015131', '2015131', '10', '12', '13', '19', '22', '26', '3', '102');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015132', '2015132', '3', '5', '11', '28', '30', '33', '1', '110');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015133', '2015133', '2', '3', '13', '20', '22', '24', '15', '84');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015134', '2015134', '2', '5', '14', '19', '27', '31', '4', '98');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015135', '2015135', '1', '12', '14', '18', '26', '32', '7', '103');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015136', '2015136', '2', '5', '12', '23', '28', '29', '1', '99');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015137', '2015137', '14', '22', '23', '27', '28', '31', '12', '145');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015138', '2015138', '1', '2', '8', '16', '19', '24', '11', '70');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015139', '2015139', '1', '10', '13', '18', '25', '27', '9', '94');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015140', '2015140', '6', '20', '28', '29', '30', '31', '12', '144');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015141', '2015141', '3', '8', '19', '25', '27', '28', '2', '110');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015142', '2015142', '13', '17', '19', '20', '22', '25', '11', '116');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015143', '2015143', '13', '15', '19', '20', '21', '32', '4', '120');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015144', '2015144', '1', '4', '7', '15', '28', '32', '16', '87');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015145', '2015145', '7', '8', '15', '19', '20', '24', '13', '93');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015146', '2015146', '16', '17', '21', '28', '30', '32', '15', '144');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015147', '2015147', '8', '9', '16', '23', '24', '30', '5', '110');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015148', '2015148', '9', '13', '14', '22', '26', '27', '7', '111');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015149', '2015149', '9', '10', '20', '21', '22', '33', '9', '115');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015150', '2015150', '1', '3', '8', '11', '29', '31', '13', '83');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015151', '2015151', '5', '6', '8', '23', '31', '32', '11', '105');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015152', '2015152', '11', '18', '19', '21', '29', '32', '12', '130');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015153', '2015153', '8', '11', '15', '22', '27', '29', '3', '112');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2015154', '2015154', '7', '9', '11', '15', '18', '25', '7', '92');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2016001', '2015155', '6', '13', '16', '18', '20', '22', '13', '108');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2016002', '2015156', '9', '14', '17', '20', '24', '30', '16', '130');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2016003', '2015157', '1', '10', '14', '23', '26', '28', '1', '103');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2016004', '2015158', '8', '10', '17', '22', '25', '33', '12', '127');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2016005', '2015159', '11', '14', '18', '20', '31', '33', '14', '141');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2016006', '2015160', '13', '16', '18', '20', '28', '31', '12', '138');
INSERT INTO `tb_shuang_se_qiu` VALUES ('2016007', '2015161', '5', '12', '14', '20', '27', '29', '6', '113');
