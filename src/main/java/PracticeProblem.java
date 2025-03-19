public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	
	public static int[] compareSearch(int[] array, int number) {
		int linearCount = 1;
		for (int i = 0; i < array.length && array[i] != number; i++) {
			linearCount++;
		}
		linearCount = Math.min(linearCount, array.length);
		int start = 0;
		int end = array.length - 1;
		int mid;
		int binaryCount = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			binaryCount++;
			if (array[mid] == number) {
				start = end + 1;
			} else if (array[mid] < number) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return new int[]{linearCount, binaryCount};
	}

	public static int[] compareStringSearch(String[] array, String word) {
		int linearCount = 1;
		for (int i = 0; i < array.length && !array[i].equals(word); i++) {
			linearCount++;
		}
		linearCount = Math.min(linearCount, array.length);
		int start = 0;
		int end = array.length - 1;
		int mid;
		int binaryCount = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			binaryCount++;
			if (array[mid].equals(word)) {
				start = end + 1;
			} else if (array[mid].compareTo(word) < 0) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return new int[]{linearCount, binaryCount};
	}
}
