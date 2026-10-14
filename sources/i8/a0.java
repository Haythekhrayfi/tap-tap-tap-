package i8;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends vc.l implements uc.l<Bitmap, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc.l<Bitmap, jc.w> f31306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.w f31307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(uc.l<? super Bitmap, jc.w> lVar, o8.w wVar) {
        super(1);
        this.f31306c = lVar;
        this.f31307d = wVar;
    }

    @Override // uc.l
    public jc.w invoke(Bitmap bitmap) {
        this.f31306c.invoke(bitmap);
        this.f31307d.e();
        return jc.w.f31842a;
    }
}
