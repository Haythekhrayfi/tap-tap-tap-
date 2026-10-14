package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class f4 extends vc.l implements uc.l<y9.z5.h, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v9.d f32377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f32378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(v9.d dVar, String str) {
        super(1);
        this.f32377c = dVar;
        this.f32378d = str;
    }

    @Override // uc.l
    public Boolean invoke(y9.z5.h hVar) {
        y9.z5.h hVar2 = hVar;
        fd.j0.i(hVar2, "it");
        return Boolean.valueOf(fd.j0.d(hVar2.f44679b.b(this.f32377c), this.f32378d));
    }
}
