package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import lotto.model.Lotto;
import lotto.model.Result;

public class LottoService {
    public static List<Integer> makeLottoNumber() {
        List<Integer> lottoNumbers = new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 45, 6));
        Collections.sort(lottoNumbers);
        return lottoNumbers;
    }

    public static Map<Result, Integer> findResults(List<Lotto> lottoTickets, Lotto winningLotto, int bonusNumber) {
        Map<Result, Integer> results = Result.makeResultMap();

        for (Lotto lotto : lottoTickets) {
            int matchCount = lotto.compareWithWinningNumber(winningLotto);
            boolean isBonusMatch = false;
            if (matchCount == 2) {
                isBonusMatch = lotto.isBonusMatch(bonusNumber);
            }
            Result result = Result.findResult(matchCount, isBonusMatch);
            results.put(result, results.get(result) + 1);
        }
        // 아쉬운 점 1. 이건 Result에서 처리하도록
        return results;
    }

    public static String calculateProfit(int userAmount, int totalPrizeAmount) {
        double profit = (double) totalPrizeAmount / (userAmount * 10);
        String stringProfit = String.format("%.1f", profit);
        return stringProfit + "%";
    }
}
