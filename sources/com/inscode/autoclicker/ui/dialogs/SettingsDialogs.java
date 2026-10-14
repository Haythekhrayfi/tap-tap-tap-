package com.inscode.autoclicker.ui.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import ed.q;
import fd.j0;
import jc.w;
import r6.l;
import uc.r;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsDialogs {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.ONE_TO_ONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(vc.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showCreateShortcutDialog$lambda$3$lambda$0(AlertDialog alertDialog, CompoundButton compoundButton, boolean z10) {
            ((LinearLayout) alertDialog.findViewById(R.id.shortcutStartHiddenContainer)).setVisibility(z10 ? 0 : 8);
            ((LinearLayout) alertDialog.findViewById(R.id.shortcutCloseAfterFinishContainer)).setVisibility(z10 ? 0 : 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showCreateShortcutDialog$lambda$3$lambda$1(AlertDialog alertDialog, Context context, r6.e eVar, r rVar, View view) {
            j0.i(context, "$context");
            j0.i(eVar, "$appSettings");
            j0.i(rVar, "$onShortcutSettings");
            Editable text = ((EditText) alertDialog.findViewById(R.id.shortcutNameEditText)).getText();
            String string = text != null ? text.toString() : null;
            boolean z10 = false;
            if (string == null || q.k(string)) {
                ((EditText) alertDialog.findViewById(R.id.shortcutNameEditText)).setError(context.getString(R.string.name_empty));
                return;
            }
            boolean zIsChecked = ((CheckBox) alertDialog.findViewById(R.id.shortcutAutostartCheckbox)).isChecked();
            boolean z11 = ((CheckBox) alertDialog.findViewById(R.id.shortcutStartHiddenCheckBox)).isChecked() && zIsChecked;
            if (((CheckBox) alertDialog.findViewById(R.id.shortcutCloseAfterFinishCheckBox)).isChecked() && zIsChecked) {
                z10 = true;
            }
            if (z11 && !eVar.o()) {
                k7.g.b("volume_up_to_hide", Boolean.TRUE);
                Toast.makeText(context, context.getString(R.string.volume_up_to_hide), 1).show();
            }
            rVar.g(string, Boolean.valueOf(zIsChecked), Boolean.valueOf(z11), Boolean.valueOf(z10));
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showImportInfo$lambda$15$lambda$13(AlertDialog alertDialog, uc.a aVar, View view) {
            j0.i(aVar, "$onDismissListener");
            k7.g.b("import_dialog", Boolean.FALSE);
            alertDialog.dismiss();
            aVar.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showImportInfo$lambda$15$lambda$14(AlertDialog alertDialog, uc.a aVar, View view) {
            j0.i(aVar, "$onDismissListener");
            alertDialog.dismiss();
            aVar.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showLayoutSizeDialog$lambda$9$lambda$7(AlertDialog alertDialog, uc.l lVar, View view) {
            double d10;
            j0.i(lVar, "$onSizeChangedListener");
            switch (((RadioGroup) alertDialog.findViewById(R.id.dialogSizeRadioGroup)).getCheckedRadioButtonId()) {
                case R.id.dialogSizeRadioItemMedium /* 2131362133 */:
                    d10 = 1.25d;
                    break;
                case R.id.dialogSizeRadioItemNormal /* 2131362134 */:
                    d10 = 1.0d;
                    break;
                case R.id.dialogSizeRadioItemSmall /* 2131362135 */:
                    d10 = 0.75d;
                    break;
                default:
                    d10 = 1.5d;
                    break;
            }
            lVar.invoke(Double.valueOf(d10));
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showOrientationDialog$lambda$6$lambda$4(AlertDialog alertDialog, uc.l lVar, View view) {
            j0.i(lVar, "$onOrientationChangedListener");
            lVar.invoke(Integer.valueOf(((RadioGroup) alertDialog.findViewById(R.id.dialogOrientationRadioGroup)).getCheckedRadioButtonId() == R.id.dialogOrientationRadioItemHorizontal ? 1 : 2));
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showPlaybackEngineDialog$lambda$12$lambda$10(AlertDialog alertDialog, uc.l lVar, View view) {
            j0.i(lVar, "$onValueChangedListener");
            lVar.invoke(((RadioGroup) alertDialog.findViewById(R.id.dialogPlaybackEngineRadioGroup)).getCheckedRadioButtonId() == R.id.dialogOptionNeutral ? l.NATURAL : l.ONE_TO_ONE);
            alertDialog.dismiss();
        }

        /* JADX WARN: Type inference failed for: r1v8, types: [com.inscode.autoclicker.ui.dialogs.SettingsDialogs$Companion$showCreateShortcutDialog$1$appSettings$1] */
        public final void showCreateShortcutDialog(Context context, String str, r<? super String, ? super Boolean, ? super Boolean, ? super Boolean, w> rVar) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(str, "name");
            j0.i(rVar, "onShortcutSettings");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.create_shortcut)).setPositiveButton(context.getString(R.string.create), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_create_shortcut).create();
            r6.e settings = new le.a() { // from class: com.inscode.autoclicker.ui.dialogs.SettingsDialogs$Companion$showCreateShortcutDialog$1$appSettings$1
                private final jc.e settings$delegate = jc.f.b(new SettingsDialogs$Companion$showCreateShortcutDialog$1$appSettings$1$special$$inlined$inject$default$1(this, "", null, ae.b.f348c));

                @Override // le.a
                public wd.b getKoin() {
                    return le.a.C0352a.a();
                }

                public final r6.e getSettings() {
                    return (r6.e) this.settings$delegate.getValue();
                }
            }.getSettings();
            alertDialogCreate.show();
            ((EditText) alertDialogCreate.findViewById(R.id.shortcutNameEditText)).setText(str);
            ((CheckBox) alertDialogCreate.findViewById(R.id.shortcutAutostartCheckbox)).setOnCheckedChangeListener(new h7.b(alertDialogCreate));
            alertDialogCreate.getButton(-1).setOnClickListener(new k(alertDialogCreate, context, settings, rVar));
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 14));
        }

        public final void showImportInfo(Context context, final uc.a<w> aVar) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(aVar, "onDismissListener");
            final int i10 = 0;
            final AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setMessage(context.getString(R.string.keep_in_mind)).setPositiveButton(context.getString(R.string.not_show_again), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.ok), (DialogInterface.OnClickListener) null).setCancelable(false).create();
            alertDialogCreate.show();
            alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: com.inscode.autoclicker.ui.dialogs.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            SettingsDialogs.Companion.showImportInfo$lambda$15$lambda$13(alertDialogCreate, aVar, view);
                            break;
                        default:
                            SettingsDialogs.Companion.showImportInfo$lambda$15$lambda$14(alertDialogCreate, aVar, view);
                            break;
                    }
                }
            });
            final int i11 = 1;
            alertDialogCreate.getButton(-2).setOnClickListener(new View.OnClickListener() { // from class: com.inscode.autoclicker.ui.dialogs.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            SettingsDialogs.Companion.showImportInfo$lambda$15$lambda$13(alertDialogCreate, aVar, view);
                            break;
                        default:
                            SettingsDialogs.Companion.showImportInfo$lambda$15$lambda$14(alertDialogCreate, aVar, view);
                            break;
                    }
                }
            });
        }

        public final void showLayoutSizeDialog(Context context, double d10, uc.l<? super Double, w> lVar) {
            int i10;
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(lVar, "onSizeChangedListener");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.layout_size)).setPositiveButton(context.getString(R.string.set), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_layout_size).create();
            alertDialogCreate.show();
            if (d10 == 0.75d) {
                i10 = R.id.dialogSizeRadioItemSmall;
            } else {
                if (d10 == 1.0d) {
                    i10 = R.id.dialogSizeRadioItemNormal;
                } else {
                    i10 = d10 == 1.25d ? R.id.dialogSizeRadioItemMedium : R.id.dialogSizeRadioItemLarge;
                }
            }
            ((RadioGroup) alertDialogCreate.findViewById(R.id.dialogSizeRadioGroup)).check(i10);
            alertDialogCreate.getButton(-1).setOnClickListener(new c(alertDialogCreate, lVar, 5));
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 12));
        }

        public final void showOrientationDialog(Context context, int i10, uc.l<? super Integer, w> lVar) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(lVar, "onOrientationChangedListener");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.layout_orientation)).setPositiveButton(context.getString(R.string.set), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_layout_orientation).create();
            alertDialogCreate.show();
            ((RadioGroup) alertDialogCreate.findViewById(R.id.dialogOrientationRadioGroup)).check(i10 == 1 ? R.id.dialogOrientationRadioItemHorizontal : R.id.dialogOrientationRadioItemLandscape);
            alertDialogCreate.getButton(-1).setOnClickListener(new c(alertDialogCreate, lVar, 4));
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 11));
        }

        public final void showPlaybackEngineDialog(Context context, l lVar, uc.l<? super l, w> lVar2) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(lVar, "current");
            j0.i(lVar2, "onValueChangedListener");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.playback_engine)).setPositiveButton(context.getString(R.string.set), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_playback_engine).create();
            alertDialogCreate.show();
            ((RadioGroup) alertDialogCreate.findViewById(R.id.dialogPlaybackEngineRadioGroup)).check(WhenMappings.$EnumSwitchMapping$0[lVar.ordinal()] == 1 ? R.id.dialogOptionOneToOne : R.id.dialogOptionNeutral);
            alertDialogCreate.getButton(-1).setOnClickListener(new c(alertDialogCreate, lVar2, 6));
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 13));
        }
    }
}
