package com.web.action;

import java.util.List;

import javax.annotation.Resource;

import com.system.action.BaseAction;
import com.web.pojo.SixOne;
import com.web.services.SixOneServices;

/**
 * 
 * @author 林尧
 * 
 *         2015年12月12日
 */
public class SixOneAction extends BaseAction {
    
	private String TAG="SixOneAction";
	private static final long serialVersionUID = 1L;

	@Resource(name = "SixOneServices")// 指定服务层的实现类对象,因为该服务实现用了SixOneServices 标注
	private SixOneServices SixOneServices; // 服务层的接口
    
	/**
	 * 查询所有的期数 数据
	 * @return
	 */
	public String getSixOnes(){
		logger.info(TAG+"---"+"getSixOnes");
		List<SixOne> all_sixones=SixOneServices.selectSixOnes(new SixOne());
		logger.info(TAG+"---该表格的数据总数"+all_sixones.size());
		return "GETSIXONES_SUCCESS";
	}
	
/*	public String front_saveLetter() {
		
		
		// if(uploadFile!=null){
		// try {
		// this.uploadFileFileName =
		// letter.getAcceptNum()+uploadFileFileName.substring(uploadFileFileName.lastIndexOf("."));
		// this.saveFile();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }
		Letter lt = new Letter();
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>theID="
				+ letter.getAcceptNum());
		int theID = Integer.valueOf(letter.getAcceptNum());

		String date = DateUtils.getNowTime().replaceAll("-", "")
				.replaceAll(":", "").replaceAll(" ", "");
		Random r = new Random();
		String random = Integer.toHexString(r.nextInt(10));
		for (int i = 0; i < 3; i++) {
			random = random + Integer.toHexString(r.nextInt(10));
		}
		String acceptNum = date + random;
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>random=" + random);
		lt.setTheID(theID);
		lt.setAcceptNum(acceptNum);
		// if(uploadFile!=null){
		// lt.setUploadFile(uploadFileFileName);
		// }
		frontLetterServices.front_updateLetter(lt);
		request.setAttribute("acceptNum", acceptNum);
		request.setAttribute("flag", request.getParameter("flag"));
		return SUCCESS;
	}

	public String front_replayLetter() {
		List<Letter> list = new ArrayList<Letter>();
		Letter letter = new Letter();
		String flag = request.getParameter("flag");
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>flag=" + flag);
		letter.setFlag(flag);
		letter.setIsOpen("1");
		list = frontLetterServices.frontLetterDetail(letter);
		request.setAttribute("flag", flag);
		request.setAttribute("list", list);
		request.setAttribute("index", request.getParameter("index"));
		return "success";
	}

	public String front_queryLetterByNum() {
		String acceptNum = request.getParameter("acceptNum");
		Letter letter = new Letter();
		letter.setAcceptNum(acceptNum);
		List<Letter> list = frontLetterServices.frontLetterDetail(letter);
		request.setAttribute("list", list);
		request.setAttribute("index", request.getParameter("index"));
		return SUCCESS;
	}

	public String front_queryLetterDetail() {
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>theID="
				+ request.getParameter("theID"));
		String index = request.getParameter("index");
		int theID = Integer.valueOf(request.getParameter("theID"));
		Letter lt = new Letter();
		lt.setTheID(theID);
		List<Letter> list = frontLetterServices.frontLetterDetail(lt);
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>index=" + index);
		if (index != null && !"".equals(index)) {
			if (list.size() > 0) {
				Letter letterDetail = null;
				letterDetail = list.get(0);
				request.setAttribute("letterDetail", letterDetail);
			}
		} else {
			if (list.size() > 0) {
				Letter letter = null;
				letter = list.get(0);
				String numLast = letter.getAcceptNum().substring(12);
				letter.setAcceptNum("********" + numLast);
				String nameLast = letter.getName().substring(
						letter.getName().length() - 2,
						letter.getName().length());
				letter.setName("**" + nameLast);
				String certnumLast = letter.getCertNum().substring(
						letter.getCertNum().length() - 2,
						letter.getCertNum().length());
				letter.setCertNum("********" + certnumLast);
				String emailLast = letter.getEmail().substring(0, 2);
				letter.setEmail(emailLast + "********");
				request.setAttribute("letter", letter);
			}
		}
		return SUCCESS;
	}

	*//**
	 * 
	 * 
	 *//*

	private String saveFile() throws IOException {

		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			String urlPath = "uploads/web/letter/";// 文件存放路径
			String webappPath = request.getSession().getServletContext()
					.getRealPath("/");// 获取项目路径
			String filePath = webappPath + urlPath;
			File file = new File(filePath);
			if (!file.exists()) {
				file.mkdirs();
			}
			// File saveFile = new File(filePath + uploadFileFileName);
			// fos = new FileOutputStream(saveFile);
			// fis = new FileInputStream(this.getUploadFile());
			byte[] b = new byte[1024];
			int readSize = fis.read(b);
			while (readSize > -1) {
				fos.write(b, 0, readSize);
				readSize = fis.read(b);
			}
			// String returnUrl = urlPath + uploadFileFileName;
			return "";
		} catch (Exception e) {
			request.setAttribute("tips", e.getMessage());
			return "error";
		} finally {
			if (fos != null) {
				fos.close();
			}
			if (fis != null) {
				fis.close();
			}
		}

	}

	public Letter getLetter() {
		Letter letter = new Letter();
		letter.setVisitePath(request.getParameter("visitePath"));
		letter.setAcceptNum(request.getParameter("acceptNum"));
		letter.setName(request.getParameter("name"));
		letter.setSex(request.getParameter("sex"));
		letter.setAge(request.getParameter("age"));
		letter.setPoliticalType(request.getParameter("politicalType"));
		letter.setCertType(request.getParameter("certType"));
		letter.setCertNum(request.getParameter("certNum"));
		letter.setOccupType(request.getParameter("occupType"));
		letter.setWorkplace(request.getParameter("workplace"));
		letter.setPhone(request.getParameter("phone"));
		letter.setMoblePhone(request.getParameter("moblePhone"));
		letter.setEmail(request.getParameter("email"));
		letter.setAddress(request.getParameter("address"));
		letter.setPostcode(request.getParameter("postcode"));
		letter.setTheme(request.getParameter("theme"));
		letter.setQuestionType(request.getParameter("questionType"));
		letter.setReferDept(request.getParameter("referDept"));
		letter.setJoinNum(request.getParameter("joinNum"));
		letter.setDetailAddress(request.getParameter("detailAddress"));
		letter.setEverDo(request.getParameter("everDo"));
		letter.setIsOpen(request.getParameter("isOpen"));
		letter.setIpAddress(request.getRemoteAddr().toString());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(">>>>>>>>>>>>>>>>>>llllll" + letter);
		letter.setFlag("1");//
		letter.setStatus(request.getParameter("status"));
		letter.setCreateDate(DateUtils.getNowTime());
		return letter;
	}*/

	// public File getUploadFile() {
	// return uploadFile;
	// }
	//
	// public void setUploadFile(File uploadFile) {
	// this.uploadFile = uploadFile;
	// }
	//
	// public String getUploadFileFileName() {
	// return uploadFileFileName;
	// }
	//
	// public void setUploadFileFileName(String uploadFileFileName) {
	// this.uploadFileFileName = uploadFileFileName;
	// }

}
