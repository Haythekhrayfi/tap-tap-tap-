package l8;

import android.graphics.Bitmap;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 extends vc.l implements uc.l<Bitmap, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.e f32872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(o8.e eVar) {
        super(1);
        this.f32872c = eVar;
    }

    @Override // uc.l
    public jc.w invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (!this.f32872c.j()) {
            this.f32872c.setPreview(bitmap2);
            this.f32872c.setTag(R.id.image_loaded_flag, Boolean.FALSE);
        }
        return jc.w.f31842a;
    }
}
