package v6;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kc.t;
import r6.d;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Serializable {
    private List<d> actionSets;
    private String name;
    private int orientation;
    private double playbackSpeed;
    private long repeatCount;
    private long timeBetweenRepeat;
    private long updated;

    public a() {
        this(null, null, 0L, 0L, 0, 0L, 0.0d, 127, null);
    }

    public a(String str, List<d> list, long j10, long j11, int i10, long j12, double d10) {
        j0.i(str, "name");
        j0.i(list, "actionSets");
        this.name = str;
        this.actionSets = list;
        this.updated = j10;
        this.timeBetweenRepeat = j11;
        this.orientation = i10;
        this.repeatCount = j12;
        this.playbackSpeed = d10;
    }

    public /* synthetic */ a(String str, List list, long j10, long j11, int i10, long j12, double d10, int i11, g gVar) {
        this((i11 & 1) != 0 ? "Unsaved" : str, (i11 & 2) != 0 ? new ArrayList() : list, (i11 & 4) != 0 ? System.currentTimeMillis() : j10, (i11 & 8) != 0 ? 1000L : j11, (i11 & 16) != 0 ? 1 : i10, (i11 & 32) != 0 ? 1L : j12, (i11 & 64) != 0 ? 1.0d : d10);
    }

    public static a a(a aVar, String str, List list, long j10, long j11, int i10, long j12, double d10, int i11) {
        String str2 = (i11 & 1) != 0 ? aVar.name : null;
        List list2 = (i11 & 2) != 0 ? aVar.actionSets : list;
        long j13 = (i11 & 4) != 0 ? aVar.updated : j10;
        long j14 = (i11 & 8) != 0 ? aVar.timeBetweenRepeat : j11;
        int i12 = (i11 & 16) != 0 ? aVar.orientation : i10;
        long j15 = (i11 & 32) != 0 ? aVar.repeatCount : j12;
        double d11 = (i11 & 64) != 0 ? aVar.playbackSpeed : d10;
        j0.i(str2, "name");
        j0.i(list2, "actionSets");
        return new a(str2, list2, j13, j14, i12, j15, d11);
    }

    public final List<d> b() {
        return this.actionSets;
    }

    public final long c() {
        List<r6.c> listA;
        r6.c cVar;
        List<r6.c> listA2;
        r6.c cVar2;
        long jC = 0;
        if (this.repeatCount == 0) {
            return 0L;
        }
        d dVar = (d) t.s(this.actionSets);
        long jC2 = (dVar == null || (listA2 = dVar.a()) == null || (cVar2 = (r6.c) t.s(listA2)) == null) ? 0L : cVar2.c();
        d dVar2 = (d) t.y(this.actionSets);
        if (dVar2 != null && (listA = dVar2.a()) != null && (cVar = (r6.c) t.y(listA)) != null) {
            jC = cVar.c();
        }
        double d10 = (jC - jC2) / this.playbackSpeed;
        long j10 = this.repeatCount;
        return (long) ((d10 * j10) + (j10 * this.timeBetweenRepeat));
    }

    public final int d() {
        return this.orientation;
    }

    public final double e() {
        return this.playbackSpeed;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j0.d(this.name, aVar.name) && j0.d(this.actionSets, aVar.actionSets) && this.updated == aVar.updated && this.timeBetweenRepeat == aVar.timeBetweenRepeat && this.orientation == aVar.orientation && this.repeatCount == aVar.repeatCount && Double.compare(this.playbackSpeed, aVar.playbackSpeed) == 0;
    }

    public final long f() {
        return this.repeatCount;
    }

    public final long g() {
        return this.timeBetweenRepeat;
    }

    public final String getName() {
        return this.name;
    }

    public final long h() {
        return this.updated;
    }

    public int hashCode() {
        return Double.hashCode(this.playbackSpeed) + r6.b.a(this.repeatCount, r6.a.a(this.orientation, r6.b.a(this.timeBetweenRepeat, r6.b.a(this.updated, (this.actionSets.hashCode() + (this.name.hashCode() * 31)) * 31, 31), 31), 31), 31);
    }

    public final void i(List<d> list) {
        j0.i(list, "<set-?>");
        this.actionSets = list;
    }

    public final void j(String str) {
        j0.i(str, "<set-?>");
        this.name = str;
    }

    public final void k(int i10) {
        this.orientation = i10;
    }

    public final void l(double d10) {
        this.playbackSpeed = d10;
    }

    public final void m(long j10) {
        this.repeatCount = j10;
    }

    public final void n(long j10) {
        this.timeBetweenRepeat = j10;
    }

    public final void o(long j10) {
        this.updated = j10;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("RecordSettings(name=");
        sbA.append(this.name);
        sbA.append(", actionSets=");
        sbA.append(this.actionSets);
        sbA.append(", updated=");
        sbA.append(this.updated);
        sbA.append(", timeBetweenRepeat=");
        sbA.append(this.timeBetweenRepeat);
        sbA.append(", orientation=");
        sbA.append(this.orientation);
        sbA.append(", repeatCount=");
        sbA.append(this.repeatCount);
        sbA.append(", playbackSpeed=");
        sbA.append(this.playbackSpeed);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
