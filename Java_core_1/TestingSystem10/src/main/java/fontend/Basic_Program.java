package fontend;

import java.io.IOException;
import java.sql.SQLException;

import backend.Exercise1_Basic;

public class Basic_Program {
	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		Exercise1_Basic bs = new Exercise1_Basic();
		bs.Question1();
		bs.Question2();
		bs.Question3();
		bs.Question4();
		bs.Question5();
	}

}
