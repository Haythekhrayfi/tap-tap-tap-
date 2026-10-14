package o8;

import android.graphics.Bitmap;
import android.view.View;
import fd.j0;
import java.util.List;
import y9.d2;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f34135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bitmap f34136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f34137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r7.b f34138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v9.d f34139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ uc.l f34140h;

    public v(View view, Bitmap bitmap, List list, r7.b bVar, v9.d dVar, uc.l lVar) {
        this.f34135c = view;
        this.f34136d = bitmap;
        this.f34137e = list;
        this.f34138f = bVar;
        this.f34139g = dVar;
        this.f34140h = lVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        j0.i(view, "view");
        view.removeOnLayoutChangeListener(this);
        float fMax = Math.max(this.f34135c.getHeight() / this.f34136d.getHeight(), this.f34135c.getWidth() / this.f34136d.getWidth());
        Bitmap bitmap = this.f34136d;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMax), (int) (fMax * this.f34136d.getHeight()), false);
        for (d2 d2Var : this.f34137e) {
            if (d2Var instanceof d2.a) {
                j0.h(bitmapCreateScaledBitmap, "bitmap");
                bitmapCreateScaledBitmap = x1.q.h(bitmapCreateScaledBitmap, ((d2.a) d2Var).f39562c, this.f34138f, this.f34139g);
            }
        }
        uc.l lVar = this.f34140h;
        j0.h(bitmapCreateScaledBitmap, "bitmap");
        lVar.invoke(bitmapCreateScaledBitmap);
    }
}
