package examination.wangyi;

public class The03 {

    public int bestCardPair (int[] cards) {
        // write code here
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i+1; j < cards.length; j++) {
                if (cards[i]+cards[j]+i-j>max){
                    max = cards[i]+cards[j]+i-j;
                }
            }
        }
        return max;
    }

}
