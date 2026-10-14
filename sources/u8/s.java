package u8;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class s<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        View view = (View) t11;
        View view2 = (View) t10;
        return lc.a.a(Float.valueOf(view.getMinimumHeight() / view.getMeasuredHeight()), Float.valueOf(view2.getMinimumHeight() / view2.getMeasuredHeight()));
    }
}
