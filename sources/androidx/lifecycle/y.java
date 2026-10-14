package androidx.lifecycle;

import ch.qos.logback.core.CoreConstants;
import fd.s0;
import fd.s1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y extends fd.c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f2256e = new d();

    @Override // fd.c0
    public void c0(mc.f fVar, Runnable runnable) {
        fd.j0.i(fVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        d dVar = this.f2256e;
        Objects.requireNonNull(dVar);
        fd.c0 c0Var = s0.f29619a;
        s1 s1VarE0 = kd.q.f32064a.e0();
        if (s1VarE0.d0(fVar) || dVar.a()) {
            s1VarE0.c0(fVar, new androidx.appcompat.app.s(dVar, runnable));
        } else {
            dVar.c(runnable);
        }
    }

    @Override // fd.c0
    public boolean d0(mc.f fVar) {
        fd.j0.i(fVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.c0 c0Var = s0.f29619a;
        if (kd.q.f32064a.e0().d0(fVar)) {
            return true;
        }
        return !this.f2256e.a();
    }
}
