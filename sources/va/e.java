package va;

import androidx.recyclerview.widget.s;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.LinkedList;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36781b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f36782c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f36783a;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }

        public final e a() {
            e eVar = e.f36782c;
            if (eVar != null) {
                return eVar;
            }
            e eVar2 = new e(null);
            e.f36782c = eVar2;
            return eVar2;
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f36784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f36785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f36786c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f36787d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f36788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f36789f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f36790g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinkedList<String> f36791h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f36792i;

        public b() {
            this(0L, 0L, false, null, false, 0L, 0L, null, false, 511, null);
        }

        public b(long j10, long j11, boolean z10, String str, boolean z11, long j12, long j13, LinkedList<String> linkedList, boolean z12) {
            j0.i(str, "screenName");
            j0.i(linkedList, "failedSkuList");
            this.f36784a = j10;
            this.f36785b = j11;
            this.f36786c = z10;
            this.f36787d = str;
            this.f36788e = z11;
            this.f36789f = j12;
            this.f36790g = j13;
            this.f36791h = linkedList;
            this.f36792i = z12;
        }

        public /* synthetic */ b(long j10, long j11, boolean z10, String str, boolean z11, long j12, long j13, LinkedList linkedList, boolean z12, int i10, g gVar) {
            this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? "" : str, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? 0L : j12, (i10 & 64) == 0 ? j13 : 0L, (i10 & 128) != 0 ? new LinkedList() : linkedList, (i10 & 256) == 0 ? z12 : false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f36784a == bVar.f36784a && this.f36785b == bVar.f36785b && this.f36786c == bVar.f36786c && j0.d(this.f36787d, bVar.f36787d) && this.f36788e == bVar.f36788e && this.f36789f == bVar.f36789f && this.f36790g == bVar.f36790g && j0.d(this.f36791h, bVar.f36791h) && this.f36792i == bVar.f36792i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v11, types: [int] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iA = r6.b.a(this.f36785b, Long.hashCode(this.f36784a) * 31, 31);
            boolean z10 = this.f36786c;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int iA2 = l1.e.a(this.f36787d, (iA + r10) * 31, 31);
            boolean z11 = this.f36788e;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            int iHashCode = (this.f36791h.hashCode() + r6.b.a(this.f36790g, r6.b.a(this.f36789f, (iA2 + r11) * 31, 31), 31)) * 31;
            boolean z12 = this.f36792i;
            return iHashCode + (z12 ? 1 : z12);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("SkuLoadingData(offersStartLoadTime=");
            sbA.append(this.f36784a);
            sbA.append(", offersEndLoadTime=");
            sbA.append(this.f36785b);
            sbA.append(", offersCacheHit=");
            sbA.append(this.f36786c);
            sbA.append(", screenName=");
            sbA.append(this.f36787d);
            sbA.append(", isOneTimeOffer=");
            sbA.append(this.f36788e);
            sbA.append(", updateOffersCacheStart=");
            sbA.append(this.f36789f);
            sbA.append(", updateOffersCacheEnd=");
            sbA.append(this.f36790g);
            sbA.append(", failedSkuList=");
            sbA.append(this.f36791h);
            sbA.append(", cachePrepared=");
            return s.a(sbA, this.f36792i, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public e() {
    }

    public e(g gVar) {
    }

    public final void b() {
        b bVar = this.f36783a;
        if (bVar != null) {
            bVar.f36785b = System.currentTimeMillis();
        }
        b bVar2 = this.f36783a;
        if (bVar2 != null) {
            this.f36783a = null;
            a(new f(bVar2));
        }
    }

    public final void c() {
        b bVar = this.f36783a;
        if (bVar != null) {
            bVar.f36784a = System.currentTimeMillis();
            bVar.f36792i = bVar.f36790g != 0;
        }
    }
}
