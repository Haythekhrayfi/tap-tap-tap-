package l8;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.View;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<y9.e0> f32840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<y9.e0> f32841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f32842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Drawable f32843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f32844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i8.k f32845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v9.d f32846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DisplayMetrics f32847j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(List<? extends y9.e0> list, List<? extends y9.e0> list2, View view, Drawable drawable, p pVar, i8.k kVar, v9.d dVar, DisplayMetrics displayMetrics) {
        super(1);
        this.f32840c = list;
        this.f32841d = list2;
        this.f32842e = view;
        this.f32843f = drawable;
        this.f32844g = pVar;
        this.f32845h = kVar;
        this.f32846i = dVar;
        this.f32847j = displayMetrics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kc.w] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    @Override // uc.l
    public jc.w invoke(Object obj) {
        ?? arrayList;
        fd.j0.i(obj, "$noName_0");
        List<y9.e0> list = this.f32840c;
        if (list == null) {
            arrayList = 0;
        } else {
            p pVar = this.f32844g;
            DisplayMetrics displayMetrics = this.f32847j;
            v9.d dVar = this.f32846i;
            arrayList = new ArrayList(kc.m.j(list, 10));
            for (y9.e0 e0Var : list) {
                fd.j0.h(displayMetrics, "metrics");
                arrayList.add(p.a(pVar, e0Var, displayMetrics, dVar));
            }
        }
        if (arrayList == 0) {
            arrayList = kc.w.f32009c;
        }
        List<y9.e0> list2 = this.f32841d;
        p pVar2 = this.f32844g;
        DisplayMetrics displayMetrics2 = this.f32847j;
        v9.d dVar2 = this.f32846i;
        ArrayList arrayList2 = new ArrayList(kc.m.j(list2, 10));
        for (y9.e0 e0Var2 : list2) {
            fd.j0.h(displayMetrics2, "metrics");
            arrayList2.add(p.a(pVar2, e0Var2, displayMetrics2, dVar2));
        }
        Object tag = this.f32842e.getTag(R.id.div_default_background_list_tag);
        List list3 = tag instanceof List ? (List) tag : null;
        Object tag2 = this.f32842e.getTag(R.id.div_focused_background_list_tag);
        List list4 = tag2 instanceof List ? (List) tag2 : null;
        Object tag3 = this.f32842e.getTag(R.id.div_additional_background_layer_tag);
        if ((fd.j0.d(list3, arrayList) && fd.j0.d(list4, arrayList2) && fd.j0.d(tag3 instanceof Drawable ? (Drawable) tag3 : null, this.f32843f)) ? false : true) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_focused}, p.b(this.f32844g, arrayList2, this.f32842e, this.f32845h, this.f32843f, this.f32846i));
            if (this.f32840c != null || this.f32843f != null) {
                stateListDrawable.addState(StateSet.WILD_CARD, p.b(this.f32844g, arrayList, this.f32842e, this.f32845h, this.f32843f, this.f32846i));
            }
            p.c(this.f32844g, this.f32842e, stateListDrawable);
            this.f32842e.setTag(R.id.div_default_background_list_tag, arrayList);
            this.f32842e.setTag(R.id.div_focused_background_list_tag, arrayList2);
            this.f32842e.setTag(R.id.div_additional_background_layer_tag, this.f32843f);
        }
        return jc.w.f31842a;
    }
}
