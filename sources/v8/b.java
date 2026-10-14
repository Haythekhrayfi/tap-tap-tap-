package v8;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends l implements uc.l<Integer, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f36742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Canvas f36743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, Canvas canvas) {
        super(1);
        this.f36742c = aVar;
        this.f36743d = canvas;
    }

    @Override // uc.l
    public w invoke(Integer num) {
        int iIntValue = num.intValue();
        a aVar = this.f36742c;
        Drawable lineSeparatorDrawable = aVar.getLineSeparatorDrawable();
        Canvas canvas = this.f36743d;
        int paddingLeft = this.f36742c.getPaddingLeft();
        a aVar2 = this.f36742c;
        return aVar.l(lineSeparatorDrawable, canvas, paddingLeft, iIntValue - aVar2.f36729n, aVar2.getWidth() - this.f36742c.getPaddingRight(), iIntValue);
    }
}
