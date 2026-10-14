package y6;

import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.ManualSettingsLoadActivity;
import com.inscode.autoclicker.ui.dialogs.SettingsDialogs;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j0 implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ManualSettingsLoadActivity f38261d;

    public /* synthetic */ j0(ManualSettingsLoadActivity manualSettingsLoadActivity, int i10) {
        this.f38260c = i10;
        if (i10 == 1 || i10 == 2 || i10 != 3) {
        }
        this.f38261d = manualSettingsLoadActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int i10 = 1;
        switch (this.f38260c) {
            case 0:
                ManualSettingsLoadActivity.g(this.f38261d, view);
                break;
            case 1:
                ManualSettingsLoadActivity manualSettingsLoadActivity = this.f38261d;
                int i11 = ManualSettingsLoadActivity.f13134n;
                fd.j0.i(manualSettingsLoadActivity, "this$0");
                ((EditText) manualSettingsLoadActivity._$_findCachedViewById(R.id.searchField)).setText("");
                if (!ed.q.k(manualSettingsLoadActivity.f13138e)) {
                    manualSettingsLoadActivity.f13138e = "";
                    manualSettingsLoadActivity.j(true);
                }
                break;
            case 2:
                final ManualSettingsLoadActivity manualSettingsLoadActivity2 = this.f38261d;
                int i12 = ManualSettingsLoadActivity.f13134n;
                fd.j0.i(manualSettingsLoadActivity2, "this$0");
                PopupMenu popupMenu = new PopupMenu(manualSettingsLoadActivity2, (ImageView) manualSettingsLoadActivity2._$_findCachedViewById(R.id.sortingByButton), 5);
                popupMenu.getMenu().add(manualSettingsLoadActivity2.getString(R.string.name));
                popupMenu.getMenu().add(manualSettingsLoadActivity2.getString(R.string.update_date));
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: y6.k0
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        r6.e appSettings;
                        r6.n nVar;
                        r6.e appSettings2;
                        r6.o oVar;
                        switch (i10) {
                            case 0:
                                ManualSettingsLoadActivity manualSettingsLoadActivity3 = manualSettingsLoadActivity2;
                                int i13 = ManualSettingsLoadActivity.f13134n;
                                fd.j0.i(manualSettingsLoadActivity3, "this$0");
                                if (fd.j0.d(menuItem.getTitle(), manualSettingsLoadActivity3.getString(R.string.ascending))) {
                                    appSettings2 = manualSettingsLoadActivity3.getAppSettings();
                                    oVar = r6.o.ASC;
                                } else {
                                    appSettings2 = manualSettingsLoadActivity3.getAppSettings();
                                    oVar = r6.o.DESC;
                                }
                                appSettings2.r(oVar);
                                manualSettingsLoadActivity3.j(true);
                                break;
                            default:
                                ManualSettingsLoadActivity manualSettingsLoadActivity4 = manualSettingsLoadActivity2;
                                int i14 = ManualSettingsLoadActivity.f13134n;
                                fd.j0.i(manualSettingsLoadActivity4, "this$0");
                                if (fd.j0.d(menuItem.getTitle(), manualSettingsLoadActivity4.getString(R.string.name))) {
                                    appSettings = manualSettingsLoadActivity4.getAppSettings();
                                    nVar = r6.n.NAME;
                                } else {
                                    appSettings = manualSettingsLoadActivity4.getAppSettings();
                                    nVar = r6.n.UPDATE_DATE;
                                }
                                appSettings.q(nVar);
                                manualSettingsLoadActivity4.j(true);
                                break;
                        }
                        return true;
                    }
                });
                break;
            case 3:
                final ManualSettingsLoadActivity manualSettingsLoadActivity3 = this.f38261d;
                int i13 = ManualSettingsLoadActivity.f13134n;
                fd.j0.i(manualSettingsLoadActivity3, "this$0");
                PopupMenu popupMenu2 = new PopupMenu(manualSettingsLoadActivity3, (ImageView) manualSettingsLoadActivity3._$_findCachedViewById(R.id.sortingByButton), 5);
                popupMenu2.getMenu().add(manualSettingsLoadActivity3.getString(R.string.ascending));
                popupMenu2.getMenu().add(manualSettingsLoadActivity3.getString(R.string.descending));
                popupMenu2.show();
                final int i14 = 0;
                popupMenu2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: y6.k0
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        r6.e appSettings;
                        r6.n nVar;
                        r6.e appSettings2;
                        r6.o oVar;
                        switch (i14) {
                            case 0:
                                ManualSettingsLoadActivity manualSettingsLoadActivity4 = manualSettingsLoadActivity3;
                                int i15 = ManualSettingsLoadActivity.f13134n;
                                fd.j0.i(manualSettingsLoadActivity4, "this$0");
                                if (fd.j0.d(menuItem.getTitle(), manualSettingsLoadActivity4.getString(R.string.ascending))) {
                                    appSettings2 = manualSettingsLoadActivity4.getAppSettings();
                                    oVar = r6.o.ASC;
                                } else {
                                    appSettings2 = manualSettingsLoadActivity4.getAppSettings();
                                    oVar = r6.o.DESC;
                                }
                                appSettings2.r(oVar);
                                manualSettingsLoadActivity4.j(true);
                                break;
                            default:
                                ManualSettingsLoadActivity manualSettingsLoadActivity5 = manualSettingsLoadActivity3;
                                int i16 = ManualSettingsLoadActivity.f13134n;
                                fd.j0.i(manualSettingsLoadActivity5, "this$0");
                                if (fd.j0.d(menuItem.getTitle(), manualSettingsLoadActivity5.getString(R.string.name))) {
                                    appSettings = manualSettingsLoadActivity5.getAppSettings();
                                    nVar = r6.n.NAME;
                                } else {
                                    appSettings = manualSettingsLoadActivity5.getAppSettings();
                                    nVar = r6.n.UPDATE_DATE;
                                }
                                appSettings.q(nVar);
                                manualSettingsLoadActivity5.j(true);
                                break;
                        }
                        return true;
                    }
                });
                break;
            case 4:
                ManualSettingsLoadActivity manualSettingsLoadActivity4 = this.f38261d;
                int i15 = ManualSettingsLoadActivity.f13134n;
                fd.j0.i(manualSettingsLoadActivity4, "this$0");
                if (manualSettingsLoadActivity4.m()) {
                    Object objA = k7.g.a("import_dialog", Boolean.TRUE);
                    fd.j0.h(objA, "get(\"import_dialog\", true)");
                    if (!((Boolean) objA).booleanValue()) {
                        manualSettingsLoadActivity4.l();
                    } else {
                        SettingsDialogs.Companion.showImportInfo(manualSettingsLoadActivity4, new e1(manualSettingsLoadActivity4));
                    }
                }
                break;
            default:
                ManualSettingsLoadActivity manualSettingsLoadActivity5 = this.f38261d;
                int i16 = ManualSettingsLoadActivity.f13134n;
                fd.j0.i(manualSettingsLoadActivity5, "this$0");
                ma.h.f33410y.a();
                ab.c.f275h.a(manualSettingsLoadActivity5, "", -1);
                break;
        }
    }
}
