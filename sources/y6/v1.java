package y6;

import android.content.DialogInterface;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity;
import com.inscode.autoclicker.service.combine.CombinationActivity;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v1 f38404d = new v1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v1 f38405e = new v1(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ v1 f38406f = new v1(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v1 f38407g = new v1(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ v1 f38408h = new v1(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38409c;

    public /* synthetic */ v1(int i10) {
        this.f38409c = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38409c) {
            case 0:
                int i11 = RecordSettingsLoadActivity.f13175l;
                break;
            case 1:
                CombinationActivity.a aVar = CombinationActivity.f13209j;
                dialogInterface.dismiss();
                break;
            case 2:
                CombinationActivity.a aVar2 = CombinationActivity.f13209j;
                break;
            case 3:
                int i12 = CombinedRecordingsActivity.f13231l;
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
