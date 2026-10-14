package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class j3 extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vc.a0<String> f32503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i8.k f32504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(vc.a0<String> a0Var, i8.k kVar) {
        super(1);
        this.f32503c = a0Var;
        this.f32504d = kVar;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        String str2 = str;
        fd.j0.i(str2, "value");
        String str3 = this.f32503c.f36988c;
        if (str3 != null) {
            this.f32504d.z(str3, str2);
        }
        return jc.w.f31842a;
    }
}
