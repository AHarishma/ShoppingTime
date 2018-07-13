package collections.shoppingcart;
import java.lang.Object;
import java.util.Objects;


public class Product {
	private Integer pid;
	private String name;
	private Double price;
	private Integer stock;
 public Product()
 {
	 
 }
 public Product(Integer pid,String  name,Double price,Integer stock)
 {this.pid=pid;
	this.name=name;
	this.price=price;
	 this.stock=stock;
	 
 }
 //getter and setter methods
 /*
  * @return pid
  */
 public Integer getPid()
 {
	 return this.pid;
	 
 }
 /*
  * @param pid the pid to set
  */
 public void setPid(int pid)
 {
	 this.pid=pid;
 }
 public String getName()
 {
	 return this.name;
	 
 }
 
 public void setName(String name)
 {
	 this.name=name;
 }
 
 public Double getPrice()
 {
	 return this.price;
	 
 }
 
 public void setPrice(Double price)
 {
	 this.price=price;
 }
 
 public Integer getStock()
 {
	 return this.stock;	 
 }
 
 public void setStock(Integer stock)
 {
	 this.stock=stock;
 }
 
 
 @Override
 public boolean equals(Object obj)
 {
	if(this==obj)
		return true;
	if(obj==null)
		return false;
	if(this.getClass()!=obj.getClass())
	{
		return false;
	}
	final Product other=(Product)obj;
	if(!Objects.equals(this.pid,other.pid))
		return false;
	if(!Objects.equals(this.name,other.name))
		return false;
	if(!Objects.equals(this.price,other.price))
		return false;
	if(!Objects.equals(this.stock,other.stock))
		return false;
	return true;
 }
 
 @Override
 public int hashCode()
 {
	 int hash=7;
	 hash=29*hash+Objects.hashCode(this.pid);
	 hash=29*hash+Objects.hashCode(this.name);
	 hash=29*hash+Objects.hashCode(this.price);
	 hash=29*hash+Objects.hashCode(this.stock);
	 return hash;
 }
}
