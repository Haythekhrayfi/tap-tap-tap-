package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1651g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1750k6 f16182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1676h6 f16183c;

    public C1651g6(Context context, C1549c4 c1549c4, int i10) {
        this(new C1750k6(context, c1549c4), i10);
    }

    public C1651g6(C1750k6 c1750k6, int i10) {
        this.f16181a = i10;
        this.f16182b = c1750k6;
    }

    private void b() {
        this.f16182b.a(this.f16183c);
    }

    public N0 a(String str) {
        if (this.f16183c == null) {
            C1676h6 c1676h6A = this.f16182b.a();
            this.f16183c = c1676h6A;
            int iD = c1676h6A.d();
            int i10 = this.f16181a;
            if (iD != i10) {
                this.f16183c.b(i10);
                b();
            }
        }
        int iHashCode = str.hashCode();
        if (this.f16183c.b().contains(Integer.valueOf(iHashCode))) {
            return N0.NON_FIRST_OCCURENCE;
        }
        N0 n10 = this.f16183c.e() ? N0.FIRST_OCCURRENCE : N0.UNKNOWN;
        if (this.f16183c.c() < 1000) {
            this.f16183c.a(iHashCode);
        } else {
            this.f16183c.a(false);
        }
        b();
        return n10;
    }

    public void a() {
        if (this.f16183c == null) {
            C1676h6 c1676h6A = this.f16182b.a();
            this.f16183c = c1676h6A;
            int iD = c1676h6A.d();
            int i10 = this.f16181a;
            if (iD != i10) {
                this.f16183c.b(i10);
                b();
            }
        }
        this.f16183c.a();
        this.f16183c.a(true);
        b();
    }
}
