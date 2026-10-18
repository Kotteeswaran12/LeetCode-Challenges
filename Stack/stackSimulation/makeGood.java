class makeGood {
    public static void main(String[] args) {

        String s = "abBAcC";


        System.out.println(res(s));
    }


    public static String res(String s){
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            int len = sb.length()-1;
            if(!sb.isEmpty() && Math.abs(  c - sb.charAt(len)) == 32){
                sb.deleteCharAt(len);
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
}