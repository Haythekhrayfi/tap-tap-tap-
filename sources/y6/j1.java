package y6;

import com.inscode.autoclicker.service.ManualSettingsLoadActivity;
import com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 extends vc.l implements uc.l<List<? extends String>, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u6.a f38262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ManualSettingsLoadActivity f38263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(u6.a aVar, ManualSettingsLoadActivity manualSettingsLoadActivity) {
        super(1);
        this.f38262c = aVar;
        this.f38263d = manualSettingsLoadActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc.l
    public jc.w invoke(List<? extends String> list) {
        List<? extends String> list2 = list;
        ModeSettingsDialogs.Companion companion = ModeSettingsDialogs.Companion;
        String name = this.f38262c.getName();
        ManualSettingsLoadActivity manualSettingsLoadActivity = this.f38263d;
        fd.j0.h(list2, "it");
        companion.showRenameDialog(manualSettingsLoadActivity, name, list2, new i1(this.f38263d, this.f38262c));
        return jc.w.f31842a;
    }
}
