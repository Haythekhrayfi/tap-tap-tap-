package e8;

import android.view.View;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends f8.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View view, int i10, int i11, boolean z10) {
        super(view, i10, i11, z10);
        j0.i(view, "contentView");
    }

    public /* synthetic */ j(View view, int i10, int i11, boolean z10, int i12, vc.g gVar) {
        this(view, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? false : z10);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }
}
