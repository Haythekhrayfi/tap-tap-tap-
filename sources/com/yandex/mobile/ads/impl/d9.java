package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class d9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArraySet<Logger> f19782a = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f19783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19784c = 0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r10 = yn0.class.getPackage();
        String name = r10 != null ? r10.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(yn0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(e00.class.getName(), "okhttp.Http2");
        linkedHashMap.put(c61.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttplib.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f19783b = kc.f0.k(linkedHashMap);
    }

    public static void a() {
        for (Map.Entry<String, String> entry : f19783b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Logger logger = Logger.getLogger(key);
            if (f19782a.add(logger)) {
                logger.setUseParentHandlers(false);
                logger.setLevel(Log.isLoggable(value, 3) ? Level.FINE : Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING);
                logger.addHandler(e9.f20127a);
            }
        }
    }

    public static void a(String str, int i10, String str2, Throwable th) {
        int iMin;
        fd.j0.i(str, "loggerName");
        fd.j0.i(str2, "message");
        String strB0 = f19783b.get(str);
        if (strB0 == null) {
            strB0 = ed.w.b0(str, 23);
        }
        if (Log.isLoggable(strB0, i10)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i11 = 0;
            while (i11 < length) {
                int iD = ed.u.D(str2, '\n', i11, false, 4);
                if (iD == -1) {
                    iD = length;
                }
                while (true) {
                    iMin = Math.min(iD, i11 + 4000);
                    String strSubstring = str2.substring(i11, iMin);
                    fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strB0, strSubstring);
                    if (iMin >= iD) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }
}
