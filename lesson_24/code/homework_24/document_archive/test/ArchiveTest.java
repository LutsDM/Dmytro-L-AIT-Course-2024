package homework_24.document_archive.test;

import homework_24.document_archive.dao.ArchiveImpl;
import homework_24.document_archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveTest {

    ArchiveImpl archive;

    Document[] documents;
    int size = 0;

    @BeforeEach
    void setUp() {

        archive = new ArchiveImpl(5);
        documents = new Document[5];

        documents[0] = new Document(1_111_111_110L,"T0","A0",1998);
        documents[1] = new Document(1_111_111_111L,"T2","A2",2024);
        documents[2] = new Document(1_111_111_112L,"T3","A3",1501);
        documents[3] = new Document(1_111_111_113L,"T4","A4",1789);

        for (int i = 0; i < documents.length - 1; i++) {
            archive.addDocument(documents[i]);
        }
    }

    @Test
    void addDocumentTest() {
        assertFalse(archive.addDocument(null));
        assertFalse(archive.addDocument(documents[3]));
        Document newDocument = new Document(1_111_111_115L,"T5", "A5", 2001);
        assertTrue(archive.addDocument(newDocument));
        assertEquals(5, archive.size());
        Document oneMoreDocument = new Document(1_111_111_115L,"T6", "A7", 2000);
        assertFalse(archive. addDocument(oneMoreDocument));
    }


    @Test
    void removeDocumentTest(){
        assertEquals(documents[0], archive.removeDocument(1_111_111_110L));
        assertEquals( 3, archive.size());
        assertNull(archive.removeDocument(1_111_111_111_119L));
    }

    @Test
    void sizeTest(){
        assertEquals(4, archive.size());
    }

    @Test
    void printDocumentTest(){
        System.out.println("=========================");
        archive.printDocuments();
    }

    @Test
    void testValidYears(){
       Document invalidYearDocument = new Document(1_111_111_115L,"T5","A5",1499);
        archive.addDocument(documents[4]);
        assertEquals(-1, invalidYearDocument.getYearsOfCreate());
        assertFalse(archive.addDocument(documents[4]));
        assertEquals(4, archive.size());
    }
}