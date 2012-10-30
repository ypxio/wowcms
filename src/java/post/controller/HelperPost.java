package post.controller;


import java.util.List;
import model.*;
import util.WowUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhajoe
 */
public class HelperPost {

    Session sess = null;
    
    public HelperPost()
    {
        this.sess = WowUtil.getSessionFactory().getCurrentSession();
    }
    
    public List<Posts> getListPost()
    {
        List<Posts> LstPost = null;
        try
        {
            Transaction TxBuku = sess.beginTransaction();
            Query q = sess.createQuery("from Posts order by id_post desc");
            LstPost = q.list();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return LstPost;
    }

    public List<Comment> getListComment(int cur_id)
    {
        List<Comment> LstComment = null;
        try
        {
            Transaction TxBuku = sess.beginTransaction();
            Query q = sess.createQuery("from Comment where id_posts='"+cur_id+"'");
            LstComment = q.list();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return LstComment;
    }
    
    public void updatePost(Posts newPosts)
    {
        try
        {
            Transaction TxBuku = sess.beginTransaction();
            sess.update(newPosts);
            TxBuku.commit();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void savePost(Posts newPosts)
    {
        try
        {
            Transaction TxBuku = sess.beginTransaction();
            sess.save(newPosts);
            TxBuku.commit();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void delPost(Posts asd)
    {
        try
        {
            Transaction TxBuku = sess.beginTransaction();
            sess.delete(asd);
            TxBuku.commit();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
