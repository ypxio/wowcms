/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import model.Buku;

/**
 *
 * @author bhajoe
 */
@ManagedBean
@SessionScoped
public class BookBean implements Serializable {
    
    BookHelper helper;
    DataModel Books;
    Buku current;
    
    private int selectedItemIndex;
    /**
     * Creates a new instance of BookBean
     */
    public BookBean() {
        this.helper = new BookHelper();
    }
    
    public DataModel getBook()
    {
        if (this.Books == null)
        {
            this.Books = new ListDataModel();
            this.Books.setWrappedData(this.helper.getListBuku());
        }
        return this.Books;
    }
    
    public void prepareView(){
        this.current = (Buku) this.getBook().getRowData();
    }
    
    public Buku getChoosen() {
        return current;
    }
}
