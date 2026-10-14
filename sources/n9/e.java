package n9;

import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f33725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f33726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f33727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f33728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f33729e;

    public e(a aVar, d dVar, d dVar2, d dVar3, b bVar) {
        j0.i(aVar, "animation");
        j0.i(dVar, "activeShape");
        j0.i(dVar2, "inactiveShape");
        j0.i(dVar3, "minimumShape");
        j0.i(bVar, "itemsPlacement");
        this.f33725a = aVar;
        this.f33726b = dVar;
        this.f33727c = dVar2;
        this.f33728d = dVar3;
        this.f33729e = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f33725a == eVar.f33725a && j0.d(this.f33726b, eVar.f33726b) && j0.d(this.f33727c, eVar.f33727c) && j0.d(this.f33728d, eVar.f33728d) && j0.d(this.f33729e, eVar.f33729e);
    }

    public int hashCode() {
        return this.f33729e.hashCode() + ((this.f33728d.hashCode() + ((this.f33727c.hashCode() + ((this.f33726b.hashCode() + (this.f33725a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Style(animation=");
        sbA.append(this.f33725a);
        sbA.append(", activeShape=");
        sbA.append(this.f33726b);
        sbA.append(", inactiveShape=");
        sbA.append(this.f33727c);
        sbA.append(", minimumShape=");
        sbA.append(this.f33728d);
        sbA.append(", itemsPlacement=");
        sbA.append(this.f33729e);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
