package c7;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.manual.settings.WidgetManualSettingsActivity;
import com.inscode.autoclicker.service.record.settings.WidgetRecordSettingsActivity;
import com.inscode.autoclicker.ui.dialogs.SettingsDialogs;
import f7.m;
import fd.j0;
import r6.k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements PopupMenu.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3618a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3619b;

    public /* synthetic */ d(WidgetManualSettingsActivity widgetManualSettingsActivity) {
        this.f3619b = widgetManualSettingsActivity;
    }

    public /* synthetic */ d(WidgetRecordSettingsActivity widgetRecordSettingsActivity) {
        this.f3619b = widgetRecordSettingsActivity;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i10 = this.f3618a;
        int i11 = R.string.shortcuts_no_available;
        switch (i10) {
            case 0:
                WidgetManualSettingsActivity widgetManualSettingsActivity = (WidgetManualSettingsActivity) this.f3619b;
                int i12 = WidgetManualSettingsActivity.f13265f;
                j0.i(widgetManualSettingsActivity, "this$0");
                if (j0.d(menuItem.getTitle(), widgetManualSettingsActivity.getString(R.string.create_launcher_shortcut))) {
                    if (!ma.h.f33410y.a().i()) {
                        u1.a.o(widgetManualSettingsActivity, R.string.create_shortcut_pro, 0).setAction(widgetManualSettingsActivity.getString(R.string.buy_pro), new a(widgetManualSettingsActivity, 4)).show();
                    } else {
                        u6.a aVar = widgetManualSettingsActivity.g().f161c;
                        if (j0.d(aVar.getName(), "Unsaved")) {
                            i11 = R.string.save_settings_to_create_shortcut;
                        } else if (f0.d.a(widgetManualSettingsActivity)) {
                            String name = aVar.getName();
                            k kVar = k.MANUAL;
                            j0.i(name, "name");
                            j0.i(kVar, "mode");
                            SettingsDialogs.Companion.showCreateShortcutDialog(widgetManualSettingsActivity, name, new m(widgetManualSettingsActivity, kVar, name));
                        }
                        u1.a.s(widgetManualSettingsActivity, i11, 0, 2);
                    }
                }
                break;
            default:
                WidgetRecordSettingsActivity widgetRecordSettingsActivity = (WidgetRecordSettingsActivity) this.f3619b;
                int i13 = WidgetRecordSettingsActivity.f13283g;
                j0.i(widgetRecordSettingsActivity, "this$0");
                if (j0.d(menuItem.getTitle(), widgetRecordSettingsActivity.getString(R.string.create_launcher_shortcut))) {
                    if (!ma.h.f33410y.a().i()) {
                        u1.a.o(widgetRecordSettingsActivity, R.string.create_shortcut_pro, -2).setAction(widgetRecordSettingsActivity.getString(R.string.buy_pro), new e7.a(widgetRecordSettingsActivity, 5)).show();
                    } else {
                        v6.a aVar2 = widgetRecordSettingsActivity.g().f28802c;
                        if (j0.d(aVar2.getName(), "Unsaved")) {
                            i11 = R.string.save_settings_to_create_shortcut;
                        } else if (f0.d.a(widgetRecordSettingsActivity)) {
                            String name2 = aVar2.getName();
                            k kVar2 = k.RECORD;
                            j0.i(name2, "name");
                            j0.i(kVar2, "mode");
                            SettingsDialogs.Companion.showCreateShortcutDialog(widgetRecordSettingsActivity, name2, new m(widgetRecordSettingsActivity, kVar2, name2));
                        }
                        u1.a.s(widgetRecordSettingsActivity, i11, 0, 2);
                    }
                }
                break;
        }
        return true;
    }
}
