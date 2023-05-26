package Project.First;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.fabric.xmlrpc.base.Array;


@RestController
public class MobileController {

	@Autowired
	SessionFactory factory;
	
	@RequestMapping("getData")
	public List<Mobile> getData()
	{
	List<Mobile> arrayList = factory.openSession().createCriteria(Mobile.class).list();
	
	
	TreeSet<Mobile> ts = new TreeSet(new SortOnPrice());
	
	for (Mobile mobile : arrayList) 
	{
	int price = mobile.price;
	
	if(price>=15 && price<=30)
		ts.add(mobile);
	}
	
	//System.out.println(ts);
	
	ArrayList m = new ArrayList(ts);
		return m;
	}
}
