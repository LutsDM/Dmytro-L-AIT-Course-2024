package homework_27.marathon.document_archive.dao;

import homework_27.marathon.document_archive.model.Document;

public interface Archive {

    boolean addDocument(Document document);

    void print();

    void printDocument(Document[] documents);

    Document findDocument(long id);

    Document[] findDocumentByAuthor (String author);

    Document[] findDocumentByTitle (String title);

    Document removeDocument (long id);

    int size();

}
