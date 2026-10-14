package l8;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class e2 extends vc.l implements uc.l<Bitmap, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.g f32342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(o8.g gVar) {
        super(1);
        this.f32342c = gVar;
    }

    @Override // uc.l
    public jc.w invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        fd.j0.i(bitmap2, "it");
        this.f32342c.setImageBitmap(bitmap2);
        return jc.w.f31842a;
    }
}
