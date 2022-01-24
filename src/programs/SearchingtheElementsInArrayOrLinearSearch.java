package programs;

public class SearchingtheElementsInArrayOrLinearSearch {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 60, 80 };
		int search_ele = 800;
		boolean flag = false;

		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);

			if (search_ele == a[i]) {
				System.out.println("Element is found at  :" + i);
				flag = true;
				break;

			}
		}

		if (flag == false) {
			System.out.println("   Element not found ");
		}
	}
}
