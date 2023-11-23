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

/**
 * Anthem National Coverage Period - Code details
 * @author ShishirKumar
 *
 */
public class CodeDetails {
	private String code;
	private String name;
	private String description;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	// 17/Feb/22 - wave 16, added to check values
	@Override
	public String toString() {
		return "CodeDetails [code=" + code + ", name=" + name + ", description=" + description + "]";
	}
}
