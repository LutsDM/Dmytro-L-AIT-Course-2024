package homework_24.document_archive.controller;
//Реализовать методы:
//        - печать списка всех документов в архиве; +
//        - получение кол-ва документов в архиве; +
//        - поиска поиск документа по id; +
//        - добавление документа в архив с учетом требований:
//           - не добавлять null
//           - не добавлять дубликат
//           - не добавлять больше, чем может вместить в себя архив.
//        - удаление документа из архива.


import homework_24.document_archive.model.Document;

public class Archive {

    private Document[] documents;
    private int size;

    public Archive(int capacity) {
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

    public void printDocuments (){
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
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

}
