package l8;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f32543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i8.k f32544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f32545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<y9.q> f32546f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(j jVar, i8.k kVar, View view, List<? extends y9.q> list) {
        super(0);
        this.f32543c = jVar;
        this.f32544d = kVar;
        this.f32545e = view;
        this.f32546f = list;
    }

    @Override // uc.a
    public jc.w invoke() {
        this.f32543c.c(this.f32544d, this.f32545e, this.f32546f, "double_click");
        return jc.w.f31842a;
    }
}
