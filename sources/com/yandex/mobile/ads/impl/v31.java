package com.yandex.mobile.ads.impl;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
final class v31<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tk<V> f25817c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f25816b = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25815a = -1;

    public v31(tk<V> tkVar) {
        this.f25817c = tkVar;
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f25816b.size(); i10++) {
            this.f25817c.accept(this.f25816b.valueAt(i10));
        }
        this.f25815a = -1;
        this.f25816b.clear();
    }

    public final void a(int i10) {
        int i11 = 0;
        while (i11 < this.f25816b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f25816b.keyAt(i12)) {
                return;
            }
            this.f25817c.accept(this.f25816b.valueAt(i11));
            this.f25816b.removeAt(i11);
            int i13 = this.f25815a;
            if (i13 > 0) {
                this.f25815a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public final void a(int i10, V v10) {
        if (this.f25815a == -1) {
            pa.b(this.f25816b.size() == 0);
            this.f25815a = 0;
        }
        if (this.f25816b.size() > 0) {
            SparseArray<V> sparseArray = this.f25816b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            pa.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                tk<V> tkVar = this.f25817c;
                SparseArray<V> sparseArray2 = this.f25816b;
                tkVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f25816b.append(i10, v10);
    }

    public final V b() {
        SparseArray<V> sparseArray = this.f25816b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final V b(int i10) {
        if (this.f25815a == -1) {
            this.f25815a = 0;
        }
        while (true) {
            int i11 = this.f25815a;
            if (i11 <= 0 || i10 >= this.f25816b.keyAt(i11)) {
                break;
            }
            this.f25815a--;
        }
        while (this.f25815a < this.f25816b.size() - 1 && i10 >= this.f25816b.keyAt(this.f25815a + 1)) {
            this.f25815a++;
        }
        return this.f25816b.valueAt(this.f25815a);
    }

    public final boolean c() {
        return this.f25816b.size() == 0;
    }
}
