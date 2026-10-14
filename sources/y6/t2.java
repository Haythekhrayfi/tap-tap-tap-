package y6;

import com.inscode.autoclicker.service.RecordSettingsLoadActivity;
import com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t2 extends vc.l implements uc.l<List<? extends String>, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v6.a f38392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RecordSettingsLoadActivity f38393d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(v6.a aVar, RecordSettingsLoadActivity recordSettingsLoadActivity) {
        super(1);
        this.f38392c = aVar;
        this.f38393d = recordSettingsLoadActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc.l
    public jc.w invoke(List<? extends String> list) {
        List<? extends String> list2 = list;
        ModeSettingsDialogs.Companion companion = ModeSettingsDialogs.Companion;
        String name = this.f38392c.getName();
        RecordSettingsLoadActivity recordSettingsLoadActivity = this.f38393d;
        fd.j0.h(list2, "it");
        companion.showRenameDialog(recordSettingsLoadActivity, name, list2, new s2(this.f38393d, this.f38392c));
        return jc.w.f31842a;
    }
}
