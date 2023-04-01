package in.ineuron.test;

import in.ineuron.dao.IProductDao;
import in.ineuron.dao.ProductDaoImpl;
import in.ineuron.util.HibernateUtil;

public class InsertApp {

	public static void main(String[] args) {

		IProductDao dao = new ProductDaoImpl();

		System.out.println(dao.transferRecord(15000));

		HibernateUtil.closeSessionFactory();
	}

}
