package sistem_birocratic;

import sistem_birocratic.entity.Document;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Document> drivingLicenceAnnexList = new ArrayList<Document>();
		drivingLicenceAnnexList.add(new Document("annex1", null));
		drivingLicenceAnnexList.add(new Document("annex2", null));
		Document doc = new Document("Document1", drivingLicenceAnnexList);
		System.out.println(doc.checkDocument());
		for(Document document : doc.getIntermediateDocumentList()){
			document.setDocumentState(true);
		}
		System.out.println(doc.checkDocument());
		doc.setDocumentState(true);
		System.out.println(doc.checkDocument());
	}

}
