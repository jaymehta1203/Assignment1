
package users;

public class CardInfo {

		String card_id;
		String card_name;
		String card_no;
		String expiration_date;
		/**

		 * @param email
		 * @param password
		 * @param created_at
		 * @param updated_at
		 */
		public CardInfo() {
			// TODO Auto-generated constructor stub
		}
		
		public String getCard_id() {
			return card_id;
		}
		public void setCard_id(String card_id) {
			this.card_id = card_id;
		}
		public String getCard_name() {
			return card_name;
		}
		public void setCard_name(String card_name) {
			this.card_name = card_name;
		}
		public String getCard_no() {
			return card_no;
		}
		public void setCard_no(String card_no) {
			this.card_no = card_no;
		}
		public String getExpiration_date() {
			return expiration_date;
		}
		public void setExpiration_date(String expiration_date) {
			this.expiration_date = expiration_date;
		}
		/**

		 * @param card_id
		 * @param card_name
		 * @param card_no
		 * @param expiration_date
		 */
		public CardInfo(String card_id, String card_name,
				String card_no, String expiration_date) {
			super();
			this.card_id = card_id;
			this.card_name = card_name;
			this.card_no = card_no;
			this.expiration_date = expiration_date;
		}
		

}


