class FindTheWinner {
    public int findTheWinners(int n, int k) {
        int winner = 0;
        for(int i=1 ; i<=n ; i++){
            winner  = (winner +k) % i;
        }

        return winner +1;
    }

    public static void main(String[] args) {
        FindTheWinner findTheWinner = new FindTheWinner();
        int w =findTheWinner.findTheWinners(5, 2);
        System.out.println(w);
    }
}