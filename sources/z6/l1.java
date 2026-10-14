package z6;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends vc.l implements uc.l<r6.d, lb.j<? extends r6.d>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v6.a f45105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f45106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc.z f45107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f45108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t6.a f45109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vc.y f45110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ HashMap<Integer, Integer> f45111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i1 f45112j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(v6.a aVar, boolean z10, vc.z zVar, AtomicLong atomicLong, t6.a aVar2, vc.y yVar, HashMap<Integer, Integer> map, i1 i1Var) {
        super(1);
        this.f45105c = aVar;
        this.f45106d = z10;
        this.f45107e = zVar;
        this.f45108f = atomicLong;
        this.f45109g = aVar2;
        this.f45110h = yVar;
        this.f45111i = map;
        this.f45112j = i1Var;
    }

    @Override // uc.l
    public lb.j<? extends r6.d> invoke(r6.d dVar) {
        r6.d dVar2 = dVar;
        fd.j0.i(dVar2, "actionSet");
        vb.l lVar = new vb.l(new a1(dVar2, 1));
        x6.b bVar = new x6.b(new k1(this.f45106d, this.f45107e, this.f45108f, this.f45109g, this.f45105c, dVar2, this.f45110h, this.f45111i, this.f45112j), 19);
        pb.b<? super Throwable> bVar2 = rb.a.f35360c;
        pb.a aVar = rb.a.f35359b;
        return lVar.i(bVar, bVar2, aVar, aVar).h(Math.max(0L, (long) ((dVar2.b() + dVar2.c()) / this.f45105c.e())), TimeUnit.MILLISECONDS);
    }
}
