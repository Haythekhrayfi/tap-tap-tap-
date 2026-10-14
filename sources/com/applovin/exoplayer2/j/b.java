package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.v;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac f7176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f7178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v[] f7180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f7181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7182g;

    public b(ac acVar, int[] iArr, int i10) {
        int i11 = 0;
        com.applovin.exoplayer2.l.a.b(iArr.length > 0);
        this.f7179d = i10;
        this.f7176a = (ac) com.applovin.exoplayer2.l.a.b(acVar);
        int length = iArr.length;
        this.f7177b = length;
        this.f7180e = new v[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f7180e[i12] = acVar.a(iArr[i12]);
        }
        Arrays.sort(this.f7180e, l.f7309d);
        this.f7178c = new int[this.f7177b];
        while (true) {
            int i13 = this.f7177b;
            if (i11 >= i13) {
                this.f7181f = new long[i13];
                return;
            } else {
                this.f7178c[i11] = acVar.a(this.f7180e[i11]);
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(v vVar, v vVar2) {
        return vVar2.f8194h - vVar.f8194h;
    }

    @Override // com.applovin.exoplayer2.j.g
    public final v a(int i10) {
        return this.f7180e[i10];
    }

    @Override // com.applovin.exoplayer2.j.d
    public void a() {
    }

    @Override // com.applovin.exoplayer2.j.d
    public void a(float f10) {
    }

    @Override // com.applovin.exoplayer2.j.g
    public final int b(int i10) {
        return this.f7178c[i10];
    }

    @Override // com.applovin.exoplayer2.j.d
    public void b() {
    }

    @Override // com.applovin.exoplayer2.j.g
    public final ac d() {
        return this.f7176a;
    }

    @Override // com.applovin.exoplayer2.j.g
    public final int e() {
        return this.f7178c.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7176a == bVar.f7176a && Arrays.equals(this.f7178c, bVar.f7178c);
    }

    @Override // com.applovin.exoplayer2.j.d
    public final v f() {
        return this.f7180e[c()];
    }

    public int hashCode() {
        if (this.f7182g == 0) {
            this.f7182g = Arrays.hashCode(this.f7178c) + (System.identityHashCode(this.f7176a) * 31);
        }
        return this.f7182g;
    }
}
