package com.applovin.exoplayer2.h;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
final class ab<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f6503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.h<V> f6504c;

    public ab() {
        this(a0.f6485c);
    }

    public ab(com.applovin.exoplayer2.l.h<V> hVar) {
        this.f6503b = new SparseArray<>();
        this.f6504c = hVar;
        this.f6502a = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Object obj) {
    }

    public V a() {
        SparseArray<V> sparseArray = this.f6503b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public V a(int i10) {
        if (this.f6502a == -1) {
            this.f6502a = 0;
        }
        while (true) {
            int i11 = this.f6502a;
            if (i11 <= 0 || i10 >= this.f6503b.keyAt(i11)) {
                break;
            }
            this.f6502a--;
        }
        while (this.f6502a < this.f6503b.size() - 1 && i10 >= this.f6503b.keyAt(this.f6502a + 1)) {
            this.f6502a++;
        }
        return this.f6503b.valueAt(this.f6502a);
    }

    public void a(int i10, V v10) {
        if (this.f6502a == -1) {
            com.applovin.exoplayer2.l.a.b(this.f6503b.size() == 0);
            this.f6502a = 0;
        }
        if (this.f6503b.size() > 0) {
            SparseArray<V> sparseArray = this.f6503b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            com.applovin.exoplayer2.l.a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                com.applovin.exoplayer2.l.h<V> hVar = this.f6504c;
                SparseArray<V> sparseArray2 = this.f6503b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f6503b.append(i10, v10);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f6503b.size(); i10++) {
            this.f6504c.accept(this.f6503b.valueAt(i10));
        }
        this.f6502a = -1;
        this.f6503b.clear();
    }

    public void b(int i10) {
        int i11 = 0;
        while (i11 < this.f6503b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f6503b.keyAt(i12)) {
                return;
            }
            this.f6504c.accept(this.f6503b.valueAt(i11));
            this.f6503b.removeAt(i11);
            int i13 = this.f6502a;
            if (i13 > 0) {
                this.f6502a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public void c(int i10) {
        for (int size = this.f6503b.size() - 1; size >= 0 && i10 < this.f6503b.keyAt(size); size--) {
            this.f6504c.accept(this.f6503b.valueAt(size));
            this.f6503b.removeAt(size);
        }
        this.f6502a = this.f6503b.size() > 0 ? Math.min(this.f6502a, this.f6503b.size() - 1) : -1;
    }

    public boolean c() {
        return this.f6503b.size() == 0;
    }
}
