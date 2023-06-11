package cmnMain.Service;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.util.EgovMap;

public interface CmnMainService {
	
	/**
	 * URL 조회
	 * @param vo 검색조건
	 * @return List<?> URL 목
	 */
	List<EgovMap> selectTargetUrl(CmnMainVO vo);

}
