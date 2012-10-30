/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import model.Buku;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author bhajoe
 */
@ManagedBean
@RequestScoped
public class BeanBuku {
    
    DataModel Book;
    BookHelper Helper;
    Buku SelectedBuku, detailPost;
    
    int id_post;
    String username;
    String title;
    String content;
    String date;
    /**
     * Creates a new instance of BeanBuku
     */
    public BeanBuku() {
        this.Helper = new BookHelper();
    }


    public DataModel getBuku()
    {
        if (this.Book == null)
        {
            this.Book = new ListDataModel();
            this.Book.setWrappedData(this.Helper.getListBuku());
        }
        return this.Book;
    }

    public int getBukuId() {
        return id_post;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    
    public Buku getSelectedBuku()
    {
        return this.SelectedBuku;
    }
    
    public void setSelectedBuku(Buku curBuku)
    {
        this.SelectedBuku = curBuku;
//        Book.getRowData();
    }

    public Buku getDetailPost() {
        return detailPost;
    }

    public void setDetailPost(Buku detailPost) {
        this.detailPost = detailPost;
    }

    public String getSinglePost() {
        detailPost = (Buku) Book.getRowData();
        return "single";
    }
    
//    public void rowEditListener(RowEditEvent event)
//    {
//        Buku updateBuku = (Buku) event.getObject();
//        this.Helper.updateBuku(updateBuku);
//    }
    
    public void save()
    {
        //Buku updateBuku = (Buku) event.getObject();
        
        Buku NewBuku = new Buku();
        
        NewBuku.setId_post(this.id_post);
        NewBuku.setUsername(this.username);
        NewBuku.setTitle(this.title);
        NewBuku.setContent(this.content);
        NewBuku.setDate(this.date);
        
        this.Helper.saveBuku(NewBuku);
    }
}
