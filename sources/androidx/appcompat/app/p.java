package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class p extends androidx.fragment.app.k {
    public p() {
    }

    public p(int i10) {
        super(i10);
    }

    @Override // androidx.fragment.app.k
    public Dialog onCreateDialog(Bundle bundle) {
        return new o(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.k
    public void setupDialog(Dialog dialog, int i10) {
        if (!(dialog instanceof o)) {
            super.setupDialog(dialog, i10);
            return;
        }
        o oVar = (o) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        oVar.supportRequestWindowFeature(1);
    }
}
