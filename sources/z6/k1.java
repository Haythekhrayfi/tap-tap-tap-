package z6;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends vc.l implements uc.l<r6.d, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f45092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc.z f45093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f45094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t6.a f45095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v6.a f45096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r6.d f45097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vc.y f45098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ HashMap<Integer, Integer> f45099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i1 f45100k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(boolean z10, vc.z zVar, AtomicLong atomicLong, t6.a aVar, v6.a aVar2, r6.d dVar, vc.y yVar, HashMap<Integer, Integer> map, i1 i1Var) {
        super(1);
        this.f45092c = z10;
        this.f45093d = zVar;
        this.f45094e = atomicLong;
        this.f45095f = aVar;
        this.f45096g = aVar2;
        this.f45097h = dVar;
        this.f45098i = yVar;
        this.f45099j = map;
        this.f45100k = i1Var;
    }

    @Override // uc.l
    public jc.w invoke(r6.d dVar) {
        r6.d dVar2 = dVar;
        if (this.f45092c) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            vc.z zVar = this.f45093d;
            if (jElapsedRealtime - zVar.f37007c > 180000) {
                zVar.f37007c = SystemClock.elapsedRealtime();
                AtomicLong atomicLong = this.f45094e;
                t6.a aVar = this.f45095f;
                v6.a aVar2 = this.f45096g;
                fd.j0.h(aVar2, "recordSettings");
                r6.d dVar3 = this.f45097h;
                fd.j0.h(dVar3, "actionSet");
                int i10 = this.f45098i.f37006c;
                Integer num = this.f45099j.get(Integer.valueOf(this.f45096g.hashCode()));
                if (num == null) {
                    num = 0;
                }
                int iIntValue = num.intValue();
                fd.j0.i(aVar, "combination");
                fd.j0.i(aVar2, "recording");
                fd.j0.i(dVar3, "actionSet");
                long jA = i7.e.a(aVar2, dVar3, iIntValue);
                int iMin = Math.min(aVar.d().indexOf(aVar2) + 1, aVar.d().size());
                StringBuilder sbA = defpackage.a.a("Currenty playing: ");
                sbA.append(aVar2.getName());
                sbA.append(' ');
                sbA.append(aVar2.f());
                sbA.append(' ');
                sbA.append(aVar2.e());
                sbA.append(" ------- Index of next recording: ");
                v1.b.a(sbA, iMin, " recordingRepetition: ", iIntValue, " combinationRepetition: ");
                sbA.append(i10);
                xe.a.f37601c.a(sbA.toString(), new Object[0]);
                t6.a aVarA = t6.a.a(aVar, null, aVar.d().subList(iMin, aVar.d().size()), 0L, 0L, 0, 1L, 29);
                t6.a aVarA2 = t6.a.a(aVar, null, null, 0L, 0L, 0, 1L, 31);
                atomicLong.set((aVarA2.b() * Math.max(0L, Math.max(1L, aVar.e()) - ((long) i10))) + aVarA.b() + jA);
            }
        }
        i1 i1Var = this.f45100k;
        if (i1Var.f45069j) {
            q6.b bVar = i1Var.f45060a;
            fd.j0.h(dVar2, "it");
            bVar.c(dVar2);
        }
        return jc.w.f31842a;
    }
}
