public class BonusMilesService {
    public int calculate(int price) {
        int bonusScale = 20;
        int bonusMile = price / bonusScale;
        return bonusMile;
    }
}













/*public class Main {
        public static void main(String[] args) {
            int ticketPrice = 13676;
            int rublesToTheBonus = 20;
            int bonusMiles = ticketPrice / rublesToTheBonus;
            System.out.println(bonusMiles);*/