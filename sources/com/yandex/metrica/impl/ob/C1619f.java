package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1619f {
    public static <T extends AbstractC1594e> String a(T t10) {
        StringBuilder sbA;
        String message;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            a(null, t10, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e10) {
            sbA = defpackage.a.a("Error printing proto: ");
            message = e10.getMessage();
            sbA.append(message);
            return sbA.toString();
        } catch (InvocationTargetException e11) {
            sbA = defpackage.a.a("Error printing proto: ");
            message = e11.getMessage();
            sbA.append(message);
            return sbA.toString();
        }
    }

    private static String a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (i10 == 0) {
                cCharAt = Character.toLowerCase(cCharAt);
            } else if (Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_');
                cCharAt = Character.toLowerCase(cCharAt);
            }
            stringBuffer.append(cCharAt);
        }
        return stringBuffer.toString();
    }

    private static void a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        String str2;
        if (obj == null) {
            return;
        }
        if (obj instanceof AbstractC1594e) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(a(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if ((modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                        a(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i10 = 0; i10 < length2; i10++) {
                            a(name, Array.get(obj2, i10), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method method : cls.getMethods()) {
                String name2 = method.getName();
                if (name2.startsWith("set")) {
                    String strSubstring = name2.substring(3);
                    try {
                        if (((Boolean) cls.getMethod("has" + strSubstring, new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            a(strSubstring, cls.getMethod("get" + strSubstring, new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
            if (str == null) {
                return;
            }
            stringBuffer.setLength(length);
            stringBuffer2.append(stringBuffer);
            str2 = ">\n";
        } else {
            String strA = a(str);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(strA);
            stringBuffer2.append(": ");
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!str3.startsWith("http") && str3.length() > 200) {
                    str3 = str3.substring(0, 200) + "[...]";
                }
                int length3 = str3.length();
                StringBuilder sb2 = new StringBuilder(length3);
                for (int i11 = 0; i11 < length3; i11++) {
                    char cCharAt = str3.charAt(i11);
                    if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'') {
                        sb2.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                    } else {
                        sb2.append(cCharAt);
                    }
                }
                String string = sb2.toString();
                stringBuffer2.append("\"");
                stringBuffer2.append(string);
                stringBuffer2.append("\"");
            } else if (obj instanceof byte[]) {
                stringBuffer2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                for (byte b10 : (byte[]) obj) {
                    int i12 = b10 & 255;
                    if (i12 == 92 || i12 == 34) {
                        stringBuffer2.append(CoreConstants.ESCAPE_CHAR);
                    } else {
                        if (i12 < 32 || i12 >= 127) {
                            stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i12)));
                        }
                    }
                    stringBuffer2.append((char) i12);
                }
                stringBuffer2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else {
                stringBuffer2.append(obj);
            }
            str2 = "\n";
        }
        stringBuffer2.append(str2);
    }
}
