package classwork_35.ait.album.dao;

import classwork_35.ait.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Album {

    boolean addPhoto(Photo photo);
    boolean removePhoto(int albumId, int photoId);
    boolean updatePhoto(int albumId, int photoId, String url);
    Photo getPhotoFromAlbum(int albumId, int photoId);
    Photo[] getAllPhotoFromAlbum(int albumId);
    Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();
    void printArrayFoto();

}
