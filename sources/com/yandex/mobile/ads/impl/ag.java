package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class ag {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator<byte[]> f18923e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f18924a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f18925b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18926c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18927d = 4096;

    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f18927d) {
                this.f18924a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f18925b, bArr, f18923e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f18925b.add(iBinarySearch, bArr);
                this.f18926c += bArr.length;
                synchronized (this) {
                    while (this.f18926c > this.f18927d) {
                        byte[] bArr2 = (byte[]) this.f18924a.remove(0);
                        this.f18925b.remove(bArr2);
                        this.f18926c -= bArr2.length;
                    }
                }
            }
        }
    }

    public final synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f18925b.size(); i11++) {
            byte[] bArr = (byte[]) this.f18925b.get(i11);
            if (bArr.length >= i10) {
                this.f18926c -= bArr.length;
                this.f18925b.remove(i11);
                this.f18924a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }
}
