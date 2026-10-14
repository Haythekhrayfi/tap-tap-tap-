package u8;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.Objects;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends vc.l implements uc.p<View, Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f36127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Canvas f36128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, Canvas canvas) {
        super(2);
        this.f36127c = iVar;
        this.f36128d = canvas;
    }

    @Override // uc.p
    public jc.w invoke(View view, Integer num) {
        View view2 = view;
        int iIntValue = num.intValue();
        j0.i(view2, "child");
        i iVar = this.f36127c;
        KProperty<Object>[] kPropertyArr = i.f36104v;
        if (iVar.t(iIntValue)) {
            int top = view2.getTop();
            m9.e.a aVar = m9.e.f33332c;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            int i10 = top - ((ViewGroup.MarginLayoutParams) ((m9.d) layoutParams)).topMargin;
            i iVar2 = this.f36127c;
            iVar2.l(this.f36128d, i10 - iVar2.f36114m);
        }
        return jc.w.f31842a;
    }
}
