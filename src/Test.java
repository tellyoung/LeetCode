public class Test {
    /*
IPv4 地址由十进制数和点来表示，每个地址包含 4 个十进制数，其范围为 0 - 255，
用(".")分割。比如，172.16.254.1；同时，IPv4 地址内的数不会以 0 开头。
比如，地址 172.16.254.01 是不合法的。
*/
    public static boolean func(String ip){
        String[] s = ip.split(".");
        if(s.length != 4) {
            return false;
        }
        for(String str:s) {
            int flag = 0;
            int i = 0;

            for (i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) { //--判断是否是字母情况
                    return false;
                }
                if (s[i] != "0") break;
                if (i == s.length - 1) flag = 1;
            }
            for (; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) { //--判断是否是字母情况
                    return false;
                }
            }
            if (flag == 0 && s.length != 1) return false; // --判断首数字是否为0


            int x = Integer.valueOf(str);
            if (x > 255 || x < 0) return false;	 // 判断区间范围
        }
        return true;
    }

    public static void main(String[] args) {
        String ip = "172.16.5.001"; //
        System.out.println(func(ip));
    }
}
