package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class V9<T> implements W9<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W9<T> f15228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1618en f15229b;

    public V9(W9<T> w10, C1618en c1618en) {
        this.f15228a = w10;
        this.f15229b = c1618en;
    }

    @Override // com.yandex.metrica.impl.ob.W9
    public T a() {
        return this.f15228a.a();
    }

    @Override // com.yandex.metrica.impl.ob.W9
    public T a(byte[] bArr) throws IOException {
        try {
            C1618en c1618en = this.f15229b;
            Objects.requireNonNull(c1618en);
            return this.f15228a.a(c1618en.a(bArr, 0, bArr.length));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    @Override // com.yandex.metrica.impl.ob.W9
    public byte[] a(T t10) {
        try {
            return this.f15229b.a(this.f15228a.a(t10));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }
}
