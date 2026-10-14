package v8;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends l implements uc.l<Integer, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f36744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Canvas f36745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Canvas canvas) {
        super(1);
        this.f36744c = aVar;
        this.f36745d = canvas;
    }

    @Override // uc.l
    public w invoke(Integer num) {
        int iIntValue = num.intValue();
        a aVar = this.f36744c;
        Drawable lineSeparatorDrawable = aVar.getLineSeparatorDrawable();
        Canvas canvas = this.f36745d;
        a aVar2 = this.f36744c;
        return aVar.l(lineSeparatorDrawable, canvas, iIntValue - aVar2.f36729n, aVar2.getPaddingTop(), iIntValue, this.f36744c.getHeight() - this.f36744c.getPaddingBottom());
    }
}
