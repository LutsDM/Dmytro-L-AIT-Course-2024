package homework_27.marathon.document_archive;


import homework_27.marathon.book_library.entity.Book;
import homework_27.marathon.document_archive.dao.Archive;
import homework_27.marathon.document_archive.dao.ArchiveImpl;
import homework_27.marathon.document_archive.model.Document;

public class ArhiveAppl {
    public static void main(String[] args) {

        Document[] docs = new Document[6];
        Archive archive = new ArchiveImpl(7);

        docs[0] = new Document(1_111_111_110L,"T1","A1", 2001);
        docs[1] = new Document(1_111_111_111L,"T1","A2", 2022);
        docs[2] = new Document(1_111_111_112L,"T2","A2", 2015);
        docs[3] = new Document(1_111_111_113L,"T3","A3", 2018);
        docs[4] = new Document(1_111_111_114L,"T2","A1", 2019);
        docs[5] = new Document(1_111_111_115L,"T3","A2", 2001);

        for (int i = 0; i < docs.length; i++) {
            archive.addDocument(docs[i]);
        }

        System.out.println("All documents in the archive:");
        archive.print();
        System.out.println("Size of archive: " + archive.size());
        System.out.println("----------------------------");

        // Добавление документа
        Document newDocs = new Document(1_111_111_116L, "T4","A4", 2011);
        archive.addDocument(newDocs);

        // Печать всех документов
        System.out.println("Archive with new docs:");
        archive.print();
        System.out.println("Size of archive: " + archive.size());
        System.out.println("----------------------------");

        // Поиск документов по автору
        System.out.println("\nDocuments by author A2:");
        Document[] docsByAuthor = archive.findDocumentByAuthor("A2");
        archive.printDocument(docsByAuthor);

        // Поиск документов по названию
        System.out.println("\nDocuments with title T2:");
        Document[] docsByTitle = archive.findDocumentByTitle("T2");
        archive.printDocument(docsByTitle);

        // Удаление документа по ID
        System.out.println("\nRemoving document with ID 3:");
        archive.removeDocument(1_111_111_113L);
        archive.print();

        // Размер архива после удаления
        System.out.println("\nSize of archive after deletion: " + archive.size());
    }
}


