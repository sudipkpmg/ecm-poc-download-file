package gov.tn.dhs.ecm.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("box")
public class AppProperties {

    private String clientID;
    private String clientSecret;
    private String publicKeyID;
    private String privateKey;
    private String passphrase;
    private String enterpriseID;
    private String parentFolderID;

    private String downloadOneUserID;
    private String downloadTwoUserID;
    private String downloadThreeUserID;

    private String ConfidentialFolder;
    private String NotificationsFolder;
    private String ApplicationFolder;
    private String UploadFolder;
    private String VerifiedDocumentFolder;

    private int maxCitizensFoldersPerSubfolder;
    private int citizensFolderIterationLookback;

    private String citizenMetadataTemplate;
    private String faSnapMetadataTemplate;
    private String childCareMetadataTemplate;

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getPublicKeyID() {
        return publicKeyID;
    }

    public void setPublicKeyID(String publicKeyID) {
        this.publicKeyID = publicKeyID;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    public String getEnterpriseID() {
        return enterpriseID;
    }

    public void setEnterpriseID(String enterpriseID) {
        this.enterpriseID = enterpriseID;
    }

    public String getParentFolderID() {
        return parentFolderID;
    }

    public void setParentFolderID(String parentFolderID) {
        this.parentFolderID = parentFolderID;
    }

    public String getDownloadOneUserID() {
        return downloadOneUserID;
    }

    public void setDownloadOneUserID(String downloadOneUserID) {
        this.downloadOneUserID = downloadOneUserID;
    }

    public String getDownloadTwoUserID() {
        return downloadTwoUserID;
    }

    public void setDownloadTwoUserID(String downloadTwoUserID) {
        this.downloadTwoUserID = downloadTwoUserID;
    }

    public String getDownloadThreeUserID() {
        return downloadThreeUserID;
    }

    public void setDownloadThreeUserID(String downloadThreeUserID) {
        this.downloadThreeUserID = downloadThreeUserID;
    }

    public String getConfidentialFolder() {
        return ConfidentialFolder;
    }

    public void setConfidentialFolder(String confidentialFolder) {
        ConfidentialFolder = confidentialFolder;
    }

    public String getNotificationsFolder() {
        return NotificationsFolder;
    }

    public void setNotificationsFolder(String notificationsFolder) {
        NotificationsFolder = notificationsFolder;
    }

    public String getApplicationFolder() {
        return ApplicationFolder;
    }

    public void setApplicationFolder(String applicationFolder) {
        ApplicationFolder = applicationFolder;
    }

    public String getUploadFolder() {
        return UploadFolder;
    }

    public void setUploadFolder(String uploadFolder) {
        UploadFolder = uploadFolder;
    }

    public String getVerifiedDocumentFolder() {
        return VerifiedDocumentFolder;
    }

    public void setVerifiedDocumentFolder(String verifiedDocumentFolder) {
        VerifiedDocumentFolder = verifiedDocumentFolder;
    }

    public int getMaxCitizensFoldersPerSubfolder() {
        return this.maxCitizensFoldersPerSubfolder;
    }

    public void setMaxCitizensFoldersPerSubfolder(int maxCitizensFoldersPerSubfolder) {
        this.maxCitizensFoldersPerSubfolder = maxCitizensFoldersPerSubfolder;
    }

    public int getCitizensFolderIterationLookback() {
        return this.citizensFolderIterationLookback;
    }

    public void setCitizensFolderIterationLookback(int citizensFolderIterationLookback) {
        this.citizensFolderIterationLookback = citizensFolderIterationLookback;
    }

    public String getCitizenMetadataTemplate() {
        return citizenMetadataTemplate;
    }

    public void setCitizenMetadataTemplate(String citizenMetadataTemplate) {
        this.citizenMetadataTemplate = citizenMetadataTemplate;
    }

    public String getFaSnapMetadataTemplate() {
        return faSnapMetadataTemplate;
    }

    public void setFaSnapMetadataTemplate(String faSnapMetadataTemplate) {
        this.faSnapMetadataTemplate = faSnapMetadataTemplate;
    }

    public String getChildCareMetadataTemplate() {
        return childCareMetadataTemplate;
    }

    public void setChildCareMetadataTemplate(String childCareMetadataTemplate) {
        this.childCareMetadataTemplate = childCareMetadataTemplate;
    }

}
