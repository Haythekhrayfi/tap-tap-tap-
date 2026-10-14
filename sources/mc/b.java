package mc;

import fd.j0;
import mc.f.a;
import uc.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<B extends f.a, E extends B> implements f.b<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<f.a, E> f33532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.b<?> f33533d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [mc.f$b<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uc.l<? super mc.f$a, ? extends E extends B>, uc.l<mc.f$a, E extends B>] */
    public b(f.b<B> bVar, l<? super f.a, ? extends E> lVar) {
        j0.i(bVar, "baseKey");
        j0.i(lVar, "safeCast");
        this.f33532c = lVar;
        this.f33533d = bVar instanceof b ? (f.b<B>) ((b) bVar).f33533d : bVar;
    }
}
