package l8;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f32518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i8.k f32519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f32520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y9.q f32521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q9.b f32522g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, i8.k kVar, View view, y9.q qVar, q9.b bVar) {
        super(0);
        this.f32518c = jVar;
        this.f32519d = kVar;
        this.f32520e = view;
        this.f32521f = qVar;
        this.f32522g = bVar;
    }

    @Override // uc.a
    public jc.w invoke() {
        this.f32518c.f32461b.t(this.f32519d, this.f32520e, this.f32521f);
        this.f32518c.f32462c.a(this.f32521f, this.f32519d.getExpressionResolver());
        q9.b bVar = this.f32522g;
        Objects.requireNonNull(bVar);
        new y6.d(bVar).onClick(this.f32520e);
        return jc.w.f31842a;
    }
}
