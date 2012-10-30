package comment.controller;


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
public class HelperComment {

    Session sess = null;
    
    public HelperComment()
    {
        this.sess = WowUtil.getSessionFactory().getCurrentSession();
    }
    
    public List<Buku> getListBuku()
    {
        List<Buku> LstBuku = null;
        try
        {
            Transaction TxBuku = sess.beginTransaction();
            Query q = sess.createQuery("from Comment");
            LstBuku = q.list();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return LstBuku;
    }
    
    public void updateBuku(Comment newBuku)
    {
        try
        {
            Transaction TxBuku = sess.beginTransaction();
            sess.update(newBuku);
            TxBuku.commit();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void saveBuku(Comment newBuku)
    {
        try
        {
            Transaction TxBuku = sess.beginTransaction();
            sess.save(newBuku);
            TxBuku.commit();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void delComment(Comment newComment)
    {
        try
        {
            Transaction TxBuku = sess.beginTransaction();
            sess.delete(newComment);
            TxBuku.commit();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
