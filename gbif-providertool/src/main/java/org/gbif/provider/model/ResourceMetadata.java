/***************************************************************************
* Copyright (C) 2008 Global Biodiversity Information Facility Secretariat.
* All Rights Reserved.
*
* The contents of this file are subject to the Mozilla Public
* License Version 1.1 (the "License"); you may not use this file
* except in compliance with the License. You may obtain a copy of
* the License at http://www.mozilla.org/MPL/
*
* Software distributed under the License is distributed on an "AS
* IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
* implied. See the License for the specific language governing
* rights and limitations under the License.

***************************************************************************/

package org.gbif.provider.model;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Lob;

/**
 * A generic resource describing any digitial, online and non digital available biological resources
 * Should be replaced by a proper GBRDS model class.
 * Lacking most properties and multilingual abilities
 * @author markus
 *
 */
@Embeddable
public class ResourceMetadata{
	protected String link;
	protected String emlUrl;
	protected String title;
	protected String description;
	protected String contactName;
	protected String contactEmail;

	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getEmlUrl() {
		return emlUrl;
	}
	public void setEmlUrl(String emlUrl) {
		this.emlUrl = emlUrl;
	}
	
	@Column(length=128)
	@org.hibernate.annotations.Index(name="title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Lob
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
	
	@Column(length=128)
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	@Column(length=64)
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	

}
