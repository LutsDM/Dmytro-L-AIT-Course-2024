package homework_24.document_archive.dao;

import homework_24.document_archive.model.Document;

public interface Archive {

    boolean addDocument(Document document);

    void printDocuments();

    Document findDocument(long id);

    Document removeDocument (long id);

    int size();

}
