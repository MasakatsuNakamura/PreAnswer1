public class Jaian {
	static final int[][] Travel_Time = {
			{ 0, 10, 20, 7, 15, 24, 18, 22 },
			{ 10, 0, 11, 5, 8, 20, 21, 15 },
			{ 20, 11, 0, 10, 12, 6, 25, 20 },
			{ 7, 5, 10, 0, 9, 17, 15, 13 },
			{ 15, 8, 12, 9, 0, 7, 10, 6 },
			{ 24, 20, 6, 17, 7, 0, 14, 10 },
			{ 18, 21, 25, 15, 10, 14, 0, 5 },
			{ 22, 15, 20, 13, 6, 10, 5, 0 }
		};
	static final char[] place = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

	public static void main(String[] args){
		int now = 0;
		int nextplace = 0;
		int sum = 0;
		int tt;
		boolean[] visited = {false, false, false, false, false, false, false, false};

		visited[now] = true;
		do {
			tt = 10000;
			for (int i = 0; i < 8; ++i) {
				if(!visited[i]) {
					if(Travel_Time[now][i] < tt) {
						tt = Travel_Time[now][i];
						nextplace = i;
					}
				}
			}
			if (tt == 10000) break;
			System.out.println("move " + place[now] + "->" + place[nextplace]);
			sum += tt;
			System.out.println("need " + tt + " min. total " + sum + "min.");
			now = nextplace;
			visited[nextplace] = true;
		} while (true);
		nextplace = 0;
		tt = Travel_Time[now][nextplace];
		System.out.println("move " + place[now] + "->" + place[nextplace]);
		sum += tt;
		System.out.println("need " + tt + " min. total " + sum + "min.");
	}
}
