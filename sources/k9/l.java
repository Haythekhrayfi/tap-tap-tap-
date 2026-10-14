package k9;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class l {
    public static <T extends View> T a(View view, int i10) {
        T t10 = (T) view.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        StringBuilder sbA = defpackage.a.a("View with id [");
        sbA.append(view.getResources().getResourceName(i10));
        sbA.append("] doesn't exist");
        throw new IllegalStateException(sbA.toString());
    }
}
