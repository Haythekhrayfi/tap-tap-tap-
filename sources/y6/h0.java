package y6;

import android.content.DialogInterface;
import com.inscode.autoclicker.service.ManualSettingsLoadActivity;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity;
import com.inscode.autoclicker.service.combine.CombinationActivity;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;
import com.inscode.autoclicker.ui.prepare.PrepareActivity;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38199c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38201e;

    public /* synthetic */ h0(ManualSettingsLoadActivity manualSettingsLoadActivity, u6.a aVar) {
        this.f38200d = manualSettingsLoadActivity;
        this.f38201e = aVar;
    }

    public /* synthetic */ h0(RecordSettingsLoadActivity recordSettingsLoadActivity, v6.a aVar) {
        this.f38200d = recordSettingsLoadActivity;
        this.f38201e = aVar;
    }

    public /* synthetic */ h0(CombinationActivity combinationActivity, v6.a aVar) {
        this.f38200d = combinationActivity;
        this.f38201e = aVar;
    }

    public /* synthetic */ h0(CombinedRecordingsActivity combinedRecordingsActivity, t6.a aVar) {
        this.f38200d = combinedRecordingsActivity;
        this.f38201e = aVar;
    }

    public /* synthetic */ h0(PrepareActivity prepareActivity, uc.a aVar) {
        this.f38200d = prepareActivity;
        this.f38201e = aVar;
    }

    public /* synthetic */ h0(gb.g gVar, ma.e eVar) {
        this.f38200d = gVar;
        this.f38201e = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        List<v6.a> listD;
        switch (this.f38199c) {
            case 0:
                ManualSettingsLoadActivity manualSettingsLoadActivity = (ManualSettingsLoadActivity) this.f38200d;
                u6.a aVar = (u6.a) this.f38201e;
                int i11 = ManualSettingsLoadActivity.f13134n;
                fd.j0.i(manualSettingsLoadActivity, "this$0");
                fd.j0.i(aVar, "$item");
                a7.a aVarI = manualSettingsLoadActivity.i();
                Objects.requireNonNull(aVarI);
                nb.b bVarC = ec.a.c(aVarI.f160b.remove(aVar.getName()).n(fc.a.f29534b).i(mb.a.a()), x0.f38424c, new y0(manualSettingsLoadActivity, aVar));
                nb.a aVar2 = manualSettingsLoadActivity.f13142i;
                fd.j0.j(aVar2, "compositeDisposable");
                aVar2.a(bVarC);
                break;
            case 1:
                RecordSettingsLoadActivity recordSettingsLoadActivity = (RecordSettingsLoadActivity) this.f38200d;
                v6.a aVar3 = (v6.a) this.f38201e;
                int i12 = RecordSettingsLoadActivity.f13175l;
                fd.j0.i(recordSettingsLoadActivity, "this$0");
                fd.j0.i(aVar3, "$item");
                d7.g gVarI = recordSettingsLoadActivity.i();
                Objects.requireNonNull(gVarI);
                nb.b bVarC2 = ec.a.c(gVarI.f28801b.remove(aVar3.getName()).n(fc.a.f29534b).i(mb.a.a()), j2.f38264c, new k2(recordSettingsLoadActivity, aVar3));
                nb.a aVar4 = recordSettingsLoadActivity.f13182h;
                fd.j0.j(aVar4, "compositeDisposable");
                aVar4.a(bVarC2);
                break;
            case 2:
                CombinationActivity combinationActivity = (CombinationActivity) this.f38200d;
                v6.a aVar5 = (v6.a) this.f38201e;
                CombinationActivity.a aVar6 = CombinationActivity.f13209j;
                fd.j0.i(combinationActivity, "this$0");
                fd.j0.i(aVar5, "$item");
                t6.a aVar7 = CombinationActivity.f13210k;
                if (aVar7 != null && (listD = aVar7.d()) != null) {
                    listD.remove(aVar5);
                }
                combinationActivity.f13212d.remove(aVar5);
                combinationActivity.f13211c = true;
                break;
            case 3:
                CombinedRecordingsActivity combinedRecordingsActivity = (CombinedRecordingsActivity) this.f38200d;
                t6.a aVar8 = (t6.a) this.f38201e;
                int i13 = CombinedRecordingsActivity.f13231l;
                fd.j0.i(combinedRecordingsActivity, "this$0");
                fd.j0.i(aVar8, "$item");
                z6.r rVarH = combinedRecordingsActivity.h();
                Objects.requireNonNull(rVarH);
                nb.b bVarC3 = ec.a.c(rVarH.f45129b.remove(aVar8.getName()).n(fc.a.f29534b).i(mb.a.a()), z6.g0.f45053c, new z6.h0(combinedRecordingsActivity, aVar8));
                nb.a aVar9 = combinedRecordingsActivity.f13238h;
                fd.j0.j(aVar9, "compositeDisposable");
                aVar9.a(bVarC3);
                break;
            case 4:
                PrepareActivity.showAccessibilityConsent$lambda$1((PrepareActivity) this.f38200d, (uc.a) this.f38201e, dialogInterface, i10);
                break;
            default:
                gb.g gVar = (gb.g) this.f38200d;
                ma.e eVar = (ma.e) this.f38201e;
                KProperty<Object>[] kPropertyArr = gb.g.f30206l;
                fd.j0.i(gVar, "this$0");
                fd.j0.i(eVar, "$offer");
                y8.c0.z(fd.c1.f29556c, null, null, new gb.m(gVar, eVar, null), 3, null);
                break;
        }
    }
}
