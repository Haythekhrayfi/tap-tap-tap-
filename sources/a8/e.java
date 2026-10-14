package a8;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f193d;

    public e() {
        this(false, false, false, null, 15, null);
    }

    public e(boolean z10, boolean z11, boolean z12, JSONObject jSONObject) {
        this.f190a = z10;
        this.f191b = z11;
        this.f192c = z12;
        this.f193d = jSONObject;
    }

    public /* synthetic */ e(boolean z10, boolean z11, boolean z12, JSONObject jSONObject, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? null : jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f190a == eVar.f190a && this.f191b == eVar.f191b && this.f192c == eVar.f192c && j0.d(this.f193d, eVar.f193d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z10 = this.f190a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        boolean z11 = this.f191b;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.f192c;
        int i12 = (i11 + (z12 ? 1 : z12)) * 31;
        JSONObject jSONObject = this.f193d;
        return i12 + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DivPlayerPlaybackConfig(autoplay=");
        sbA.append(this.f190a);
        sbA.append(", isMuted=");
        sbA.append(this.f191b);
        sbA.append(", repeatable=");
        sbA.append(this.f192c);
        sbA.append(", payload=");
        sbA.append(this.f193d);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
