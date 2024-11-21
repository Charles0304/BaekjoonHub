class Solution {
    public int[] solution(String[] park, String[] routes) {
        int posX = 0, posY = 0;

        // 시작 위치(S) 찾기
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                posX = park[i].indexOf("S");
                posY = i;
                break;
            }
        }

        // 명령어 처리
        for (String route : routes) {
            char direction = route.charAt(0);
            int distance = Integer.parseInt(route.substring(2));
            boolean isBlocked = false;

            switch (direction) {
                case 'E': // 동쪽
                    if (posX + distance < park[0].length() &&
                        !park[posY].substring(posX, posX + distance + 1).contains("X")) {
                        posX += distance;
                    }
                    break;

                case 'W': // 서쪽
                    if (posX - distance >= 0 &&
                        !park[posY].substring(posX - distance, posX + 1).contains("X")) {
                        posX -= distance;
                    }
                    break;

                case 'S': // 남쪽
                    if (posY + distance < park.length) {
                        for (int i = posY + 1; i <= posY + distance; i++) {
                            if (park[i].charAt(posX) == 'X') {
                                isBlocked = true;
                                break;
                            }
                        }
                        if (!isBlocked) posY += distance;
                    }
                    break;

                case 'N': // 북쪽
                    if (posY - distance >= 0) {
                        for (int i = posY - 1; i >= posY - distance; i--) {
                            if (park[i].charAt(posX) == 'X') {
                                isBlocked = true;
                                break;
                            }
                        }
                        if (!isBlocked) posY -= distance;
                    }
                    break;
            }
        }

        return new int[]{posY, posX};
    }
}
