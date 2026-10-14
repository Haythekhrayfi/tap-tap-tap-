package za;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static final GradientDrawable a(Context context, i.b bVar) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((int) (8 * Resources.getSystem().getDisplayMetrics().density));
        gradientDrawable.setColor(c(context, bVar.f45239a));
        return gradientDrawable;
    }

    public static final RippleDrawable b(Context context, i.b bVar, i.b bVar2) {
        int iIntValue;
        int iIntValue2;
        j0.i(bVar, "style");
        j0.i(bVar2, "defaultRateBarStyle");
        int i10 = bVar2.f45239a;
        Object obj = e0.a.f28964a;
        int iA = e0.a.d.a(context, i10);
        Integer num = bVar.f45241c;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Integer num2 = bVar2.f45241c;
            j0.f(num2);
            iIntValue = num2.intValue();
        }
        int iA2 = e0.a.d.a(context, iIntValue);
        Integer num3 = bVar.f45240b;
        if (num3 != null) {
            iIntValue2 = num3.intValue();
        } else {
            Integer num4 = bVar2.f45240b;
            j0.f(num4);
            iIntValue2 = num4.intValue();
        }
        return new RippleDrawable(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{R.attr.state_enabled}, new int[0]}, new int[]{iA2, iA, e0.a.d.a(context, iIntValue2)}), a(context, bVar), null);
    }

    public static final int c(Context context, int i10) {
        Object obj = e0.a.f28964a;
        return e0.a.d.a(context, i10);
    }
}
