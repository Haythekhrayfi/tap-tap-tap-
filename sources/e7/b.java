package e7;

import android.content.Context;
import android.view.View;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.record.settings.WidgetRecordSettingsActivity;
import com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs;
import fd.j0;
import ma.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WidgetRecordSettingsActivity f29059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v6.a f29060e;

    public /* synthetic */ b(WidgetRecordSettingsActivity widgetRecordSettingsActivity, v6.a aVar, int i10) {
        this.f29058c = i10;
        this.f29059d = widgetRecordSettingsActivity;
        this.f29060e = aVar;
    }

    public /* synthetic */ b(v6.a aVar, WidgetRecordSettingsActivity widgetRecordSettingsActivity, int i10) {
        this.f29058c = i10;
        this.f29060e = aVar;
        this.f29059d = widgetRecordSettingsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f29058c) {
            case 0:
                WidgetRecordSettingsActivity widgetRecordSettingsActivity = this.f29059d;
                v6.a aVar = this.f29060e;
                int i10 = WidgetRecordSettingsActivity.f13283g;
                j0.i(widgetRecordSettingsActivity, "this$0");
                j0.i(aVar, "$settings");
                widgetRecordSettingsActivity.h(aVar);
                break;
            case 1:
                v6.a aVar2 = this.f29060e;
                WidgetRecordSettingsActivity widgetRecordSettingsActivity2 = this.f29059d;
                int i11 = WidgetRecordSettingsActivity.f13283g;
                j0.i(aVar2, "$settings");
                j0.i(widgetRecordSettingsActivity2, "this$0");
                ModeSettingsDialogs.Companion companion = ModeSettingsDialogs.Companion;
                Context context = view.getContext();
                j0.h(context, "it.context");
                companion.showRepeatCountDialog(context, aVar2.f(), new WidgetRecordSettingsActivity.d(aVar2, widgetRecordSettingsActivity2));
                break;
            case 2:
                v6.a aVar3 = this.f29060e;
                WidgetRecordSettingsActivity widgetRecordSettingsActivity3 = this.f29059d;
                int i12 = WidgetRecordSettingsActivity.f13283g;
                j0.i(aVar3, "$settings");
                j0.i(widgetRecordSettingsActivity3, "this$0");
                ModeSettingsDialogs.Companion companion2 = ModeSettingsDialogs.Companion;
                Context context2 = view.getContext();
                j0.h(context2, "it.context");
                companion2.showPauseBeforeRepeatDialog(context2, aVar3.g(), new WidgetRecordSettingsActivity.e(aVar3, widgetRecordSettingsActivity3));
                break;
            default:
                WidgetRecordSettingsActivity widgetRecordSettingsActivity4 = this.f29059d;
                v6.a aVar4 = this.f29060e;
                int i13 = WidgetRecordSettingsActivity.f13283g;
                j0.i(widgetRecordSettingsActivity4, "this$0");
                j0.i(aVar4, "$settings");
                if (!h.f33410y.a().i()) {
                    u1.a.o(widgetRecordSettingsActivity4, R.string.change_playback_pro, -2).setAction(widgetRecordSettingsActivity4.getString(R.string.buy_pro), new a(widgetRecordSettingsActivity4, 4)).show();
                } else {
                    ModeSettingsDialogs.Companion companion3 = ModeSettingsDialogs.Companion;
                    Context context3 = view.getContext();
                    j0.h(context3, "it.context");
                    companion3.showPlaybackSpeedDialog(context3, aVar4.e(), ((r6.e) widgetRecordSettingsActivity4.f13285d.getValue()).b(), new WidgetRecordSettingsActivity.f(aVar4, widgetRecordSettingsActivity4));
                }
                break;
        }
    }
}
