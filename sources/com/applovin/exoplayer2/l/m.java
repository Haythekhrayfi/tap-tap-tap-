package com.applovin.exoplayer2.l;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f7634a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f7635a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7636b;

        public a a(int i10) {
            com.applovin.exoplayer2.l.a.b(!this.f7636b);
            this.f7635a.append(i10, true);
            return this;
        }

        public a a(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public a a(m mVar) {
            for (int i10 = 0; i10 < mVar.a(); i10++) {
                a(mVar.b(i10));
            }
            return this;
        }

        public a a(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public m a() {
            com.applovin.exoplayer2.l.a.b(!this.f7636b);
            this.f7636b = true;
            return new m(this.f7635a);
        }
    }

    private m(SparseBooleanArray sparseBooleanArray) {
        this.f7634a = sparseBooleanArray;
    }

    public int a() {
        return this.f7634a.size();
    }

    public boolean a(int i10) {
        return this.f7634a.get(i10);
    }

    public boolean a(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int b(int i10) {
        com.applovin.exoplayer2.l.a.a(i10, 0, a());
        return this.f7634a.keyAt(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (ai.f7595a >= 24) {
            return this.f7634a.equals(mVar.f7634a);
        }
        if (a() != mVar.a()) {
            return false;
        }
        for (int i10 = 0; i10 < a(); i10++) {
            if (b(i10) != mVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (ai.f7595a >= 24) {
            return this.f7634a.hashCode();
        }
        int iA = a();
        for (int i10 = 0; i10 < a(); i10++) {
            iA = (iA * 31) + b(i10);
        }
        return iA;
    }
}
