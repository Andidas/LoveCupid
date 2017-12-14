package service;



import entity.SelfNomination;

public interface SelfNominationService {  
	boolean addSelfnomination(SelfNomination selfnomination);//添加自我推荐表 
	//List<SelfNomination> findAllSelfNomination();
	SelfNomination findSelfNominationById(Integer ubid);//查询自我推荐表
	boolean deleteSelfNomination(Integer snid);//删除自我推荐表
	boolean updateSelfNomination(SelfNomination selfnomination);//修改自我推荐表
}
