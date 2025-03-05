import java.io.*;

public class Main {
    static int[][] sudoku = new int[9][9];

    public static boolean isValid(int r, int c, int num) {
        // 가로 검사
        for (int i = 0; i < 9; i++) {
            if (sudoku[r][i] == num) return false;
        }
        // 세로 검사
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][c] == num) return false;
        }
        // 박스 검사
        int sr = (r / 3) * 3;
        int sc = (c / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudoku[sr + i][sc + j] == num) return false;
            }
        }
        return true;
    }

    public static boolean solveSudoku() {
        // 빈칸 찾기
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (sudoku[r][c] == 0) { // 빈칸이면 숫자 채우기
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(r, c, num)) { // 유효성 검사
                            sudoku[r][c] = num;
                            if (solveSudoku()) return true; // 다음 단계 진행
                            sudoku[r][c] = 0; // 백트래킹
                        }
                    }
                    return false; // 숫자를 채울 수 없는 경우
                }
            }
        }
        return true; // 모든 빈칸이 채워졌으면 완료
    }

    public static void printBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(input[j]);
            }
        }

        if (solveSudoku()) {
            printBoard();
        } else {
            System.out.println("해결할 수 없는 스도쿠입니다.");
        }
    }
}
