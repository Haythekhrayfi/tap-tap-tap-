package com.yandex.metrica.impl.ob;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1530ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f15819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2045vm f15820b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ba$a */
    public static class a {
    }

    public C1530ba() {
        this(new a(), new C2045vm());
    }

    public C1530ba(a aVar, C2045vm c2045vm) {
        this.f15819a = aVar;
        this.f15820b = c2045vm;
    }

    public byte[] a(byte[] bArr, String str) {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            a aVar = this.f15819a;
            byte[] bytes = str.getBytes();
            Objects.requireNonNull(aVar);
            C1618en c1618en = new C1618en("AES/CBC/PKCS5Padding", bytes, bArrCopyOfRange);
            if (U2.a(bArr)) {
                return null;
            }
            byte[] bArrA = c1618en.a(bArr, 16, bArr.length - 16);
            Objects.requireNonNull(this.f15820b);
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArrA);
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    try {
                        byte[] bArrA2 = V0.a(gZIPInputStream, Integer.MAX_VALUE);
                        U2.a((Closeable) gZIPInputStream);
                        U2.a((Closeable) byteArrayInputStream);
                        return bArrA2;
                    } catch (Throwable th2) {
                        th = th2;
                        U2.a((Closeable) gZIPInputStream);
                        U2.a((Closeable) byteArrayInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gZIPInputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPInputStream = null;
                byteArrayInputStream = null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
