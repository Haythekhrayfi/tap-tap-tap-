package e7;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity;
import com.inscode.autoclicker.service.record.settings.WidgetRecordSettingsActivity;
import com.inscode.autoclicker.ui.main.SettingsActivity;
import fd.j0;
import java.util.List;
import java.util.Objects;
import lb.m;
import wb.h;
import z6.y0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WidgetRecordSettingsActivity f29057d;

    public /* synthetic */ a(WidgetRecordSettingsActivity widgetRecordSettingsActivity, int i10) {
        this.f29056c = i10;
        switch (i10) {
            case 1:
                this.f29057d = widgetRecordSettingsActivity;
                break;
            case 2:
                this.f29057d = widgetRecordSettingsActivity;
                break;
            case 3:
                this.f29057d = widgetRecordSettingsActivity;
                break;
            case 4:
                this.f29057d = widgetRecordSettingsActivity;
                break;
            case 5:
                this.f29057d = widgetRecordSettingsActivity;
                break;
            case 6:
                this.f29057d = widgetRecordSettingsActivity;
                break;
            default:
                this.f29057d = widgetRecordSettingsActivity;
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f29056c) {
            case 0:
                WidgetRecordSettingsActivity widgetRecordSettingsActivity = this.f29057d;
                int i10 = WidgetRecordSettingsActivity.f13283g;
                j0.i(widgetRecordSettingsActivity, "this$0");
                widgetRecordSettingsActivity.startActivity(new Intent(widgetRecordSettingsActivity, (Class<?>) SettingsActivity.class));
                break;
            case 1:
                WidgetRecordSettingsActivity widgetRecordSettingsActivity2 = this.f29057d;
                int i11 = WidgetRecordSettingsActivity.f13283g;
                j0.i(widgetRecordSettingsActivity2, "this$0");
                if (!widgetRecordSettingsActivity2.g().f28802c.b().isEmpty()) {
                    m<List<v6.a>> mVarA = widgetRecordSettingsActivity2.g().a();
                    y0 y0Var = new y0(c.f29061c, 25);
                    Objects.requireNonNull(mVarA);
                    nb.b bVarC = ec.a.c(new h(mVarA, y0Var).j(i5.a.f31254j).n(fc.a.f29534b).i(mb.a.a()), d.f29062c, new f(widgetRecordSettingsActivity2));
                    nb.a aVar = widgetRecordSettingsActivity2.f13286e;
                    j0.j(aVar, "compositeDisposable");
                    aVar.a(bVarC);
                } else {
                    u1.a.s(widgetRecordSettingsActivity2, R.string.no_actions, 0, 2);
                }
                break;
            case 2:
                WidgetRecordSettingsActivity widgetRecordSettingsActivity3 = this.f29057d;
                int i12 = WidgetRecordSettingsActivity.f13283g;
                j0.i(widgetRecordSettingsActivity3, "this$0");
                widgetRecordSettingsActivity3.startActivity(new Intent(widgetRecordSettingsActivity3, (Class<?>) RecordSettingsLoadActivity.class));
                break;
            case 3:
                WidgetRecordSettingsActivity widgetRecordSettingsActivity4 = this.f29057d;
                int i13 = WidgetRecordSettingsActivity.f13283g;
                j0.i(widgetRecordSettingsActivity4, "this$0");
                PopupMenu popupMenu = new PopupMenu(widgetRecordSettingsActivity4, (ImageView) widgetRecordSettingsActivity4._$_findCachedViewById(R.id.recordSettingsMore), 5);
                popupMenu.getMenu().add(widgetRecordSettingsActivity4.getString(R.string.create_launcher_shortcut));
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new c7.d(widgetRecordSettingsActivity4));
                break;
            case 4:
                WidgetRecordSettingsActivity widgetRecordSettingsActivity5 = this.f29057d;
                int i14 = WidgetRecordSettingsActivity.f13283g;
                j0.i(widgetRecordSettingsActivity5, "this$0");
                ma.h.f33410y.a();
                ab.c.f275h.a(widgetRecordSettingsActivity5, "", -1);
                break;
            case 5:
                WidgetRecordSettingsActivity widgetRecordSettingsActivity6 = this.f29057d;
                int i15 = WidgetRecordSettingsActivity.f13283g;
                j0.i(widgetRecordSettingsActivity6, "this$0");
                ma.h.f33410y.a();
                ab.c.f275h.a(widgetRecordSettingsActivity6, "", -1);
                break;
            default:
                WidgetRecordSettingsActivity widgetRecordSettingsActivity7 = this.f29057d;
                j0.i(widgetRecordSettingsActivity7, "this$0");
                ma.h.f33410y.a();
                ab.c.f275h.a(widgetRecordSettingsActivity7, "", -1);
                break;
        }
    }
}
