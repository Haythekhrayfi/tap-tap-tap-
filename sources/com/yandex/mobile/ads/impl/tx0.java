package com.yandex.mobile.ads.impl;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class tx0 extends BufferedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25514a;

    public tx0(FileOutputStream fileOutputStream, int i10) {
        super(fileOutputStream, i10);
    }

    public tx0(OutputStream outputStream) {
        super(outputStream);
    }

    public final void a(OutputStream outputStream) {
        pa.b(this.f25514a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f25514a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f25514a = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th == null) {
            return;
        }
        int i10 = da1.f19803a;
        throw th;
    }
}
