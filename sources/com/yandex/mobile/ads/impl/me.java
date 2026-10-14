package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class me implements pv0, qv0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23031b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private rv0 f23033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private gr0 f23035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private fz0 f23037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private yv[] f23038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f23039j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23042m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zv f23032c = new zv();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f23040k = Long.MIN_VALUE;

    public me(int i10) {
        this.f23031b = i10;
    }

    public final int a(zv zvVar, an anVar, int i10) {
        fz0 fz0Var = this.f23037h;
        Objects.requireNonNull(fz0Var);
        int iA = fz0Var.a(zvVar, anVar, i10);
        if (iA == -4) {
            if (anVar.f()) {
                this.f23040k = Long.MIN_VALUE;
                return this.f23041l ? -4 : -3;
            }
            long j10 = anVar.f19006e + this.f23039j;
            anVar.f19006e = j10;
            this.f23040k = Math.max(this.f23040k, j10);
        } else if (iA == -5) {
            yv yvVar = zvVar.f27433b;
            Objects.requireNonNull(yvVar);
            if (yvVar.f27119p != RecyclerView.FOREVER_NS) {
                zvVar.f27433b = yvVar.a().a(yvVar.f27119p + this.f23039j).a();
            }
        }
        return iA;
    }

    public final ns a(int i10, yv yvVar, Exception exc, boolean z10) {
        int iA;
        if (yvVar == null || this.f23042m) {
            iA = 4;
        } else {
            this.f23042m = true;
            try {
                iA = a(yvVar) & 7;
                this.f23042m = false;
            } catch (ns unused) {
                this.f23042m = false;
                iA = 4;
            } catch (Throwable th) {
                this.f23042m = false;
                throw th;
            }
        }
        return ns.a(exc, getName(), this.f23034e, yvVar, iA, z10, i10);
    }

    public final ns a(Exception exc, yv yvVar, int i10) {
        return a(i10, yvVar, exc, false);
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final void a(int i10, gr0 gr0Var) {
        this.f23034e = i10;
        this.f23035f = gr0Var;
    }

    @Override // com.yandex.mobile.ads.impl.hr0.b
    public void a(int i10, Object obj) throws ns {
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final void a(long j10) throws ns {
        this.f23041l = false;
        this.f23040k = j10;
        a(j10, false);
    }

    public abstract void a(long j10, boolean z10) throws ns;

    @Override // com.yandex.mobile.ads.impl.pv0
    public final void a(rv0 rv0Var, yv[] yvVarArr, fz0 fz0Var, long j10, boolean z10, boolean z11, long j11, long j12) throws ns {
        pa.b(this.f23036g == 0);
        this.f23033d = rv0Var;
        this.f23036g = 1;
        a(z10, z11);
        a(yvVarArr, fz0Var, j11, j12);
        this.f23041l = false;
        this.f23040k = j10;
        a(j10, z10);
    }

    public void a(boolean z10, boolean z11) throws ns {
    }

    public abstract void a(yv[] yvVarArr, long j10, long j11) throws ns;

    @Override // com.yandex.mobile.ads.impl.pv0
    public final void a(yv[] yvVarArr, fz0 fz0Var, long j10, long j11) throws ns {
        pa.b(!this.f23041l);
        this.f23037h = fz0Var;
        if (this.f23040k == Long.MIN_VALUE) {
            this.f23040k = j10;
        }
        this.f23038i = yvVarArr;
        this.f23039j = j11;
        a(yvVarArr, j10, j11);
    }

    public final int b(long j10) {
        fz0 fz0Var = this.f23037h;
        Objects.requireNonNull(fz0Var);
        return fz0Var.a(j10 - this.f23039j);
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final void b() {
        pa.b(this.f23036g == 1);
        zv zvVar = this.f23032c;
        zvVar.f27432a = null;
        zvVar.f27433b = null;
        this.f23036g = 0;
        this.f23037h = null;
        this.f23038i = null;
        this.f23041l = false;
        u();
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final int c() {
        return this.f23036g;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final boolean e() {
        return this.f23040k == Long.MIN_VALUE;
    }

    public int f() throws ns {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final fz0 g() {
        return this.f23037h;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final void h() {
        this.f23041l = true;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final void i() throws IOException {
        fz0 fz0Var = this.f23037h;
        Objects.requireNonNull(fz0Var);
        fz0Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final long j() {
        return this.f23040k;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final boolean k() {
        return this.f23041l;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public db0 l() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final int m() {
        return this.f23031b;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final me n() {
        return this;
    }

    public final rv0 p() {
        rv0 rv0Var = this.f23033d;
        Objects.requireNonNull(rv0Var);
        return rv0Var;
    }

    public final zv q() {
        zv zvVar = this.f23032c;
        zvVar.f27432a = null;
        zvVar.f27433b = null;
        return zvVar;
    }

    public final gr0 r() {
        gr0 gr0Var = this.f23035f;
        Objects.requireNonNull(gr0Var);
        return gr0Var;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final void reset() {
        pa.b(this.f23036g == 0);
        zv zvVar = this.f23032c;
        zvVar.f27432a = null;
        zvVar.f27433b = null;
        v();
    }

    public final yv[] s() {
        yv[] yvVarArr = this.f23038i;
        Objects.requireNonNull(yvVarArr);
        return yvVarArr;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final void start() throws ns {
        pa.b(this.f23036g == 1);
        this.f23036g = 2;
        w();
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final void stop() {
        pa.b(this.f23036g == 2);
        this.f23036g = 1;
        x();
    }

    public final boolean t() {
        if (e()) {
            return this.f23041l;
        }
        fz0 fz0Var = this.f23037h;
        Objects.requireNonNull(fz0Var);
        return fz0Var.d();
    }

    public abstract void u();

    public void v() {
    }

    public void w() throws ns {
    }

    public void x() {
    }
}
