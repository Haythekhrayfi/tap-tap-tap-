package l8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y3 extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<String> f32985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o8.n f32987e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(List<String> list, int i10, o8.n nVar) {
        super(1);
        this.f32985c = list;
        this.f32986d = i10;
        this.f32987e = nVar;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        String str2 = str;
        fd.j0.i(str2, "it");
        this.f32985c.set(this.f32986d, str2);
        this.f32987e.setItems(this.f32985c);
        return jc.w.f31842a;
    }
}
