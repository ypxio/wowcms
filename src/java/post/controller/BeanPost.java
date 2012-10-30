package post.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import comment.controller.HelperComment;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
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
public class BeanPost {
    
    DataModel Post_datamodel, Comment;
    
    HelperPost Helper;

    HelperComment Comment_Helper;
    
    Posts SelectedPost, detailPost;
   
    Comment id_post_comment;
    
    int id_post=0;
    String username;
    String title;
    String content;
    String date;

    int comment_id;
    String comment_name;
    String comment_email;
    String comment_content;
    String comment_date;
    int comment_id_post;
//     private int id_posts;

    int cur_id;
    /**
     * Creates a new instance of BeanBuku
     */
    public BeanPost() {
        this.Helper = new HelperPost();
        this.Comment_Helper=new HelperComment();
    }


    public DataModel getPost()
    {
        if (this.Post_datamodel == null)
        {
            this.Post_datamodel = new ListDataModel();
            this.Post_datamodel.setWrappedData(this.Helper.getListPost());
        }
        return this.Post_datamodel;
    }

    public DataModel getComment()
    {
        if (this.Comment == null)
        {
            this.Comment = new ListDataModel();
            this.Comment.setWrappedData(this.Helper.getListComment(this.cur_id));
        }
        return this.Comment;
        
    }

    public Comment getId_post_comment() {
        return id_post_comment;
    }

    public void setId_post_comment(Comment id_post_comment) {
        this.id_post_comment = id_post_comment;
    }

    
    public int getCur_id() {
        return cur_id;
    }

    public void setCur_id(int cur_id) {
        this.cur_id = cur_id;
    }

    public void setIdpost(int cur_id)
    {
        this.cur_id = cur_id;
    }

    public String getSinglePost() {
        detailPost = (Posts) Post_datamodel.getRowData();
        this.cur_id = detailPost.getId_post();
        
        return "single";
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getDate() {
        return Calendar.getInstance().getTime().toString();
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

    
    
    
    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public String getComment_date() {
        return Calendar.getInstance().getTime().toString();
    }

    public void setComment_date(String comment_date) {
        this.comment_date = comment_date;
    }

    public String getComment_email() {
        return comment_email;
    }

    public void setComment_email(String comment_email) {
        this.comment_email = comment_email;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public String getComment_name() {
        return comment_name;
    }

    public void setComment_name(String comment_name) {
        this.comment_name = comment_name;
    }













    public Posts getSelectedPost() {
        return SelectedPost;
    }
    public void setSelectedPost(Posts SelectedPost) {
        this.SelectedPost = SelectedPost;
    }
    
    public Posts getDetailPost() {
        return detailPost;
    }
    public void setDetailPost(Posts detailPost) {
        this.detailPost = detailPost;
    }

    
    
    public void rowEditListener(RowEditEvent event)
    {
        Posts updatePost = (Posts) event.getObject();
        this.Helper.updatePost(updatePost);
    }
    
    public String save()
    {
        Posts NewPosts = new Posts();
        
        NewPosts.setId_post(this.id_post);
        NewPosts.setUsername("yurigantengs");
        NewPosts.setTitle(this.title);
        NewPosts.setContent(this.content);
        NewPosts.setDate(this.date);
        
        this.Helper.savePost(NewPosts);

        return "post?faces-redirect=true";
    }

    public String delete()
    {
        detailPost = (Posts) Post_datamodel.getRowData();

        this.Helper.delPost(detailPost);
        return "post?faces-redirect=true";


    }

    

    public String save_comment()
    {

        Comment NewComment = new Comment();

        NewComment.setId_comment(comment_id);
        NewComment.setName(comment_name);
        NewComment.setEmail(comment_email);
        NewComment.setContent(comment_content);
        NewComment.setDate(comment_date);
        NewComment.setId_posts(this.cur_id);

        this.Comment_Helper.saveBuku(NewComment);

        return "home?faces-redirect=true";
    }
}
