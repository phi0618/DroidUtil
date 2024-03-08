package com.phi.xutils.utils;

public class RegexUtils {

    private RegexUtils(){

    }

    /**
     * 数字检查
     */
    public static final String REGEX_NUMBER = "^[0-9]*$";

    /**
     * 简单手机号检查
     */
    public static final String REGEX_MOBILE_SIMPLE = "^1[3-9]\\d{9}$";

    /**
     * 汉字
     */
    public static final String REGEX_CHINESE_CHARACTER = "^[\\u4e00-\\u9fa5]+$";



    /**
     * 身份证检查15位（第一代居民身份证）
     */
    public static final String REGEX_ID_CARD_15 = "^[1-9]\\d{5}\\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\\d{2}[0-9Xx]$";

    /**
     * 身份证号检查18位（第二代居民身份证）
     */
    public static final String REGEX_ID_CARD_18 = "^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\\d{3}([0-9Xx])$";

    /**
     * 身份证最后6位检查
     */
    public static final String REGEX_ID_CARD_LAST_SIX = "^(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";

    /**
     * 邮箱验证
     */
    public static final String REGEX_EMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";


    /**
     * 英文字母（含大小写）
     */
    public static final String REGEX_EN_CHAR = "^[A-Za-z]+$";

    /**
     * 大写英文字母
     */
    public static final String REGEX_EN_CHAR_BIG = "^[A-Z]+$";

    /**
     * 小写英文字母
     */
    public static final String REGEX_EN_CHAR_SMALL = "^[A-Z]+$";

    /**
     * 数字和字母
     */
    public static final String REGEX_EN_CHAR_NUMBER = "^[A-Za-z0-9]+$";


    /**
     * 强密码(必须包含大小写字母和数字的组合，可以使用特殊字符，长度在 8-16 之间)
     */
    public static final String REGEX_PWD_STRONG = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,16}$";


    /**
     * 检查是否为数字
     *
     * @param number 数字字符串
     * @return true or false
     */
    public static boolean isNumber(String number) {
        return number.matches(REGEX_NUMBER);
    }

    /**
     * 检查是否为数字
     *
     * @param number 数字字符串
     * @param regex  正则表达式
     * @return true or false
     */
    public static boolean isNumber(String number, String regex) {
        return number.matches(regex);
    }

    /**
     * 检查是否为手机号（简单版）
     *
     * @param phoneNumber 手机号字符串
     * @return true or false
     */
    public static boolean isPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(REGEX_MOBILE_SIMPLE);
    }

    /**
     * 检查是否为汉字
     *
     * @param chineseCharacter 汉字
     * @return true or false
     */
    public static boolean isChineseCharacter(String chineseCharacter) {
        return chineseCharacter.matches(REGEX_CHINESE_CHARACTER);
    }


    /**
     * 检查姓名 中文姓名
     *
     * @param userName 中文姓名
     * @param regex    正则表达式
     * @return true or false
     */
    public static boolean isName(String userName, String regex) {
        return userName.matches(regex);
    }

    /**
     * 检查身份证号 15位 （第一代身份证）
     *
     * @param idCard15 身份证号 15位
     * @return true or false
     */
    public static boolean isIdCard15(String idCard15) {
        return idCard15.matches(REGEX_ID_CARD_15);
    }

    /**
     * 检查身份证号 15位 （第一代身份证）
     *
     * @param idCard15 身份证号 15位
     * @param regex    正则表达式
     * @return true or false
     */
    public static boolean isIdCard15(String idCard15, String regex) {
        return idCard15.matches(regex);
    }

    /**
     * 检查身份证号 18位 （第二代身份证）
     *
     * @param idCard18 身份证号 18位
     * @return true or false
     */
    public static boolean isIdCard18(String idCard18) {
        return idCard18.matches(REGEX_ID_CARD_18);
    }

    /**
     * 检查身份证号 18位 （第二代身份证）
     *
     * @param idCard18 身份证号 18位
     * @param regex    正则表达式
     * @return true or false
     */
    public static boolean isIdCard18(String idCard18, String regex) {
        return idCard18.matches(regex);
    }

    /**
     * 检查身份证号 最后六位
     *
     * @param idCardLast6 身份证号 最后六位
     * @return true or false
     */
    public static boolean isIdCardLast6(String idCardLast6) {
        return idCardLast6.matches(REGEX_ID_CARD_LAST_SIX);
    }

    /**
     * 检查身份证号 最后六位
     *
     * @param idCardLast6 身份证号 最后六位
     * @param regex       正则表达式
     * @return true or false
     */
    public static boolean isIdCardLast6(String idCardLast6, String regex) {
        return idCardLast6.matches(regex);
    }


    /**
     * 检查QQ号
     *
     * @param qq    QQ
     * @param regex 正则表达式
     * @return true or false
     */
    public static boolean isQQ(String qq, String regex) {
        return qq.matches(regex);
    }

    /**
     * 检查邮政编码
     *
     * @param postalCode 邮政编码
     * @param regex      正则表达式
     * @return true or false
     */
    public static boolean isPostalCode(String postalCode, String regex) {
        return postalCode.matches(regex);
    }

    /**
     * 检查邮箱
     *
     * @param email 邮箱
     * @return true or false
     */
    public static boolean isEmail(String email) {
        return email.matches(REGEX_EMAIL);
    }

    /**
     * 检查邮箱
     *
     * @param email 邮箱
     * @param regex 正则表达式
     * @return true or false
     */
    public static boolean isEmail(String email, String regex) {
        return email.matches(regex);
    }



    /**
     * 检查字符
     *
     * @param character 字符
     * @param regex     正则表达式
     * @return true or false
     */
    public static boolean isChar(String character, String regex) {
        return character.matches(regex);
    }

    /**
     * 检查英文字母（含大小写）
     *
     * @param enChar 英文字母
     * @return true or false
     */
    public static boolean isCharEn(String enChar) {
        return enChar.matches(REGEX_EN_CHAR);
    }

    /**
     * 检查英文字母（含大小写）
     *
     * @param enChar 英文字母
     * @param regex  正则表达式
     * @return true or false
     */
    public static boolean isCharEn(String enChar, String regex) {
        return enChar.matches(regex);
    }

    /**
     * 检查英文字母（大写）
     *
     * @param enChar 英文字母
     * @return true or false
     */
    public static boolean isCharEnBig(String enChar) {
        return enChar.matches(REGEX_EN_CHAR_BIG);
    }

    /**
     * 检查英文字母（大写）
     *
     * @param enChar 英文字母
     * @param regex  正则表达式
     * @return true or false
     */
    public static boolean isCharEnBig(String enChar, String regex) {
        return enChar.matches(regex);
    }

    /**
     * 检查英文字母（小写）
     *
     * @param enChar 英文字母
     * @return true or false
     */
    public static boolean isCharEnSmall(String enChar) {
        return enChar.matches(REGEX_EN_CHAR_SMALL);
    }

    /**
     * 检查英文字母（小写）
     *
     * @param enChar 英文字母
     * @param regex  正则表达式
     * @return true or false
     */
    public static boolean isCharEnSmall(String enChar, String regex) {
        return enChar.matches(regex);
    }

    /**
     * 检查数字和字母（小写）
     *
     * @param enCharAndNumber 数字和字母
     * @return true or false
     */
    public static boolean isCharEnAndNumber(String enCharAndNumber) {
        return enCharAndNumber.matches(REGEX_EN_CHAR_NUMBER);
    }

    /**
     * 检查数字和字母（小写）
     *
     * @param enCharAndNumber 数字和字母
     * @param regex           正则表达式
     * @return true or false
     */
    public static boolean isCharEnAndNumber(String enCharAndNumber, String regex) {
        return enCharAndNumber.matches(regex);
    }


    /**
     * 检查密码 （以字母开头，长度在6~18之间，只能包含字母、数字和下划线）
     *
     * @param password 密码
     * @param regex    正则表达式
     * @return true or false
     */
    public static boolean isPwd(String password, String regex) {
        return password.matches(regex);
    }

    /**
     * 检查强密码 （必须包含大小写字母和数字的组合，可以使用特殊字符，长度在 8-16 之间）
     *
     * @param password 密码
     * @return true or false
     */
    public static boolean isPwdStrong(String password) {
        return password.matches(REGEX_PWD_STRONG);
    }

    /**
     * 检查强密码 （必须包含大小写字母和数字的组合，可以使用特殊字符，长度在 8-16 之间）
     *
     * @param password 密码
     * @param regex    正则表达式
     * @return true or false
     */
    public static boolean isPwdStrong(String password, String regex) {
        return password.matches(regex);
    }


}
