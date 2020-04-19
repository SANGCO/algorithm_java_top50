package com.example.programmers.test.devMatching2020;

public class Test2 {

    public int solution(int[][] office, int r, int c, String[] move) {
        int rowStart = 0;
        int rowEnd = 2;
        int colStart = 0;
        int colEnd = 2;

        boolean isMoveToCol = true;
        boolean isPlus = false;

        int col = r;
        int row = c;
        int answer = office[col][row];
        office[col][row] = 0;

        for (int i = 0; i < move.length; i++) {
            String order = move[i];

            if (order.equals("go")) {

                if (isMoveToCol) {
                    int temp = col;

                    if (isPlus) {
                        temp += 1;
                    }

                    if (!isPlus) {
                        temp -= 1;
                    }

                    if (colStart <= temp && temp <= colEnd) {
                        int status = office[temp][row];
                        if (status != -1) {
                            col = temp;
                            answer += status;
                            office[temp][row] = 0;
                        }
                    }
                }

                if (!isMoveToCol) {
                    int temp = row;

                    if (isPlus) {
                        temp += 1;
                    }

                    if (!isPlus) {
                        temp -= 1;
                    }

                    if (rowStart <= temp && temp <= rowEnd) {
                        int status = office[col][temp];
                        if (status != -1) {
                            row = temp;
                            answer += status;
                            office[col][temp] = 0;
                        }
                    }
                }
            }

            if (order.equals("right")) {

                if ((isMoveToCol && !isPlus) || (!isMoveToCol && isPlus)) {
                    isPlus = true;
                } else if ((isMoveToCol && isPlus) || (!isMoveToCol && !isPlus)) {
                    isPlus = false;
                }
                isMoveToCol = !isMoveToCol;
            }

            if (order.equals("left")) {

                if ((isMoveToCol && isPlus) || !isMoveToCol && !isPlus) {
                    isPlus = true;
                } else if ((isMoveToCol && !isPlus) || (!isMoveToCol && isPlus)) {
                    isPlus = false;
                }
                isMoveToCol = !isMoveToCol;
            }
        }
        return answer;
    }
}
