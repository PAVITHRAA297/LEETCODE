// Last updated: 2/13/2026, 9:38:55 AM
class Solution {
    public double average(int[] salary) {
        int min = salary[0], max = salary[0], sum = salary[0];
        for (int i = 1; i < salary.length; i++) {
            sum += salary[i];
            if (salary[i] < min) min = salary[i];
            if (salary[i] > max) max = salary[i];
        }
        return (sum - min - max) / (double)(salary.length - 2);
    }
}
