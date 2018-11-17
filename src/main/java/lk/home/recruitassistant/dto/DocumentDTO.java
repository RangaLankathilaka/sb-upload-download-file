package lk.home.recruitassistant.dto;



public class DocumentDTO {

    private int documentId;
    private String documentName;
    private String documentPath;

    public DocumentDTO() {
    }

    public DocumentDTO(String documentName, String documentPath) {
        this.documentName = documentName;
        this.documentPath = documentPath;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentPath() {
        return documentPath;
    }

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId=" + documentId +
                ", documentName='" + documentName + '\'' +
                ", documentPath='" + documentPath + '\'' +
                '}';
    }
}

