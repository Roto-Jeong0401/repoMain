package cmnMain.DAO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.springframework.stereotype.Repository;

@Repository(value = "cmnDao")
public class CmnMainDAO extends EgovAbstractMapper {

	/**
	 * 입력 처리 SQL mapping 을 실행한다.
	 * 
	 * @param queryId - 입력 처리 SQL mapping 쿼리 ID
	 * 
	 * @return DBMS가 지원하는 경우 insert 적용 결과 count
	 */
	public int insert(String queryId) {
		return super.getSqlSession().insert(queryId);
	}
	
	
	/**
	 * 입력 처리 SQL mapping 을 실행한다.
	 * 
	 * @param queryId - 입력 처리 SQL mapping 쿼리 ID
	 * @param parameterObject - 입력 처리 SQL mapping 입력 데이터를 세팅한 파라메터 객체(보통 VO 또는 Map)
	 * 
	 * @return DBMS가 지원하는 경우 insert 적용 결과 count
	 */
	public int insert(String queryId, Object parameterObject) {
		return super.getSqlSession().insert(queryId, parameterObject);
	}
	
	/**
	 * 수정 처리 SQL mapping 을 실행한다.
	 * 
	 * @param queryId - 수정 처리 SQL mapping 쿼리 ID
	 * 
	 * @return DBMS가 지원하는 경우 update 적용 결과 count
	 */
	public int update(String queryId) {
		return super.getSqlSession().insert(queryId);
	}
	
	/**
	 * 수정 처리 SQL mapping 을 실행한다.
	 * 
	 * @param queryId - 수정 처리 SQL mapping 쿼리 ID
	 * @param parameterObject - 수정 처리 SQL mapping 입력 데이터(Key 조건 및 변경 데이터)를 세팅한 파라메터 객체(보통 VO 또는 Map)
	 * 
	 * @return DBMS가 지원하는 경우 update 적용 결과 count
	 */
	public int update(String queryId, Object parameterObject) {
		return super.getSqlSession().insert(queryId, parameterObject);
	}
	
	/**
	 * 삭제 처리 SQL mapping 을 실행한다.
	 * 
	 * @param queryId - 삭제 처리 SQL mapping 쿼리 ID
	 * 
	 * @return DBMS가 지원하는 경우 delete 적용 결과 count
	 */
	public int delete(String queryId) {
		return super.getSqlSession().insert(queryId);
	}
	
	/**
	 * 삭제 처리 SQL mapping 을 실행한다.
	 * 
	 * @param queryId - 삭제 처리 SQL mapping 쿼리 ID
	 * @param parameterObject - 삭제 처리 SQL mapping 입력 데이터(Key 조건 및 변경 데이터)를 세팅한 파라메터 객체(보통 VO 또는 Map)
	 * 
	 * @return DBMS가 지원하는 경우 delete 적용 결과 count
	 */
	public int delete(String queryId, Object parameterObject) {
		return super.getSqlSession().insert(queryId, parameterObject);
	}
	
	//CHECKSTYLE:OFF
	/**
	 * 명명규칙에 맞춰 selectOne()로 변경한다.
	 * @deprecated select() 메소드로 대체
	 * 
	 * @see EgovAbstractMapper.selectOne()
	 */
	//CHECKSTYLE:ON
	@Deprecated
	public Object selectByPk(String queryId, Object parameterObject) {
		return super.getSqlSession().selectOne(queryId, parameterObject);
	}
	
	/**
	 * 단건조회 처리 SQL mapping 을 실행한다.
	 * 
	 * @param queryId - 단건 조회 처리 SQL mapping 쿼리 ID
	 * 
	 * @return 결과 객체 - SQL mapping 파일에서 지정한 resultType/resultMap 에 의한 단일 결과 객체(보통 VO 또는 Map)
	 */
	public <T> T selectOne(String queryId) {
		return super.getSqlSession().selectOne(queryId);
	}
	
	/**
	 * 단건조회 처리 SQL mapping 을 실행한다.
	 * 
	 * @param queryId - 단건 조회 처리 SQL mapping 쿼리 ID
	 * @param parameterObject - 단건 조회 처리 SQL mapping 입력 데이터(Key)를 세팅한 파라메터 객체(보통 VO 또는 Map)
	 * 
	 * @return 결과 객체 - SQL mapping 파일에서 지정한 resultType/resultMap 에 의한 단일 결과 객체(보통 VO 또는 Map)
	 */
	public <T> T selectOne(String queryId, Object parameterObject) {
		return super.getSqlSession().selectOne(queryId, parameterObject);
	}
	
	/**
	 * 결과 목록을 Map 으로 변환한다.
	 * 모든 구문이 파라미터를 필요로 하지는 않기 때문에, 파라미터 객체를 요구하지 않는 형태로 오버로드 되었다.
	 * 
	 * @param queryId - 단건 조회 처리 SQL mapping 쿼리 ID
	 * @param mapKey - 결과 객체의 프로퍼티 중 하나를 키로 사용
	 * 
	 * @return 결과 객체 - SQL mapping 파일에서 지정한 resultType/resultMap 에 의한 단일 결과 객체(보통 VO 또는 Map)의 Map
	 */
	public <K, V> Map<K, V> selectMap(String queryId, String mapKey) {
		return super.getSqlSession().selectMap(queryId, mapKey);
	}
	
	/**
	 * 결과 목록을 Map 으로 변환한다.
	 * 모든 구문이 파라미터를 필요로 하지는 않기 때문에, 파라미터 객체를 요구하지 않는 형태로 오버로드 되었다.
	 * 
	 * @param queryId - 단건 조회 처리 SQL mapping 쿼리 ID
	 * @param parameterObject - 맵 조회 처리 SQL mapping 입력 데이터(조회 조건)를 세팅한 파라미터 객체(보통 VO 또는 Map)
	 * @param mapKey - 결과 객체의 프로퍼티 중 하나를 키로 사용
	 * 
	 * @return 결과 객체 - SQL mapping 파일에서 지정한 resultType/resultMap 에 의한 단일 결과 객체(보통 VO 또는 Map)의 Map
	 */
	public <K, V> Map<K, V> selectMap(String queryId, Object parameterObject, String mapKey) {
		return super.getSqlSession().selectMap(queryId, parameterObject, mapKey);
	}
	
	/**
	 * 결과 목록을 Map 으로 변환한다.
	 * 모든 구문이 파라미터를 필요로 하지는 않기 때문에, 파라미터 객체를 요구하지 않는 형태로 오버로드 되었다.
	 * 
	 * @param queryId - 단건 조회 처리 SQL mapping 쿼리 ID
	 * @param parameterObject - 맵 조회 처리 SQL mapping 입력 데이터(조회 조건)를 세팅한 파라미터 객체(보통 VO 또는 Map)
	 * @param mapKey - 결과 객체의 프로퍼티 중 하나를 키로 사용
	 * @param rowBounds - 특정 개수 만큼의 레코드를 건너뛰게 함
	 * 
	 * @return 결과 객체 - SQL mapping 파일에서 지정한 resultType/resultMap 에 의한 단일 결과 객체(보통 VO 또는 Map)의 Map
	 */
	public <K, V> Map<K, V> selectMap(String queryId, Object parameterObject, String mapKey, RowBounds rowBounds) {
		return super.getSqlSession().selectMap(queryId, parameterObject, mapKey, rowBounds);
	}
	
	//CHECKSTYLE:OFF
	/**
	 * 명명 규칙에 맞춰 selectList()로 변경한다.
	 * 
	 * @see EgovAbstractMapper.selectList()
	 * @deprecated List<?> 메소드로 대체
	 */
	//CHECKSTYLE:ON
	@Deprecated
	public List<?> list(String queryId, Object parameterObject) {
		return super.getSqlSession().selectList(queryId, parameterObject);
	}
	
	/**
	 * 리스트 조회 처리 SQL mapping 을 실행한다.
	 * 
	 * @param queryId - 리스트 조회 처리 SQL mapping 쿼리 ID
	 * 
	 * @return 결과 List 객체 - SQL mapping 파일에서 지정한 resultType/resultMap 에 의한 결과 객체(보통 VO 또는 Map)의 List
	 */
	public <E> List<E> selectList(String queryId) {
		return super.getSqlSession().selectList(queryId);
	}
	
	/**
	 * 리스트 조회 처리 SQL mapping 을 실행한다.
	 * 
	 * @param queryId - 리스트 조회 처리 SQL mapping 쿼리 ID
	 * @param parameterObject - 리스트 조회 처리 SQL mapping 입력 데이터(조회 조건)를 세팅한 파라메터 객체(보통 VO 또는 Map)
	 * 
	 * @return 결과 List 객체 - SQL mapping 파일에서 지정한 resultType/resultMap 에 의한 결과 객체(보통 VO 또는 Map)의 List
	 */
	public <E> List<E> selectList(String queryId, Object parameterObject) {
		System.out.println("queryId: "+queryId+", parameterObject: "+ parameterObject);
		return super.getSqlSession().selectList(queryId, parameterObject);
	}
	
	/**
	 * 리스트 조회 처리 SQL mapping 을 실행한다.
	 * 
	 * @param queryId - 리스트 조회 처리 SQL mapping 쿼리 ID
	 * @param parameterObject - 리스트 조회 처리 SQL mapping 입력 데이터(조회 조건)를 세팅한 파라메터 객체(보통 VO 또는 Map)
	 * @param rowBounds - 특정 개수 만큼의 레코드를 건너뛰게 함
	 * 
	 * @return 결과 List 객체 - SQL mapping 파일에서 지정한 resultType/resultMap 에 의한 결과 객체(보통 VO 또는 Map)의 List
	 */
	public <E> List<E> selectList(String queryId, Object parameterObject, RowBounds rowBounds) {
		return super.getSqlSession().selectList(queryId, parameterObject, rowBounds);
	}
	
	/**
	 * 부분 범위 리스트 조회 처리 SQL mapping 을 실행한다.
	 * (부분 범위 - pageIndex 와 pageSize 기반으로 현재 부분 범위 조회를 위한 skipResults, maxResults 를 계산하여 ibatis 호출)
	 * 
	 * @param queryId - 리스트 조회 처리 SQL mapping 쿼리 ID
	 * @param parameterObject - 리스트 조회 처리 SQL mapping 입력 데이터(조회 조건)를 세팅한 파라메터 객체(보통 VO 또는 Map)
	 * @param pageIndex - 현재 페이지 번
	 * @param pageSize - 한 페이지 조회 수(pageSize)
	 * 
	 * @return 부분 범위 결과 List 객체 - SQL mapping 파일에서 지정한 resultType/resultMap 에 의한 부분 범위 결과 객체(보통 VO 또는 Map) List
	 */
	public List<?> listWithPaging(String queryID, Object parameterObject, int pageIndex, int pageSize) {
		int skipResults = pageIndex * pageSize;
		// int maxResults = (pageIndex * pageSize) + pageSize; 
		
		RowBounds rowBounds = new RowBounds(skipResults, pageSize);
		
		return super.getSqlSession().selectList(queryID, parameterObject, rowBounds);
	}
	
	/**
	 * SQL 조회 결과를 ResultHandler를 이용해서 출력한다.
	 * ResultHandler를 상속해 구현한 커스텀 핸들러의 handlerResult() 메서드에 따라 실행된다.
	 * 
	 * @param queryId - 리스트 조회 처리 SQL mapping 쿼리 ID
	 * @param handler - 조회 결과를 제어하기 위해 구현한 ResultHandler
	 * @return
	 * 
	 * @return 결과 List 객체 - SQL mapping 파일에서 지정한 resultType/resultMap 에 의한 결과 객체(보통 VO 또는 Map)의 List 
	 */
	public void listToOutUsingResultHandler(String queryId, ResultHandler handler) {
		super.getSqlSession().select(queryId, handler);
	}
	
	
}
