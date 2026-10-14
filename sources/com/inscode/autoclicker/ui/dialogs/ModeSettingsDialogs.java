package com.inscode.autoclicker.ui.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseAdapter;
import ed.u;
import fd.j0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kc.t;
import r6.n;
import r6.o;
import uc.l;
import vc.a0;
import vc.w;
import y6.a1;

/* JADX INFO: loaded from: classes2.dex */
public final class ModeSettingsDialogs {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[o.values().length];
                try {
                    iArr[o.ASC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o.DESC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
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
        public static final void showAddCombinationDialog$lambda$11$lambda$9(AlertDialog alertDialog, Context context, List list, l lVar, View view) {
            j0.i(context, "$context");
            j0.i(list, "$alreadyUsedNames");
            j0.i(lVar, "$onSaveConfirmedListener");
            Editable text = ((EditText) alertDialog.findViewById(R.id.dialogSaveAsEditText)).getText();
            String string = text != null ? text.toString() : null;
            if (string != null) {
                boolean z10 = true;
                if (!(string.length() == 0) && string.length() >= 3) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                z10 = false;
                                break;
                            }
                        } while (!j0.d((String) it.next(), string));
                    } else {
                        z10 = false;
                        break;
                    }
                    if (!z10) {
                        lVar.invoke(string);
                        alertDialog.dismiss();
                        return;
                    } else {
                        EditText editText = (EditText) alertDialog.findViewById(R.id.dialogSaveAsEditText);
                        if (editText != null) {
                            editText.setError(context.getString(R.string.used_name));
                            return;
                        }
                        return;
                    }
                }
            }
            EditText editText2 = (EditText) alertDialog.findViewById(R.id.dialogSaveAsEditText);
            if (editText2 != null) {
                editText2.setError(context.getString(R.string.short_name));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showLoadRecordingsDialog$lambda$57$lambda$37(l lVar, List list, AlertDialog alertDialog, View view) {
            j0.i(lVar, "$onLoadListener");
            j0.i(list, "$selectedRecordings");
            lVar.invoke(list);
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void showLoadRecordingsDialog$lambda$57$lambda$51(a0 a0Var, AlertDialog alertDialog, a0 a0Var2, List list, BaseAdapter baseAdapter, View view) {
            j0.i(a0Var, "$query");
            j0.i(a0Var2, "$queriedRecordings");
            j0.i(list, "$settings");
            j0.i(baseAdapter, "$adapter");
            a0Var.f36988c = "";
            ((EditText) alertDialog.findViewById(R.id.searchField)).setText((CharSequence) a0Var.f36988c);
            a0Var2.f36988c = list;
            baseAdapter.setAll(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showLoadRecordingsDialog$lambda$57$lambda$53(Context context, AlertDialog alertDialog, r6.e eVar, a0 a0Var, List list, List list2, BaseAdapter baseAdapter, a0 a0Var2, View view) {
            j0.i(context, "$context");
            j0.i(eVar, "$appSettings");
            j0.i(a0Var, "$queriedRecordings");
            j0.i(list, "$settings");
            j0.i(list2, "$selectedRecordings");
            j0.i(baseAdapter, "$adapter");
            j0.i(a0Var2, "$query");
            PopupMenu popupMenu = new PopupMenu(context, (ImageView) alertDialog.findViewById(R.id.sortingByButton), 5);
            popupMenu.getMenu().add(context.getString(R.string.name));
            popupMenu.getMenu().add(context.getString(R.string.update_date));
            popupMenu.show();
            popupMenu.setOnMenuItemClickListener(new h(context, eVar, a0Var, list, list2, baseAdapter, a0Var2, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean showLoadRecordingsDialog$lambda$57$lambda$53$lambda$52(Context context, r6.e eVar, a0 a0Var, List list, List list2, BaseAdapter baseAdapter, a0 a0Var2, MenuItem menuItem) {
            j0.i(context, "$context");
            j0.i(eVar, "$appSettings");
            j0.i(a0Var, "$queriedRecordings");
            j0.i(list, "$settings");
            j0.i(list2, "$selectedRecordings");
            j0.i(baseAdapter, "$adapter");
            j0.i(a0Var2, "$query");
            eVar.q(j0.d(menuItem.getTitle(), context.getString(R.string.name)) ? n.NAME : n.UPDATE_DATE);
            showLoadRecordingsDialog$lambda$57$reloadData(a0Var, list, list2, baseAdapter, a0Var2, eVar);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showLoadRecordingsDialog$lambda$57$lambda$55(Context context, AlertDialog alertDialog, r6.e eVar, a0 a0Var, List list, List list2, BaseAdapter baseAdapter, a0 a0Var2, View view) {
            j0.i(context, "$context");
            j0.i(eVar, "$appSettings");
            j0.i(a0Var, "$queriedRecordings");
            j0.i(list, "$settings");
            j0.i(list2, "$selectedRecordings");
            j0.i(baseAdapter, "$adapter");
            j0.i(a0Var2, "$query");
            PopupMenu popupMenu = new PopupMenu(context, (ImageView) alertDialog.findViewById(R.id.sortingOrderButton), 5);
            popupMenu.getMenu().add(context.getString(R.string.ascending));
            popupMenu.getMenu().add(context.getString(R.string.descending));
            popupMenu.show();
            popupMenu.setOnMenuItemClickListener(new h(context, eVar, a0Var, list, list2, baseAdapter, a0Var2, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean showLoadRecordingsDialog$lambda$57$lambda$55$lambda$54(Context context, r6.e eVar, a0 a0Var, List list, List list2, BaseAdapter baseAdapter, a0 a0Var2, MenuItem menuItem) {
            j0.i(context, "$context");
            j0.i(eVar, "$appSettings");
            j0.i(a0Var, "$queriedRecordings");
            j0.i(list, "$settings");
            j0.i(list2, "$selectedRecordings");
            j0.i(baseAdapter, "$adapter");
            j0.i(a0Var2, "$query");
            eVar.r(j0.d(menuItem.getTitle(), context.getString(R.string.ascending)) ? o.ASC : o.DESC);
            showLoadRecordingsDialog$lambda$57$reloadData(a0Var, list, list2, baseAdapter, a0Var2, eVar);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r7v9, types: [T, java.util.List] */
        public static final void showLoadRecordingsDialog$lambda$57$reloadData(a0<List<v6.a>> a0Var, List<v6.a> list, List<v6.a> list2, BaseAdapter<v6.a> baseAdapter, a0<String> a0Var2, r6.e eVar) {
            Comparator comparator;
            Comparator comparator2;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (u.x(((v6.a) obj).getName(), a0Var2.f36988c, false, 2)) {
                    arrayList.add(obj);
                }
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[eVar.k().ordinal()];
            if (i10 == 1) {
                comparator = eVar.j() == n.UPDATE_DATE ? new Comparator() { // from class: com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs$Companion$showLoadRecordingsDialog$lambda$57$reloadData$lambda$43$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return lc.a.a(Long.valueOf(((v6.a) t10).h()), Long.valueOf(((v6.a) t11).h()));
                    }
                } : new Comparator() { // from class: com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs$Companion$showLoadRecordingsDialog$lambda$57$reloadData$lambda$43$$inlined$sortedBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return lc.a.a(((v6.a) t10).getName(), ((v6.a) t11).getName());
                    }
                };
            } else {
                if (i10 != 2) {
                    throw new jc.g();
                }
                comparator = eVar.j() == n.UPDATE_DATE ? new Comparator() { // from class: com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs$Companion$showLoadRecordingsDialog$lambda$57$reloadData$lambda$43$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return lc.a.a(Long.valueOf(((v6.a) t11).h()), Long.valueOf(((v6.a) t10).h()));
                    }
                } : new Comparator() { // from class: com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs$Companion$showLoadRecordingsDialog$lambda$57$reloadData$lambda$43$$inlined$sortedByDescending$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return lc.a.a(((v6.a) t11).getName(), ((v6.a) t10).getName());
                    }
                };
            }
            a0Var.f36988c = t.C(arrayList, comparator);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (!a0Var.f36988c.contains((v6.a) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            int i11 = WhenMappings.$EnumSwitchMapping$0[eVar.k().ordinal()];
            if (i11 == 1) {
                comparator2 = eVar.j() == n.UPDATE_DATE ? new Comparator() { // from class: com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs$Companion$showLoadRecordingsDialog$lambda$57$reloadData$lambda$49$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return lc.a.a(Long.valueOf(((v6.a) t10).h()), Long.valueOf(((v6.a) t11).h()));
                    }
                } : new Comparator() { // from class: com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs$Companion$showLoadRecordingsDialog$lambda$57$reloadData$lambda$49$$inlined$sortedBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return lc.a.a(((v6.a) t10).getName(), ((v6.a) t11).getName());
                    }
                };
            } else {
                if (i11 != 2) {
                    throw new jc.g();
                }
                comparator2 = eVar.j() == n.UPDATE_DATE ? new Comparator() { // from class: com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs$Companion$showLoadRecordingsDialog$lambda$57$reloadData$lambda$49$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return lc.a.a(Long.valueOf(((v6.a) t11).h()), Long.valueOf(((v6.a) t10).h()));
                    }
                } : new Comparator() { // from class: com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs$Companion$showLoadRecordingsDialog$lambda$57$reloadData$lambda$49$$inlined$sortedByDescending$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return lc.a.a(((v6.a) t11).getName(), ((v6.a) t10).getName());
                    }
                };
            }
            baseAdapter.setAll(t.z(t.C(arrayList2, comparator2), a0Var.f36988c));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showPauseBeforeRepeatDialog$lambda$34$lambda$31(Context context, AlertDialog alertDialog, View view) {
            j0.i(context, "$context");
            PopupMenu popupMenu = new PopupMenu(context, (ImageButton) alertDialog.findViewById(R.id.dialogTimeUnitButton));
            popupMenu.getMenuInflater().inflate(R.menu.time_unit_menu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new g(alertDialog, 3));
            popupMenu.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean showPauseBeforeRepeatDialog$lambda$34$lambda$31$lambda$30(AlertDialog alertDialog, MenuItem menuItem) {
            Editable text = ((EditText) alertDialog.findViewById(R.id.dialogTimeEditText)).getText();
            String string = text != null ? text.toString() : null;
            boolean z10 = false;
            if (string != null) {
                if (string.length() > 0) {
                    z10 = true;
                }
            }
            if (z10) {
                long j10 = Long.parseLong(string);
                if (menuItem.getItemId() != R.id.popupSeconds) {
                    j10 *= (long) 60;
                }
                ((EditText) alertDialog.findViewById(R.id.dialogTimeEditText)).setText(String.valueOf(j10 * ((long) 1000)));
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showPauseBeforeRepeatDialog$lambda$34$lambda$32(AlertDialog alertDialog, Context context, l lVar, View view) {
            j0.i(context, "$context");
            j0.i(lVar, "$onSaveConfirmedListener");
            try {
                Editable text = ((EditText) alertDialog.findViewById(R.id.dialogTimeEditText)).getText();
                String string = text != null ? text.toString() : null;
                if (string != null) {
                    if (!(string.length() == 0)) {
                        lVar.invoke(Long.valueOf(Long.parseLong(string)));
                        alertDialog.dismiss();
                        return;
                    }
                }
                alertDialog.dismiss();
            } catch (NumberFormatException unused) {
                EditText editText = (EditText) alertDialog.findViewById(R.id.dialogTimeEditText);
                if (editText == null) {
                    return;
                }
                editText.setError(context.getString(R.string.input_number));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showPlaybackSpeedDialog$lambda$60$lambda$58(l lVar, w wVar, AlertDialog alertDialog, View view) {
            j0.i(lVar, "$onPlaybackSpeedChanged");
            j0.i(wVar, "$value");
            lVar.invoke(Double.valueOf(wVar.f37004c));
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showRenameDialog$lambda$7$lambda$5(AlertDialog alertDialog, Context context, List list, l lVar, View view) {
            j0.i(context, "$context");
            j0.i(list, "$alreadyUsedNames");
            j0.i(lVar, "$onSaveConfirmedListener");
            Editable text = ((EditText) alertDialog.findViewById(R.id.dialogSaveAsEditText)).getText();
            String string = text != null ? text.toString() : null;
            if (string != null) {
                boolean z10 = true;
                if (!(string.length() == 0) && string.length() >= 3) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                z10 = false;
                                break;
                            }
                        } while (!j0.d((String) it.next(), string));
                    } else {
                        z10 = false;
                        break;
                    }
                    if (!z10) {
                        lVar.invoke(string);
                        alertDialog.dismiss();
                        return;
                    } else {
                        EditText editText = (EditText) alertDialog.findViewById(R.id.dialogSaveAsEditText);
                        if (editText != null) {
                            editText.setError(context.getString(R.string.used_name));
                            return;
                        }
                        return;
                    }
                }
            }
            EditText editText2 = (EditText) alertDialog.findViewById(R.id.dialogSaveAsEditText);
            if (editText2 != null) {
                editText2.setError(context.getString(R.string.short_name));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showRenameDialog$lambda$7$lambda$6(AlertDialog alertDialog, View view) {
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showRepeatCountDialog$lambda$29$lambda$27(AlertDialog alertDialog, l lVar, View view) {
            j0.i(lVar, "$onSaveConfirmedListener");
            Editable text = ((EditText) alertDialog.findViewById(R.id.dialogRepeatCountEditText)).getText();
            String string = text != null ? text.toString() : null;
            if (string != null) {
                if (!(string.length() == 0)) {
                    lVar.invoke(Long.valueOf(Long.parseLong(string)));
                    alertDialog.dismiss();
                    return;
                }
            }
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showSaveAsDialog$lambda$3$lambda$1(AlertDialog alertDialog, Context context, List list, l lVar, View view) {
            j0.i(context, "$context");
            j0.i(list, "$alreadyUsedNames");
            j0.i(lVar, "$onSaveConfirmedListener");
            Editable text = ((EditText) alertDialog.findViewById(R.id.dialogSaveAsEditText)).getText();
            String string = text != null ? text.toString() : null;
            if (string != null) {
                boolean z10 = true;
                if (!(string.length() == 0) && string.length() >= 3) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                z10 = false;
                                break;
                            }
                        } while (!j0.d((String) it.next(), string));
                    } else {
                        z10 = false;
                        break;
                    }
                    if (!z10) {
                        lVar.invoke(string);
                        alertDialog.dismiss();
                        return;
                    } else {
                        EditText editText = (EditText) alertDialog.findViewById(R.id.dialogSaveAsEditText);
                        if (editText != null) {
                            editText.setError(context.getString(R.string.used_name));
                            return;
                        }
                        return;
                    }
                }
            }
            EditText editText2 = (EditText) alertDialog.findViewById(R.id.dialogSaveAsEditText);
            if (editText2 != null) {
                editText2.setError(context.getString(R.string.short_name));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showSwipeDurationDialog$lambda$26$lambda$23(Context context, AlertDialog alertDialog, View view) {
            j0.i(context, "$context");
            PopupMenu popupMenu = new PopupMenu(context, (ImageButton) alertDialog.findViewById(R.id.dialogTimeUnitButton));
            popupMenu.getMenuInflater().inflate(R.menu.time_unit_menu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new g(alertDialog, 0));
            popupMenu.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean showSwipeDurationDialog$lambda$26$lambda$23$lambda$22(AlertDialog alertDialog, MenuItem menuItem) {
            Editable text = ((EditText) alertDialog.findViewById(R.id.dialogTimeEditText)).getText();
            String string = text != null ? text.toString() : null;
            boolean z10 = false;
            if (string != null) {
                if (string.length() > 0) {
                    z10 = true;
                }
            }
            if (z10) {
                long j10 = Long.parseLong(string);
                if (menuItem.getItemId() != R.id.popupSeconds) {
                    j10 *= (long) 60;
                }
                ((EditText) alertDialog.findViewById(R.id.dialogTimeEditText)).setText(String.valueOf(j10 * ((long) 1000)));
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showSwipeDurationDialog$lambda$26$lambda$24(AlertDialog alertDialog, l lVar, View view) {
            j0.i(lVar, "$onSaveConfirmedListener");
            Editable text = ((EditText) alertDialog.findViewById(R.id.dialogTimeEditText)).getText();
            String string = text != null ? text.toString() : null;
            if (string != null) {
                if (!(string.length() == 0)) {
                    lVar.invoke(Long.valueOf(Long.parseLong(string)));
                    alertDialog.dismiss();
                    return;
                }
            }
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showSwipeDurationDialog$lambda$26$lambda$25(AlertDialog alertDialog, View view) {
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showTapDurationDialog$lambda$21$lambda$18(Context context, AlertDialog alertDialog, View view) {
            j0.i(context, "$context");
            PopupMenu popupMenu = new PopupMenu(context, (ImageButton) alertDialog.findViewById(R.id.dialogTimeUnitButton));
            popupMenu.getMenuInflater().inflate(R.menu.time_unit_menu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new g(alertDialog, 1));
            popupMenu.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean showTapDurationDialog$lambda$21$lambda$18$lambda$17(AlertDialog alertDialog, MenuItem menuItem) {
            Editable text = ((EditText) alertDialog.findViewById(R.id.dialogTimeEditText)).getText();
            String string = text != null ? text.toString() : null;
            boolean z10 = false;
            if (string != null) {
                if (string.length() > 0) {
                    z10 = true;
                }
            }
            if (z10) {
                long j10 = Long.parseLong(string);
                if (menuItem.getItemId() != R.id.popupSeconds) {
                    j10 *= (long) 60;
                }
                ((EditText) alertDialog.findViewById(R.id.dialogTimeEditText)).setText(String.valueOf(j10 * ((long) 1000)));
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showTapDurationDialog$lambda$21$lambda$19(AlertDialog alertDialog, l lVar, View view) {
            j0.i(lVar, "$onSaveConfirmedListener");
            Editable text = ((EditText) alertDialog.findViewById(R.id.dialogTimeEditText)).getText();
            String string = text != null ? text.toString() : null;
            if (string != null) {
                if (!(string.length() == 0)) {
                    lVar.invoke(Long.valueOf(Long.parseLong(string)));
                    alertDialog.dismiss();
                    return;
                }
            }
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showTapDurationDialog$lambda$21$lambda$20(AlertDialog alertDialog, View view) {
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showTimeBetweenSetDialog$lambda$16$lambda$13(Context context, AlertDialog alertDialog, View view) {
            j0.i(context, "$context");
            PopupMenu popupMenu = new PopupMenu(context, (ImageButton) alertDialog.findViewById(R.id.dialogTimeUnitButton));
            popupMenu.getMenuInflater().inflate(R.menu.time_unit_menu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new g(alertDialog, 2));
            popupMenu.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean showTimeBetweenSetDialog$lambda$16$lambda$13$lambda$12(AlertDialog alertDialog, MenuItem menuItem) {
            Editable text = ((EditText) alertDialog.findViewById(R.id.dialogTimeEditText)).getText();
            String string = text != null ? text.toString() : null;
            boolean z10 = false;
            if (string != null) {
                if (string.length() > 0) {
                    z10 = true;
                }
            }
            if (z10) {
                long j10 = Long.parseLong(string);
                if (menuItem.getItemId() != R.id.popupSeconds) {
                    j10 *= (long) 60;
                }
                ((EditText) alertDialog.findViewById(R.id.dialogTimeEditText)).setText(String.valueOf(j10 * ((long) 1000)));
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showTimeBetweenSetDialog$lambda$16$lambda$14(AlertDialog alertDialog, l lVar, View view) {
            j0.i(lVar, "$onSaveConfirmedListener");
            Editable text = ((EditText) alertDialog.findViewById(R.id.dialogTimeEditText)).getText();
            String string = text != null ? text.toString() : null;
            if (string != null) {
                if (!(string.length() == 0)) {
                    lVar.invoke(Long.valueOf(Long.parseLong(string)));
                    alertDialog.dismiss();
                    return;
                }
            }
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showTimeBetweenSetDialog$lambda$16$lambda$15(AlertDialog alertDialog, View view) {
            alertDialog.dismiss();
        }

        public final double round(float f10, int i10) {
            BigDecimal scale = new BigDecimal(Float.toString(f10)).setScale(i10, 4);
            j0.h(scale, "bd.setScale(decimalPlace…BigDecimal.ROUND_HALF_UP)");
            return scale.doubleValue();
        }

        public final float round(double d10, int i10) {
            BigDecimal scale = new BigDecimal(Double.toString(d10)).setScale(i10, 4);
            j0.h(scale, "bd.setScale(decimalPlace…BigDecimal.ROUND_HALF_UP)");
            return scale.floatValue();
        }

        public final void showAddCombinationDialog(Context context, List<String> list, l<? super String, jc.w> lVar) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(list, "alreadyUsedNames");
            j0.i(lVar, "onSaveConfirmedListener");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.set_name_for_combination)).setPositiveButton(context.getString(R.string.add), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_save_as).create();
            alertDialogCreate.show();
            alertDialogCreate.getButton(-1).setOnClickListener(new b(alertDialogCreate, context, list, lVar, 2));
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 5));
        }

        public final void showLoadDialog(Context context, List<u6.a> list, l<? super u6.a, jc.w> lVar, l<? super u6.a, jc.w> lVar2) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(list, "settings");
            j0.i(lVar, "onLoadListener");
            j0.i(lVar2, "onDeleteListener");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.saved_configurations)).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_load).create();
            alertDialogCreate.show();
            BaseAdapter baseAdapterBuild = new BaseAdapter.Builder().layoutId(R.layout.item_settings).onBind(ModeSettingsDialogs$Companion$showLoadDialog$1$adapter$1.INSTANCE).onItemClick(new ModeSettingsDialogs$Companion$showLoadDialog$1$adapter$2(lVar, alertDialogCreate)).build();
            ((RecyclerView) alertDialogCreate.findViewById(R.id.dialogLoadList)).setLayoutManager(new LinearLayoutManager(context));
            ((RecyclerView) alertDialogCreate.findViewById(R.id.dialogLoadList)).setAdapter(baseAdapterBuild);
            baseAdapterBuild.setAll(list);
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 1));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void showLoadRecordingsDialog(final Context context, final r6.e eVar, final List<v6.a> list, l<? super List<v6.a>, jc.w> lVar) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(eVar, "appSettings");
            j0.i(list, "settings");
            j0.i(lVar, "onLoadListener");
            final a0 a0Var = new a0();
            a0Var.f36988c = "";
            final a0 a0Var2 = new a0();
            a0Var2.f36988c = list;
            final ArrayList arrayList = new ArrayList();
            final AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.FullScreenDialog).setTitle(context.getString(R.string.select_recordings)).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setPositiveButton(context.getString(R.string.add_zero), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_load).create();
            alertDialogCreate.show();
            alertDialogCreate.getButton(-1).setOnClickListener(new a1(lVar, arrayList, alertDialogCreate));
            final BaseAdapter baseAdapterBuild = new BaseAdapter.Builder().layoutId(R.layout.item_recording_to_load).onBind(new ModeSettingsDialogs$Companion$showLoadRecordingsDialog$1$adapter$1(arrayList, alertDialogCreate, context)).build();
            EditText editText = (EditText) alertDialogCreate.findViewById(R.id.searchField);
            j0.h(editText, "dialog.searchField");
            editText.addTextChangedListener(new TextWatcher() { // from class: com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs$Companion$showLoadRecordingsDialog$lambda$57$$inlined$addTextChangedListener$default$1
                /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.Object, java.lang.String] */
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    ?? ValueOf = String.valueOf(editable);
                    if (j0.d(ValueOf, a0Var.f36988c)) {
                        return;
                    }
                    a0 a0Var3 = a0Var;
                    a0Var3.f36988c = ValueOf;
                    ModeSettingsDialogs.Companion.showLoadRecordingsDialog$lambda$57$reloadData(a0Var2, list, arrayList, baseAdapterBuild, a0Var3, eVar);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                }
            });
            ((ImageView) alertDialogCreate.findViewById(R.id.resetSearchQueryButton)).setOnClickListener(new f(a0Var, alertDialogCreate, a0Var2, list, baseAdapterBuild));
            final int i10 = 0;
            ((ImageView) alertDialogCreate.findViewById(R.id.sortingByButton)).setOnClickListener(new View.OnClickListener() { // from class: com.inscode.autoclicker.ui.dialogs.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            ModeSettingsDialogs.Companion.showLoadRecordingsDialog$lambda$57$lambda$53(context, alertDialogCreate, eVar, a0Var2, list, arrayList, baseAdapterBuild, a0Var, view);
                            break;
                        default:
                            ModeSettingsDialogs.Companion.showLoadRecordingsDialog$lambda$57$lambda$55(context, alertDialogCreate, eVar, a0Var2, list, arrayList, baseAdapterBuild, a0Var, view);
                            break;
                    }
                }
            });
            final int i11 = 1;
            ((ImageView) alertDialogCreate.findViewById(R.id.sortingOrderButton)).setOnClickListener(new View.OnClickListener() { // from class: com.inscode.autoclicker.ui.dialogs.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            ModeSettingsDialogs.Companion.showLoadRecordingsDialog$lambda$57$lambda$53(context, alertDialogCreate, eVar, a0Var2, list, arrayList, baseAdapterBuild, a0Var, view);
                            break;
                        default:
                            ModeSettingsDialogs.Companion.showLoadRecordingsDialog$lambda$57$lambda$55(context, alertDialogCreate, eVar, a0Var2, list, arrayList, baseAdapterBuild, a0Var, view);
                            break;
                    }
                }
            });
            ((RecyclerView) alertDialogCreate.findViewById(R.id.dialogLoadList)).setLayoutManager(new LinearLayoutManager(context));
            ((RecyclerView) alertDialogCreate.findViewById(R.id.dialogLoadList)).setAdapter(baseAdapterBuild);
            baseAdapterBuild.setAll(list);
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 10));
        }

        public final void showPauseBeforeRepeatDialog(Context context, long j10, l<? super Long, jc.w> lVar) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(lVar, "onSaveConfirmedListener");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.pause_before_repeat)).setPositiveButton(context.getString(R.string.set), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_input_millis).create();
            alertDialogCreate.show();
            ((EditText) alertDialogCreate.findViewById(R.id.dialogTimeEditText)).setText(String.valueOf(j10));
            ((ImageButton) alertDialogCreate.findViewById(R.id.dialogTimeUnitButton)).setOnClickListener(new d(context, alertDialogCreate, 1));
            alertDialogCreate.getButton(-1).setOnClickListener(new a1(alertDialogCreate, context, lVar));
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 6));
        }

        public final void showPlaybackSpeedDialog(Context context, double d10, boolean z10, l<? super Double, jc.w> lVar) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(lVar, "onPlaybackSpeedChanged");
            final AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.playback_speed)).setPositiveButton(context.getString(R.string.set), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_playback_speed_2).create();
            final w wVar = new w();
            wVar.f37004c = d10;
            alertDialogCreate.show();
            if (!z10) {
                ((TextView) alertDialogCreate.findViewById(R.id.experimentalModeTip)).setVisibility(0);
            }
            TextView textView = (TextView) alertDialogCreate.findViewById(R.id.playbackValue);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d10);
            sb2.append('x');
            textView.setText(sb2.toString());
            ((AppCompatSeekBar) alertDialogCreate.findViewById(R.id.playbackSeekBar)).setMax((int) 137.0f);
            final float f10 = 0.15f;
            final float f11 = 0.05f;
            ((AppCompatSeekBar) alertDialogCreate.findViewById(R.id.playbackSeekBar)).setProgress((int) ((wVar.f37004c - ((double) 0.15f)) / ((double) 0.05f)));
            ((AppCompatSeekBar) alertDialogCreate.findViewById(R.id.playbackSeekBar)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs$Companion$showPlaybackSpeedDialog$1$1
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar, int i10, boolean z11) {
                    wVar.f37004c = ModeSettingsDialogs.Companion.round((i10 * f11) + f10, 2);
                    TextView textView2 = (TextView) alertDialogCreate.findViewById(R.id.playbackValue);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(wVar.f37004c);
                    sb3.append('x');
                    textView2.setText(sb3.toString());
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            });
            alertDialogCreate.getButton(-1).setOnClickListener(new a1(lVar, wVar, alertDialogCreate));
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 7));
        }

        public final void showRenameDialog(Context context, String str, List<String> list, l<? super String, jc.w> lVar) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(str, "currentName");
            j0.i(list, "alreadyUsedNames");
            j0.i(lVar, "onSaveConfirmedListener");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.rename)).setPositiveButton(context.getString(R.string.save), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_save_as).create();
            alertDialogCreate.show();
            ((EditText) alertDialogCreate.findViewById(R.id.dialogSaveAsEditText)).setText(str);
            alertDialogCreate.getButton(-1).setOnClickListener(new b(alertDialogCreate, context, list, lVar, 1));
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 3));
        }

        public final void showRepeatCountDialog(Context context, long j10, l<? super Long, jc.w> lVar) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(lVar, "onSaveConfirmedListener");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.repeat_count)).setPositiveButton(context.getString(R.string.set), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_repeat_count).create();
            alertDialogCreate.show();
            ((EditText) alertDialogCreate.findViewById(R.id.dialogRepeatCountEditText)).setText(String.valueOf(j10));
            alertDialogCreate.getButton(-1).setOnClickListener(new c(alertDialogCreate, lVar, 1));
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 4));
        }

        public final void showSaveAsDialog(Context context, List<String> list, l<? super String, jc.w> lVar) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(list, "alreadyUsedNames");
            j0.i(lVar, "onSaveConfirmedListener");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.save_as)).setPositiveButton(context.getString(R.string.save), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_save_as).create();
            alertDialogCreate.show();
            alertDialogCreate.getButton(-1).setOnClickListener(new b(alertDialogCreate, context, list, lVar, 0));
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 2));
        }

        public final void showSwipeDurationDialog(Context context, long j10, l<? super Long, jc.w> lVar) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(lVar, "onSaveConfirmedListener");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.click_duration)).setPositiveButton(context.getString(R.string.set), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_input_millis).create();
            alertDialogCreate.show();
            ((EditText) alertDialogCreate.findViewById(R.id.dialogTimeEditText)).setText(String.valueOf(j10));
            int i10 = 3;
            ((ImageButton) alertDialogCreate.findViewById(R.id.dialogTimeUnitButton)).setOnClickListener(new d(context, alertDialogCreate, i10));
            alertDialogCreate.getButton(-1).setOnClickListener(new c(alertDialogCreate, lVar, i10));
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 9));
        }

        public final void showTapDurationDialog(Context context, long j10, l<? super Long, jc.w> lVar) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(lVar, "onSaveConfirmedListener");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.click_duration)).setPositiveButton(context.getString(R.string.set), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_input_millis).create();
            alertDialogCreate.show();
            ((EditText) alertDialogCreate.findViewById(R.id.dialogTimeEditText)).setText(String.valueOf(j10));
            int i10 = 0;
            ((ImageButton) alertDialogCreate.findViewById(R.id.dialogTimeUnitButton)).setOnClickListener(new d(context, alertDialogCreate, i10));
            alertDialogCreate.getButton(-1).setOnClickListener(new c(alertDialogCreate, lVar, i10));
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, i10));
        }

        public final void showTimeBetweenSetDialog(Context context, long j10, l<? super Long, jc.w> lVar) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(lVar, "onSaveConfirmedListener");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DialogTheme).setTitle(context.getString(R.string.repeat_interval)).setPositiveButton(context.getString(R.string.set), (DialogInterface.OnClickListener) null).setNegativeButton(context.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).setView(R.layout.dialog_input_millis).create();
            alertDialogCreate.show();
            ((EditText) alertDialogCreate.findViewById(R.id.dialogTimeEditText)).setText(String.valueOf(j10));
            int i10 = 2;
            ((ImageButton) alertDialogCreate.findViewById(R.id.dialogTimeUnitButton)).setOnClickListener(new d(context, alertDialogCreate, i10));
            alertDialogCreate.getButton(-1).setOnClickListener(new c(alertDialogCreate, lVar, i10));
            alertDialogCreate.getButton(-2).setOnClickListener(new a(alertDialogCreate, 8));
        }
    }
}
