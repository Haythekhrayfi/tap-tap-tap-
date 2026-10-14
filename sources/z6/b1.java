package z6;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends vc.l implements uc.l<r6.d, lb.j<? extends r6.d>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v6.a f45037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(v6.a aVar) {
        super(1);
        this.f45037c = aVar;
    }

    @Override // uc.l
    public lb.j<? extends r6.d> invoke(r6.d dVar) {
        r6.d dVar2 = dVar;
        fd.j0.i(dVar2, "actionSet");
        xe.a.f37601c.a("Currently playing delay (" + this.f45037c.getName() + "): " + Math.max(0L, (long) ((dVar2.b() - dVar2.c()) / this.f45037c.e())), new Object[0]);
        return new vb.l(new a1(dVar2, 0)).h(Math.max(0L, (long) ((dVar2.b() - dVar2.c()) / this.f45037c.e())), TimeUnit.MILLISECONDS);
    }
}
