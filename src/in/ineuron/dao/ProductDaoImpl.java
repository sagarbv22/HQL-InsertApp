package in.ineuron.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import in.ineuron.util.HibernateUtil;

public class ProductDaoImpl implements IProductDao {

	@Override
	public String transferRecord(Integer cost) {

		Session session = null;
		Transaction txt = null;
		boolean flag = false;
		int insertedRows = 0;
		try {

			session = HibernateUtil.getSession();
			txt = session.beginTransaction();
			Query query = session.getNamedQuery("insert");

			query.setParameter("cost", cost);

			insertedRows = query.executeUpdate();
			flag = true;

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				txt.commit();
				return insertedRows + " RECORDS TRANSFERED SUCCESSFULLY";
			} else {
				txt.rollback();
				return "Failed to Transfered";
			}

		}

	}

}
