package l8;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 extends vc.l implements uc.l<Drawable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.u f32439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(o8.u uVar) {
        super(1);
        this.f32439c = uVar;
    }

    @Override // uc.l
    public jc.w invoke(Drawable drawable) {
        this.f32439c.setLineSeparatorDrawable(drawable);
        return jc.w.f31842a;
    }
}
