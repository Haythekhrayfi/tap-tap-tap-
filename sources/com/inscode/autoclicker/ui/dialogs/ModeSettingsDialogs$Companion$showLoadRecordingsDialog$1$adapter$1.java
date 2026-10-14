package com.inscode.autoclicker.ui.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.List;
import jc.w;
import org.joda.time.DateTime;
import uc.p;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class ModeSettingsDialogs$Companion$showLoadRecordingsDialog$1$adapter$1 extends l implements p<View, v6.a, w> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AlertDialog $dialog;
    public final /* synthetic */ List<v6.a> $selectedRecordings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeSettingsDialogs$Companion$showLoadRecordingsDialog$1$adapter$1(List<v6.a> list, AlertDialog alertDialog, Context context) {
        super(2);
        this.$selectedRecordings = list;
        this.$dialog = alertDialog;
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(List list, v6.a aVar, AlertDialog alertDialog, Context context, CompoundButton compoundButton, boolean z10) {
        j0.i(list, "$selectedRecordings");
        j0.i(aVar, "$item");
        j0.i(context, "$context");
        if (!z10 || list.contains(aVar)) {
            list.remove(aVar);
        } else {
            list.add(aVar);
        }
        alertDialog.getButton(-1).setText(context.getString(R.string.add_number, Integer.valueOf(list.size())));
    }

    @Override // uc.p
    public /* bridge */ /* synthetic */ w invoke(View view, v6.a aVar) {
        invoke2(view, aVar);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View view, final v6.a aVar) {
        j0.i(view, "itemView");
        j0.i(aVar, "item");
        ((TextView) view.findViewById(R.id.itemSettingsName)).setText(aVar.getName());
        ((TextView) view.findViewById(R.id.itemSettingsDate)).setText(u1.a.f(new DateTime(aVar.h())));
        ((CheckBox) view.findViewById(R.id.itemSettingsCheckbox)).setOnCheckedChangeListener(null);
        ((CheckBox) view.findViewById(R.id.itemSettingsCheckbox)).setChecked(this.$selectedRecordings.contains(aVar));
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.itemSettingsCheckbox);
        final List<v6.a> list = this.$selectedRecordings;
        final AlertDialog alertDialog = this.$dialog;
        final Context context = this.$context;
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.inscode.autoclicker.ui.dialogs.i
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ModeSettingsDialogs$Companion$showLoadRecordingsDialog$1$adapter$1.invoke$lambda$0(list, aVar, alertDialog, context, compoundButton, z10);
            }
        });
    }
}
