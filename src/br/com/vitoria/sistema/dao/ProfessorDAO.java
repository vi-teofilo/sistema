package br.com.vitoria.sistema.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.vitoria.sistema.bean.Professor;
import br.com.vitoria.sistema.util.HibernateUtil;

public class ProfessorDAO extends GenericDAO{

	 @SuppressWarnings("unchecked")
	    public ArrayList<Professor> buscarTodos() throws Exception {

	        ArrayList<Professor> listaRetorno = new ArrayList<Professor>();
	        Session sessao = HibernateUtil.getSessionFactory().openSession();
	        Criteria criteria = sessao.createCriteria(Professor.class);
	        criteria.addOrder(Order.asc("idprofessor"));
	        listaRetorno = (ArrayList<Professor>) criteria.list();

	        return listaRetorno;
	    }

	    @SuppressWarnings("unchecked")
		public ArrayList<Professor> buscarNome(String nome) throws Exception {

	        ArrayList<Professor> listaRetorno = new ArrayList<Professor>();
	        Session sessao = HibernateUtil.getSessionFactory().openSession();
	        Criteria criteria = sessao.createCriteria(Professor.class);
	        criteria.add(Restrictions.ilike("nome", nome + "%"));
	        criteria.addOrder(Order.asc("nome"));
	        listaRetorno = (ArrayList<Professor>) criteria.list();

	        return listaRetorno;
	    }

	    public Professor buscarPorCodigo(int codigo) throws Exception {
	        Session sessao = HibernateUtil.getSessionFactory().openSession();
	        Professor filme = (Professor) sessao.get(Professor.class, codigo);
	        return filme;
	    }
}
