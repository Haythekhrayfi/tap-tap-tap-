package com.yandex.mobile.ads.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class u00 {
    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e10) {
            if ("0".equals(str) || "-1".equals(str)) {
                Object[] objArr = {str};
                boolean z10 = ci1.f19511a;
                x60.e("Unable to parse dateStr: %s, falling back to 0", objArr);
                return 0L;
            }
            Object[] objArr2 = {str};
            boolean z11 = ci1.f19511a;
            x60.a(e10, "Unable to parse dateStr: %s, falling back to 0", objArr2);
            return 0L;
        }
    }

    public static eg.a a(wm0 wm0Var) {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = wm0Var.f26321c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jA = str != null ? a(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            int i11 = 0;
            j10 = 0;
            j11 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j10 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
            z10 = true;
        } else {
            z10 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = map.get("Expires");
        long jA2 = str3 != null ? a(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long jA3 = str4 != null ? a(str4) : 0L;
        String str5 = map.get("ETag");
        if (z10) {
            j13 = jCurrentTimeMillis + (j10 * 1000);
            if (i10 != 0) {
                j12 = j13;
            } else {
                j12 = j13;
                j13 = (j11 * 1000) + j13;
            }
        } else {
            j12 = 0;
            if (jA <= 0 || jA2 < jA) {
                j13 = 0;
            } else {
                j13 = jCurrentTimeMillis + (jA2 - jA);
                j12 = j13;
            }
        }
        eg.a aVar = new eg.a();
        aVar.f20239a = wm0Var.f26320b;
        aVar.f20240b = str5;
        aVar.f20244f = j12;
        aVar.f20243e = j13;
        aVar.f20241c = jA;
        aVar.f20242d = jA3;
        aVar.f20245g = map;
        aVar.f20246h = wm0Var.f26322d;
        return aVar;
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

    public static Map<String, String> a(eg.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        String str = aVar.f20240b;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        long j10 = aVar.f20242d;
        if (j10 > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put("If-Modified-Since", simpleDateFormat.format(new Date(j10)));
        }
        return map;
    }
}
