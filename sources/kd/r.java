package kd;

import fd.o0;
import fd.s1;
import fd.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends s1 implements o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f32065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f32066f;

    public r(Throwable th, String str) {
        this.f32065e = th;
        this.f32066f = str;
    }

    public /* synthetic */ r(Throwable th, String str, int i10, vc.g gVar) {
        this(th, (i10 & 2) != 0 ? null : str);
    }

    @Override // fd.c0
    public void c0(mc.f fVar, Runnable runnable) {
        g0();
        throw null;
    }

    @Override // fd.c0
    public boolean d0(mc.f fVar) {
        g0();
        throw null;
    }

    @Override // fd.s1
    public s1 e0() {
        return this;
    }

    public final Void g0() {
        String strA;
        if (this.f32065e == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        StringBuilder sbA = defpackage.a.a("Module with the Main dispatcher had failed to initialize");
        String str = this.f32066f;
        if (str == null || (strA = i.f.a(". ", str)) == null) {
            strA = "";
        }
        sbA.append(strA);
        throw new IllegalStateException(sbA.toString(), this.f32065e);
    }

    @Override // fd.o0
    public t0 k(long j10, Runnable runnable, mc.f fVar) {
        g0();
        throw null;
    }

    @Override // fd.o0
    public void l(long j10, fd.i iVar) {
        g0();
        throw null;
    }

    @Override // fd.s1, fd.c0
    public String toString() {
        String string;
        StringBuilder sbA = defpackage.a.a("Dispatchers.Main[missing");
        if (this.f32065e != null) {
            StringBuilder sbA2 = defpackage.a.a(", cause=");
            sbA2.append(this.f32065e);
            string = sbA2.toString();
        } else {
            string = "";
        }
        return s.a.a(sbA, string, ']');
    }
}
