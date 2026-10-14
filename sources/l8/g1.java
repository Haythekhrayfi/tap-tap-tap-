package l8;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 extends vc.l implements uc.l<Drawable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.u f32387c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(o8.u uVar) {
        super(1);
        this.f32387c = uVar;
    }

    @Override // uc.l
    public jc.w invoke(Drawable drawable) {
        this.f32387c.setSeparatorDrawable(drawable);
        return jc.w.f31842a;
    }
}
