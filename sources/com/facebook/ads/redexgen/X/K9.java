package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class K9 {
    public static String[] A01 = {"vWOWhJ9TqiA1ty478f", "MWb8A3Nd6tPLcAimCp0hVAmYX6QHiaZm", "Xd3YBUkiMhOleC4V056rVyOXhinwtSii", "tT8mJINbcEXXPPmKiWyTepfA0JHaFg93", "WoudJsrKOqRuVhNYSdRTZjqc00A0B3WY", "YTheXaZSxrm1KPF5Yd", "huHeChgRkwF7QVPgKoMeW6tLhEc13T9K", "ASVM8zHOtJrSOKsDwpZwweqDqvgS8KFW"};
    public static final ThreadLocal<K9> A02 = new ThreadLocal<>();
    public final C0975Js A00 = new C0975Js();

    public static C0975Js A00() {
        return A02().A00;
    }

    public static C0975Js A01(K8 k10) {
        C0975Js currentStackTraces = new C0975Js(A00());
        currentStackTraces.add(k10);
        return currentStackTraces;
    }

    public static K9 A02() {
        ThreadLocal<K9> threadLocal = A02;
        K9 k10 = threadLocal.get();
        String[] strArr = A01;
        if (strArr[6].charAt(1) == strArr[2].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "JnfSkSuIf6osqUQGv4Nkh0Vi2QZsQFPV";
        strArr2[4] = "e9u3CRl6fKpCeCDR9nRPR0cml03xK1Bs";
        if (k10 == null) {
            K9 k11 = new K9();
            threadLocal.set(k11);
            return k11;
        }
        return k10;
    }

    public static void A03(K4 k10) {
        C0975Js c0975JsA05 = k10.A05();
        if (c0975JsA05 != null) {
            C0975Js createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(c0975JsA05);
        }
    }

    public static void A04(K4 k10) {
        C0975Js c0975JsA05 = k10.A05();
        if (c0975JsA05 != null) {
            C0975Js createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.removeAll(c0975JsA05);
        }
    }
}
