package com.yandex.mobile.ads.impl;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class qy {

    public interface a<T> {
        T a(String str);
    }

    public static String a(Map<String, String> map) {
        String str;
        if (map != null && (str = map.get("Content-Type")) != null) {
            String[] strArrSplit = str.split(";", 0);
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return "ISO-8859-1";
    }

    public static ArrayList a(Map map, int i10, a aVar) {
        ArrayList arrayList = new ArrayList();
        String str = (String) map.get(t00.b(i10));
        if (str != null && !str.isEmpty()) {
            Object objSplit = str.split(",");
            if (objSplit == null) {
                objSplit = new Object[0];
            }
            for (String str2 : (String[]) objSplit) {
                try {
                    String strDecode = URLDecoder.decode(str2.trim(), "UTF-8");
                    if (aVar.a(strDecode) != null) {
                        arrayList.add(aVar.a(strDecode));
                    }
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    public static boolean a(Map map, int i10) {
        String str = (String) map.get(t00.b(i10));
        if (str == null) {
            return false;
        }
        return Boolean.parseBoolean(str);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Object;)I */
    public static int b(Map map, int i10) {
        String str = (String) map.get(t00.b(i10));
        int i11 = t6.f25286b;
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Object;)Ljava/lang/Integer; */
    public static Integer c(Map map, int i10) {
        String str = (String) map.get(t00.b(i10));
        int i11 = t6.f25286b;
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Object;)Ljava/lang/String; */
    public static String d(Map map, int i10) {
        ArrayList arrayListE = e(map, i10);
        if (arrayListE.isEmpty()) {
            return null;
        }
        return (String) arrayListE.get(0);
    }

    public static ArrayList e(Map map, int i10) {
        ArrayList arrayList = new ArrayList();
        String str = (String) map.get(t00.b(i10));
        if (str != null && !str.isEmpty()) {
            Object objSplit = str.split(",");
            if (objSplit == null) {
                objSplit = new Object[0];
            }
            for (String str2 : (String[]) objSplit) {
                try {
                    String strDecode = URLDecoder.decode(str2.trim(), "UTF-8");
                    if (strDecode != null) {
                        arrayList.add(strDecode);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }
}
