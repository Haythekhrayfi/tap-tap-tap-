package com.yandex.metrica.impl.ob;

import android.util.SparseArray;
import ch.qos.logback.core.joran.action.Action;

/* JADX INFO: loaded from: classes.dex */
public class Z6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SparseArray<Z6> f15633c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15635b;

    static {
        SparseArray<Z6> sparseArray = new SparseArray<>();
        f15633c = sparseArray;
        sparseArray.put(EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED.b(), new Z6("jvm", "binder"));
        f15633c.put(EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b(), new Z6("jvm", "binder"));
        f15633c.put(EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.b(), new Z6("jvm", "intent"));
        f15633c.put(EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.b(), new Z6("jvm", Action.FILE_ATTRIBUTE));
        f15633c.put(EnumC1745k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH.b(), new Z6("jni_native", Action.FILE_ATTRIBUTE));
        f15633c.put(EnumC1745k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF.b(), new Z6("jni_native", Action.FILE_ATTRIBUTE));
        f15633c.put(EnumC1745k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH.b(), new Z6("jni_native", Action.FILE_ATTRIBUTE));
        f15633c.put(EnumC1745k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF.b(), new Z6("jni_native", Action.FILE_ATTRIBUTE));
        f15633c.put(EnumC1745k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF.b(), new Z6("jni_native", Action.FILE_ATTRIBUTE));
        f15633c.put(EnumC1745k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF.b(), new Z6("jni_native", "binder"));
    }

    private Z6(String str, String str2) {
        this.f15634a = str;
        this.f15635b = str2;
    }

    public static Z6 a(int i10) {
        return f15633c.get(i10);
    }
}
