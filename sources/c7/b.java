package c7;

import android.content.Context;
import android.view.View;
import com.inscode.autoclicker.service.manual.settings.WidgetManualSettingsActivity;
import com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WidgetManualSettingsActivity f3614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u6.a f3615e;

    public /* synthetic */ b(WidgetManualSettingsActivity widgetManualSettingsActivity, u6.a aVar) {
        this.f3613c = 0;
        this.f3614d = widgetManualSettingsActivity;
        this.f3615e = aVar;
    }

    public /* synthetic */ b(u6.a aVar, WidgetManualSettingsActivity widgetManualSettingsActivity, int i10) {
        this.f3613c = i10;
        if (i10 != 2) {
        }
        this.f3615e = aVar;
        this.f3614d = widgetManualSettingsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3613c) {
            case 0:
                WidgetManualSettingsActivity widgetManualSettingsActivity = this.f3614d;
                u6.a aVar = this.f3615e;
                int i10 = WidgetManualSettingsActivity.f13265f;
                j0.i(widgetManualSettingsActivity, "this$0");
                j0.i(aVar, "$settings");
                widgetManualSettingsActivity.h(aVar);
                break;
            case 1:
                u6.a aVar2 = this.f3615e;
                WidgetManualSettingsActivity widgetManualSettingsActivity2 = this.f3614d;
                int i11 = WidgetManualSettingsActivity.f13265f;
                j0.i(aVar2, "$settings");
                j0.i(widgetManualSettingsActivity2, "this$0");
                ModeSettingsDialogs.Companion companion = ModeSettingsDialogs.Companion;
                Context context = view.getContext();
                j0.h(context, "it.context");
                companion.showTimeBetweenSetDialog(context, aVar2.f(), new WidgetManualSettingsActivity.c(aVar2, widgetManualSettingsActivity2));
                break;
            case 2:
                u6.a aVar3 = this.f3615e;
                WidgetManualSettingsActivity widgetManualSettingsActivity3 = this.f3614d;
                int i12 = WidgetManualSettingsActivity.f13265f;
                j0.i(aVar3, "$settings");
                j0.i(widgetManualSettingsActivity3, "this$0");
                ModeSettingsDialogs.Companion companion2 = ModeSettingsDialogs.Companion;
                Context context2 = view.getContext();
                j0.h(context2, "it.context");
                companion2.showTapDurationDialog(context2, aVar3.h(), new WidgetManualSettingsActivity.d(aVar3, widgetManualSettingsActivity3));
                break;
            case 3:
                u6.a aVar4 = this.f3615e;
                WidgetManualSettingsActivity widgetManualSettingsActivity4 = this.f3614d;
                int i13 = WidgetManualSettingsActivity.f13265f;
                j0.i(aVar4, "$settings");
                j0.i(widgetManualSettingsActivity4, "this$0");
                ModeSettingsDialogs.Companion companion3 = ModeSettingsDialogs.Companion;
                Context context3 = view.getContext();
                j0.h(context3, "it.context");
                companion3.showSwipeDurationDialog(context3, aVar4.g(), new WidgetManualSettingsActivity.e(aVar4, widgetManualSettingsActivity4));
                break;
            default:
                u6.a aVar5 = this.f3615e;
                WidgetManualSettingsActivity widgetManualSettingsActivity5 = this.f3614d;
                int i14 = WidgetManualSettingsActivity.f13265f;
                j0.i(aVar5, "$settings");
                j0.i(widgetManualSettingsActivity5, "this$0");
                ModeSettingsDialogs.Companion companion4 = ModeSettingsDialogs.Companion;
                Context context4 = view.getContext();
                j0.h(context4, "it.context");
                companion4.showRepeatCountDialog(context4, aVar5.e(), new WidgetManualSettingsActivity.f(aVar5, widgetManualSettingsActivity5));
                break;
        }
    }
}
