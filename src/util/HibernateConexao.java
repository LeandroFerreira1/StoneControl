package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateConexao {
	private static final ThreadLocal session = new ThreadLocal();
	private static final SessionFactory sf;
	private static AnnotationConfiguration cfg;
	
	static {
		cfg = new AnnotationConfiguration();
		cfg.configure();
		sf = cfg.buildSessionFactory();		
	}
	
	public static Session getSession() {
		Session s = (Session) session.get();
		if (s != null && s.isOpen()) {
			s.close();
		}
		
		if (s == null || !s.isOpen()) {
			s = sf.openSession();
			session.set(s);
		}
		return s;
	}
	

}
