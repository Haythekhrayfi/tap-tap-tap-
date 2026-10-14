package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1594e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f15981a = -1;

    public static final <T extends AbstractC1594e> T a(T t10, byte[] bArr) throws C1569d {
        try {
            C1494a c1494aA = C1494a.a(bArr, 0, bArr.length);
            t10.a(c1494aA);
            c1494aA.a(0);
            return t10;
        } catch (C1569d e10) {
            throw e10;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final byte[] a(AbstractC1594e abstractC1594e) {
        int iA = abstractC1594e.a();
        abstractC1594e.f15981a = iA;
        byte[] bArr = new byte[iA];
        try {
            C1519b c1519bA = C1519b.a(bArr, 0, iA);
            abstractC1594e.a(c1519bA);
            c1519bA.a();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public int a() {
        return 0;
    }

    public abstract AbstractC1594e a(C1494a c1494a) throws IOException;

    public void a(C1519b c1519b) throws IOException {
    }

    public String toString() {
        return C1619f.a(this);
    }
}
