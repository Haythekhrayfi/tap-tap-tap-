package y6;

import com.inscode.autoclicker.service.ManualSettingsLoadActivity;
import com.inscode.autoclicker.service.ManualSettingsLoadActivity.b;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity.b;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity.d;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Callable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38281c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f38282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38283e;

    public /* synthetic */ l0(boolean z10, ManualSettingsLoadActivity manualSettingsLoadActivity) {
        this.f38282d = z10;
        this.f38283e = manualSettingsLoadActivity;
    }

    public /* synthetic */ l0(boolean z10, RecordSettingsLoadActivity recordSettingsLoadActivity) {
        this.f38282d = z10;
        this.f38283e = recordSettingsLoadActivity;
    }

    public /* synthetic */ l0(boolean z10, CombinedRecordingsActivity combinedRecordingsActivity) {
        this.f38282d = z10;
        this.f38283e = combinedRecordingsActivity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f38281c) {
            case 0:
                boolean z10 = this.f38282d;
                ManualSettingsLoadActivity manualSettingsLoadActivity = (ManualSettingsLoadActivity) this.f38283e;
                int i10 = ManualSettingsLoadActivity.f13134n;
                fd.j0.i(manualSettingsLoadActivity, "this$0");
                if (z10) {
                    return lb.m.g(manualSettingsLoadActivity.f13145l);
                }
                lb.m<List<u6.a>> mVarA = manualSettingsLoadActivity.i().a();
                x6.b bVar = new x6.b(manualSettingsLoadActivity.new b(), 9);
                Objects.requireNonNull(mVarA);
                return new wb.d(mVarA, bVar);
            case 1:
                boolean z11 = this.f38282d;
                RecordSettingsLoadActivity recordSettingsLoadActivity = (RecordSettingsLoadActivity) this.f38283e;
                int i11 = RecordSettingsLoadActivity.f13175l;
                fd.j0.i(recordSettingsLoadActivity, "this$0");
                if (z11) {
                    return lb.m.g(recordSettingsLoadActivity.f13184j);
                }
                lb.m<List<v6.a>> mVarA2 = recordSettingsLoadActivity.i().a();
                x6.b bVar2 = new x6.b(recordSettingsLoadActivity.new b(), 11);
                Objects.requireNonNull(mVarA2);
                return new wb.d(mVarA2, bVar2);
            default:
                boolean z12 = this.f38282d;
                CombinedRecordingsActivity combinedRecordingsActivity = (CombinedRecordingsActivity) this.f38283e;
                int i12 = CombinedRecordingsActivity.f13231l;
                fd.j0.i(combinedRecordingsActivity, "this$0");
                if (z12) {
                    return lb.m.g(combinedRecordingsActivity.f13240j);
                }
                lb.m<List<t6.a>> mVarA3 = combinedRecordingsActivity.h().a();
                x6.b bVar3 = new x6.b(combinedRecordingsActivity.new d(), 14);
                Objects.requireNonNull(mVarA3);
                return new wb.d(mVarA3, bVar3);
        }
    }
}
