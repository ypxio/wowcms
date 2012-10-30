package model;
// Generated Jun 20, 2012 11:34:37 AM by Hibernate Tools 3.2.1.GA



/**
 * Comment generated by hbm2java
 */
public class Comment implements java.io.Serializable {


     private Integer id_comment;
     private String name;
     private String email;
     private String content;
     private String date;
     private Integer id_posts;

    public Comment() {
    }

    public Comment(Integer id_comment, String name, String email, String content, String date, Integer id_posts) {
        this.id_comment = id_comment;
        this.name = name;
        this.email = email;
        this.content = content;
        this.date = date;
        this.id_posts = id_posts;
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

    public Integer getId_comment() {
        return id_comment;
    }

    public void setId_comment(Integer id_comment) {
        this.id_comment = id_comment;
    }

    public Integer getId_posts() {
        return id_posts;
    }

    public void setId_posts(Integer id_posts) {
        this.id_posts = id_posts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	
//    public Comment(String idComment) {
//        this.id_comment = idComment;
//    }

   




}

