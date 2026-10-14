package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class b1 {

    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        d1 d1Var = d1.f1182m;
        if (d1Var != null && d1Var.f1184c == view) {
            d1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new d1(view, charSequence);
            return;
        }
        d1 d1Var2 = d1.f1183n;
        if (d1Var2 != null && d1Var2.f1184c == view) {
            d1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
