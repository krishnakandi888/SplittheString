public class Split {
	public static void main(String[] args) {
		String input = "krishna chinna kmr";
		String[] r=input.split(" ");
		for(int i=0;i<r.length;i++){
			System.out.println(r[i]);
		}
	}
}
