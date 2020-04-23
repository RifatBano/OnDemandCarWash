package com.cg.casestudy.carwash.entity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CustomerLogin")
public class CustomerCarWashEntity{
		/**
	 * 
	 */
		private String customername;
		private String password;
		public CustomerCarWashEntity(String customername, String password) {
			super();
			this.customername = customername;
			this.password = password;
		}
		
		
		public void setCustomername(String customername) {
			this.customername = customername;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getCustomername() {
			return customername;
		}
		public String getPassword() {
			return password;
		}
		
}
