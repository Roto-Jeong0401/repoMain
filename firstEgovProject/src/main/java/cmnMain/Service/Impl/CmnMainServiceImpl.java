package cmnMain.Service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Service;

import cmnMain.DAO.CmnMainDAO;
import cmnMain.Service.CmnMainService;
import cmnMain.Service.CmnMainVO;

@Service(value = "cmnService")
public class CmnMainServiceImpl implements CmnMainService{
	
	@Resource(name = "cmnDao")
	private CmnMainDAO cmnDao;

	/**
	 * 요청에 맞는 URL을 조회하는 쿼리
	 */
	@Override
	public List<EgovMap> selectTargetUrl(CmnMainVO vo) {
		// TODO Auto-generated method stub
		// cmnMain은 mapper의 namespace 이름
		return cmnDao.selectList("cmnMain.selectTargetUrl", vo);
	}

}
