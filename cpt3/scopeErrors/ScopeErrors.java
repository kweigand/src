package cpt3.scopeErrors;

public class ScopeErrors {

	/**
	 * @param args
	 */
	// int x = 5;
	public static void main(String[] args) {
		ScopeErrors s = new ScopeErrors();
		s.go();

	}
	void go() {
		int y = 5;
		go2();
		y++;
	}
	void go2() {
		y++;
	}

}
