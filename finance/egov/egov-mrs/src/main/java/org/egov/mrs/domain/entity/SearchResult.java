/*
 * eGov suite of products aim to improve the internal efficiency,transparency,
 *    accountability and the service delivery of the government  organizations.
 *
 *     Copyright (C) <2015>  eGovernments Foundation
 *
 *     The updated version of eGov suite of products as by eGovernments Foundation
 *     is available at http://www.egovernments.org
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program. If not, see http://www.gnu.org/licenses/ or
 *     http://www.gnu.org/licenses/gpl.html .
 *
 *     In addition to the terms of the GPL license to be adhered to in using this
 *     program, the following additional terms are to be complied with:
 *
 *         1) All versions of this program, verbatim or modified must carry this
 *            Legal Notice.
 *
 *         2) Any misrepresentation of the origin of the material is prohibited. It
 *            is required that all modified versions of this material be marked in
 *            reasonable ways as different from the original version.
 *
 *         3) This license does not grant any rights to any user of the program
 *            with regards to rights under trademark law for use of the trade names
 *            or trademarks of eGovernments Foundation.
 *
 *   In case of any queries, you can reach eGovernments Foundation at contact@egovernments.org.
 */


package org.egov.mrs.domain.entity;

import java.util.Date;

public class SearchResult {
    
    private Long registrationId;
    private String registrationNo;
    private Date registrationDate;
    private Date dateOfMarriage;
    private String husbandName;
    private String wifeName;
    private boolean certificateIssued;
    private String status;
    private Double feePaid;
    private boolean feeCollectionPending;
    
    public Long getRegistrationId() {
        return registrationId;
    }
    
    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }
    
    public String getRegistrationNo() {
        return registrationNo;
    }
    
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }
    
    public Date getRegistrationDate() {
        return registrationDate;
    }
    
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    
    public Date getDateOfMarriage() {
        return dateOfMarriage;
    }
    
    public void setDateOfMarriage(Date dateOfMarriage) {
        this.dateOfMarriage = dateOfMarriage;
    }
    
    public String getHusbandName() {
        return husbandName;
    }
    
    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }
    
    public String getWifeName() {
        return wifeName;
    }
    
    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }
    
    public boolean isCertificateIssued() {
        return certificateIssued;
    }
    
    public void setCertificateIssued(boolean certificateIssued) {
        this.certificateIssued = certificateIssued;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public Double getFeePaid() {
        return feePaid;
    }
    
    public void setFeePaid(Double feePaid) {
        this.feePaid = feePaid;
    }

    public boolean isFeeCollectionPending() {
        return feeCollectionPending;
    }
    
    public void setFeeCollectionPending(boolean feeCollectionPending) {
        this.feeCollectionPending = feeCollectionPending;
    }
}
