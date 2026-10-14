package u8;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public interface f {
    void a(Drawable drawable);

    void b(boolean z10);

    Drawable invalidateDrawable(Drawable drawable);

    void onAttachedToWindow();

    void onDetachedFromWindow();

    boolean onVisibilityChanged(View view, int i10);
}
