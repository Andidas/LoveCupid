package service;



import entity.SelfNomination;

public interface SelfNominationService {  
	boolean addSelfnomination(SelfNomination selfnomination);//��������Ƽ��� 
	//List<SelfNomination> findAllSelfNomination();
	SelfNomination findSelfNominationById(Integer ubid);//��ѯ�����Ƽ���
	boolean deleteSelfNomination(Integer snid);//ɾ�������Ƽ���
	boolean updateSelfNomination(SelfNomination selfnomination);//�޸������Ƽ���
}
