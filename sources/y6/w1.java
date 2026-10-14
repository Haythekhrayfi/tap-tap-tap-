package y6;

import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity;
import com.inscode.autoclicker.ui.dialogs.SettingsDialogs;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w1 implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RecordSettingsLoadActivity f38419d;

    public /* synthetic */ w1(RecordSettingsLoadActivity recordSettingsLoadActivity, int i10) {
        this.f38418c = i10;
        if (i10 == 1 || i10 == 2 || i10 != 3) {
        }
        this.f38419d = recordSettingsLoadActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int i10 = 1;
        switch (this.f38418c) {
            case 0:
                RecordSettingsLoadActivity recordSettingsLoadActivity = this.f38419d;
                int i11 = RecordSettingsLoadActivity.f13175l;
                fd.j0.i(recordSettingsLoadActivity, "this$0");
                if (recordSettingsLoadActivity.m()) {
                    Object objA = k7.g.a("import_dialog", Boolean.TRUE);
                    fd.j0.h(objA, "get(\"import_dialog\", true)");
                    if (!((Boolean) objA).booleanValue()) {
                        recordSettingsLoadActivity.l();
                    } else {
                        SettingsDialogs.Companion.showImportInfo(recordSettingsLoadActivity, new o2(recordSettingsLoadActivity));
                    }
                }
                break;
            case 1:
                RecordSettingsLoadActivity.g(this.f38419d, view);
                break;
            case 2:
                RecordSettingsLoadActivity recordSettingsLoadActivity2 = this.f38419d;
                int i12 = RecordSettingsLoadActivity.f13175l;
                fd.j0.i(recordSettingsLoadActivity2, "this$0");
                ((EditText) recordSettingsLoadActivity2._$_findCachedViewById(R.id.searchField)).setText("");
                if (!ed.q.k(recordSettingsLoadActivity2.f13179e)) {
                    recordSettingsLoadActivity2.f13179e = "";
                    recordSettingsLoadActivity2.j(true);
                }
                break;
            case 3:
                final RecordSettingsLoadActivity recordSettingsLoadActivity3 = this.f38419d;
                int i13 = RecordSettingsLoadActivity.f13175l;
                fd.j0.i(recordSettingsLoadActivity3, "this$0");
                PopupMenu popupMenu = new PopupMenu(recordSettingsLoadActivity3, (ImageView) recordSettingsLoadActivity3._$_findCachedViewById(R.id.sortingByButton), 5);
                popupMenu.getMenu().add(recordSettingsLoadActivity3.getString(R.string.name));
                popupMenu.getMenu().add(recordSettingsLoadActivity3.getString(R.string.update_date));
                popupMenu.show();
                final int i14 = 0;
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: y6.x1
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        r6.e appSettings;
                        r6.o oVar;
                        r6.e appSettings2;
                        r6.n nVar;
                        switch (i14) {
                            case 0:
                                RecordSettingsLoadActivity recordSettingsLoadActivity4 = recordSettingsLoadActivity3;
                                int i15 = RecordSettingsLoadActivity.f13175l;
                                fd.j0.i(recordSettingsLoadActivity4, "this$0");
                                if (fd.j0.d(menuItem.getTitle(), recordSettingsLoadActivity4.getString(R.string.name))) {
                                    appSettings2 = recordSettingsLoadActivity4.getAppSettings();
                                    nVar = r6.n.NAME;
                                } else {
                                    appSettings2 = recordSettingsLoadActivity4.getAppSettings();
                                    nVar = r6.n.UPDATE_DATE;
                                }
                                appSettings2.q(nVar);
                                recordSettingsLoadActivity4.j(true);
                                break;
                            default:
                                RecordSettingsLoadActivity recordSettingsLoadActivity5 = recordSettingsLoadActivity3;
                                int i16 = RecordSettingsLoadActivity.f13175l;
                                fd.j0.i(recordSettingsLoadActivity5, "this$0");
                                if (fd.j0.d(menuItem.getTitle(), recordSettingsLoadActivity5.getString(R.string.ascending))) {
                                    appSettings = recordSettingsLoadActivity5.getAppSettings();
                                    oVar = r6.o.ASC;
                                } else {
                                    appSettings = recordSettingsLoadActivity5.getAppSettings();
                                    oVar = r6.o.DESC;
                                }
                                appSettings.r(oVar);
                                recordSettingsLoadActivity5.j(true);
                                break;
                        }
                        return true;
                    }
                });
                break;
            case 4:
                final RecordSettingsLoadActivity recordSettingsLoadActivity4 = this.f38419d;
                int i15 = RecordSettingsLoadActivity.f13175l;
                fd.j0.i(recordSettingsLoadActivity4, "this$0");
                PopupMenu popupMenu2 = new PopupMenu(recordSettingsLoadActivity4, (ImageView) recordSettingsLoadActivity4._$_findCachedViewById(R.id.sortingByButton), 5);
                popupMenu2.getMenu().add(recordSettingsLoadActivity4.getString(R.string.ascending));
                popupMenu2.getMenu().add(recordSettingsLoadActivity4.getString(R.string.descending));
                popupMenu2.show();
                popupMenu2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: y6.x1
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        r6.e appSettings;
                        r6.o oVar;
                        r6.e appSettings2;
                        r6.n nVar;
                        switch (i10) {
                            case 0:
                                RecordSettingsLoadActivity recordSettingsLoadActivity5 = recordSettingsLoadActivity4;
                                int i16 = RecordSettingsLoadActivity.f13175l;
                                fd.j0.i(recordSettingsLoadActivity5, "this$0");
                                if (fd.j0.d(menuItem.getTitle(), recordSettingsLoadActivity5.getString(R.string.name))) {
                                    appSettings2 = recordSettingsLoadActivity5.getAppSettings();
                                    nVar = r6.n.NAME;
                                } else {
                                    appSettings2 = recordSettingsLoadActivity5.getAppSettings();
                                    nVar = r6.n.UPDATE_DATE;
                                }
                                appSettings2.q(nVar);
                                recordSettingsLoadActivity5.j(true);
                                break;
                            default:
                                RecordSettingsLoadActivity recordSettingsLoadActivity6 = recordSettingsLoadActivity4;
                                int i17 = RecordSettingsLoadActivity.f13175l;
                                fd.j0.i(recordSettingsLoadActivity6, "this$0");
                                if (fd.j0.d(menuItem.getTitle(), recordSettingsLoadActivity6.getString(R.string.ascending))) {
                                    appSettings = recordSettingsLoadActivity6.getAppSettings();
                                    oVar = r6.o.ASC;
                                } else {
                                    appSettings = recordSettingsLoadActivity6.getAppSettings();
                                    oVar = r6.o.DESC;
                                }
                                appSettings.r(oVar);
                                recordSettingsLoadActivity6.j(true);
                                break;
                        }
                        return true;
                    }
                });
                break;
            default:
                RecordSettingsLoadActivity recordSettingsLoadActivity5 = this.f38419d;
                int i16 = RecordSettingsLoadActivity.f13175l;
                fd.j0.i(recordSettingsLoadActivity5, "this$0");
                ma.h.f33410y.a();
                ab.c.f275h.a(recordSettingsLoadActivity5, "", -1);
                break;
        }
    }
}
