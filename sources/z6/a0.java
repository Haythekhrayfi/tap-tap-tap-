package z6;

import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CombinedRecordingsActivity f45031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(CombinedRecordingsActivity combinedRecordingsActivity) {
        super(1);
        this.f45031c = combinedRecordingsActivity;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        CombinedRecordingsActivity combinedRecordingsActivity = this.f45031c;
        String string = combinedRecordingsActivity.getString(R.string.settings_exported_to_directory);
        fd.j0.h(string, "getString(R.string.settings_exported_to_directory)");
        CombinedRecordingsActivity.g(combinedRecordingsActivity, string);
        xe.a.f37601c.a("[COMBINE_RECORDINGS] export successful: " + str, new Object[0]);
        return jc.w.f31842a;
    }
}
