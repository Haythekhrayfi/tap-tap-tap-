package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class b4 extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.n f32280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(o8.n nVar) {
        super(1);
        this.f32280c = nVar;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        String str2 = str;
        fd.j0.i(str2, "hint");
        this.f32280c.setHint(str2);
        return jc.w.f31842a;
    }
}
