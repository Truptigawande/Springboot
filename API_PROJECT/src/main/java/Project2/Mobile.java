package Project2;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
public class Mobile {

	@Id
	Integer price;
	Integer speed;
	
	public Mobile() {
		super();
	}
	
	public Mobile(Integer price, Integer speed) {
		super();
		this.price = price;
		this.speed = speed;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Mobile [price=" + price + ", speed=" + speed + "]";
	}

	
	
}
