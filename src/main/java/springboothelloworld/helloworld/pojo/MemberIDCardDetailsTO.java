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
import java.util.Map;
/**
 * 
 * @author ShishirKumar
 *
 */
public class MemberIDCardDetailsTO {
	private List<Member> member;
	private List<Member> actualMember;
	private Map<String, Map<String,List<MemberCard>>> mapOfMemberCardForMbrUid;

	public List<Member> getMember() {
		return member;
	}

	public void setMember(List<Member> member) {
		this.member = member;
	}

	/**
	 * @return the mapOfMemberCardForMbrUid
	 */
	public Map<String, Map<String, List<MemberCard>>> getMapOfMemberCardForMbrUid() {
		return mapOfMemberCardForMbrUid;
	}

	/**
	 * @param mapOfMemberCardForMbrUid the mapOfMemberCardForMbrUid to set
	 */
	public void setMapOfMemberCardForMbrUid(
			Map<String, Map<String, List<MemberCard>>> mapOfMemberCardForMbrUid) {
		this.mapOfMemberCardForMbrUid = mapOfMemberCardForMbrUid;
	}

	public List<Member> getActualMember() {
		return actualMember;
	}

	public void setActualMember(List<Member> actualMember) {
		this.actualMember = actualMember;
	}

	
	
	

}
