package pe;

import fd.z;
import java.util.Locale;
import ne.q;
import ne.r;
import oe.m;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public re.e f34681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Locale f34682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f34683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34684d;

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00ae, please report this as an issue */
    public f(re.e eVar, a aVar) {
        int i10;
        q qVarA;
        oe.h hVar = aVar.f34644f;
        q qVar = aVar.f34645g;
        if (hVar != null || qVar != null) {
            oe.h hVar2 = (oe.h) eVar.query(re.j.f35374b);
            q qVar2 = (q) eVar.query(re.j.f35373a);
            oe.b bVarB = null;
            hVar = z.q(hVar2, hVar) ? null : hVar;
            qVar = z.q(qVar2, qVar) ? null : qVar;
            if (hVar != null || qVar != null) {
                oe.h hVar3 = hVar != null ? hVar : hVar2;
                qVar2 = qVar != null ? qVar : qVar2;
                if (qVar == null) {
                    if (hVar != null) {
                        if (eVar.isSupported(re.a.EPOCH_DAY)) {
                            bVarB = hVar3.b(eVar);
                        } else if (hVar == m.f34269e || hVar2 != null) {
                            for (re.a aVar2 : re.a.values()) {
                                if (!aVar2.isDateBased() && eVar.isSupported(aVar2)) {
                                    throw new ne.a("Invalid override chronology for temporal: " + hVar + " " + eVar);
                                }
                            }
                        }
                    }
                    eVar = new e(bVarB, eVar, hVar3, qVar2);
                } else if (eVar.isSupported(re.a.INSTANT_SECONDS)) {
                    eVar = (hVar3 == null ? m.f34269e : hVar3).l(ne.e.h(eVar), qVar);
                } else {
                    try {
                        se.f fVarH = qVar.h();
                        qVarA = fVarH.d() ? fVarH.a(ne.e.f33774e) : qVar;
                    } catch (se.g unused) {
                    }
                    r rVar = (r) eVar.query(re.j.f35377e);
                    if ((qVarA instanceof r) && rVar != null && !qVarA.equals(rVar)) {
                        throw new ne.a("Invalid override zone for temporal: " + qVar + " " + eVar);
                    }
                    if (hVar != null) {
                        if (eVar.isSupported(re.a.EPOCH_DAY)) {
                            bVarB = hVar3.b(eVar);
                        } else if (hVar == m.f34269e) {
                            while (i10 < r2) {
                                if (!aVar2.isDateBased()) {
                                }
                            }
                        } else {
                            while (i10 < r2) {
                                if (!aVar2.isDateBased()) {
                                }
                            }
                        }
                    }
                    eVar = new e(bVarB, eVar, hVar3, qVar2);
                }
            }
        }
        this.f34681a = eVar;
        this.f34682b = aVar.f34640b;
        this.f34683c = aVar.f34641c;
    }

    public void a() {
        this.f34684d--;
    }

    public Long b(re.i iVar) {
        try {
            return Long.valueOf(this.f34681a.getLong(iVar));
        } catch (ne.a e10) {
            if (this.f34684d > 0) {
                return null;
            }
            throw e10;
        }
    }

    public String toString() {
        return this.f34681a.toString();
    }
}
