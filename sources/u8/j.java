package u8;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.Objects;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends vc.l implements uc.p<View, Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f36124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f36125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Canvas f36126e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, boolean z10, Canvas canvas) {
        super(2);
        this.f36124c = iVar;
        this.f36125d = z10;
        this.f36126e = canvas;
    }

    @Override // uc.p
    public jc.w invoke(View view, Integer num) {
        int i10;
        View view2 = view;
        int iIntValue = num.intValue();
        j0.i(view2, "child");
        i iVar = this.f36124c;
        KProperty<Object>[] kPropertyArr = i.f36104v;
        if (iVar.t(iIntValue)) {
            if (this.f36125d) {
                int right = view2.getRight();
                m9.e.a aVar = m9.e.f33332c;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                i10 = right + ((ViewGroup.MarginLayoutParams) ((m9.d) layoutParams)).rightMargin;
            } else {
                int left = view2.getLeft();
                m9.e.a aVar2 = m9.e.f33332c;
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                i10 = (left - ((ViewGroup.MarginLayoutParams) ((m9.d) layoutParams2)).leftMargin) - this.f36124c.f36113l;
            }
            this.f36124c.m(this.f36126e, i10);
        }
        return jc.w.f31842a;
    }
}
