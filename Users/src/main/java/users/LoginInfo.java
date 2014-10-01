package users;

public class LoginInfo {

		String login_id;
		String url;
		String login;

		String password;
		public String getLogin_id() {
			return login_id;
		}
		public void setLogin_id(String login_id) {
			this.login_id = login_id;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		/**
		 * @param login_id
		 * @param url
		 * @param login
		 * @param password
		 */
		public LoginInfo(String login_id, String url, String login,
				String password) {
			super();
			this.login_id = login_id;
			this.url = url;
			this.login = login;
			this.password = password;
		}
		public LoginInfo(){
			
		}
}
