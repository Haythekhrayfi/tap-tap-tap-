package u9;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public class f extends RuntimeException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f36171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k9.c f36172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36173e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, Throwable th, k9.c cVar, String str2) {
        super(str, th);
        j0.i(gVar, "reason");
        j0.i(str, "message");
        this.f36171c = gVar;
        this.f36172d = cVar;
        this.f36173e = str2;
    }

    public /* synthetic */ f(g gVar, String str, Throwable th, k9.c cVar, String str2, int i10, vc.g gVar2) {
        this(gVar, str, (i10 & 4) != 0 ? null : th, (i10 & 8) != 0 ? null : cVar, (i10 & 16) != 0 ? null : str2);
    }
}
