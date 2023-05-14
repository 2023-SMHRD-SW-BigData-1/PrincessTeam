package DTO;

public class playerDTO {

		private String name;
		private int power;
		
		
		public playerDTO(String n, int p) {
			this.name = n;
			this.power = p;
			
		}
			


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getPower() {
			return power;
		}


		public void setPower(int power) {
			this.power = power;
		}

}
