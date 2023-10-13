package com.lt.utils;

import com.sun.xml.internal.ws.util.UtilException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.*;

/**
 * @author luot
 * @date   2023年9月15日
 *
 *
 **/
@SuppressWarnings("all")
public class ArrayUtil {

    /** 数组中元素未找到的下标，值为-1 */
    public static final int INDEX_NOT_FOUND = -1;

    //======================isEmpty=========================
    /**
     * 功能描述:
     * 〈判断数组是否为空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:44
     */
    @SuppressWarnings("unchecked")
    public static <T> boolean isEmpty(final T... array) {
        return array == null || array.length == 0;
    }

    /**
     * 功能描述:
     * 〈数组是否为空:此方法会匹配单一对象，如果此对象为null,则返回true
     * 如果此对象为非数组，理解为此对象为数组的第一个元素，则返回false
     * 如果此对象为数组对象，数组长度大于0情况下返回false，否则返回true〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:44
     */
    public static boolean isEmpty(Object array) {
        if (null == array) {
            return true;
        } else if (isArray(array)) {
            return 0 == Array.getLength(array);
        }
        throw new UtilException("Object to provide is not a Array !");
    }

    /**
     * 功能描述:
     * 〈long数组是否为空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:46
     */
    public static boolean isEmpty(final long... array) {
        return array == null || array.length == 0;
    }

    /**
     * 功能描述:
     * 〈int数组是否为空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:46
     */
    public static boolean isEmpty(final int... array) {
        return array == null || array.length == 0;
    }

    /**
     * 功能描述:
     * 〈short数组是否为空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:47
     */
    public static boolean isEmpty(final short... array) {
        return array == null || array.length == 0;
    }

    /**
     * 功能描述:
     * 〈char数组是否为空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:47
     */
    public static boolean isEmpty(final char... array) {
        return array == null || array.length == 0;
    }

    /**
     * 功能描述:
     * 〈byte数组是否为空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:47
     */
    public static boolean isEmpty(final byte... array) {
        return array == null || array.length == 0;
    }

    /**
     * 功能描述:
     * 〈double数组是否为空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:48
     */
    public static boolean isEmpty(final double... array) {
        return array == null || array.length == 0;
    }

    /**
     * 功能描述:
     * 〈float数组是否为空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:48
     */
    public static boolean isEmpty(final float... array) {
        return array == null || array.length == 0;
    }

    /**
     * 数组是否为空
     *
     * @param array 数组
     * @return 是否为空
     */
    public static boolean isEmpty(final boolean... array) {
        return array == null || array.length == 0;
    }

    //======================isNotEmpty=========================
    /**
     * 功能描述:
     * 〈判断数组是否为非空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:49
     */
    @SuppressWarnings("unchecked")
    public static <T> boolean isNotEmpty(final T... array) {
        return (array != null && array.length != 0);
    }

    /**
     * 功能描述:
     * 〈数组是否为非空〉
     *  此方法会匹配单一对象，如果此对象为null,则返回false
     *  如果此对象为非数组，理解为此对象为数组的第一个元素，则返回true
     *  如果此对象为数组对象，数组长度大于0情况下返回true，否则返回false
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:49
     */
    public static boolean isNotEmpty(final Object array) {
        return false == isEmpty((Object) array);
    }

    /**
     * 功能描述:
     * 〈long数组为非空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:50
     */
    public static boolean isNotEmpty(final long... array) {
        return (array != null && array.length != 0);
    }

    /**
     * 功能描述:
     * 〈int数组为非空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:50
     */
    public static boolean isNotEmpty(final int... array) {
        return (array != null && array.length != 0);
    }

    /**
     * 功能描述:
     * 〈short数组为非空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:51
     */
    public static boolean isNotEmpty(final short... array) {
        return (array != null && array.length != 0);
    }

    /**
     * 功能描述:
     * 〈char数组非空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:57
     */
    public static boolean isNotEmpty(final char... array) {
        return (array != null && array.length != 0);
    }

    /**
     * 功能描述:
     * 〈byte数组非空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:57
     */
    public static boolean isNotEmpty(final byte... array) {
        return (array != null && array.length != 0);
    }

    /**
     * 功能描述:
     * 〈double数组非空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:57
     */
    public static boolean isNotEmpty(final double... array) {
        return (array != null && array.length != 0);
    }

    /**
     * 功能描述:
     * 〈float数组非空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:58
     */
    public static boolean isNotEmpty(final float... array) {
        return (array != null && array.length != 0);
    }

    /*
     * 功能描述:
     * 〈boolean数组非空〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:58
     */
    public static boolean isNotEmpty(final boolean... array) {
        return (array != null && array.length != 0);
    }

    /**
     * 功能描述:
     * 〈数组是否包含null〉
     *
     * @params : [array]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/21 16:59
     */
    @SuppressWarnings("unchecked")
    public static <T> boolean hasNull(T... array) {
        if (isNotEmpty(array)) {
            for (T element : array) {
                if (null == element) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 功能描述:
     * 〈返回数组的第一个元素〉
     *
     * @params : [array]
     * @return : T
     * @author : cwl
     * @date : 2019/5/21 17:00
     */
    @SuppressWarnings("unchecked")
    public static <T> T firstNonNull(T... array) {
        if (isNotEmpty(array)) {
            for (final T val : array) {
                if (null != val) {
                    return val;
                }
            }
        }
        return null;
    }

    /**
     * 功能描述:
     * 〈指定类型和大小,新建一个空数组〉
     *
     * @params : [componentType, newSize]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/21 17:01
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] newArray(Class<?> componentType, int newSize) {
        return (T[]) Array.newInstance(componentType, newSize);
    }

    /**
     * 功能描述:
     * 〈指定大小创建一个空数组〉
     *
     * @params : [newSize]
     * @return : java.lang.Object[]
     * @author : cwl
     * @date : 2019/5/21 17:02
     */
    public static Object[] newArray(int newSize) {
        return new Object[newSize];
    }

    /**
     * 功能描述:
     * 〈根据数组对象获取数组对象的元素类型〉
     *
     * @params : [array]
     * @return : java.lang.Class<?>
     * @author : cwl
     * @date : 2019/5/21 17:03
     */
    public static Class<?> getComponentType(Object array) {
        return null == array ? null : array.getClass().getComponentType();
    }

    /**
     * 功能描述:
     * 〈根据数组字节码获取数组类型〉
     *
     * @params : [arrayClass]
     * @return : java.lang.Class<?>
     * @author : cwl
     * @date : 2019/5/21 17:04
     */
    public static Class<?> getComponentType(Class<?> arrayClass) {
        return null == arrayClass ? null : arrayClass.getComponentType();
    }

    /**
     * 功能描述:
     * 〈根据数组元素类型,获取数组类型〉
     *
     * @params : [componentType]
     * @return : java.lang.Class<?>
     * @author : cwl
     * @date : 2019/5/21 17:05
     */
    public static Class<?> getArrayType(Class<?> componentType) {
        return Array.newInstance(componentType, 0).getClass();
    }

    /**
     * 功能描述:
     * 〈强转数组类型,前提是数组元素类型是可被强制转换〉
     *
     * @params : [type, arrayObj]
     * @return : java.lang.Object[]
     * @author : cwl
     * @date : 2019/5/22 9:07
     */
    public static Object[] cast(Class<?> type, Object arrayObj) throws NullPointerException, IllegalArgumentException {
        if (null == arrayObj) {
            throw new NullPointerException("Argument [arrayObj] is null !");
        }
        if (false == arrayObj.getClass().isArray()) {
            throw new IllegalArgumentException("Argument [arrayObj] is not array !");
        }
        if (null == type) {
            return (Object[]) arrayObj;
        }

        final Class<?> componentType = type.isArray() ? type.getComponentType() : type;
        final Object[] array = (Object[]) arrayObj;
        final Object[] result = ArrayUtil.newArray(componentType, array.length);
        System.arraycopy(array, 0, result, 0, array.length);
        return result;
    }

    /**
     * 功能描述:
     * 〈将新元素添加到数组当中〉
     *
     * @params : [buffer, newElements]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 9:10
     */
    @SafeVarargs
    public static <T> T[] append(T[] buffer, T... newElements) {
        if(isEmpty(buffer)) {
            return newElements;
        }
        return insert(buffer, buffer.length, newElements);
    }

    /**
     * 功能描述:
     * 〈将新元素添加到数组当中〉
     *
     * @params : [array, newElements]
     * @return : java.lang.Object
     * @author : cwl
     * @date : 2019/5/22 9:11
     */
    @SafeVarargs
    public static <T> Object append(Object array, T... newElements) {
        if(isEmpty(array)) {
            return newElements;
        }
        return insert(array, length(array), newElements);
    }

    /**
     * 功能描述:
     * 〈将元素值设置为数组的某个位置，当给定的index大于数组长度，则追加〉
     *
     * @params : [buffer, index, value]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 9:12
     */
    public static <T> T[] setOrAppend(T[] buffer, int index, T value) {
        if(index < buffer.length) {
            Array.set(buffer, index, value);
            return buffer;
        }else {
            return append(buffer, value);
        }
    }

    /**
     * 功能描述:
     * 〈将元素值设置为数组的某个位置，当给定的index大于数组长度，则追加〉
     *
     * @params : [array, index, value]
     * @return : java.lang.Object
     * @author : cwl
     * @date : 2019/5/22 9:12
     */
    public static Object setOrAppend(Object array, int index, Object value) {
        if(index < length(array)) {
            Array.set(array, index, value);
            return array;
        }else {
            return append(array, value);
        }
    }

    /**
     * 功能描述:
     * 〈将新元素插入到到已有数组中的某个位置,添加新元素会生成一个新的数组，不影响原数组,
     * 如果插入位置为为负数，从原数组从后向前计数，若大于原数组长度，则空白处用null填充〉
     *
     * @params : [buffer, index, newElements]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 9:13
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] insert(T[] buffer, int index, T... newElements) {
        return (T[]) insert((Object)buffer, index, newElements);
    }

    /**
     * 功能描述:
     * 〈将新元素插入到到已有数组中的某个位置,添加新元素会生成一个新的数组，不影响原数组,
     * 如果插入位置为为负数，从原数组从后向前计数，若大于原数组长度，则空白处用null填充〉
     *
     * @params : [buffer, index, newElements]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 9:13
     */
    @SuppressWarnings("unchecked")
    public static <T> Object insert(Object array, int index, T... newElements) {
        if (isEmpty(newElements)) {
            return array;
        }
        if(isEmpty(array)) {
            return newElements;
        }

        final int len = length(array);
        if (index < 0) {
            index = (index % len) + len;
        }

        final T[] result = newArray(array.getClass().getComponentType(), Math.max(len, index) + newElements.length);
        System.arraycopy(array, 0, result, 0, Math.min(len, index));
        System.arraycopy(newElements, 0, result, index, newElements.length);
        if (index < len) {
            System.arraycopy(array, index, result, index + newElements.length, len - index);
        }
        return result;
    }

    /**
     * 功能描述:
     * 〈生成一个新的重新设置大小的数组,调整大小后拷贝原数组到新数组下。扩大则占位前N个位置，缩小则截断〉
     *
     * @params : [buffer, newSize, componentType]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 9:14
     */
    public static <T> T[] resize(T[] buffer, int newSize, Class<?> componentType) {
        T[] newArray = newArray(componentType, newSize);
        if (isNotEmpty(buffer)) {
            System.arraycopy(buffer, 0, newArray, 0, Math.min(buffer.length, newSize));
        }
        return newArray;
    }

    /**
     * 功能描述:
     * 〈生成一个新的重新设置大小的数组,新数组的类型为原数组的类型，调整大小后拷贝原数组到新数组下。扩大则占位前N个位置，缩小则截断〉
     *
     * @params : [buffer, newSize]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 9:15
     */
    public static <T> T[] resize(T[] buffer, int newSize) {
        return resize(buffer, newSize, buffer.getClass().getComponentType());
    }

    /**
     * 功能描述:
     * 〈将多个数组合并在一起,忽略null的数组〉
     *
     * @params : [arrays]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 9:15
     */
    @SafeVarargs
    public static <T> T[] addAll(T[]... arrays) {
        if (arrays.length == 1) {
            return arrays[0];
        }

        int length = 0;
        for (T[] array : arrays) {
            if (array == null) {
                continue;
            }
            length += array.length;
        }
        T[] result = newArray(arrays.getClass().getComponentType().getComponentType(), length);

        length = 0;
        for (T[] array : arrays) {
            if (array == null) {
                continue;
            }
            System.arraycopy(array, 0, result, length, array.length);
            length += array.length;
        }
        return result;
    }

    /**
     * 功能描述:
     * 〈数组复制〉
     *
     * @params : [src源数组, srcPos源数组开始位置, dest目标数组, destPos目标数组开始位置, length拷贝数组长度]
     * @return : java.lang.Object
     * @author : cwl
     * @date : 2019/5/22 9:17
     */
    public static Object copy(Object src, int srcPos, Object dest, int destPos, int length) {
        System.arraycopy(src, srcPos, dest, destPos, length);
        return dest;
    }

    /**
     * 功能描述:
     * 〈数组复制，缘数组和目标数组都是从位置0开始复制〉
     *
     * @params : [src, dest, length]
     * @return : java.lang.Object
     * @author : cwl
     * @date : 2019/5/22 9:18
     */
    public static Object copy(Object src, Object dest, int length) {
        System.arraycopy(src, 0, dest, 0, length);
        return dest;
    }

    /**
     * 功能描述:
     * 〈克隆数组〉
     *
     * @params : [array]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 9:18
     */
    public static <T> T[] clone(T[] array) {
        if (array == null) {
            return null;
        }
        return array.clone();
    }

    /**
     * 功能描述:
     * 〈克隆数组，如果非数组返回null〉
     *
     * @params : [obj]
     * @return : T
     * @author : cwl
     * @date : 2019/5/22 9:20
     */
    @SuppressWarnings("unchecked")
    public static <T> T clone(final T obj) {
        if (null == obj) {
            return null;
        }
        if (isArray(obj)) {
            final Object result;
            final Class<?> componentType = obj.getClass().getComponentType();
            if (componentType.isPrimitive()) {// 原始类型
                int length = Array.getLength(obj);
                result = Array.newInstance(componentType, length);
                while (length-- > 0) {
                    Array.set(result, length, Array.get(obj, length));
                }
            } else {
                result = ((Object[]) obj).clone();
            }
            return (T) result;
        }
        return null;
    }

    /**
     * 功能描述:
     * 〈生成一个从0开始的数字列表〉
     *
     * @params : [excludedEnd]
     * @return : int[]
     * @author : cwl
     * @date : 2019/5/22 9:20
     */
    public static int[] range(int excludedEnd) {
        return range(0, excludedEnd, 1);
    }

    /**
     * 功能描述:
     * 〈自动生成一个数字列表,自动判定正序反序〉
     *
     * @params : [includedStart包含开始数, excludedEnd不包含结尾数]
     * @return : int[]
     * @author : cwl
     * @date : 2019/5/22 9:21
     */
    public static int[] range(int includedStart, int excludedEnd) {
        return range(includedStart, excludedEnd, 1);
    }

    /**
     * 功能描述:
     * 〈自动生成一个数字列表,自动判定正序反序,可以根据要求生成步进〉
     *
     * @params : [includedStart, excludedEnd, step每步前进多少]
     * @return : int[]
     * @author : cwl
     * @date : 2019/5/22 9:23
     */
    public static int[] range(int includedStart, int excludedEnd, int step) {
        if (includedStart > excludedEnd) {
            int tmp = includedStart;
            includedStart = excludedEnd;
            excludedEnd = tmp;
        }

        if (step <= 0) {
            step = 1;
        }

        int deviation = excludedEnd - includedStart;
        int length = deviation / step;
        if (deviation % step != 0) {
            length += 1;
        }
        int[] range = new int[length];
        for (int i = 0; i < length; i++) {
            range[i] = includedStart;
            includedStart += step;
        }
        return range;
    }

    /**
     * 功能描述:
     * 〈按照要求拆分byte[]〉
     *
     * @params : [array, len]
     * @return : byte[][]
     * @author : cwl
     * @date : 2019/5/22 9:24
     */
    public static byte[][] split(byte[] array, int len) {
        int x = array.length / len;
        int y = array.length % len;
        int z = 0;
        if (y != 0) {
            z = 1;
        }
        byte[][] arrays = new byte[x + z][];
        byte[] arr;
        for (int i = 0; i < x + z; i++) {
            arr = new byte[len];
            if (i == x + z - 1 && y != 0) {
                System.arraycopy(array, i * len, arr, 0, y);
            } else {
                System.arraycopy(array, i * len, arr, 0, len);
            }
            arrays[i] = arr;
        }
        return arrays;
    }


    /**
     * 映射键值（参考Python的zip()函数）<br>
     * 例如：<br>
     * keys = [a,b,c,d]<br>
     * values = [1,2,3,4]<br>
     * 则得到的Map是 {a=1, b=2, c=3, d=4}<br>
     * 如果两个数组长度不同，则只对应最短部分
     *
     * @param <K> Key类型
     * @param <V> Value类型
     * @param keys 键列表
     * @param values 值列表
     * @param isOrder 是否有序
     * @return Map
     */
    public static final float DEFAULT_LOAD_FACTOR = 0.75f;
    public static <K, V> Map<K, V> zip(K[] keys, V[] values, boolean isOrder) {
        if (isEmpty(keys) || isEmpty(values)) {
            return null;
        }

        final int size = Math.min(keys.length, values.length);
        int initialCapacity = (int) (size / DEFAULT_LOAD_FACTOR);
        final Map<K, V> map = isOrder ? new LinkedHashMap<K, V>(initialCapacity) : new HashMap<K, V>(initialCapacity);
        for (int i = 0; i < size; i++) {
            map.put(keys[i], values[i]);
        }

        return map;
    }

    /**
     * 映射键值（参考Python的zip()函数），返回Map无序<br>
     * 例如：<br>
     * keys = [a,b,c,d]<br>
     * values = [1,2,3,4]<br>
     * 则得到的Map是 {a=1, b=2, c=3, d=4}<br>
     * 如果两个数组长度不同，则只对应最短部分
     *
     * @param <K> Key类型
     * @param <V> Value类型
     * @param keys 键列表
     * @param values 值列表
     * @return Map
     */
    public static <K, V> Map<K, V> zip(K[] keys, V[] values) {
        return zip(keys, values, false);
    }

    /**
     * 功能描述:
     * 〈返回数组中指定元素所在位置，未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 9:36
     */
    public static <T> int indexOf(T[] array, Object value) {
        if (null != array) {
            for (int i = 0; i < array.length; i++) {
                if ((value == array[i]) || (value != null && value.equals(array[i]))) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈返回数组中指定元素所在位置，忽略大小写，未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:24
     */
    public static int indexOfIgnoreCase(CharSequence[] array, CharSequence value) {
        if (null != array) {
            for (int i = 0; i < array.length; i++) {
                if (equalsIgnoreCase(array[i], value,true)) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈是否忽略大小写的比值〉
     *
     * @params : [charSequence, value, ignoreCase]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 9:43
     */
    private static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence value ,boolean ignoreCase) {
        if (null == charSequence) {
            // 只有两个都为null才判断相等
            return value == null;
        }
        if (null == value) {
            // 字符串2空，字符串1非空，直接false
            return false;
        }

        if (ignoreCase) {
            return charSequence.toString().equalsIgnoreCase(value.toString());
        } else {
            return charSequence.equals(value);
        }
    }

    /**
     * 功能描述:
     * 〈返回数组中指定元素所在最后的位置，未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:25
     */
    public static <T> int lastIndexOf(T[] array, Object value) {
        if (null != array) {
            for (int i = array.length - 1; i >= 0; i--) {
                if ((value == array[i]) || (value != null && value.equals(array[i]))) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈数组中是否包含元素〉
     *
     * @params : [array, value]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 11:25
     */
    public static <T> boolean contains(T[] array, T value) {
        return indexOf(array, value) > INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈数组中是否包含指定元素中的任意一个〉
     *
     * @params : [array, values]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 11:25
     */
    @SuppressWarnings("unchecked")
    public static <T> boolean containsAny(T[] array, T... values) {
        for (T value : values) {
            if(contains(array, value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 功能描述:
     * 〈数组中是否包含元素，忽略大小写〉
     *
     * @params : [array, value]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 11:26
     */
    public static boolean containsIgnoreCase(CharSequence[] array, CharSequence value) {
        return indexOfIgnoreCase(array, value) > INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈从long数组前面找指定元素，未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:26
     */
    public static int indexOf(long[] array, long value) {
        if (null != array) {
            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈从long数组后面找数组中的指定元素，未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:26
     */
    public static int lastIndexOf(long[] array, long value) {
        if (null != array) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈long数组中是否包含元素〉
     *
     * @params : [array, value]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 11:27
     */
    public static boolean contains(long[] array, long value) {
        return indexOf(array, value) > INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈从int数组前面开始找数组中的指定元素，未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:27
     */
    public static int indexOf(int[] array, int value) {
        if (null != array) {
            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈从int数组后面开始找数组中的指定元素,未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:28
     */
    public static int lastIndexOf(int[] array, int value) {
        if (null != array) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * int数组中是否包含元素
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 是否包含
     * @since 3.0.7
     */
    public static boolean contains(int[] array, int value) {
        return indexOf(array, value) > INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈从short数组前面开始开始找指定元素所在位置,未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:33
     */
    public static int indexOf(short[] array, short value) {
        if (null != array) {
            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈从short数组后面开始找指定元素,未找到则返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:34
     */
    public static int lastIndexOf(short[] array, short value) {
        if (null != array) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈short数组中是否包含元素〉
     *
     * @params : [array, value]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 11:35
     */
    public static boolean contains(short[] array, short value) {
        return indexOf(array, value) > INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈从char数组前面开始找指定元素所在位置,未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:35
     */
    public static int indexOf(char[] array, char value) {
        if (null != array) {
            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈从char数组后面开始找指定元素所在的位置,未找到则返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:36
     */
    public static int lastIndexOf(char[] array, char value) {
        if (null != array) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈char数组中是否包含元素〉
     *
     * @params : [array, value]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 11:37
     */
    public static boolean contains(char[] array, char value) {
        return indexOf(array, value) > INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈找到byte数组当中第一次出现的位置,未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:37
     */
    public static int indexOf(byte[] array, byte value) {
        if (null != array) {
            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈找到byte数组中指定元素最后出现的位置,未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:38
     */
    public static int lastIndexOf(byte[] array, byte value) {
        if (null != array) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈byte数组是否包含元素〉
     *
     * @params : [array, value]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 11:39
     */
    public static boolean contains(byte[] array, byte value) {
        return indexOf(array, value) > INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈double数组中指定元素第一次出现的位置,未找到则返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:39
     */
    public static int indexOf(double[] array, double value) {
        if (null != array) {
            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈找到double数组中指定元素最后出现的位置,未找到则返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:40
     */
    public static int lastIndexOf(double[] array, double value) {
        if (null != array) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈double数组中是否包含元素〉
     *
     * @params : [array, value]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 11:40
     */
    public static boolean contains(double[] array, double value) {
        return indexOf(array, value) > INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈返回float数组中指定元素所在位置,未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:49
     */
    public static int indexOf(float[] array, float value) {
        if (null != array) {
            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈返回float数组中指定的元素所在最后的位置，未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 11:50
     */
    public static int lastIndexOf(float[] array, float value) {
        if (null != array) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈float数组中是否包含元素〉
     *
     * @params : [array, value]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 12:00
     */
    public static boolean contains(float[] array, float value) {
        return indexOf(array, value) > INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈返回boolean数组中指定元素所在位置，未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 13:45
     */
    public static int indexOf(boolean[] array, boolean value) {
        if (null != array) {
            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈返回boolean数组中指定元素所在最后的位置，未找到返回-1〉
     *
     * @params : [array, value]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 13:46
     */
    public static int lastIndexOf(boolean[] array, boolean value) {
        if (null != array) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈boolean数组中是否包含元素〉
     *
     * @params : [array, value]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 13:46
     */
    public static boolean contains(boolean[] array, boolean value) {
        return indexOf(array, value) > INDEX_NOT_FOUND;
    }

    /**
     * 功能描述:
     * 〈将原始类型数组包装为包装类型〉
     *
     * @params : [values]
     * @return : java.lang.Integer[]
     * @author : cwl
     * @date : 2019/5/22 13:47
     */
    public static Integer[] wrap(int... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new Integer[0];
        }

        final Integer[] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            array[i] = Integer.valueOf(values[i]);
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈包装类数组转为原始类型数组〉
     *
     * @params : [values]
     * @return : int[]
     * @author : cwl
     * @date : 2019/5/22 13:47
     */
    public static int[] unWrap(Integer... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new int[0];
        }

        final int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = values[i].intValue();
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈将原始类型数组包装为包装类型〉
     *
     * @params : [values]
     * @return : java.lang.Long[]
     * @author : cwl
     * @date : 2019/5/22 13:48
     */
    public static Long[] wrap(long... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new Long[0];
        }

        final Long[] array = new Long[length];
        for (int i = 0; i < length; i++) {
            array[i] = Long.valueOf(values[i]);
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈包装类数组转为原始类型数组〉
     *
     * @params : [values]
     * @return : long[]
     * @author : cwl
     * @date : 2019/5/22 13:48
     */
    public static long[] unWrap(Long... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new long[0];
        }

        final long[] array = new long[length];
        for (int i = 0; i < length; i++) {
            array[i] = values[i].longValue();
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈将原始类型数组包装为包装类型〉
     *
     * @params : [values]
     * @return : java.lang.Character[]
     * @author : cwl
     * @date : 2019/5/22 13:48
     */
    public static Character[] wrap(char... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new Character[0];
        }

        final Character[] array = new Character[length];
        for (int i = 0; i < length; i++) {
            array[i] = Character.valueOf(values[i]);
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈包装类数组转为原始类型数组〉
     *
     * @params : [values]
     * @return : char[]
     * @author : cwl
     * @date : 2019/5/22 13:48
     */
    public static char[] unWrap(Character... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new char[0];
        }

        char[] array = new char[length];
        for (int i = 0; i < length; i++) {
            array[i] = values[i].charValue();
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈将原始类型数组包装为包装类型〉
     *
     * @params : [values]
     * @return : java.lang.Byte[]
     * @author : cwl
     * @date : 2019/5/22 13:48
     */
    public static Byte[] wrap(byte... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new Byte[0];
        }

        final Byte[] array = new Byte[length];
        for (int i = 0; i < length; i++) {
            array[i] = Byte.valueOf(values[i]);
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈包装类数组转为原始类型数组〉
     *
     * @params : [values]
     * @return : byte[]
     * @author : cwl
     * @date : 2019/5/22 13:49
     */
    public static byte[] unWrap(Byte... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new byte[0];
        }

        final byte[] array = new byte[length];
        for (int i = 0; i < length; i++) {
            array[i] = values[i].byteValue();
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈将原始类型数组包装为包装类型〉
     *
     * @params : [values]
     * @return : java.lang.Short[]
     * @author : cwl
     * @date : 2019/5/22 13:49
     */
    public static Short[] wrap(short... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new Short[0];
        }

        final Short[] array = new Short[length];
        for (int i = 0; i < length; i++) {
            array[i] = Short.valueOf(values[i]);
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈包装类数组转为原始类型数组〉
     *
     * @params : [values]
     * @return : short[]
     * @author : cwl
     * @date : 2019/5/22 13:50
     */
    public static short[] unWrap(Short... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new short[0];
        }

        final short[] array = new short[length];
        for (int i = 0; i < length; i++) {
            array[i] = values[i].shortValue();
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈将原始类型数组包装为包装类型〉
     *
     * @params : [values]
     * @return : java.lang.Float[]
     * @author : cwl
     * @date : 2019/5/22 13:50
     */
    public static Float[] wrap(float... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new Float[0];
        }

        final Float[] array = new Float[length];
        for (int i = 0; i < length; i++) {
            array[i] = Float.valueOf(values[i]);
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈包装类数组转为原始类型数组〉
     *
     * @params : [values]
     * @return : float[]
     * @author : cwl
     * @date : 2019/5/22 13:50
     */
    public static float[] unWrap(Float... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new float[0];
        }

        final float[] array = new float[length];
        for (int i = 0; i < length; i++) {
            array[i] = values[i].floatValue();
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈将原始类型数组包装为包装类型〉
     *
     * @params : [values]
     * @return : java.lang.Double[]
     * @author : cwl
     * @date : 2019/5/22 13:51
     */
    public static Double[] wrap(double... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new Double[0];
        }

        final Double[] array = new Double[length];
        for (int i = 0; i < length; i++) {
            array[i] = Double.valueOf(values[i]);
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈包装类数组转为原始类型数组〉
     *
     * @params : [values]
     * @return : double[]
     * @author : cwl
     * @date : 2019/5/22 13:51
     */
    public static double[] unWrap(Double... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new double[0];
        }

        final double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = values[i].doubleValue();
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈将原始类型数组包装为包装类型〉
     *
     * @params : [values]
     * @return : java.lang.Boolean[]
     * @author : cwl
     * @date : 2019/5/22 13:52
     */
    public static Boolean[] wrap(boolean... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new Boolean[0];
        }

        final Boolean[] array = new Boolean[length];
        for (int i = 0; i < length; i++) {
            array[i] = Boolean.valueOf(values[i]);
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈包装类数组转为原始类型数组〉
     *
     * @params : [values]
     * @return : boolean[]
     * @author : cwl
     * @date : 2019/5/22 13:52
     */
    public static boolean[] unWrap(Boolean... values) {
        if (null == values) {
            return null;
        }
        final int length = values.length;
        if (0 == length) {
            return new boolean[0];
        }

        final boolean[] array = new boolean[length];
        for (int i = 0; i < length; i++) {
            array[i] = values[i].booleanValue();
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈包装数组对象〉
     *
     * @params : [obj]
     * @return : java.lang.Object[]
     * @author : cwl
     * @date : 2019/5/22 13:52
     */
    public static Object[] wrap(Object obj) {
        if (null == obj) {
            return null;
        }
        if (isArray(obj)) {
            try {
                return (Object[]) obj;
            } catch (Exception e) {
                final String className = obj.getClass().getComponentType().getName();
                switch (className) {
                    case "long":
                        return wrap((long[]) obj);
                    case "int":
                        return wrap((int[]) obj);
                    case "short":
                        return wrap((short[]) obj);
                    case "char":
                        return wrap((char[]) obj);
                    case "byte":
                        return wrap((byte[]) obj);
                    case "boolean":
                        return wrap((boolean[]) obj);
                    case "float":
                        return wrap((float[]) obj);
                    case "double":
                        return wrap((double[]) obj);
                    default:
                        throw new UtilException(e);
                }
            }
        }
        throw new UtilException("Argument is not Array!", obj.getClass());
    }

    /**
     * 功能描述:
     * 〈对象是否为数组对象〉
     *
     * @params : [obj]
     * @return : boolean
     * @author : cwl
     * @date : 2019/5/22 13:53
     */
    public static boolean isArray(Object obj) {
        if (null == obj) {
            // throw new NullPointerException("Object check for isArray is null");
            return false;
        }
        return obj.getClass().isArray();
    }

    /**
     * 功能描述:
     * 〈获取数组对象中指定index的值，支持负数，例如-1表示倒数第一个值,如果数组下标越界，返回null〉
     *
     * @params : [array, index]
     * @return : T
     * @author : cwl
     * @date : 2019/5/22 13:53
     */
    @SuppressWarnings("unchecked")
    public static <T> T get(Object array, int index) {
        if(null == array) {
            return null;
        }

        if (index < 0) {
            index += Array.getLength(array);
        }
        try {
            return (T) Array.get(array, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    /**
     * 功能描述:
     * 〈获取数组中指定多个下标元素值，组成新数组〉
     *
     * @params : [array, indexes]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 13:53
     */
    public static <T> T[] getAny(Object array, int... indexes) {
        if(null == array) {
            return null;
        }

        final T[] result = newArray(array.getClass().getComponentType(), indexes.length);
        for (int i : indexes) {
            result[i] = get(array, i);
        }
        return result;
    }

    /**
     * 功能描述:
     * 〈获取子数组〉
     *
     * @params : [array, start, end]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 13:54
     */
    public static <T> T[] sub(T[] array, int start, int end) {
        int length = length(array);
        if (start < 0) {
            start += length;
        }
        if (end < 0) {
            end += length;
        }
        if (start == length) {
            return newArray(array.getClass().getComponentType(), 0);
        }
        if (start > end) {
            int tmp = start;
            start = end;
            end = tmp;
        }
        if (end > length) {
            if (start >= length) {
                return newArray(array.getClass().getComponentType(), 0);
            }
            end = length;
        }
        return Arrays.copyOfRange(array, start, end);
    }

    /**
     * 功能描述:
     * 〈获取子数组〉
     *
     * @params : [array, start, end]
     * @return : byte[]
     * @author : cwl
     * @date : 2019/5/22 13:54
     */
    public static byte[] sub(byte[] array, int start, int end) {
        int length = length(array);
        if (start < 0) {
            start += length;
        }
        if (end < 0) {
            end += length;
        }
        if (start == length) {
            return new byte[0];
        }
        if (start > end) {
            int tmp = start;
            start = end;
            end = tmp;
        }
        if (end > length) {
            if (start >= length) {
                return new byte[0];
            }
            end = length;
        }
        return Arrays.copyOfRange(array, start, end);
    }

    /**
     * 功能描述:
     * 〈获取子数组〉
     *
     * @params : [array, start, end]
     * @return : int[]
     * @author : cwl
     * @date : 2019/5/22 13:54
     */
    public static int[] sub(int[] array, int start, int end) {
        int length = length(array);
        if (start < 0) {
            start += length;
        }
        if (end < 0) {
            end += length;
        }
        if (start == length) {
            return new int[0];
        }
        if (start > end) {
            int tmp = start;
            start = end;
            end = tmp;
        }
        if (end > length) {
            if (start >= length) {
                return new int[0];
            }
            end = length;
        }
        return Arrays.copyOfRange(array, start, end);
    }

    /**
     * 功能描述:
     * 〈获取子数组〉
     *
     * @params : [array, start, end]
     * @return : long[]
     * @author : cwl
     * @date : 2019/5/22 13:54
     */
    public static long[] sub(long[] array, int start, int end) {
        int length = length(array);
        if (start < 0) {
            start += length;
        }
        if (end < 0) {
            end += length;
        }
        if (start == length) {
            return new long[0];
        }
        if (start > end) {
            int tmp = start;
            start = end;
            end = tmp;
        }
        if (end > length) {
            if (start >= length) {
                return new long[0];
            }
            end = length;
        }
        return Arrays.copyOfRange(array, start, end);
    }

    /**
     * 功能描述:
     * 〈获取子数组〉
     *
     * @params : [array, start, end]
     * @return : short[]
     * @author : cwl
     * @date : 2019/5/22 13:55
     */
    public static short[] sub(short[] array, int start, int end) {
        int length = length(array);
        if (start < 0) {
            start += length;
        }
        if (end < 0) {
            end += length;
        }
        if (start == length) {
            return new short[0];
        }
        if (start > end) {
            int tmp = start;
            start = end;
            end = tmp;
        }
        if (end > length) {
            if (start >= length) {
                return new short[0];
            }
            end = length;
        }
        return Arrays.copyOfRange(array, start, end);
    }

    /**
     * 功能描述:
     * 〈获取子数组〉
     *
     * @params : [array, start, end]
     * @return : char[]
     * @author : cwl
     * @date : 2019/5/22 13:55
     */
    public static char[] sub(char[] array, int start, int end) {
        int length = length(array);
        if (start < 0) {
            start += length;
        }
        if (end < 0) {
            end += length;
        }
        if (start == length) {
            return new char[0];
        }
        if (start > end) {
            int tmp = start;
            start = end;
            end = tmp;
        }
        if (end > length) {
            if (start >= length) {
                return new char[0];
            }
            end = length;
        }
        return Arrays.copyOfRange(array, start, end);
    }

    /**
     * 功能描述:
     * 〈获取子数组〉
     *
     * @params : [array, start, end]
     * @return : double[]
     * @author : cwl
     * @date : 2019/5/22 13:55
     */
    public static double[] sub(double[] array, int start, int end) {
        int length = length(array);
        if (start < 0) {
            start += length;
        }
        if (end < 0) {
            end += length;
        }
        if (start == length) {
            return new double[0];
        }
        if (start > end) {
            int tmp = start;
            start = end;
            end = tmp;
        }
        if (end > length) {
            if (start >= length) {
                return new double[0];
            }
            end = length;
        }
        return Arrays.copyOfRange(array, start, end);
    }

    /**
     * 功能描述:
     * 〈获取子数组〉
     *
     * @params : [array, start, end]
     * @return : float[]
     * @author : cwl
     * @date : 2019/5/22 13:55
     */
    public static float[] sub(float[] array, int start, int end) {
        int length = length(array);
        if (start < 0) {
            start += length;
        }
        if (end < 0) {
            end += length;
        }
        if (start == length) {
            return new float[0];
        }
        if (start > end) {
            int tmp = start;
            start = end;
            end = tmp;
        }
        if (end > length) {
            if (start >= length) {
                return new float[0];
            }
            end = length;
        }
        return Arrays.copyOfRange(array, start, end);
    }

    /**
     * 功能描述:
     * 〈获取子数组〉
     *
     * @params : [array, start, end]
     * @return : boolean[]
     * @author : cwl
     * @date : 2019/5/22 13:55
     */
    public static boolean[] sub(boolean[] array, int start, int end) {
        int length = length(array);
        if (start < 0) {
            start += length;
        }
        if (end < 0) {
            end += length;
        }
        if (start == length) {
            return new boolean[0];
        }
        if (start > end) {
            int tmp = start;
            start = end;
            end = tmp;
        }
        if (end > length) {
            if (start >= length) {
                return new boolean[0];
            }
            end = length;
        }
        return Arrays.copyOfRange(array, start, end);
    }

    /**
     * 功能描述:
     * 〈获取子数组〉
     *
     * @params : [array, start, end]
     * @return : java.lang.Object[]
     * @author : cwl
     * @date : 2019/5/22 13:55
     */
    public static Object[] sub(Object array, int start, int end) {
        return sub(array, start, end, 1);
    }

    /**
     * 功能描述:
     * 〈获取子数组〉
     *
     * @params : [array, start, end, step]
     * @return : java.lang.Object[]
     * @author : cwl
     * @date : 2019/5/22 13:56
     */
    public static Object[] sub(Object array, int start, int end, int step) {
        int length = length(array);
        if (start < 0) {
            start += length;
        }
        if (end < 0) {
            end += length;
        }
        if (start == length) {
            return new Object[0];
        }
        if (start > end) {
            int tmp = start;
            start = end;
            end = tmp;
        }
        if (end > length) {
            if (start >= length) {
                return new Object[0];
            }
            end = length;
        }

        if (step <= 1) {
            step = 1;
        }

        final ArrayList<Object> list = new ArrayList<>();
        for (int i = start; i < end; i += step) {
            list.add(get(array, i));
        }

        return list.toArray();
    }

    /**
     * 功能描述:
     * 〈数组或集合转String〉
     *
     * @params : [obj]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/22 13:56
     */
    public static String toString(Object obj) {
        if (null == obj) {
            return null;
        }
        if (ArrayUtil.isArray(obj)) {
            try {
                return Arrays.deepToString((Object[]) obj);
            } catch (Exception e) {
                final String className = obj.getClass().getComponentType().getName();
                switch (className) {
                    case "long":
                        return Arrays.toString((long[]) obj);
                    case "int":
                        return Arrays.toString((int[]) obj);
                    case "short":
                        return Arrays.toString((short[]) obj);
                    case "char":
                        return Arrays.toString((char[]) obj);
                    case "byte":
                        return Arrays.toString((byte[]) obj);
                    case "boolean":
                        return Arrays.toString((boolean[]) obj);
                    case "float":
                        return Arrays.toString((float[]) obj);
                    case "double":
                        return Arrays.toString((double[]) obj);
                    default:
                        throw new UtilException(e);
                }
            }
        }
        return obj.toString();
    }

    /**
     * 功能描述:
     * 〈获取数组长度〉
     *
     * @params : [array]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 13:56
     */
    public static int length(Object array) throws IllegalArgumentException {
        if (null == array) {
            return 0;
        }
        return Array.getLength(array);
    }

    /**
     * 功能描述:
     * 〈以 conjunction 为分隔符将数组转换为字符串〉
     *
     * @params : [array, conjunction]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/22 13:56
     */
    public static String join(long[] array, CharSequence conjunction) {
        if (null == array) {
            return null;
        }

        final StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (long item : array) {
            if (isFirst) {
                isFirst = false;
            } else {
                sb.append(conjunction);
            }
            sb.append(item);
        }
        return sb.toString();
    }

    /**
     * 功能描述:
     * 〈以 conjunction 为分隔符将数组转换为字符串〉
     *
     * @params : [array, conjunction]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/22 13:56
     */
    public static String join(int[] array, CharSequence conjunction) {
        if (null == array) {
            return null;
        }

        final StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (int item : array) {
            if (isFirst) {
                isFirst = false;
            } else {
                sb.append(conjunction);
            }
            sb.append(item);
        }
        return sb.toString();
    }

    /**
     * 功能描述:
     * 〈以 conjunction 为分隔符将数组转换为字符串〉
     *
     * @params : [array, conjunction]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/22 13:56
     */
    public static String join(short[] array, CharSequence conjunction) {
        if (null == array) {
            return null;
        }

        final StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (short item : array) {
            if (isFirst) {
                isFirst = false;
            } else {
                sb.append(conjunction);
            }
            sb.append(item);
        }
        return sb.toString();
    }

    /**
     * 功能描述:
     * 〈以 conjunction 为分隔符将数组转换为字符串〉
     *
     * @params : [array, conjunction]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/22 13:56
     */
    public static String join(char[] array, CharSequence conjunction) {
        if (null == array) {
            return null;
        }

        final StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (char item : array) {
            if (isFirst) {
                isFirst = false;
            } else {
                sb.append(conjunction);
            }
            sb.append(item);
        }
        return sb.toString();
    }

    /**
     * 功能描述:
     * 〈以 conjunction 为分隔符将数组转换为字符串〉
     *
     * @params : [array, conjunction]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/22 13:56
     */
    public static String join(byte[] array, CharSequence conjunction) {
        if (null == array) {
            return null;
        }

        final StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (byte item : array) {
            if (isFirst) {
                isFirst = false;
            } else {
                sb.append(conjunction);
            }
            sb.append(item);
        }
        return sb.toString();
    }

    /**
     * 功能描述:
     * 〈以 conjunction 为分隔符将数组转换为字符串〉
     *
     * @params : [array, conjunction]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/22 13:56
     */
    public static String join(boolean[] array, CharSequence conjunction) {
        if (null == array) {
            return null;
        }

        final StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (boolean item : array) {
            if (isFirst) {
                isFirst = false;
            } else {
                sb.append(conjunction);
            }
            sb.append(item);
        }
        return sb.toString();
    }

    /**
     * 功能描述:
     * 〈以 conjunction 为分隔符将数组转换为字符串〉
     *
     * @params : [array, conjunction]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/22 13:56
     */
    public static String join(float[] array, CharSequence conjunction) {
        if (null == array) {
            return null;
        }

        final StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (float item : array) {
            if (isFirst) {
                isFirst = false;
            } else {
                sb.append(conjunction);
            }
            sb.append(item);
        }
        return sb.toString();
    }

    /**
     * 功能描述:
     * 〈以 conjunction 为分隔符将数组转换为字符串〉
     *
     * @params : [array, conjunction]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/22 13:56
     */
    public static String join(double[] array, CharSequence conjunction) {
        if (null == array) {
            return null;
        }

        final StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (double item : array) {
            if (isFirst) {
                isFirst = false;
            } else {
                sb.append(conjunction);
            }
            sb.append(item);
        }
        return sb.toString();
    }

    /**
     * 功能描述:
     * 〈以 conjunction 为分隔符将数组转换为字符串〉
     *
     * @params : [array, conjunction]
     * @return : java.lang.String
     * @author : cwl
     * @date : 2019/5/22 13:56
     */
    public static String join(Object array, CharSequence conjunction) {
        if (isArray(array)) {
            final Class<?> componentType = array.getClass().getComponentType();
            if (componentType.isPrimitive()) {
                final String componentTypeName = componentType.getName();
                switch (componentTypeName) {
                    case "long":
                        return join((long[]) array, conjunction);
                    case "int":
                        return join((int[]) array, conjunction);
                    case "short":
                        return join((short[]) array, conjunction);
                    case "char":
                        return join((char[]) array, conjunction);
                    case "byte":
                        return join((byte[]) array, conjunction);
                    case "boolean":
                        return join((boolean[]) array, conjunction);
                    case "float":
                        return join((float[]) array, conjunction);
                    case "double":
                        return join((double[]) array, conjunction);
                    default:
                        throw new UtilException("Unknown primitive type: [{}]", componentTypeName);
                }
            } else {
                return join((Object[]) array, conjunction);
            }
        }
        throw new UtilException("Argument is not a Array!", array.getClass());
    }

    /**
     * 功能描述:
     * 〈ByteBuffer转byte数组〉
     *
     * @params : [bytebuffer]
     * @return : byte[]
     * @author : cwl
     * @date : 2019/5/22 13:58
     */
    public static byte[] toArray(ByteBuffer bytebuffer) {
        if (false == bytebuffer.hasArray()) {
            int oldPosition = bytebuffer.position();
            bytebuffer.position(0);
            int size = bytebuffer.limit();
            byte[] buffers = new byte[size];
            bytebuffer.get(buffers);
            bytebuffer.position(oldPosition);
            return buffers;
        } else {
            return Arrays.copyOfRange(bytebuffer.array(), bytebuffer.position(), bytebuffer.limit());
        }
    }

    /**
     * 功能描述:
     * 〈将集合转为数组〉
     *
     * @params : [collection, componentType]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 13:59
     */
    public static <T> T[] toArray(Collection<T> collection, Class<T> componentType) {
        final T[] array = newArray(componentType, collection.size());
        return collection.toArray(array);
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素〉
     *
     * @params : [array, index]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 17:25
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] remove(T[] array, int index) throws IllegalArgumentException {
        return (T[]) remove((Object) array, index);
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素〉
     *
     * @params : [array, index]
     * @return : long[]
     * @author : cwl
     * @date : 2019/5/22 17:26
     */
    public static long[] remove(long[] array, int index) throws IllegalArgumentException {
        return (long[]) remove((Object) array, index);
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素〉
     *
     * @params : [array, index]
     * @return : int[]
     * @author : cwl
     * @date : 2019/5/22 17:26
     */
    public static int[] remove(int[] array, int index) throws IllegalArgumentException {
        return (int[]) remove((Object) array, index);
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素〉
     *
     * @params : [array, index]
     * @return : short[]
     * @author : cwl
     * @date : 2019/5/22 17:26
     */
    public static short[] remove(short[] array, int index) throws IllegalArgumentException {
        return (short[]) remove((Object) array, index);
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素〉
     *
     * @params : [array, index]
     * @return : char[]
     * @author : cwl
     * @date : 2019/5/22 17:27
     */
    public static char[] remove(char[] array, int index) throws IllegalArgumentException {
        return (char[]) remove((Object) array, index);
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素〉
     *
     * @params : [array, index]
     * @return : byte[]
     * @author : cwl
     * @date : 2019/5/22 17:27
     */
    public static byte[] remove(byte[] array, int index) throws IllegalArgumentException {
        return (byte[]) remove((Object) array, index);
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素〉
     *
     * @params : [array, index]
     * @return : double[]
     * @author : cwl
     * @date : 2019/5/22 17:27
     */
    public static double[] remove(double[] array, int index) throws IllegalArgumentException {
        return (double[]) remove((Object) array, index);
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素〉
     *
     * @params : [array, index]
     * @return : float[]
     * @author : cwl
     * @date : 2019/5/22 17:27
     */
    public static float[] remove(float[] array, int index) throws IllegalArgumentException {
        return (float[]) remove((Object) array, index);
    }

    /**
     * 移除数组中对应位置的元素<br>
     * copy from commons-lang
     *
     * @param array 数组对象，可以是对象数组，也可以原始类型数组
     * @param index 位置，如果位置小于0或者大于长度，返回原数组
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     * @since 3.0.8
     */
    public static boolean[] remove(boolean[] array, int index) throws IllegalArgumentException {
        return (boolean[]) remove((Object) array, index);
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素〉
     *
     * @params : [array, index]
     * @return : java.lang.Object
     * @author : cwl
     * @date : 2019/5/22 17:28
     */
    public static Object remove(Object array, int index) throws IllegalArgumentException {
        if (null == array) {
            return array;
        }
        int length = length(array);
        if (index < 0 || index >= length) {
            return array;
        }

        final Object result = Array.newInstance(array.getClass().getComponentType(), length - 1);
        System.arraycopy(array, 0, result, 0, index);
        if (index < length - 1) {
            // 后半部分
            System.arraycopy(array, index + 1, result, index, length - index - 1);
        }

        return result;
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素.只会移除匹配到的第一个元素〉
     *
     * @params : [array, element]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 17:28
     */
    public static <T> T[] removeEle(T[] array, T element) throws IllegalArgumentException {
        return remove(array, indexOf(array, element));
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素.只会移除匹配到的第一个元素〉
     *
     * @params : [array, element]
     * @return : long[]
     * @author : cwl
     * @date : 2019/5/22 17:28
     */
    public static long[] removeEle(long[] array, long element) throws IllegalArgumentException {
        return remove(array, indexOf(array, element));
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素.只会移除匹配到的第一个元素〉
     *
     * @params : [array, element]
     * @return : int[]
     * @author : cwl
     * @date : 2019/5/22 17:48
     */
    public static int[] removeEle(int[] array, int element) throws IllegalArgumentException {
        return remove(array, indexOf(array, element));
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素.只会移除匹配到的第一个元素〉
     *
     * @params : [array, element]
     * @return : short[]
     * @author : cwl
     * @date : 2019/5/22 17:49
     */
    public static short[] removeEle(short[] array, short element) throws IllegalArgumentException {
        return remove(array, indexOf(array, element));
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素.只会移除匹配到的第一个元素〉
     *
     * @params : [array, element]
     * @return : char[]
     * @author : cwl
     * @date : 2019/5/22 17:49
     */
    public static char[] removeEle(char[] array, char element) throws IllegalArgumentException {
        return remove(array, indexOf(array, element));
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素.只会移除匹配到的第一个元素〉
     *
     * @params : [array, element]
     * @return : byte[]
     * @author : cwl
     * @date : 2019/5/22 17:49
     */
    public static byte[] removeEle(byte[] array, byte element) throws IllegalArgumentException {
        return remove(array, indexOf(array, element));
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素.只会移除匹配到的第一个元素〉
     *
     * @params : [array, element]
     * @return : double[]
     * @author : cwl
     * @date : 2019/5/22 17:49
     */
    public static double[] removeEle(double[] array, double element) throws IllegalArgumentException {
        return remove(array, indexOf(array, element));
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素.只会移除匹配到的第一个元素〉
     *
     * @params : [array, element]
     * @return : float[]
     * @author : cwl
     * @date : 2019/5/22 17:49
     */
    public static float[] removeEle(float[] array, float element) throws IllegalArgumentException {
        return remove(array, indexOf(array, element));
    }

    /**
     * 功能描述:
     * 〈移除数组中对应位置的元素.只会移除匹配到的第一个元素〉
     *
     * @params : [array, element]
     * @return : boolean[]
     * @author : cwl
     * @date : 2019/5/22 17:49
     */
    public static boolean[] removeEle(boolean[] array, boolean element) throws IllegalArgumentException {
        return remove(array, indexOf(array, element));
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array, startIndexInclusive, endIndexExclusive]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 17:50
     */
    public static <T> T[] reverse(final T[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (isEmpty(array)) {
            return array;
        }
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = Math.min(array.length, endIndexExclusive) - 1;
        T tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/22 17:50
     */
    public static <T> T[] reverse(final T[] array) {
        return reverse(array, 0, array.length);
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array, startIndexInclusive, endIndexExclusive]
     * @return : long[]
     * @author : cwl
     * @date : 2019/5/22 17:51
     */
    public static long[] reverse(final long[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (isEmpty(array)) {
            return array;
        }
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = Math.min(array.length, endIndexExclusive) - 1;
        long tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array]
     * @return : long[]
     * @author : cwl
     * @date : 2019/5/22 17:51
     */
    public static long[] reverse(final long[] array) {
        return reverse(array, 0, array.length);
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array, startIndexInclusive, endIndexExclusive]
     * @return : int[]
     * @author : cwl
     * @date : 2019/5/22 17:51
     */
    public static int[] reverse(final int[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (isEmpty(array)) {
            return array;
        }
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = Math.min(array.length, endIndexExclusive) - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array]
     * @return : int[]
     * @author : cwl
     * @date : 2019/5/22 17:51
     */
    public static int[] reverse(final int[] array) {
        return reverse(array, 0, array.length);
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array, startIndexInclusive, endIndexExclusive]
     * @return : short[]
     * @author : cwl
     * @date : 2019/5/22 17:51
     */
    public static short[] reverse(final short[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (isEmpty(array)) {
            return array;
        }
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = Math.min(array.length, endIndexExclusive) - 1;
        short tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array]
     * @return : short[]
     * @author : cwl
     * @date : 2019/5/22 17:51
     */
    public static short[] reverse(final short[] array) {
        return reverse(array, 0, array.length);
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array, startIndexInclusive, endIndexExclusive]
     * @return : char[]
     * @author : cwl
     * @date : 2019/5/22 17:51
     */
    public static char[] reverse(final char[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (isEmpty(array)) {
            return array;
        }
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = Math.min(array.length, endIndexExclusive) - 1;
        char tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array]
     * @return : char[]
     * @author : cwl
     * @date : 2019/5/22 17:52
     */
    public static char[] reverse(final char[] array) {
        return reverse(array, 0, array.length);
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array, startIndexInclusive, endIndexExclusive]
     * @return : byte[]
     * @author : cwl
     * @date : 2019/5/22 17:52
     */
    public static byte[] reverse(final byte[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (isEmpty(array)) {
            return array;
        }
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = Math.min(array.length, endIndexExclusive) - 1;
        byte tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array]
     * @return : byte[]
     * @author : cwl
     * @date : 2019/5/22 17:52
     */
    public static byte[] reverse(final byte[] array) {
        return reverse(array, 0, array.length);
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array, startIndexInclusive, endIndexExclusive]
     * @return : double[]
     * @author : cwl
     * @date : 2019/5/22 17:52
     */
    public static double[] reverse(final double[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (isEmpty(array)) {
            return array;
        }
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = Math.min(array.length, endIndexExclusive) - 1;
        double tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array]
     * @return : double[]
     * @author : cwl
     * @date : 2019/5/22 17:52
     */
    public static double[] reverse(final double[] array) {
        return reverse(array, 0, array.length);
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array, startIndexInclusive, endIndexExclusive]
     * @return : float[]
     * @author : cwl
     * @date : 2019/5/22 17:52
     */
    public static float[] reverse(final float[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (isEmpty(array)) {
            return array;
        }
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = Math.min(array.length, endIndexExclusive) - 1;
        float tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array]
     * @return : float[]
     * @author : cwl
     * @date : 2019/5/22 17:53
     */
    public static float[] reverse(final float[] array) {
        return reverse(array, 0, array.length);
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array, startIndexInclusive, endIndexExclusive]
     * @return : boolean[]
     * @author : cwl
     * @date : 2019/5/22 17:53
     */
    public static boolean[] reverse(final boolean[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (isEmpty(array)) {
            return array;
        }
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = Math.min(array.length, endIndexExclusive) - 1;
        boolean tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        return array;
    }

    /**
     * 功能描述:
     * 〈反转数组，会变更原数组〉
     *
     * @params : [array]
     * @return : boolean[]
     * @author : cwl
     * @date : 2019/5/22 17:53
     */
    public static boolean[] reverse(final boolean[] array) {
        return reverse(array, 0, array.length);
    }

    /**
     * 功能描述:
     * 〈取最小值〉
     *
     * @params : [numberArray]
     * @return : T
     * @author : cwl
     * @date : 2019/5/22 17:55
     */
    public static <T extends Comparable<? super T>> T min(T[] numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        T min = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (min.compareTo(numberArray[i]) > 0) {
                min = numberArray[i];
            }
        }
        return min;
    }

    /**
     * 功能描述:
     * 〈取最小值〉
     *
     * @params : [numberArray]
     * @return : long
     * @author : cwl
     * @date : 2019/5/22 17:55
     */
    public static long min(long... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        long min = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (min > numberArray[i]) {
                min = numberArray[i];
            }
        }
        return min;
    }

    /**
     * 功能描述:
     * 〈取最小值〉
     *
     * @params : [numberArray]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 17:55
     */
    public static int min(int... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        int min = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (min > numberArray[i]) {
                min = numberArray[i];
            }
        }
        return min;
    }

    /**
     * 功能描述:
     * 〈取最小值〉
     *
     * @params : [numberArray]
     * @return : short
     * @author : cwl
     * @date : 2019/5/22 17:56
     */
    public static short min(short... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        short min = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (min > numberArray[i]) {
                min = numberArray[i];
            }
        }
        return min;
    }

    /**
     * 功能描述:
     * 〈取最小值〉
     *
     * @params : [numberArray]
     * @return : char
     * @author : cwl
     * @date : 2019/5/22 17:57
     */
    public static char min(char... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        char min = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (min > numberArray[i]) {
                min = numberArray[i];
            }
        }
        return min;
    }

    /**
     * 功能描述:
     * 〈取最小值〉
     *
     * @params : [numberArray]
     * @return : byte
     * @author : cwl
     * @date : 2019/5/22 17:58
     */
    public static byte min(byte... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        byte min = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (min > numberArray[i]) {
                min = numberArray[i];
            }
        }
        return min;
    }

    /**
     * 功能描述:
     * 〈取最小值〉
     *
     * @params : [numberArray]
     * @return : double
     * @author : cwl
     * @date : 2019/5/22 17:58
     */
    public static double min(double... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        double min = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (min > numberArray[i]) {
                min = numberArray[i];
            }
        }
        return min;
    }

    /**
     * 功能描述:
     * 〈取最小值〉
     *
     * @params : [numberArray]
     * @return : float
     * @author : cwl
     * @date : 2019/5/22 17:58
     */
    public static float min(float... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        float min = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (min > numberArray[i]) {
                min = numberArray[i];
            }
        }
        return min;
    }

    /**
     * 功能描述:
     * 〈取最大值〉
     *
     * @params : [numberArray]
     * @return : T
     * @author : cwl
     * @date : 2019/5/22 17:58
     */
    public static <T extends Comparable<? super T>> T max(T[] numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        T max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (max.compareTo(numberArray[i])< 0) {
                max = numberArray[i];
            }
        }
        return max;
    }

    /**
     * 功能描述:
     * 〈取最大值〉
     *
     * @params : [numberArray]
     * @return : long
     * @author : cwl
     * @date : 2019/5/22 17:58
     */
    public static long max(long... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        long max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (max < numberArray[i]) {
                max = numberArray[i];
            }
        }
        return max;
    }

    /**
     * 功能描述:
     * 〈取最大值〉
     *
     * @params : [numberArray]
     * @return : int
     * @author : cwl
     * @date : 2019/5/22 17:59
     */
    public static int max(int... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        int max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (max < numberArray[i]) {
                max = numberArray[i];
            }
        }
        return max;
    }

    /**
     * 功能描述:
     * 〈取最大值〉
     *
     * @params : [numberArray]
     * @return : short
     * @author : cwl
     * @date : 2019/5/22 17:59
     */
    public static short max(short... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        short max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (max < numberArray[i]) {
                max = numberArray[i];
            }
        }
        return max;
    }

    /**
     * 功能描述:
     * 〈取最大值〉
     *
     * @params : [numberArray]
     * @return : char
     * @author : cwl
     * @date : 2019/5/22 17:59
     */
    public static char max(char... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        char max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (max < numberArray[i]) {
                max = numberArray[i];
            }
        }
        return max;
    }

    /**
     * 功能描述:
     * 〈取最大值〉
     *
     * @params : [numberArray]
     * @return : byte
     * @author : cwl
     * @date : 2019/5/22 17:59
     */
    public static byte max(byte... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        byte max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (max < numberArray[i]) {
                max = numberArray[i];
            }
        }
        return max;
    }

    /**
     * 功能描述:
     * 〈取最大值〉
     *
     * @params : [numberArray]
     * @return : double
     * @author : cwl
     * @date : 2019/5/23 15:12
     */
    public static double max(double... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        double max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (max < numberArray[i]) {
                max = numberArray[i];
            }
        }
        return max;
    }

    /**
     * 功能描述:
     * 〈取最大值〉
     *
     * @params : [numberArray]
     * @return : float
     * @author : cwl
     * @date : 2019/5/23 15:12
     */
    public static float max(float... numberArray) {
        if (isEmpty(numberArray)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        float max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (max < numberArray[i]) {
                max = numberArray[i];
            }
        }
        return max;
    }

    /**
     * 功能描述:
     * 〈交换数组中两个位置的值〉
     *
     * @params : [array, index1, index2]
     * @return : int[]
     * @author : cwl
     * @date : 2019/5/23 15:13
     */
    public static int[] swap(int[] array, int index1, int index2) {
        if (isEmpty(array)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        return array;
    }

    /**
     * 功能描述:
     * 〈交换数组中两个位置的值〉
     *
     * @params : [array, index1, index2]
     * @return : long[]
     * @author : cwl
     * @date : 2019/5/23 15:14
     */
    public static long[] swap(long[] array, int index1, int index2) {
        if (isEmpty(array)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        long tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        return array;
    }

    /**
     * 功能描述:
     * 〈交换数组中两个位置的值〉
     *
     * @params : [array, index1, index2]
     * @return : double[]
     * @author : cwl
     * @date : 2019/5/23 15:14
     */
    public static double[] swap(double[] array, int index1, int index2) {
        if (isEmpty(array)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        double tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        return array;
    }

    /**
     * 功能描述:
     * 〈交换数组中两个位置的值〉
     *
     * @params : [array, index1, index2]
     * @return : float[]
     * @author : cwl
     * @date : 2019/5/23 15:14
     */
    public static float[] swap(float[] array, int index1, int index2) {
        if (isEmpty(array)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        float tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        return array;
    }

    /**
     * 功能描述:
     * 〈交换数组中两个位置的值〉
     *
     * @params : [array, index1, index2]
     * @return : boolean[]
     * @author : cwl
     * @date : 2019/5/23 15:15
     */
    public static boolean[] swap(boolean[] array, int index1, int index2) {
        if (isEmpty(array)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        boolean tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        return array;
    }

    /**
     * 功能描述:
     * 〈交换数组中两个位置的值〉
     *
     * @params : [array, index1, index2]
     * @return : byte[]
     * @author : cwl
     * @date : 2019/5/23 15:15
     */
    public static byte[] swap(byte[] array, int index1, int index2) {
        if (isEmpty(array)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        byte tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        return array;
    }

    /**
     * 功能描述:
     * 〈交换数组中两个位置的值〉
     *
     * @params : [array, index1, index2]
     * @return : char[]
     * @author : cwl
     * @date : 2019/5/23 15:15
     */
    public static char[] swap(char[] array, int index1, int index2) {
        if (isEmpty(array)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        char tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        return array;
    }

    /**
     * 功能描述:
     * 〈交换数组中两个位置的值〉
     *
     * @params : [array, index1, index2]
     * @return : short[]
     * @author : cwl
     * @date : 2019/5/23 15:15
     */
    public static short[] swap(short[] array, int index1, int index2) {
        if (isEmpty(array)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        short tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        return array;
    }

    /**
     * 功能描述:
     * 〈交换数组中两个位置的值〉
     *
     * @params : [array, index1, index2]
     * @return : T[]
     * @author : cwl
     * @date : 2019/5/23 15:15
     */
    public static <T> T[] swap(T[] array, int index1, int index2) {
        if (isEmpty(array)) {
            throw new IllegalArgumentException("Array must not empty !");
        }
        T tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        return array;
    }

    /**
     * 功能描述:
     * 〈交换数组中两个位置的值〉
     *
     * @params : [array, index1, index2]
     * @return : java.lang.Object
     * @author : cwl
     * @date : 2019/5/23 15:16
     */
    public static Object swap(Object array, int index1, int index2) {
        if (isEmpty(array)) {
            throw new IllegalArgumentException("Array must not empty !");
        }
        Object tmp = get(array, index1);
        Array.set(array, index1, Array.get(array, index2));
        Array.set(array, index2, tmp);
        return array;
    }
}


