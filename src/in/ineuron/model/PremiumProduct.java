package in.ineuron.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "insert",query = "INSERT INTO in.ineuron.model.PremiumProduct(pid,pname,pcost,pqty) SELECT i.pid,i.pname,i.pcost,i.pqty FROM in.ineuron.model.Product as i WHERE i.pcost>=:cost")
public class PremiumProduct implements Serializable {
	
	@Id
	private Integer pid;
	private String pname;
	private Integer pcost;
	private Integer pqty;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPcost() {
		return pcost;
	}

	public void setPcost(Integer pcost) {
		this.pcost = pcost;
	}

	public Integer getPqty() {
		return pqty;
	}

	public void setPqty(Integer pqty) {
		this.pqty = pqty;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + ", pqty=" + pqty + "]";
	}

}
