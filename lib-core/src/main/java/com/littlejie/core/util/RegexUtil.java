package com.littlejie.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式工具类
 * Created by littlejie on 2016/12/28.
 */

public class RegexUtil {

    private static final String PATTERN_IPV4 = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    /**
     * 判断是否为合法IP
     *
     * @return the ip
     * @link https://www.mkyong.com/regular-expressions/how-to-validate-ip-address-with-regular-expression/
     */
    public static boolean isIPV4(String ip) {
        Pattern pattern = Pattern.compile(PATTERN_IPV4);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static boolean isMobile(String number) {

        return false;
    }

    /**
     * 判断文件名是否合法
     *
     * @param name
     * @return
     */
    public static boolean isValidName(String name) {
        return !(name == null || name.length() > 255)
                && name.matches("[^\\s\\\\/:*?\"<>|]?(\\x20|[^\\s\\\\/:*?\"<>|])*[^\\s\\\\/:*?\"<>|.]$");
    }

    /**
     * 判断URL是否合法
     *
     * @param url
     * @return
     */
    public static boolean isUrl(String url) {
        Pattern pattern = Pattern.compile("http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w\\- ./?%&=]*)?", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}
