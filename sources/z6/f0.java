package z6;

import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends vc.l implements uc.l<List<Boolean>, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CombinedRecordingsActivity f45050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(CombinedRecordingsActivity combinedRecordingsActivity) {
        super(1);
        this.f45050c = combinedRecordingsActivity;
    }

    @Override // uc.l
    public jc.w invoke(List<Boolean> list) {
        boolean z10;
        boolean z11;
        CombinedRecordingsActivity combinedRecordingsActivity;
        String string;
        String str;
        List<Boolean> list2 = list;
        xe.a.f37601c.a("[COMBINE_RECORDINGS] Import successful: " + list2, new Object[0]);
        fd.j0.h(list2, "it");
        if (!list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                Boolean bool = (Boolean) it.next();
                fd.j0.h(bool, "it");
                if (!bool.booleanValue()) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (!z10) {
            if (!list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z11 = false;
                        break;
                    }
                    Boolean bool2 = (Boolean) it2.next();
                    fd.j0.h(bool2, "it");
                    if (bool2.booleanValue()) {
                        z11 = true;
                        break;
                    }
                }
            } else {
                z11 = false;
                break;
            }
            if (z11) {
                combinedRecordingsActivity = this.f45050c;
                string = combinedRecordingsActivity.getString(R.string.import_some_setting_error);
                str = "getString(R.string.import_some_setting_error)";
            }
            return jc.w.f31842a;
        }
        combinedRecordingsActivity = this.f45050c;
        string = combinedRecordingsActivity.getString(R.string.all_settings_imported);
        str = "getString(R.string.all_settings_imported)";
        fd.j0.h(string, str);
        CombinedRecordingsActivity.g(combinedRecordingsActivity, string);
        CombinedRecordingsActivity.j(this.f45050c, false, 1);
        return jc.w.f31842a;
    }
}
