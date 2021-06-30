package hu.webuni.airport.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "airport")
@Component
public class AirportConfigProperties {
	
	private Discount discount = new Discount();
	
	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public static class Discount {
		private Default def;
		private Special secial;
		public Default getDef() {
			return def;
		}
		public void setDef(Default def) {
			this.def = def;
		}
		public Special getSecial() {
			return secial;
		}
		public void setSecial(Special secial) {
			this.secial = secial;
		}
		
	}
	
	public static class Default{
		private int percent;

		public int getPercent() {
			return percent;
		}
		public void setPercent(int percent) {
			this.percent = percent;
		}
	}
	
	public static class Special{
		private int percent;
		private int limit;
		
		public int getPercent() {
			return percent;
		}
		public void setPercent(int percent) {
			this.percent = percent;
		}
		public int getLimit() {
			return limit;
		}
		public void setLimit(int limit) {
			this.limit = limit;
		}
	}	
}
