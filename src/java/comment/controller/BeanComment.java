package comment.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import model.*;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author bhajoe
 */
@ManagedBean
@RequestScoped
public class BeanComment {
    
    HelperComment Helper;
    Comment SelectedComment, detailComment;

    DataModel Post, Comment_datamodel;

    HelperComment Comment_Helper;

    Posts SelectedPost, detailPost;
    Comment id_post_comment;
    
     private int id_comment;
     private String name;
     private String email;
     private String content;
     private String date;
     private int id_posts;
    /**
     * Creates a new instance of BeanBuku
     */
    public BeanComment() {
        this.Helper = new HelperComment();
    }


    public DataModel getComment()
    {
        if (this.Comment_datamodel == null)
        {
            this.Comment_datamodel = new ListDataModel();
            this.Comment_datamodel.setWrappedData(this.Helper.getListBuku());
        }
        return this.Comment_datamodel;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_comment() {
        return id_comment;
    }

    public void setId_comment(int id_comment) {
        this.id_comment = id_comment;
    }

    public int getId_posts() {
        return id_posts;
    }

    public void setId_posts(int id_posts) {
        this.id_posts = id_posts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  


    public Comment getDetailComment() {
        return detailComment;
    }
    public void setDetailComment(Comment detailComment) {
        this.detailComment = detailComment;
    }
    public Comment getSelectedComment() {
        return SelectedComment;
    }
    public void setSelectedComment(Comment SelectedComment) {
        this.SelectedComment = SelectedComment;
    }

    public String getSinglePost() {
        detailComment = (Comment) Comment_datamodel.getRowData();
        return "single";
    }
    
    public void rowEditListener(RowEditEvent event)
    {
        Comment updateBuku = (Comment) event.getObject();
        this.Helper.updateBuku(updateBuku);
    }
    
    public String save(ActionEvent event)
    {
        //Buku updateBuku = (Buku) event.getObject();


        Comment NewBuku = new Comment();
        
        NewBuku.setId_comment(id_comment);
        NewBuku.setId_posts(id_posts);
        NewBuku.setName(name);
        NewBuku.setEmail(email);
        NewBuku.setContent(content);
        NewBuku.setDate(date);
        
        this.Helper.saveBuku(NewBuku);

        return "comment";
    }

    public String delete()
    {
        Comment rowData = (Comment) Comment_datamodel.getRowData();

        this.Helper.delComment(rowData);
        
        return "comment?faces-redirect=true";
    }
}
