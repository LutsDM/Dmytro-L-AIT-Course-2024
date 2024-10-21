package homework_27.marathon.document_archive.dao;

import homework_27.marathon.document_archive.model.Document;

import java.util.function.Predicate;

public class ArchiveImpl implements Archive {

    private Document[] documents;
    private int size;

    public ArchiveImpl(int capacity) {
        this.documents = new Document[capacity];
        this.size = 0;
    }

    public boolean addDocument (Document document) {
        if (document == null) {
            return false;
        }
        if (size == documents.length) {
            return false;
        }
        if (!(findDocument(document.getId()) == null)) {
            return false;
        }

        documents[size] = document;
        size++;
        return true;
    }

    public void print (){
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }
    }


    public void printDocument (Document[] documents) {
        for (Document document : documents) {
            if (document != null) {
                System.out.println(document);
            }
        }
    }

    public Document findDocument(long id){
        for (int i = 0; i < size; i++) {
            if(documents[i].getId() == id) {
                return documents[i];
            }
        }
        return null;
    }

    @Override
    public Document[] findDocumentByAuthor(String author) {
        return findDocumentByPredicate(document -> document.getAuthor().equals(author));
    }

    @Override
    public Document[] findDocumentByTitle(String title) {
        return findDocumentByPredicate(document -> document.getTitle().equals(title));
    }

    public Document removeDocument (long id) {
        for (int i = 0; i < size; i++) {
            if(documents[i].getId() == id){
                Document victim = documents[i];
                documents[i] = documents[size - 1];
                documents[size -1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    public int size() {

        return size;
    }

    private Document[] findDocumentByPredicate (Predicate<Document> predicate) {
        int count  = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(documents[i])) {
                count++;
            }
        }

        Document[] res = new Document[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(documents[i])){
                res[j++] = documents[i];
            }
        }
        return res;

    }

}
