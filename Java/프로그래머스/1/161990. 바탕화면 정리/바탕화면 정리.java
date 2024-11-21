class Solution {
    public int[] solution(String[] wallpaper) {
        int startx = -1, starty = -1, endx = -1, endy = -1;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (startx == -1) {
                        startx = j;
                        starty = i;
                        endx = j + 1;
                        endy = i + 1;
                    }
                    startx = Math.min(startx, j);
                    starty = Math.min(starty, i);
                    endx = Math.max(endx, j + 1);
                    endy = Math.max(endy, i + 1);
                }
            }
        }
        return new int[]{starty, startx, endy, endx};
    }
}