package com.yandex.mobile.ads.impl;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes3.dex */
public final class qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f24571a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f24572a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f24573b;

        public final a a(int i10) {
            pa.b(!this.f24573b);
            this.f24572a.append(i10, true);
            return this;
        }

        public final qv a() {
            pa.b(!this.f24573b);
            this.f24573b = true;
            return new qv(this.f24572a, 0);
        }
    }

    private qv(SparseBooleanArray sparseBooleanArray) {
        this.f24571a = sparseBooleanArray;
    }

    public /* synthetic */ qv(SparseBooleanArray sparseBooleanArray, int i10) {
        this(sparseBooleanArray);
    }

    public final int a() {
        return this.f24571a.size();
    }

    public final boolean a(int i10) {
        return this.f24571a.get(i10);
    }

    public final int b(int i10) {
        pa.a(i10, this.f24571a.size());
        return this.f24571a.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv)) {
            return false;
        }
        qv qvVar = (qv) obj;
        if (da1.f19803a >= 24) {
            return this.f24571a.equals(qvVar.f24571a);
        }
        if (this.f24571a.size() != qvVar.f24571a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f24571a.size(); i10++) {
            if (b(i10) != qvVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (da1.f19803a >= 24) {
            return this.f24571a.hashCode();
        }
        int size = this.f24571a.size();
        for (int i10 = 0; i10 < this.f24571a.size(); i10++) {
            size = (size * 31) + b(i10);
        }
        return size;
    }
}
