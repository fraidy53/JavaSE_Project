package mylab.book.control;

import mylab.book.entity.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Publication> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Publication item) {
        items.add(item);
        System.out.println(item.getTitle() + "이(가) 장바구니에 추가되었습니다.");
    }

    public boolean removeItem(String title) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getTitle().equals(title)) {
                System.out.println(items.remove(i).getTitle()
                        + "이(가) 장바구니에서 제거되었습니다.");
                return true;
            }
        }
        return false;
    }

    public int calculateTotalPrice() {
        int total = 0;
        for (Publication item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public int calculateDiscountedPrice() {
        int total = 0;

        for (Publication item : items) {
            if (item instanceof Magazine)
                total += item.getPrice() * 0.9;
            else if (item instanceof Novel)
                total += item.getPrice() * 0.85;
            else if (item instanceof ReferenceBook)
                total += item.getPrice() * 0.8;
            else
                total += item.getPrice();
        }
        return total;
    }

    public void displayCart() {
        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println("====== 장바구니 내용 ======");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i+1) + ". "
                    + items.get(i).getTitle() + " - "
                    + df.format(items.get(i).getPrice()) + "원");
        }

        System.out.println("총 가격: " + df.format(calculateTotalPrice()) + "원");
        System.out.println("할인 적용 가격: " + df.format(calculateDiscountedPrice()) + "원");

        printStatistics();
    }

    public void printStatistics() {
        int mag=0, nov=0, ref=0;

        for (Publication item : items) {
            if (item instanceof Magazine) mag++;
            else if (item instanceof Novel) nov++;
            else if (item instanceof ReferenceBook) ref++;
        }

        System.out.println("====== 장바구니 통계 ======");
        System.out.println("잡지: " + mag + "권");
        System.out.println("소설: " + nov + "권");
        System.out.println("참고서: " + ref + "권");
        System.out.println("총 출판물: " + items.size() + "권");
    }
    
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // 출판물 생성
        Publication p1 = new Magazine("마이크로소프트","2007-10-01",328,9900,"매월");
        Publication p2 = new Magazine("경영과컴퓨터","2007-10-03",316,9000,"매월");
        Publication p3 = new Novel("빠삐용","2007-07-01",396,9800,"베르나르베르베르","현대소설");
        Publication p4 = new Novel("남한산성","2007-04-14",383,11000,"김훈","대하소설");
        Publication p5 = new ReferenceBook("실용주의프로그래머","2007-01-14",496,25000,"소프트웨어공학");

        // 장바구니 추가
        cart.addItem(p1);
        cart.addItem(p2);
        cart.addItem(p3);
        cart.addItem(p4);
        cart.addItem(p5);

        // 장바구니 출력
        cart.displayCart();

        // 빠삐용 제거
        cart.removeItem("빠삐용");

        // 다시 출력
        cart.displayCart();
    }
}