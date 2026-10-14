package com.yandex.metrica.impl.ob;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1851o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1851o7 f16997a = new C1851o7();

    private C1851o7() {
    }

    public static final C1826n7 a(Throwable th) {
        return f16997a.a(th, 1, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    private final C1826n7 a(Throwable th, int i10, int i11) {
        StackTraceElement[] stackTrace;
        C1826n7 c1826n7A;
        ArrayList arrayList;
        String name = th.getClass().getName();
        String message = th.getMessage();
        try {
            stackTrace = th.getStackTrace();
        } catch (Throwable unused) {
            stackTrace = new StackTraceElement[0];
        }
        fd.j0.h(stackTrace, "Utils.getStackTraceSafely(throwable)");
        ArrayList arrayList2 = new ArrayList(stackTrace.length);
        for (StackTraceElement stackTraceElement : stackTrace) {
            arrayList2.add(new C1776l7(stackTraceElement));
        }
        Throwable cause = th.getCause();
        if (cause == null) {
            c1826n7A = null;
        } else {
            if (!(i11 < i10)) {
                cause = null;
            }
            if (cause != null) {
                c1826n7A = f16997a.a(cause, 30, i11 + 1);
            } else {
                c1826n7A = null;
            }
        }
        if (!U2.a(19) || i11 >= i10) {
            arrayList = null;
        } else {
            Throwable[] suppressed = th.getSuppressed();
            fd.j0.h(suppressed, "throwable.suppressed");
            ArrayList arrayList3 = new ArrayList(suppressed.length);
            for (Throwable th2 : suppressed) {
                C1851o7 c1851o7 = f16997a;
                fd.j0.h(th2, "it");
                arrayList3.add(c1851o7.a(th2, 1, i11));
            }
            arrayList = arrayList3;
        }
        return new C1826n7(name, message, arrayList2, c1826n7A, arrayList);
    }
}
