package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class t81<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f25289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25290b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public static t81 a(gx gxVar, long j10) {
            return new t81(gxVar, System.currentTimeMillis() + j10);
        }
    }

    static {
        new a(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t81(gx gxVar, long j10) {
        this.f25289a = gxVar;
        this.f25290b = j10;
    }

    public final long a() {
        return this.f25290b;
    }

    public final T b() {
        return this.f25289a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t81)) {
            return false;
        }
        t81 t81Var = (t81) obj;
        return fd.j0.d(this.f25289a, t81Var.f25289a) && this.f25290b == t81Var.f25290b;
    }

    public final int hashCode() {
        T t10 = this.f25289a;
        return Long.hashCode(this.f25290b) + ((t10 == null ? 0 : t10.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("TtlWrapper(value=");
        sbA.append(this.f25289a);
        sbA.append(", expiredTimestamp=");
        return o2.a.a(sbA, this.f25290b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
