package com.phi.xutils.utils;

public class VerifyUtils {
    public static final String REG_NUM = "-?\\d+(\\.\\d+)?";
    public static final String REG_EMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    public static final String REGEX_MOBILE = "^1[3-9]\\d{9}$";
    public static final String REGEX_ID_CARD = "\\d{17}[0-9Xx]";

    private VerifyUtils() {

    }

    /**
     * 判断字符串是否为数字(可以是负数或者小数)
     *
     * @param str 需要判断的字符串
     * @return true 是数字，false 不是数字
     */
    public static boolean isNumeric(String str) {
        return str != null && str.matches(REG_NUM);
    }

    /**
     * 判断字符串是否为邮箱
     *
     * @param str 需要判断的字符串
     * @return true 是邮箱，false 不是邮箱
     */
    public static boolean isEmail(String str) {
        return str != null && str.matches(REG_EMAIL);
    }

    /**
     * 判断字符串是否为手机号
     *
     * @param str 需要判断的字符串
     * @return true 是，false 不是
     */
    public static boolean isPhone(String str) {
        return str != null && str.matches(REGEX_MOBILE);
    }

    /**
     * 判断是否是有效身份证号码
     * @param str 需要判断的字符串
     * @return true 是，false 不是
     */
    public static boolean isIdCard(String str) {
        if (str == null || str.length() != 18) {
            return false;
        }
        // 1 判断是否是数字
        if (!str.matches(REGEX_ID_CARD)) {
            return false;
        }

        // 2 判断校验码
        int[] weights = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] checkCodes = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        // 身份证号码的前17位数字
        char[] chars = str.toCharArray();
        int remainder = 0;
        for (int i = 0; i < 17; i++) {
            int digit = chars[i] - '0';
            remainder += digit * weights[i];
        }
        remainder = remainder % 11;
        char verifyCode = checkCodes[remainder];
        if (chars[17] == 'x') {
            chars[17] = 'X';
        }
        // x Up
        if (verifyCode != chars[17]) {
            // 校验码不正确
            return false;
        }
        // 忽略日期判断
        return true;

    }


}
