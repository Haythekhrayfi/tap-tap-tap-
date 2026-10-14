package l8;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends vc.l implements uc.l<Drawable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.j f32549c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(o8.j jVar) {
        super(1);
        this.f32549c = jVar;
    }

    @Override // uc.l
    public jc.w invoke(Drawable drawable) {
        this.f32549c.setDividerDrawable(drawable);
        return jc.w.f31842a;
    }
}
