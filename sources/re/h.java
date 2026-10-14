package re;

import fd.z;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35372d;

    public h(int i10, ne.c cVar, g gVar) {
        z.B(cVar, "dayOfWeek");
        this.f35371c = i10;
        this.f35372d = cVar.getValue();
    }

    @Override // re.f
    public d adjustInto(d dVar) {
        int i10 = dVar.get(a.DAY_OF_WEEK);
        int i11 = this.f35371c;
        if (i11 < 2 && i10 == this.f35372d) {
            return dVar;
        }
        if ((i11 & 1) == 0) {
            int i12 = i10 - this.f35372d;
            return dVar.j(i12 >= 0 ? 7 - i12 : -i12, b.DAYS);
        }
        int i13 = this.f35372d - i10;
        return dVar.i(i13 >= 0 ? 7 - i13 : -i13, b.DAYS);
    }
}
