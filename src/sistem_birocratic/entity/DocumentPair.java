package sistem_birocratic.entity;

import java.util.List;

public class DocumentPair {
    private String documentName;
    private List<Document> documentList;

    public DocumentPair(String documentName, List<Document> annexList){
        this.documentName = documentName;
        this.documentList = annexList;
    }
    //getters
    public String getDocumentName(){
        return documentName;
    }
    public List<Document> getDocumentList(){
        return documentList;
    }
    //setters
    public void setDocumentName(String documentName){
        this.documentName = documentName;
    }
    public void setAnnexList(List<Document> annexList){
        this.documentList = annexList;
    }

    public void addAnnex(Document annex){
        documentList.add(annex);
    }
}
