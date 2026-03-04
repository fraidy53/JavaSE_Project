package mylab.book.control;

import mylab.book.entity.*;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class StatisticsAnalyzer {

    private String getPublicationType(Publication pub) {
        if (pub instanceof Novel) return "소설";
        if (pub instanceof Magazine) return "잡지";
        if (pub instanceof ReferenceBook) return "참고서";
        return "기타";
    }

    public Map<String, Double> calculateAveragePriceByType(Publication[] publications) {
        Map<String, Integer> total = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        Map<String, Double> result = new HashMap<>();

        for (Publication pub : publications) {
            String type = getPublicationType(pub);
            total.put(type, total.getOrDefault(type, 0) + pub.getPrice());
            count.put(type, count.getOrDefault(type, 0) + 1);
        }

        for (String key : total.keySet()) {
            result.put(key, (double) total.get(key) / count.get(key));
        }

        return result;
    }

    public Map<String, Double> calculatePublicationDistribution(Publication[] publications) {
        Map<String, Integer> count = new HashMap<>();
        Map<String, Double> result = new HashMap<>();

        for (Publication pub : publications) {
            String type = getPublicationType(pub);
            count.put(type, count.getOrDefault(type, 0) + 1);
        }

        for (String key : count.keySet()) {
            result.put(key, count.get(key) * 100.0 / publications.length);
        }

        return result;
    }

    public double calculatePublicationRatioByYear(Publication[] publications, String year) {
        int count = 0;
        for (Publication pub : publications) {
            if (pub.getPublishDate().substring(0, 4).equals(year)) {
                count++;
            }
        }
        return count * 100.0 / publications.length;
    }

    public void printStatistics(Publication[] publications) {
        DecimalFormat df = new DecimalFormat("#,###.##");

        System.out.println("\n===== 출판물 통계 분석 =====");

        System.out.println("1. 타입별 평균 가격:");
        Map<String, Double> avg = calculateAveragePriceByType(publications);
        for (String key : avg.keySet()) {
            System.out.println("   - " + key + ": " + df.format(avg.get(key)) + "원");
        }

        System.out.println("\n2. 출판물 유형 분포:");
        Map<String, Double> dist = calculatePublicationDistribution(publications);
        for (String key : dist.keySet()) {
            System.out.println("   - " + key + ": " + df.format(dist.get(key)) + "%");
        }

        System.out.println("\n3. 2007년에 출판된 출판물 비율: "
                + df.format(calculatePublicationRatioByYear(publications, "2007")) + "%");
    }
}