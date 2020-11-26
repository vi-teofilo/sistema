package br.com.vitoria.sistema.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.vitoria.sistema.bean.Aluno;
import br.com.vitoria.sistema.util.HibernateUtil;

public class AlunoDAO extends GenericDAO{


    @SuppressWarnings("unchecked")
    public ArrayList<Aluno> buscarTodos() throws Exception {
        ArrayList<Aluno> listaRetorno = new ArrayList<Aluno>();
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = sessao.createCriteria(Aluno.class);
        criteria.addOrder(Order.asc("idaluno"));
        listaRetorno = (ArrayList<Aluno>) criteria.list();
        return listaRetorno;
    }
    
    @SuppressWarnings("unchecked")
	public ArrayList<Aluno> buscarNome(String nome) throws Exception {
        ArrayList<Aluno> listaRetorno = new ArrayList<Aluno>();
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = sessao.createCriteria(Aluno.class);
        criteria.add(Restrictions.ilike("nome", nome + "%"));
        criteria.addOrder(Order.asc("nome"));
        listaRetorno = (ArrayList<Aluno>) criteria.list();
        return listaRetorno;
    }
}
