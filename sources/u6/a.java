package u6;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import h0.f;
import java.io.Serializable;
import java.util.List;
import kc.w;
import r6.d;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Serializable {
    private List<d> actionSets;
    private String name;
    private boolean oneFingerMode;
    private int orientation;
    private boolean randomizeActions;
    private long repeatCount;
    private long repeatInterval;
    private long swipeDuration;
    private long tapDuration;
    private long updated;

    public a() {
        this(null, 0L, 0L, 0L, false, 0L, null, 0L, false, 0, 1023, null);
    }

    public a(String str, long j10, long j11, long j12, boolean z10, long j13, List<d> list, long j14, boolean z11, int i10) {
        j0.i(str, "name");
        j0.i(list, "actionSets");
        this.name = str;
        this.repeatInterval = j10;
        this.tapDuration = j11;
        this.swipeDuration = j12;
        this.randomizeActions = z10;
        this.repeatCount = j13;
        this.actionSets = list;
        this.updated = j14;
        this.oneFingerMode = z11;
        this.orientation = i10;
    }

    public /* synthetic */ a(String str, long j10, long j11, long j12, boolean z10, long j13, List list, long j14, boolean z11, int i10, int i11, g gVar) {
        this((i11 & 1) != 0 ? "Unsaved" : str, (i11 & 2) != 0 ? 200L : j10, (i11 & 4) != 0 ? 200L : j11, (i11 & 8) == 0 ? j12 : 200L, (i11 & 16) != 0 ? false : z10, (i11 & 32) != 0 ? 0L : j13, (i11 & 64) != 0 ? w.f32009c : list, (i11 & 128) != 0 ? System.currentTimeMillis() : j14, (i11 & 256) != 0 ? true : z11, (i11 & 512) == 0 ? i10 : 1);
    }

    public final List<d> a() {
        return this.actionSets;
    }

    public final boolean b() {
        return this.oneFingerMode;
    }

    public final int c() {
        return this.orientation;
    }

    public final boolean d() {
        return this.randomizeActions;
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
        return j0.d(this.name, aVar.name) && this.repeatInterval == aVar.repeatInterval && this.tapDuration == aVar.tapDuration && this.swipeDuration == aVar.swipeDuration && this.randomizeActions == aVar.randomizeActions && this.repeatCount == aVar.repeatCount && j0.d(this.actionSets, aVar.actionSets) && this.updated == aVar.updated && this.oneFingerMode == aVar.oneFingerMode && this.orientation == aVar.orientation;
    }

    public final long f() {
        return this.repeatInterval;
    }

    public final long g() {
        return this.swipeDuration;
    }

    public final String getName() {
        return this.name;
    }

    public final long h() {
        return this.tapDuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iA = r6.b.a(this.swipeDuration, r6.b.a(this.tapDuration, r6.b.a(this.repeatInterval, this.name.hashCode() * 31, 31), 31), 31);
        boolean z10 = this.randomizeActions;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iA2 = r6.b.a(this.updated, (this.actionSets.hashCode() + r6.b.a(this.repeatCount, (iA + r10) * 31, 31)) * 31, 31);
        boolean z11 = this.oneFingerMode;
        return Integer.hashCode(this.orientation) + ((iA2 + (z11 ? 1 : z11)) * 31);
    }

    public final long i() {
        return this.updated;
    }

    public final void j(List<d> list) {
        j0.i(list, "<set-?>");
        this.actionSets = list;
    }

    public final void k(String str) {
        j0.i(str, "<set-?>");
        this.name = str;
    }

    public final void l(boolean z10) {
        this.oneFingerMode = z10;
    }

    public final void m(int i10) {
        this.orientation = i10;
    }

    public final void n(boolean z10) {
        this.randomizeActions = z10;
    }

    public final void o(long j10) {
        this.repeatCount = j10;
    }

    public final void p(long j10) {
        this.repeatInterval = j10;
    }

    public final void q(long j10) {
        this.swipeDuration = j10;
    }

    public final void r(long j10) {
        this.tapDuration = j10;
    }

    public final void s(long j10) {
        this.updated = j10;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ManualSettings(name=");
        sbA.append(this.name);
        sbA.append(", repeatInterval=");
        sbA.append(this.repeatInterval);
        sbA.append(", tapDuration=");
        sbA.append(this.tapDuration);
        sbA.append(", swipeDuration=");
        sbA.append(this.swipeDuration);
        sbA.append(", randomizeActions=");
        sbA.append(this.randomizeActions);
        sbA.append(", repeatCount=");
        sbA.append(this.repeatCount);
        sbA.append(", actionSets=");
        sbA.append(this.actionSets);
        sbA.append(", updated=");
        sbA.append(this.updated);
        sbA.append(", oneFingerMode=");
        sbA.append(this.oneFingerMode);
        sbA.append(", orientation=");
        return f.a(sbA, this.orientation, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
