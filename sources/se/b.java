package se;

import fd.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import ne.r;
import oe.m;
import org.threeten.bp.zone.ZoneOffsetTransition;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends f implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f35508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r[] f35509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f35510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ne.g[] f35511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r[] f35512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e[] f35513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentMap<Integer, ZoneOffsetTransition[]> f35514i = new ConcurrentHashMap();

    public b(long[] jArr, r[] rVarArr, long[] jArr2, r[] rVarArr2, e[] eVarArr) {
        this.f35508c = jArr;
        this.f35509d = rVarArr;
        this.f35510e = jArr2;
        this.f35512g = rVarArr2;
        this.f35513h = eVarArr;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < jArr2.length) {
            r rVar = rVarArr2[i10];
            int i11 = i10 + 1;
            r rVar2 = rVarArr2[i11];
            ne.g gVarV = ne.g.v(jArr2[i10], 0, rVar);
            int i12 = rVar2.f33835d;
            int i13 = rVar.f33835d;
            if (i12 > i13) {
                arrayList.add(gVarV);
                gVarV = gVarV.z(rVar2.f33835d - rVar.f33835d);
            } else {
                arrayList.add(gVarV.z(i12 - i13));
            }
            arrayList.add(gVarV);
            i10 = i11;
        }
        this.f35511f = (ne.g[]) arrayList.toArray(new ne.g[arrayList.size()]);
    }

    private Object writeReplace() {
        return new a((byte) 1, this);
    }

    @Override // se.f
    public r a(ne.e eVar) {
        long j10 = eVar.f33775c;
        if (this.f35513h.length > 0) {
            long[] jArr = this.f35510e;
            if (j10 > jArr[jArr.length - 1]) {
                r[] rVarArr = this.f35512g;
                d[] dVarArrF = f(ne.f.D(z.t(((long) rVarArr[rVarArr.length - 1].f33835d) + j10, 86400L)).f33781c);
                d dVar = null;
                for (int i10 = 0; i10 < dVarArrF.length; i10++) {
                    dVar = dVarArrF[i10];
                    if (j10 < dVar.f35522c.k(dVar.f35523d)) {
                        return dVar.f35523d;
                    }
                }
                return dVar.f35524e;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f35510e, j10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f35512g[iBinarySearch + 1];
    }

    @Override // se.f
    public d b(ne.g gVar) {
        Object objG = g(gVar);
        if (objG instanceof d) {
            return (d) objG;
        }
        return null;
    }

    @Override // se.f
    public List<r> c(ne.g gVar) {
        Object objG = g(gVar);
        if (!(objG instanceof d)) {
            return Collections.singletonList((r) objG);
        }
        d dVar = (d) objG;
        return dVar.b() ? Collections.emptyList() : Arrays.asList(dVar.f35523d, dVar.f35524e);
    }

    @Override // se.f
    public boolean d() {
        return this.f35510e.length == 0;
    }

    @Override // se.f
    public boolean e(ne.g gVar, r rVar) {
        return c(gVar).contains(rVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Arrays.equals(this.f35508c, bVar.f35508c) && Arrays.equals(this.f35509d, bVar.f35509d) && Arrays.equals(this.f35510e, bVar.f35510e) && Arrays.equals(this.f35512g, bVar.f35512g) && Arrays.equals(this.f35513h, bVar.f35513h);
        }
        if (obj instanceof f.a) {
            return d() && a(ne.e.f33774e).equals(((f.a) obj).f35535c);
        }
        return false;
    }

    public final d[] f(int i10) {
        ne.f fVarC;
        re.h hVar;
        Integer numValueOf = Integer.valueOf(i10);
        d[] dVarArr = this.f35514i.get(numValueOf);
        if (dVarArr != null) {
            return dVarArr;
        }
        e[] eVarArr = this.f35513h;
        ZoneOffsetTransition[] zoneOffsetTransitionArr = new d[eVarArr.length];
        for (int i11 = 0; i11 < eVarArr.length; i11++) {
            e eVar = eVarArr[i11];
            byte b10 = eVar.f35526d;
            if (b10 < 0) {
                ne.i iVar = eVar.f35525c;
                fVarC = ne.f.C(i10, iVar, iVar.length(m.f34269e.n(i10)) + 1 + eVar.f35526d);
                ne.c cVar = eVar.f35527e;
                if (cVar != null) {
                    hVar = new re.h(1, cVar, null);
                    fVarC = fVarC.o(hVar);
                }
            } else {
                fVarC = ne.f.C(i10, eVar.f35525c, b10);
                ne.c cVar2 = eVar.f35527e;
                if (cVar2 != null) {
                    hVar = new re.h(0, cVar2, null);
                    fVarC = fVarC.o(hVar);
                }
            }
            zoneOffsetTransitionArr[i11] = new d(eVar.f35530h.createDateTime(ne.g.u(fVarC.F(eVar.f35529g), eVar.f35528f), eVar.f35531i, eVar.f35532j), eVar.f35532j, eVar.f35533k);
        }
        if (i10 < 2100) {
            this.f35514i.putIfAbsent(numValueOf, zoneOffsetTransitionArr);
        }
        return zoneOffsetTransitionArr;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    public final Object g(ne.g gVar) {
        boolean z10;
        Object obj;
        int i10 = 0;
        if (this.f35513h.length > 0) {
            ne.g[] gVarArr = this.f35511f;
            ne.g gVar2 = gVarArr[gVarArr.length - 1];
            Objects.requireNonNull(gVar);
            if (!(gVar2 instanceof ne.g)) {
                long jL = gVar.f33788c.l();
                long jL2 = gVar2.f33788c.l();
                if (jL > jL2 || (jL == jL2 && gVar.f33789d.q() > gVar2.f33789d.q())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (gVar.q(gVar2) > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d[] dVarArrF = f(gVar.f33788c.f33781c);
                Object obj2 = null;
                int length = dVarArrF.length;
                while (i10 < length) {
                    d dVar = dVarArrF[i10];
                    ne.g gVar3 = dVar.f35522c;
                    boolean zB = dVar.b();
                    boolean zS = gVar.s(gVar3);
                    if (zB) {
                        if (zS) {
                            obj = dVar.f35523d;
                        } else if (gVar.s(dVar.a())) {
                            obj = dVar;
                        } else {
                            obj = dVar.f35524e;
                        }
                    } else if (!zS) {
                        obj = dVar.f35524e;
                    } else if (gVar.s(dVar.a())) {
                        obj = dVar.f35523d;
                    } else {
                        obj = dVar;
                    }
                    if ((obj instanceof d) || obj.equals(dVar.f35523d)) {
                        return obj;
                    }
                    i10++;
                    obj2 = obj;
                }
                return obj2;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f35511f, gVar);
        if (iBinarySearch == -1) {
            return this.f35512g[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.f35511f;
            if (iBinarySearch < objArr.length - 1) {
                int i11 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i11])) {
                    iBinarySearch = i11;
                }
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return this.f35512g[(iBinarySearch / 2) + 1];
        }
        ne.g[] gVarArr2 = this.f35511f;
        ne.g gVar4 = gVarArr2[iBinarySearch];
        ne.g gVar5 = gVarArr2[iBinarySearch + 1];
        r[] rVarArr = this.f35512g;
        int i12 = iBinarySearch / 2;
        r rVar = rVarArr[i12];
        r rVar2 = rVarArr[i12 + 1];
        return rVar2.f33835d > rVar.f33835d ? new d(gVar4, rVar, rVar2) : new d(gVar5, rVar, rVar2);
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f35508c) ^ Arrays.hashCode(this.f35509d)) ^ Arrays.hashCode(this.f35510e)) ^ Arrays.hashCode(this.f35512g)) ^ Arrays.hashCode(this.f35513h);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("StandardZoneRules[currentStandardOffset=");
        r[] rVarArr = this.f35509d;
        sbA.append(rVarArr[rVarArr.length - 1]);
        sbA.append("]");
        return sbA.toString();
    }
}
