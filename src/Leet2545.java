class Solution2545 {
    public int[][] sortTheStudents(int[][] score, int k) {
        mergeSort(score, 0, score.length - 1, k);
        return score;
    }

    private void mergeSort(int[][] score, int left, int right, int k) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(score, left, mid, k);
        mergeSort(score, mid + 1, right, k);

        merge(score, left, mid, right, k);
    }

    private void merge(int[][] score, int left, int mid, int right, int k) {
        int[][] temp = new int[right - left + 1][];
        int i = left, j = mid + 1, t = 0;

        while (i <= mid && j <= right) {
            if (score[i][k] >= score[j][k]) {
                temp[t++] = score[i++];
            } else {
                temp[t++] = score[j++];
            }
        }

        while (i <= mid) temp[t++] = score[i++];
        while (j <= right) temp[t++] = score[j++];

        for (int x = 0; x < temp.length; x++) {
            score[left + x] = temp[x];
        }
    }
}
