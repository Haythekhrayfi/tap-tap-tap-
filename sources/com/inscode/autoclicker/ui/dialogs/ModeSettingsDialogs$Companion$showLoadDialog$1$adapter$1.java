package com.inscode.autoclicker.ui.dialogs;

import android.view.View;
import android.widget.TextView;
import com.inscode.autoclicker.R;
import fd.j0;
import jc.w;
import org.joda.time.DateTime;
import uc.p;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class ModeSettingsDialogs$Companion$showLoadDialog$1$adapter$1 extends l implements p<View, u6.a, w> {
    public static final ModeSettingsDialogs$Companion$showLoadDialog$1$adapter$1 INSTANCE = new ModeSettingsDialogs$Companion$showLoadDialog$1$adapter$1();

    public ModeSettingsDialogs$Companion$showLoadDialog$1$adapter$1() {
        super(2);
    }

    @Override // uc.p
    public /* bridge */ /* synthetic */ w invoke(View view, u6.a aVar) {
        invoke2(view, aVar);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View view, u6.a aVar) {
        j0.i(view, "itemView");
        j0.i(aVar, "item");
        ((TextView) view.findViewById(R.id.itemSettingsName)).setText(aVar.getName());
        ((TextView) view.findViewById(R.id.itemSettingsDate)).setText(u1.a.f(new DateTime(aVar.i())));
    }
}
