package l8;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class t1 extends vc.l implements uc.l<Drawable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.e f32851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(o8.e eVar) {
        super(1);
        this.f32851c = eVar;
    }

    @Override // uc.l
    public jc.w invoke(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (!this.f32851c.j() && !this.f32851c.k()) {
            this.f32851c.setPlaceholder(drawable2);
        }
        return jc.w.f31842a;
    }
}
