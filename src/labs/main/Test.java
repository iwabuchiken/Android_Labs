package labs.main;

import java.io.File;

import jmtp.*;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi");
		
		_test_IFM11_D_27();
		
//		Test.message("abc", 10);
		
	}

	private static void _test_IFM11_D_27() {

		File f = new File("f:\\");
		
		if (!f.exists()) {
			
			int line = Thread.currentThread().getStackTrace()[1].getLineNumber();
			
			Test.message("f:\\ => doesn't exist", line);
			
		} else {

			int line = Thread.currentThread().getStackTrace()[1].getLineNumber();
//			int line = Thread.currentThread().getStackTrace()[2].getLineNumber();
			
			Test.message("f:\\ => exists", line);
			
			String msg;

			String[] fnames = f.list();
			
			for (int i = 0; i < fnames.length; i++) {
				
				line = Thread.currentThread().getStackTrace()[1].getLineNumber();
//				int line = Thread.currentThread().getStackTrace()[2].getLineNumber();
				
				msg = "name => " + fnames[i];
				
				Test.message(msg, line);
				
			}

		}

	}
	
	private static void _test_IFM11_D_27_done() {
		// TODO Auto-generated method stub
		
		PortableDeviceManager manager = new PortableDeviceManager();
		
		PortableDevice device = manager.getDevices()[0];
		
//		device.getFriendlyName()
		
	}

	private static void 
	message
	(String msg, int line) {
		
//		int num = Thread.currentThread().getStackTrace()[2].getLineNumber();

		String tmp = String.format("[%d] %s", line, msg);
//		String tmp = String.format("[%d] %s", num, msg);

		System.out.println(tmp);
		
	}//message
}
