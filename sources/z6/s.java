package z6;

import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;
import com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs;
import com.inscode.autoclicker.ui.dialogs.SettingsDialogs;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CombinedRecordingsActivity f45134d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public /* synthetic */ s(CombinedRecordingsActivity combinedRecordingsActivity, int i10) {
        this.f45133c = i10;
        switch (i10) {
        }
        this.f45134d = combinedRecordingsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int i10 = 1;
        switch (this.f45133c) {
            case 0:
                CombinedRecordingsActivity combinedRecordingsActivity = this.f45134d;
                int i11 = CombinedRecordingsActivity.f13231l;
                fd.j0.i(combinedRecordingsActivity, "this$0");
                if (combinedRecordingsActivity.l()) {
                    Object objA = k7.g.a("import_dialog", Boolean.TRUE);
                    fd.j0.h(objA, "get(\"import_dialog\", true)");
                    if (!((Boolean) objA).booleanValue()) {
                        combinedRecordingsActivity.k();
                    } else {
                        SettingsDialogs.Companion.showImportInfo(combinedRecordingsActivity, new m0(combinedRecordingsActivity));
                    }
                }
                break;
            case 1:
                CombinedRecordingsActivity combinedRecordingsActivity2 = this.f45134d;
                int i12 = CombinedRecordingsActivity.f13231l;
                fd.j0.i(combinedRecordingsActivity2, "this$0");
                ((EditText) combinedRecordingsActivity2._$_findCachedViewById(R.id.searchField)).setText("");
                if (!ed.q.k(combinedRecordingsActivity2.f13235e)) {
                    combinedRecordingsActivity2.f13235e = "";
                    combinedRecordingsActivity2.i(true);
                }
                break;
            case 2:
                final CombinedRecordingsActivity combinedRecordingsActivity3 = this.f45134d;
                int i13 = CombinedRecordingsActivity.f13231l;
                fd.j0.i(combinedRecordingsActivity3, "this$0");
                PopupMenu popupMenu = new PopupMenu(combinedRecordingsActivity3, (ImageView) combinedRecordingsActivity3._$_findCachedViewById(R.id.sortingByButton), 5);
                popupMenu.getMenu().add(combinedRecordingsActivity3.getString(R.string.name));
                popupMenu.getMenu().add(combinedRecordingsActivity3.getString(R.string.update_date));
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: z6.t
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        r6.e appSettings;
                        r6.n nVar;
                        r6.e appSettings2;
                        r6.o oVar;
                        switch (i10) {
                            case 0:
                                CombinedRecordingsActivity combinedRecordingsActivity4 = combinedRecordingsActivity3;
                                int i14 = CombinedRecordingsActivity.f13231l;
                                fd.j0.i(combinedRecordingsActivity4, "this$0");
                                if (fd.j0.d(menuItem.getTitle(), combinedRecordingsActivity4.getString(R.string.ascending))) {
                                    appSettings2 = combinedRecordingsActivity4.getAppSettings();
                                    oVar = r6.o.ASC;
                                } else {
                                    appSettings2 = combinedRecordingsActivity4.getAppSettings();
                                    oVar = r6.o.DESC;
                                }
                                appSettings2.r(oVar);
                                combinedRecordingsActivity4.i(true);
                                break;
                            default:
                                CombinedRecordingsActivity combinedRecordingsActivity5 = combinedRecordingsActivity3;
                                int i15 = CombinedRecordingsActivity.f13231l;
                                fd.j0.i(combinedRecordingsActivity5, "this$0");
                                if (fd.j0.d(menuItem.getTitle(), combinedRecordingsActivity5.getString(R.string.name))) {
                                    appSettings = combinedRecordingsActivity5.getAppSettings();
                                    nVar = r6.n.NAME;
                                } else {
                                    appSettings = combinedRecordingsActivity5.getAppSettings();
                                    nVar = r6.n.UPDATE_DATE;
                                }
                                appSettings.q(nVar);
                                combinedRecordingsActivity5.i(true);
                                break;
                        }
                        return true;
                    }
                });
                break;
            case 3:
                final CombinedRecordingsActivity combinedRecordingsActivity4 = this.f45134d;
                int i14 = CombinedRecordingsActivity.f13231l;
                fd.j0.i(combinedRecordingsActivity4, "this$0");
                PopupMenu popupMenu2 = new PopupMenu(combinedRecordingsActivity4, (ImageView) combinedRecordingsActivity4._$_findCachedViewById(R.id.sortingByButton), 5);
                popupMenu2.getMenu().add(combinedRecordingsActivity4.getString(R.string.ascending));
                popupMenu2.getMenu().add(combinedRecordingsActivity4.getString(R.string.descending));
                popupMenu2.show();
                final int i15 = 0;
                popupMenu2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: z6.t
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        r6.e appSettings;
                        r6.n nVar;
                        r6.e appSettings2;
                        r6.o oVar;
                        switch (i15) {
                            case 0:
                                CombinedRecordingsActivity combinedRecordingsActivity5 = combinedRecordingsActivity4;
                                int i16 = CombinedRecordingsActivity.f13231l;
                                fd.j0.i(combinedRecordingsActivity5, "this$0");
                                if (fd.j0.d(menuItem.getTitle(), combinedRecordingsActivity5.getString(R.string.ascending))) {
                                    appSettings2 = combinedRecordingsActivity5.getAppSettings();
                                    oVar = r6.o.ASC;
                                } else {
                                    appSettings2 = combinedRecordingsActivity5.getAppSettings();
                                    oVar = r6.o.DESC;
                                }
                                appSettings2.r(oVar);
                                combinedRecordingsActivity5.i(true);
                                break;
                            default:
                                CombinedRecordingsActivity combinedRecordingsActivity6 = combinedRecordingsActivity4;
                                int i17 = CombinedRecordingsActivity.f13231l;
                                fd.j0.i(combinedRecordingsActivity6, "this$0");
                                if (fd.j0.d(menuItem.getTitle(), combinedRecordingsActivity6.getString(R.string.name))) {
                                    appSettings = combinedRecordingsActivity6.getAppSettings();
                                    nVar = r6.n.NAME;
                                } else {
                                    appSettings = combinedRecordingsActivity6.getAppSettings();
                                    nVar = r6.n.UPDATE_DATE;
                                }
                                appSettings.q(nVar);
                                combinedRecordingsActivity6.i(true);
                                break;
                        }
                        return true;
                    }
                });
                break;
            case 4:
                CombinedRecordingsActivity combinedRecordingsActivity5 = this.f45134d;
                int i16 = CombinedRecordingsActivity.f13231l;
                fd.j0.i(combinedRecordingsActivity5, "this$0");
                ModeSettingsDialogs.Companion.showAddCombinationDialog(combinedRecordingsActivity5, kc.w.f32009c, new u(combinedRecordingsActivity5));
                break;
            case 5:
                CombinedRecordingsActivity combinedRecordingsActivity6 = this.f45134d;
                int i17 = CombinedRecordingsActivity.f13231l;
                fd.j0.i(combinedRecordingsActivity6, "this$0");
                ma.h.f33410y.a();
                ab.c.f275h.a(combinedRecordingsActivity6, "", -1);
                break;
            default:
                CombinedRecordingsActivity combinedRecordingsActivity7 = this.f45134d;
                int i18 = CombinedRecordingsActivity.f13231l;
                fd.j0.i(combinedRecordingsActivity7, "this$0");
                ma.h.f33410y.a();
                ab.c.f275h.a(combinedRecordingsActivity7, "", -1);
                break;
        }
    }
}
