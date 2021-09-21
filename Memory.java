public class Memory {

	public static void main(String[] args) {
		System.out.println(memorySize("32GB"));
		System.out.println(memorySize("2GB"));
		System.out.println(memorySize("512MB"));
	}
	
	public static String actualMemorySize(String m) {
		String type = m.substring(m.length()-2);
		String amount = m.substring(0,m.length()-2);
		int iamount = Integer.parseInt(amount);
		double size = iamount * 0.93;
		
		if(type.equals("MB")) {
			return String.valueOf(Math.round(size))+type;
		}
		return String.format("%.2f", size) + type;
	}

}