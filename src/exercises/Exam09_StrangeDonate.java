package exercises;

/*
描述
地产大亨Q先生临终的遗愿是：拿出100万元给X社区的居民抽奖，以稍慰藉心中愧疚。
麻烦的是，他有个很奇怪的要求：

1. 100万元必须被正好分成若干份（不能剩余）。每份必须是7的若干次方元。比如：1元, 7元，49元，343元，...

2. 相同金额的份数不能超过5份。

3. 在满足上述要求的情况下，分成的份数越多越好！

请你帮忙计算一下，最多可以分为多少份？

输入
固定输入：1000000

输出
最多可以分为多少份

*/

//dfs
public class Exam09_StrangeDonate {
    static int[] mk = new int[100];
    static int num = 0;

    public static void main(String[] args) {
        dfs(0, 0);
    }

    public static void dfs(int i, int count) {
        if (count > 1000000)
            return;
        if (mk[i] > 5)
            return;
        int temp = 1;
        if (i == 0) {
            count += 1;
            temp = 0;
        }
        for (int j = 0; j < i; j++) {
            temp = temp * 7;
        }
        count += temp;
        mk[i] += 1;
        num += 1;
        if (count == 1000000) {
            System.out.println(num);
            return;
        }
        dfs(i, count);
        dfs(i + 1, count);
        mk[i] -= 1;
        num -= 1;
        count -= temp;
    }
}
