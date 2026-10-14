package ab;

import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, AppCompatActivity appCompatActivity) {
        super(0);
        this.f295c = cVar;
        this.f296d = appCompatActivity;
    }

    @Override // uc.a
    public jc.w invoke() {
        c.a(this.f295c, this.f296d);
        return jc.w.f31842a;
    }
}
