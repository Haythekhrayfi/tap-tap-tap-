package mc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import java.io.Serializable;
import uc.p;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements f, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f33539c = new h();

    @Override // mc.f
    public <R> R Y(R r10, p<? super R, ? super f.a, ? extends R> pVar) {
        j0.i(pVar, "operation");
        return r10;
    }

    @Override // mc.f
    public <E extends f.a> E b(f.b<E> bVar) {
        j0.i(bVar, Action.KEY_ATTRIBUTE);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // mc.f
    public f i(f fVar) {
        j0.i(fVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        return fVar;
    }

    @Override // mc.f
    public f p(f.b<?> bVar) {
        j0.i(bVar, Action.KEY_ATTRIBUTE);
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
