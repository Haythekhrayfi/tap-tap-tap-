package f8;

import android.view.View;
import android.widget.PopupWindow;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public class d extends PopupWindow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, int i10, int i11) {
        super(view, i10, i11);
        j0.i(view, "contentView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, int i10, int i11, boolean z10) {
        super(view, i10, i11, z10);
        j0.i(view, "contentView");
    }

    @Override // android.widget.PopupWindow
    public void setContentView(View view) {
        if (view != null) {
            view.setFilterTouchesWhenObscured(true);
        }
        super.setContentView(view);
    }
}
