/*******************************************************************************
 *
 * *********************************************** {COPYRIGHT-TOP} ***
 * IBM Confidential
 *
 * (c) Copyright IBM Corp. 2000, 2020 All Rights Reserved.
 *
 * The source code for this program is not published or otherwise
 * divested of its trade secrets.The source code for this program is owned by International
 * Business Machines Corporation or one of its subsidiaries ("IBM") and is
 * copyrighted.
 * ************************************************ {COPYRIGHT-END}
 *******************************************************************************/
package springboothelloworld.helloworld.pojo;

import java.util.List;

/**
 * 
 * @author ShishirKumar
 *
 */
public class Member {
	private String mbrUid;
	private String contractId;
	private String mbrSequenceNbr;
	private String firstNm;
	private String lastNm;
	private List<MemberCard> memberCard;
	public String getMbrUid() {
		return mbrUid;
	}
	public void setMbrUid(String mbrUid) {
		this.mbrUid = mbrUid;
	}
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public String getMbrSequenceNbr() {
		return mbrSequenceNbr;
	}
	public void setMbrSequenceNbr(String mbrSequenceNbr) {
		this.mbrSequenceNbr = mbrSequenceNbr;
	}
	public String getFirstNm() {
		return firstNm;
	}
	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}
	public String getLastNm() {
		return lastNm;
	}
	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}
	public List<MemberCard> getMemberCard() {
		return memberCard;
	}
	public void setMemberCard(List<MemberCard> memberCard) {
		this.memberCard = memberCard;
	}
	
}
