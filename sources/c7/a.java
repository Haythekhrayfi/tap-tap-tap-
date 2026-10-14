package c7;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.applovin.exoplayer2.b.z;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.ManualSettingsLoadActivity;
import com.inscode.autoclicker.service.manual.settings.WidgetManualSettingsActivity;
import com.inscode.autoclicker.service.manual.settings.WidgetOneFingerVideoActivity;
import fd.j0;
import java.util.List;
import java.util.Objects;
import lb.m;
import z6.y0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WidgetManualSettingsActivity f3612d;

    public /* synthetic */ a(WidgetManualSettingsActivity widgetManualSettingsActivity, int i10) {
        this.f3611c = i10;
        if (i10 == 1) {
            this.f3612d = widgetManualSettingsActivity;
            return;
        }
        if (i10 == 2) {
            this.f3612d = widgetManualSettingsActivity;
            return;
        }
        if (i10 == 3) {
            this.f3612d = widgetManualSettingsActivity;
        } else if (i10 != 4) {
            this.f3612d = widgetManualSettingsActivity;
        } else {
            this.f3612d = widgetManualSettingsActivity;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3611c) {
            case 0:
                WidgetManualSettingsActivity widgetManualSettingsActivity = this.f3612d;
                int i10 = WidgetManualSettingsActivity.f13265f;
                j0.i(widgetManualSettingsActivity, "this$0");
                PopupMenu popupMenu = new PopupMenu(widgetManualSettingsActivity, (ImageView) widgetManualSettingsActivity._$_findCachedViewById(R.id.manualSettingsMore), 5);
                popupMenu.getMenu().add(widgetManualSettingsActivity.getString(R.string.create_launcher_shortcut));
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new d(widgetManualSettingsActivity));
                break;
            case 1:
                WidgetManualSettingsActivity widgetManualSettingsActivity2 = this.f3612d;
                int i11 = WidgetManualSettingsActivity.f13265f;
                j0.i(widgetManualSettingsActivity2, "this$0");
                if (!widgetManualSettingsActivity2.g().f161c.a().isEmpty()) {
                    m<List<u6.a>> mVarA = widgetManualSettingsActivity2.g().a();
                    y0 y0Var = new y0(e.f3620c, 12);
                    Objects.requireNonNull(mVarA);
                    nb.b bVarC = ec.a.c(new wb.h(mVarA, y0Var).j(z.G).n(fc.a.f29534b).i(mb.a.a()), f.f3621c, new h(widgetManualSettingsActivity2));
                    nb.a aVar = widgetManualSettingsActivity2.f13267d;
                    j0.j(aVar, "compositeDisposable");
                    aVar.a(bVarC);
                } else {
                    u1.a.s(widgetManualSettingsActivity2, R.string.no_taps_swipe_to_save, 0, 2);
                }
                break;
            case 2:
                WidgetManualSettingsActivity widgetManualSettingsActivity3 = this.f3612d;
                int i12 = WidgetManualSettingsActivity.f13265f;
                j0.i(widgetManualSettingsActivity3, "this$0");
                widgetManualSettingsActivity3.startActivity(new Intent(widgetManualSettingsActivity3, (Class<?>) ManualSettingsLoadActivity.class));
                break;
            case 3:
                WidgetManualSettingsActivity widgetManualSettingsActivity4 = this.f3612d;
                int i13 = WidgetManualSettingsActivity.f13265f;
                j0.i(widgetManualSettingsActivity4, "this$0");
                widgetManualSettingsActivity4.startActivity(new Intent(widgetManualSettingsActivity4, (Class<?>) WidgetOneFingerVideoActivity.class));
                break;
            case 4:
                WidgetManualSettingsActivity widgetManualSettingsActivity5 = this.f3612d;
                int i14 = WidgetManualSettingsActivity.f13265f;
                j0.i(widgetManualSettingsActivity5, "this$0");
                ma.h.f33410y.a();
                ab.c.f275h.a(widgetManualSettingsActivity5, "", -1);
                break;
            default:
                WidgetManualSettingsActivity widgetManualSettingsActivity6 = this.f3612d;
                j0.i(widgetManualSettingsActivity6, "this$0");
                ma.h.f33410y.a();
                ab.c.f275h.a(widgetManualSettingsActivity6, "", -1);
                break;
        }
    }
}
