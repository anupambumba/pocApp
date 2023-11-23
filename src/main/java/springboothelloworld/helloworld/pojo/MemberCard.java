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
public class MemberCard {
	private List<CodeDetails> coverageTypeCd;
	private String recordId;
	private String systemId;
	private String custmrSrvsPhonenNbr;
	private boolean isTransientCard=false;
	private String cardId=null;
	private String idCardEffectiveDate=null;
	private List<TransientCoverage> coverage;
	private VendorStatus vendorStatus=null;
	
	
	public List<CodeDetails> getCoverageTypeCd() {
		return coverageTypeCd;
	}
	public void setCoverageTypeCd(List<CodeDetails> coverageTypeCd) {
		this.coverageTypeCd = coverageTypeCd;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getSystemId() {
		return systemId;
	}
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
	public String getCustmrSrvsPhonenNbr() {
		return custmrSrvsPhonenNbr;
	}
	public void setCustmrSrvsPhonenNbr(String custmrSrvsPhonenNbr) {
		this.custmrSrvsPhonenNbr = custmrSrvsPhonenNbr;
	}
	
	public boolean isTransientCard() {
		return isTransientCard;
	}
	
	public void setTransientCard(boolean isTransientCard) {
		this.isTransientCard = isTransientCard;
	}
	/**
	 * @return the cardId
	 */
	public String getCardId() {
		return cardId;
	}
	/**
	 * @param cardId the cardId to set
	 */
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	/**
	 * @return the coverage
	 */
	public List<TransientCoverage> getCoverage() {
		return coverage;
	}
	/**
	 * @param coverage the coverage to set
	 */
	public void setCoverage(List<TransientCoverage> coverage) {
		this.coverage = coverage;
	}
	/**
	 * @return the vendorStatus
	 */
	public VendorStatus getVendorStatus() {
		return vendorStatus;
	}
	/**
	 * @param vendorStatus the vendorStatus to set
	 */
	public void setVendorStatus(VendorStatus vendorStatus) {
		this.vendorStatus = vendorStatus;
	}
	/**
	 * @return the idCardEffectiveDate
	 */
	public String getIdCardEffectiveDate() {
		return idCardEffectiveDate;
	}
	/**
	 * @param idCardEffectiveDate the idCardEffectiveDate to set
	 */
	public void setIdCardEffectiveDate(String idCardEffectiveDate) {
		this.idCardEffectiveDate = idCardEffectiveDate;
	}
	
	
	
}
