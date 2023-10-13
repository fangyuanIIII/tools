package com.lt.utils;
/**
 * Boolean工具类
 * @author luot
 * @date   2023年9月15日
 *
 *
 **/
public class BooleanUtil {

    /** 表示为真的字符串 */
    private static final String[] TRUE_ARRAY = { "true", "yes", "y", "t", "ok", "1", "on", "是", "对", "真", };

    /**
     * 功能描述:
     * 〈判断是否是true〉
     *
     * @params : [bool]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 11:20
     */
    public static boolean isTrue(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    /**
     * 功能描述:
     * 〈检查是否为false〉
     *
     * @params : [bool]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 11:20
     */
    public static boolean isFalse(Boolean bool) {
        return Boolean.FALSE.equals(bool);
    }

   /**
    * 功能描述:
    * 〈boolean取相反值〉
    *
    * @params : [bool]
    * @return : boolean
    * @author : cwl
    * @date : 2019/5/22 11:22
    */
    public static boolean negate(boolean bool) {
        return bool ? false : true;
    }

    /**
     * 功能描述:
     * 〈Boolean取相反值〉
     *
     * @params : [bool]
     * @return : java.lang.Boolean
     * @author : cwl
     * @date : 2019/5/22 11:18
     */
    public static Boolean negate(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return bool.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
    }

    /**
     * 功能描述:
     * 〈转换字符串为boolean值〉
     *
     * @params : [valueStr]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/23 15:16
     */
    public static boolean toBoolean(String valueStr) {
        if (!((valueStr == null) || (valueStr.length() == 0))) {
            valueStr = valueStr.trim().toLowerCase();
            if (ArrayUtil.contains(TRUE_ARRAY, valueStr)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 功能描述:
     * 〈boolean值转为int〉
     *
     * @params : [value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/23 15:16
     */
    public static int toInt(boolean value) {
        return value ? 1 : 0;
    }

    /**
     * 功能描述:
     * 〈boolean值转为Integer〉
     *
     * @params : [value]
     * @return : java.lang.Integer
     * @author : cwl
     * @date : 2019/5/23 15:16
     */
    public static Integer toInteger(boolean value) {
        return Integer.valueOf(toInt(value));
    }

    /**
     * 功能描述:
     * 〈boolean值转为char〉
     *
     * @params : [value]
     * @return : char
     * @author : cwl
     * @date : 2019/5/23 15:17
     */
    public static char toChar(boolean value) {
        return (char) toInt(value);
    }

    /**
     * 功能描述:
     * 〈boolean值转为Character〉
     *
     * @params : [value]
     * @return : java.lang.Character
     * @author : cwl
     * @date : 2019/5/23 15:17
     */
    public static Character toCharacter(boolean value) {
        return Character.valueOf(toChar(value));
    }

    /**
     * 功能描述:
     * 〈boolean值转为byte〉
     *
     * @params : [value]
     * @return : byte
     * @author : cwl
     * @date : 2019/5/23 15:17
     */
    public static byte toByte(boolean value) {
        return (byte) toInt(value);
    }

    /**
     * 功能描述:
     * 〈boolean值转为Byte〉
     *
     * @params : [value]
     * @return : java.lang.Byte
     * @author : cwl
     * @date : 2019/5/23 15:17
     */
    public static Byte toByteObj(boolean value) {
        return Byte.valueOf(toByte(value));
    }

    /**
     * 功能描述:
     * 〈boolean值转为long〉
     *
     * @params : [value]
     * @return : long
     * @author : cwl
     * @date : 2019/5/23 15:17
     */
    public static long toLong(boolean value) {
        return (long) toInt(value);
    }

    /**
     * 功能描述:
     * 〈boolean值转为Long〉
     *
     * @params : [value]
     * @return : java.lang.Long
     * @author : cwl
     * @date : 2019/5/23 15:18
     */
    public static Long toLongObj(boolean value) {
        return Long.valueOf(toLong(value));
    }

    /**
     * 功能描述:
     * 〈boolean值转为short〉
     *
     * @params : [value]
     * @return : short
     * @author : cwl
     * @date : 2019/5/23 15:18
     */
    public static short toShort(boolean value) {
        return (short) toInt(value);
    }

    /**
     * 功能描述:
     * 〈boolean值转为Short〉
     *
     * @params : [value]
     * @return : java.lang.Short
     * @author : cwl
     * @date : 2019/5/23 15:18
     */
    public static Short toShortObj(boolean value) {
        return Short.valueOf(toShort(value));
    }

    /**
     * 功能描述:
     * 〈boolean值转为float〉
     *
     * @params : [value]
     * @return : float
     * @author : cwl
     * @date : 2019/5/23 15:18
     */
    public static float toFloat(boolean value) {
        return (float) toInt(value);
    }

    /**
     * 功能描述:
     * 〈boolean值转为Float〉
     *
     * @params : [value]
     * @return : java.lang.Float
     * @author : cwl
     * @date : 2019/5/23 15:18
     */
    public static Float toFloatObj(boolean value) {
        return Float.valueOf(toFloat(value));
    }

    /**
     * 功能描述:
     * 〈boolean值转为double〉
     *
     * @params : [value]
     * @return : double
     * @author : cwl
     * @date : 2019/5/23 15:19
     */
    public static double toDouble(boolean value) {
        return (double) toInt(value);
    }

    /**
     * 功能描述:
     * 〈boolean值转为double〉
     *
     * @params : [value]
     * @return : java.lang.Double
     * @author : cwl
     * @date : 2019/5/23 15:19
     */
    public static Double toDoubleObj(boolean value) {
        return Double.valueOf(toDouble(value));
    }

    /**
     * 功能描述:
     * 〈将boolean转换为字符串true 或者 false〉
     *
     * @params : [bool]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/23 15:19
     */
    public static String toStringTrueFalse(boolean bool) {
        return toString(bool, "true", "false");
    }

    /**
     * 功能描述:
     * 〈将boolean转换为字符串on 或者 off〉
     *
     * @params : [bool]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/23 15:20
     */
    public static String toStringOnOff(boolean bool) {
        return toString(bool, "on", "off");
    }

    /**
     * 功能描述:
     * 〈将boolean转换为字符串yes 或者 no〉
     *
     * @params : [bool]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/23 15:20
     */
    public static String toStringYesNo(boolean bool) {
        return toString(bool, "yes", "no");
    }

    /**
     * 功能描述:
     * 〈将boolean转换为字符串
     * Demo:
     *  BooleanUtil.toString(true, "true", "false")   = "true"
     *  BooleanUtil.toString(false, "true", "false")  = "false"
     * 〉
     *
     * @params : [bool, trueString, falseString]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/23 15:22
     */
    public static String toString(boolean bool, String trueString, String falseString) {
        return bool ? trueString : falseString;
    }

    /**
     * 对Boolean数组取与
     *
     * <pre>
     *   BooleanUtil.and(true, true)         = true
     *   BooleanUtil.and(false, false)       = false
     *   BooleanUtil.and(true, false)        = false
     *   BooleanUtil.and(true, true, false)  = false
     *   BooleanUtil.and(true, true, true)   = true
     * </pre>
     *
     * @param array {@code Boolean}数组
     * @return 取与为真返回{@code true}
     */
    /**
     * 功能描述:
     * 〈对Boolean数组取与
     * Demo;
     *  BooleanUtil.and(true, true)         = true
     *  BooleanUtil.and(false, false)       = false
     *  BooleanUtil.and(true, false)        = false
     *  BooleanUtil.and(true, true, false)  = false
     *  BooleanUtil.and(true, true, true)   = true
     * 〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/23 15:23
     */
    public static boolean and(boolean... array) {
        if (ArrayUtil.isEmpty(array)) {
            throw new IllegalArgumentException("The Array must not be empty !");
        }
        for (final boolean element : array) {
            if (false == element) {
                return false;
            }
        }
        return true;
    }

    /**
     * 对Boolean数组取或
     *
     * <pre>
     *   BooleanUtil.or(true, true)          = true
     *   BooleanUtil.or(false, false)        = false
     *   BooleanUtil.or(true, false)         = true
     *   BooleanUtil.or(true, true, false)   = true
     *   BooleanUtil.or(true, true, true)    = true
     *   BooleanUtil.or(false, false, false) = false
     * </pre>
     *
     * @param array {@code Boolean}数组
     * @return 取或为真返回{@code true}
     */
    /**
     * 功能描述:
     * 〈对Boolean数组取或
     *  Demo
     *  BooleanUtil.or(true, true)          = true
     *  BooleanUtil.or(false, false)        = false
     *  BooleanUtil.or(true, false)         = true
     *  BooleanUtil.or(true, true, false)   = true
     *  BooleanUtil.or(true, true, true)    = true
     *  BooleanUtil.or(false, false, false) = false
     *  〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/23 15:24
     */
    public static boolean or(boolean... array) {
        if (ArrayUtil.isEmpty(array)) {
            throw new IllegalArgumentException("The Array must not be empty !");
        }
        for (final boolean element : array) {
            if (element) {
                return true;
            }
        }
        return false;
    }

    /**
     * 对Boolean数组取异或
     *
     * <pre>
     *   BooleanUtil.xor(true, true)   = false
     *   BooleanUtil.xor(false, false) = false
     *   BooleanUtil.xor(true, false)  = true
     *   BooleanUtil.xor(true, true)   = false
     *   BooleanUtil.xor(false, false) = false
     *   BooleanUtil.xor(true, false)  = true
     * </pre>
     *
     * @param array {@code boolean}数组
     * @return 如果异或计算为true返回 {@code true}
     */
    /**
     * 功能描述:
     * 〈 对Boolean数组取异或
     * Demo
     *  BooleanUtil.xor(true, true)   = false
     *  BooleanUtil.xor(false, false) = false
     *  BooleanUtil.xor(true, false)  = true
     *  BooleanUtil.xor(true, true)   = false
     *  BooleanUtil.xor(false, false) = false
     *  BooleanUtil.xor(true, false)  = true〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/23 15:25
     */
    public static boolean xor(boolean... array) {
        if (ArrayUtil.isEmpty(array)) {
            throw new IllegalArgumentException("The Array must not be empty");
        }

        boolean result = false;
        for (final boolean element : array) {
            result ^= element;
        }

        return result;
    }

    /**
     * 功能描述:
     * 〈给定类是否为Boolean或者boolean〉
     *
     * @params : [clazz]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/23 15:26
     */
    public static boolean isBoolean(Class<?> clazz) {
        return (clazz == Boolean.class || clazz == boolean.class);
    }
}


