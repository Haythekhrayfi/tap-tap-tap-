package t6;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Serializable {
    private String name;
    private int orientation;
    private List<v6.a> recordings;
    private long repeatCount;
    private long timeBetweenRepeat;
    private long updated;

    public a() {
        this(null, null, 0L, 0L, 0, 0L, 63, null);
    }

    public a(String str, List<v6.a> list, long j10, long j11, int i10, long j12) {
        j0.i(str, "name");
        j0.i(list, "recordings");
        this.name = str;
        this.recordings = list;
        this.updated = j10;
        this.timeBetweenRepeat = j11;
        this.orientation = i10;
        this.repeatCount = j12;
    }

    public /* synthetic */ a(String str, List list, long j10, long j11, int i10, long j12, int i11, g gVar) {
        this((i11 & 1) != 0 ? "Unsaved" : str, (i11 & 2) != 0 ? new ArrayList() : list, (i11 & 4) != 0 ? System.currentTimeMillis() : j10, (i11 & 8) != 0 ? 1000L : j11, (i11 & 16) != 0 ? 1 : i10, (i11 & 32) != 0 ? 1L : j12);
    }

    public static a a(a aVar, String str, List list, long j10, long j11, int i10, long j12, int i11) {
        String str2 = (i11 & 1) != 0 ? aVar.name : null;
        List list2 = (i11 & 2) != 0 ? aVar.recordings : list;
        long j13 = (i11 & 4) != 0 ? aVar.updated : j10;
        long j14 = (i11 & 8) != 0 ? aVar.timeBetweenRepeat : j11;
        int i12 = (i11 & 16) != 0 ? aVar.orientation : i10;
        long j15 = (i11 & 32) != 0 ? aVar.repeatCount : j12;
        j0.i(str2, "name");
        j0.i(list2, "recordings");
        return new a(str2, list2, j13, j14, i12, j15);
    }

    public final long b() {
        if (this.repeatCount == 0) {
            return 0L;
        }
        int iC = 0;
        Iterator<T> it = this.recordings.iterator();
        while (it.hasNext()) {
            iC += (int) ((v6.a) it.next()).c();
        }
        long j10 = this.repeatCount;
        return (j10 * this.timeBetweenRepeat) + (((long) iC) * j10);
    }

    public final int c() {
        return this.orientation;
    }

    public final List<v6.a> d() {
        return this.recordings;
    }

    public final long e() {
        return this.repeatCount;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j0.d(this.name, aVar.name) && j0.d(this.recordings, aVar.recordings) && this.updated == aVar.updated && this.timeBetweenRepeat == aVar.timeBetweenRepeat && this.orientation == aVar.orientation && this.repeatCount == aVar.repeatCount;
    }

    public final long f() {
        return this.timeBetweenRepeat;
    }

    public final long g() {
        return this.updated;
    }

    public final String getName() {
        return this.name;
    }

    public final void h(String str) {
        j0.i(str, "<set-?>");
        this.name = str;
    }

    public int hashCode() {
        return Long.hashCode(this.repeatCount) + r6.a.a(this.orientation, r6.b.a(this.timeBetweenRepeat, r6.b.a(this.updated, (this.recordings.hashCode() + (this.name.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final void i(int i10) {
        this.orientation = i10;
    }

    public final void j(List<v6.a> list) {
        j0.i(list, "<set-?>");
        this.recordings = list;
    }

    public final void k(long j10) {
        this.repeatCount = j10;
    }

    public final void l(long j10) {
        this.timeBetweenRepeat = j10;
    }

    public final void m(long j10) {
        this.updated = j10;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CombineSettings(name=");
        sbA.append(this.name);
        sbA.append(", recordings=");
        sbA.append(this.recordings);
        sbA.append(", updated=");
        sbA.append(this.updated);
        sbA.append(", timeBetweenRepeat=");
        sbA.append(this.timeBetweenRepeat);
        sbA.append(", orientation=");
        sbA.append(this.orientation);
        sbA.append(", repeatCount=");
        return o2.a.a(sbA, this.repeatCount, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
