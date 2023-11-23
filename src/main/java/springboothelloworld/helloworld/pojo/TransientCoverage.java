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
 * @author Anupam Sarkar
 *
 */
public class TransientCoverage {

	private String subGroupId=null;
	private String planNm=null;
	private String prodCd=null;
	private List<CodeDetails> coverageTypeCd;
	private List<RXDetails> rxDetails;
	/**
	 * @return the subGroupId
	 */
	public String getSubGroupId() {
		return subGroupId;
	}
	/**
	 * @param subGroupId the subGroupId to set
	 */
	public void setSubGroupId(String subGroupId) {
		this.subGroupId = subGroupId;
	}
	/**
	 * @return the planNm
	 */
	public String getPlanNm() {
		return planNm;
	}
	/**
	 * @param planNm the planNm to set
	 */
	public void setPlanNm(String planNm) {
		this.planNm = planNm;
	}
	/**
	 * @return the prodCd
	 */
	public String getProdCd() {
		return prodCd;
	}
	/**
	 * @param prodCd the prodCd to set
	 */
	public void setProdCd(String prodCd) {
		this.prodCd = prodCd;
	}
	/**
	 * @return the coverageTypeCd
	 */
	public List<CodeDetails> getCoverageTypeCd() {
		return coverageTypeCd;
	}
	/**
	 * @param coverageTypeCd the coverageTypeCd to set
	 */
	public void setCoverageTypeCd(List<CodeDetails> coverageTypeCd) {
		this.coverageTypeCd = coverageTypeCd;
	}
	/**
	 * @return the rxDetails
	 */
	public List<RXDetails> getRxDetails() {
		return rxDetails;
	}
	/**
	 * @param rxDetails the rxDetails to set
	 */
	public void setRxDetails(List<RXDetails> rxDetails) {
		this.rxDetails = rxDetails;
	}
	
	
}
