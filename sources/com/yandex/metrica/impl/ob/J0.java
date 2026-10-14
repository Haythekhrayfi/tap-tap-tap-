package com.yandex.metrica.impl.ob;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<Integer> f14258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final EnumSet<EnumC1745k1> f14259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final EnumSet<EnumC1745k1> f14260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final EnumSet<EnumC1745k1> f14261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final EnumSet<EnumC1745k1> f14262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final EnumSet<EnumC1745k1> f14263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final EnumSet<EnumC1745k1> f14264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final EnumSet<EnumC1745k1> f14265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List<Integer> f14266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List<Integer> f14267j;

    static {
        Integer[] numArr = {Integer.valueOf(EnumC1745k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.b()), Integer.valueOf(EnumC1745k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.b()), Integer.valueOf(EnumC1745k1.EVENT_TYPE_EXCEPTION_USER.b()), Integer.valueOf(EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b()), Integer.valueOf(EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.b()), Integer.valueOf(EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.b()), Integer.valueOf(EnumC1745k1.EVENT_TYPE_ANR.b())};
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < 7; i10++) {
            hashSet.add(numArr[i10]);
        }
        f14258a = Collections.unmodifiableSet(hashSet);
        EnumC1745k1 enumC1745k1 = EnumC1745k1.EVENT_TYPE_UNDEFINED;
        EnumC1745k1 enumC1745k2 = EnumC1745k1.EVENT_TYPE_SEND_REFERRER;
        EnumC1745k1 enumC1745k3 = EnumC1745k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC1745k1 enumC1745k4 = EnumC1745k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC1745k1 enumC1745k5 = EnumC1745k1.EVENT_TYPE_ACTIVATION;
        EnumC1745k1 enumC1745k6 = EnumC1745k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        EnumC1745k1 enumC1745k7 = EnumC1745k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC1745k1 enumC1745k8 = EnumC1745k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        f14259b = EnumSet.of(enumC1745k1, EnumC1745k1.EVENT_TYPE_PURGE_BUFFER, enumC1745k2, enumC1745k3, enumC1745k4, enumC1745k5, enumC1745k6, enumC1745k7, enumC1745k8);
        EnumC1745k1 enumC1745k9 = EnumC1745k1.EVENT_TYPE_SET_USER_INFO;
        EnumC1745k1 enumC1745k10 = EnumC1745k1.EVENT_TYPE_REPORT_USER_INFO;
        EnumC1745k1 enumC1745k11 = EnumC1745k1.EVENT_TYPE_INIT;
        EnumC1745k1 enumC1745k12 = EnumC1745k1.EVENT_TYPE_APP_UPDATE;
        f14260c = EnumSet.of(enumC1745k9, enumC1745k10, EnumC1745k1.EVENT_TYPE_IDENTITY, enumC1745k1, enumC1745k11, enumC1745k12, enumC1745k2, EnumC1745k1.EVENT_TYPE_ALIVE, EnumC1745k1.EVENT_TYPE_STARTUP, enumC1745k3, enumC1745k4, enumC1745k5, enumC1745k6, enumC1745k7, enumC1745k8, EnumC1745k1.EVENT_TYPE_WEBVIEW_SYNC);
        EnumC1745k1 enumC1745k13 = EnumC1745k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC1745k1 enumC1745k14 = EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        f14261d = EnumSet.of(enumC1745k13, enumC1745k9, enumC1745k10, enumC1745k14);
        EnumC1745k1 enumC1745k15 = EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        EnumC1745k1 enumC1745k16 = EnumC1745k1.EVENT_TYPE_REGULAR;
        f14262e = EnumSet.of(enumC1745k15, enumC1745k14, EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, EnumC1745k1.EVENT_TYPE_EXCEPTION_USER, EnumC1745k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, EnumC1745k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, enumC1745k6, enumC1745k7, EnumC1745k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, EnumC1745k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, EnumC1745k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, enumC1745k8, enumC1745k16);
        f14263f = EnumSet.of(EnumC1745k1.EVENT_TYPE_DIAGNOSTIC, EnumC1745k1.EVENT_TYPE_DIAGNOSTIC_STATBOX, EnumC1745k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING, EnumC1745k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS);
        f14264g = EnumSet.of(enumC1745k16);
        f14265h = EnumSet.of(enumC1745k6, enumC1745k7, enumC1745k8);
        f14266i = Arrays.asList(Integer.valueOf(enumC1745k11.b()), Integer.valueOf(EnumC1745k1.EVENT_TYPE_FIRST_ACTIVATION.b()), Integer.valueOf(enumC1745k2.b()), Integer.valueOf(enumC1745k12.b()));
        f14267j = Arrays.asList(Integer.valueOf(EnumC1745k1.EVENT_TYPE_CLEANUP.b()));
    }

    public static C1744k0 a() {
        C1744k0 c1744k0 = new C1744k0();
        c1744k0.f16515e = EnumC1745k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.b();
        try {
            c1744k0.f16512b = new JSONObject().put("stat_sending", new JSONObject().put("disabled", true)).toString();
        } catch (Throwable unused) {
        }
        return c1744k0;
    }

    public static C1744k0 a(String str, Im im) {
        return a(str, EnumC1745k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, im);
    }

    private static C1744k0 a(String str, EnumC1745k1 enumC1745k1, Im im) {
        S s10 = new S("", "", enumC1745k1.b(), 0, im);
        if (str != null) {
            s10.i(str);
        }
        return s10;
    }

    public static C1744k0 a(String str, String str2, boolean z10, Im im) {
        HashMap map = new HashMap();
        map.put("type", str);
        map.put("link", str2);
        map.put("auto", Boolean.valueOf(z10));
        return new S(C2120ym.g(map), "", EnumC1745k1.EVENT_TYPE_APP_OPEN.b(), 0, im);
    }

    public static C1744k0 a(String str, byte[] bArr, Im im) {
        return new S(bArr, str, EnumC1745k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.b(), im);
    }

    public static boolean a(int i10) {
        return f14263f.contains(EnumC1745k1.a(i10));
    }

    public static boolean a(EnumC1745k1 enumC1745k1) {
        return !f14259b.contains(enumC1745k1);
    }

    public static C1744k0 b(String str, Im im) {
        return a(str, EnumC1745k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, im);
    }

    public static boolean b(int i10) {
        return f14261d.contains(EnumC1745k1.a(i10));
    }

    public static boolean b(EnumC1745k1 enumC1745k1) {
        return !f14260c.contains(enumC1745k1);
    }

    public static C1744k0 c(String str, Im im) {
        return a(str, EnumC1745k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF, im);
    }

    public static boolean c(int i10) {
        return f14262e.contains(EnumC1745k1.a(i10));
    }

    public static boolean d(int i10) {
        return !f14265h.contains(EnumC1745k1.a(i10));
    }

    public static boolean e(int i10) {
        return f14264g.contains(EnumC1745k1.a(i10));
    }

    public static boolean f(int i10) {
        return f14258a.contains(Integer.valueOf(i10));
    }
}
