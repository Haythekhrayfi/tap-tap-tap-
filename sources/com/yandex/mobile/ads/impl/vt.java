package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface vt extends im {
    long a();

    void a(int i10) throws IOException;

    void a(byte[] bArr, int i10, int i11) throws IOException;

    boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    void b(int i10) throws IOException;

    boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    void c();

    long e();

    long getPosition();

    @Override // com.yandex.mobile.ads.impl.im
    int read(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;
}
