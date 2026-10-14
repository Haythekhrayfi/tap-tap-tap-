package d7;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends vc.l implements uc.l<r6.d, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc.z f28791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f28792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v6.a f28793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r6.d f28794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vc.y f28795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0 f28796i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(boolean z10, vc.z zVar, AtomicLong atomicLong, v6.a aVar, r6.d dVar, vc.y yVar, a0 a0Var) {
        super(1);
        this.f28790c = z10;
        this.f28791d = zVar;
        this.f28792e = atomicLong;
        this.f28793f = aVar;
        this.f28794g = dVar;
        this.f28795h = yVar;
        this.f28796i = a0Var;
    }

    @Override // uc.l
    public jc.w invoke(r6.d dVar) {
        r6.d dVar2 = dVar;
        if (this.f28790c) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            vc.z zVar = this.f28791d;
            if (jElapsedRealtime - zVar.f37007c > 180000) {
                zVar.f37007c = SystemClock.elapsedRealtime();
                AtomicLong atomicLong = this.f28792e;
                v6.a aVar = this.f28793f;
                r6.d dVar3 = this.f28794g;
                fd.j0.h(dVar3, "actionSet");
                atomicLong.set(i7.e.a(aVar, dVar3, this.f28795h.f37006c));
            }
        }
        a0 a0Var = this.f28796i;
        if (a0Var.f28764k) {
            q6.b bVar = a0Var.f28754a;
            fd.j0.h(dVar2, "it");
            bVar.c(dVar2);
        }
        return jc.w.f31842a;
    }
}
