package de;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import fd.f;
import fd.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import vc.g;
import zd.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28960c;

    public a(String str, String str2, boolean z10) {
        j0.j(str, FacebookMediationAdapter.KEY_ID);
        j0.j(str2, "uuid");
        this.f28958a = str;
        this.f28959b = str2;
        this.f28960c = z10;
        new HashMap();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(String str, String str2, boolean z10, int i10, g gVar) {
        if ((i10 & 2) != 0) {
            str2 = UUID.randomUUID().toString();
            j0.e(str2, "UUID.randomUUID().toString()");
        }
        this(str, str2, (i10 & 4) != 0 ? false : z10);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    public final void a() {
        boolean z10;
        wd.a aVar = le.b.f33117a;
        if (aVar == null) {
            throw new IllegalStateException("StandAloneContext Koin instance is null".toString());
        }
        ArrayList<zd.c<?>> arrayList = aVar.f37306d.f44885a;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            zd.c cVar = (zd.c) next;
            if ((cVar instanceof d) && j0.d(((d) cVar).f45282c, this)) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((zd.c) it2.next()).release();
        }
        aVar.f37306d.f44885a.removeAll(arrayList2);
        HashSet<ge.b<?>> hashSet = aVar.f37304b.f37598a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : hashSet) {
            ge.b bVar = (ge.b) obj;
            if (j0.d(f.e(bVar), this.f28958a)) {
                j0.j(bVar, "$receiver");
                Object obj2 = bVar.f30453j.get("added_to_scope");
                if (!(obj2 instanceof Boolean)) {
                    obj2 = null;
                }
                Boolean bool = (Boolean) obj2;
                if (bool != null ? bool.booleanValue() : false) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList3.add(obj);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            aVar.f37304b.f37598a.remove((ge.b) it3.next());
        }
        c cVar2 = aVar.f37307e.f37312b;
        String str = this.f28958a;
        String str2 = this.f28959b;
        Objects.requireNonNull(cVar2);
        j0.j(str, FacebookMediationAdapter.KEY_ID);
        j0.j(str2, "uuid");
        cVar2.f28961a.remove(str);
        cVar2.f28962b.remove(str2);
        Iterator<T> it4 = cVar2.f28963c.iterator();
        while (it4.hasNext()) {
            ((b) it4.next()).a(str, str2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (j0.d(this.f28958a, aVar.f28958a) && j0.d(this.f28959b, aVar.f28959b)) {
                    if (this.f28960c == aVar.f28960c) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        String str = this.f28958a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f28959b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z10 = this.f28960c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode2 + r10;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Scope['");
        sbA.append(this.f28958a);
        sbA.append("'-");
        return s.a.a(sbA, this.f28959b, ']');
    }
}
