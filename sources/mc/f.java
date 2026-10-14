package mc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import uc.p;

/* JADX INFO: loaded from: classes3.dex */
public interface f {

    public interface a extends f {

        /* JADX INFO: renamed from: mc.f$a$a, reason: collision with other inner class name */
        public static final class C0363a {
            public static <R> R a(a aVar, R r10, p<? super R, ? super a, ? extends R> pVar) {
                j0.i(pVar, "operation");
                return pVar.invoke(r10, aVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends a> E b(a aVar, b<E> bVar) {
                j0.i(bVar, Action.KEY_ATTRIBUTE);
                if (j0.d(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            public static f c(a aVar, b<?> bVar) {
                j0.i(bVar, Action.KEY_ATTRIBUTE);
                return j0.d(aVar.getKey(), bVar) ? h.f33539c : aVar;
            }

            public static f d(a aVar, f fVar) {
                j0.i(fVar, CoreConstants.CONTEXT_SCOPE_VALUE);
                return fVar == h.f33539c ? aVar : (f) fVar.Y(aVar, g.f33538c);
            }
        }

        @Override // mc.f
        <E extends a> E b(b<E> bVar);

        b<?> getKey();
    }

    public interface b<E extends a> {
    }

    <R> R Y(R r10, p<? super R, ? super a, ? extends R> pVar);

    <E extends a> E b(b<E> bVar);

    f i(f fVar);

    f p(b<?> bVar);
}
