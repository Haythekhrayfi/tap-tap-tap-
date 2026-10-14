package com.yandex.mobile.ads.impl;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ix0 implements Closeable {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public static hx0 a(byte[] bArr) {
            fd.j0.i(bArr, "<this>");
            qd.c cVar = new qd.c();
            cVar.O(bArr);
            return new hx0(bArr.length, null, cVar);
        }
    }

    static {
        new a(0);
    }

    public final InputStream a() {
        return d().a0();
    }

    public abstract long b();

    public abstract tc0 c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ea1.a((Closeable) d());
    }

    public abstract qd.f d();
}
