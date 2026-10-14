package y6;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.Toast;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.ManualSettingsLoadActivity;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity;
import com.inscode.autoclicker.service.combine.CombinationActivity;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;
import com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs;
import com.inscode.autoclicker.ui.dialogs.SettingsDialogs;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b1 implements PopupMenu.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38108a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38110c;

    public /* synthetic */ b1(ManualSettingsLoadActivity manualSettingsLoadActivity, u6.a aVar) {
        this.f38109b = manualSettingsLoadActivity;
        this.f38110c = aVar;
    }

    public /* synthetic */ b1(RecordSettingsLoadActivity recordSettingsLoadActivity, v6.a aVar) {
        this.f38109b = recordSettingsLoadActivity;
        this.f38110c = aVar;
    }

    public /* synthetic */ b1(CombinationActivity combinationActivity, v6.a aVar) {
        this.f38109b = combinationActivity;
        this.f38110c = aVar;
    }

    public /* synthetic */ b1(CombinedRecordingsActivity combinedRecordingsActivity, t6.a aVar) {
        this.f38109b = combinedRecordingsActivity;
        this.f38110c = aVar;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i10;
        switch (this.f38108a) {
            case 0:
                ManualSettingsLoadActivity manualSettingsLoadActivity = (ManualSettingsLoadActivity) this.f38109b;
                u6.a aVar = (u6.a) this.f38110c;
                fd.j0.i(manualSettingsLoadActivity, "this$0");
                fd.j0.i(aVar, "$item");
                if (fd.j0.d(menuItem.getTitle(), manualSettingsLoadActivity.getString(R.string.delete))) {
                    new AlertDialog.Builder(manualSettingsLoadActivity).setTitle(manualSettingsLoadActivity.getString(R.string.delete)).setMessage(manualSettingsLoadActivity.getString(R.string.delete_config_confirm)).setPositiveButton(manualSettingsLoadActivity.getString(android.R.string.ok), new h0(manualSettingsLoadActivity, aVar)).setNegativeButton(manualSettingsLoadActivity.getString(android.R.string.cancel), new DialogInterface.OnClickListener() { // from class: y6.i0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            int i12 = ManualSettingsLoadActivity.f13134n;
                        }
                    }).create().show();
                } else if (!fd.j0.d(menuItem.getTitle(), manualSettingsLoadActivity.getString(R.string.export))) {
                    if (fd.j0.d(menuItem.getTitle(), manualSettingsLoadActivity.getString(R.string.rename))) {
                        lb.m<List<u6.a>> mVarA = manualSettingsLoadActivity.i().a();
                        p6.a aVar2 = new p6.a(f1.f38190c, 16);
                        Objects.requireNonNull(mVarA);
                        nb.b bVarC = ec.a.c(new wb.h(mVarA, aVar2).j(i5.a.f31253i).n(fc.a.f29534b).i(mb.a.a()), g1.f38195c, new j1(aVar, manualSettingsLoadActivity));
                        nb.a aVar3 = manualSettingsLoadActivity.f13142i;
                        fd.j0.j(aVar3, "compositeDisposable");
                        aVar3.a(bVarC);
                    }
                } else if (manualSettingsLoadActivity.m()) {
                    nb.b bVarE = ec.a.e(lb.i.n(Boolean.TRUE), c1.f38112c, null, new d1(manualSettingsLoadActivity, aVar), 2);
                    nb.a aVar4 = manualSettingsLoadActivity.f13142i;
                    fd.j0.j(aVar4, "compositeDisposable");
                    aVar4.a(bVarE);
                }
                break;
            case 1:
                RecordSettingsLoadActivity recordSettingsLoadActivity = (RecordSettingsLoadActivity) this.f38109b;
                v6.a aVar5 = (v6.a) this.f38110c;
                fd.j0.i(recordSettingsLoadActivity, "this$0");
                fd.j0.i(aVar5, "$item");
                if (fd.j0.d(menuItem.getTitle(), recordSettingsLoadActivity.getString(R.string.delete))) {
                    new AlertDialog.Builder(recordSettingsLoadActivity).setTitle(recordSettingsLoadActivity.getString(R.string.delete)).setMessage(recordSettingsLoadActivity.getString(R.string.delete_config_confirm)).setPositiveButton(recordSettingsLoadActivity.getString(android.R.string.ok), new h0(recordSettingsLoadActivity, aVar5)).setNegativeButton(recordSettingsLoadActivity.getString(android.R.string.cancel), v1.f38404d).create().show();
                } else if (!fd.j0.d(menuItem.getTitle(), recordSettingsLoadActivity.getString(R.string.export))) {
                    if (fd.j0.d(menuItem.getTitle(), recordSettingsLoadActivity.getString(R.string.rename))) {
                        lb.m<List<v6.a>> mVarA2 = recordSettingsLoadActivity.i().a();
                        p6.a aVar6 = new p6.a(p2.f38363c, 21);
                        Objects.requireNonNull(mVarA2);
                        nb.b bVarC2 = ec.a.c(new wb.h(mVarA2, aVar6).j(com.applovin.exoplayer2.b.z.D).n(fc.a.f29534b).i(mb.a.a()), q2.f38366c, new t2(aVar5, recordSettingsLoadActivity));
                        nb.a aVar7 = recordSettingsLoadActivity.f13182h;
                        fd.j0.j(aVar7, "compositeDisposable");
                        aVar7.a(bVarC2);
                    }
                } else if (recordSettingsLoadActivity.m()) {
                    nb.b bVarE2 = ec.a.e(lb.i.n(Boolean.TRUE), m2.f38289c, null, new n2(recordSettingsLoadActivity, aVar5), 2);
                    nb.a aVar8 = recordSettingsLoadActivity.f13182h;
                    fd.j0.j(aVar8, "compositeDisposable");
                    aVar8.a(bVarE2);
                }
                break;
            case 2:
                CombinationActivity combinationActivity = (CombinationActivity) this.f38109b;
                v6.a aVar9 = (v6.a) this.f38110c;
                fd.j0.i(combinationActivity, "this$0");
                fd.j0.i(aVar9, "$item");
                if (fd.j0.d(menuItem.getTitle(), combinationActivity.getString(R.string.delete))) {
                    new AlertDialog.Builder(combinationActivity).setTitle(combinationActivity.getString(R.string.delete)).setMessage(combinationActivity.getString(R.string.delete_confirm)).setPositiveButton(combinationActivity.getString(android.R.string.ok), new h0(combinationActivity, aVar9)).setNegativeButton(combinationActivity.getString(android.R.string.cancel), v1.f38406f).create().show();
                } else if (fd.j0.d(menuItem.getTitle(), combinationActivity.getString(R.string.edit_repeat_count))) {
                    ModeSettingsDialogs.Companion.showRepeatCountDialog(combinationActivity, aVar9.f(), new z6.n(aVar9, combinationActivity));
                } else if (fd.j0.d(menuItem.getTitle(), combinationActivity.getString(R.string.edit_playback_speed))) {
                    ModeSettingsDialogs.Companion.showPlaybackSpeedDialog(combinationActivity, aVar9.e(), ((r6.e) combinationActivity.f13213e.getValue()).b(), new z6.m(aVar9, combinationActivity));
                } else if (fd.j0.d(menuItem.getTitle(), combinationActivity.getString(R.string.edit_repeat_delay))) {
                    ModeSettingsDialogs.Companion.showPauseBeforeRepeatDialog(combinationActivity, aVar9.g(), new z6.o(aVar9, combinationActivity));
                }
                break;
            default:
                CombinedRecordingsActivity combinedRecordingsActivity = (CombinedRecordingsActivity) this.f38109b;
                t6.a aVar10 = (t6.a) this.f38110c;
                fd.j0.i(combinedRecordingsActivity, "this$0");
                fd.j0.i(aVar10, "$item");
                if (fd.j0.d(menuItem.getTitle(), combinedRecordingsActivity.getString(R.string.delete))) {
                    new AlertDialog.Builder(combinedRecordingsActivity).setTitle(combinedRecordingsActivity.getString(R.string.delete)).setMessage(combinedRecordingsActivity.getString(R.string.delete_config_confirm)).setPositiveButton(combinedRecordingsActivity.getString(android.R.string.ok), new h0(combinedRecordingsActivity, aVar10)).setNegativeButton(combinedRecordingsActivity.getString(android.R.string.cancel), v1.f38407g).create().show();
                } else if (!fd.j0.d(menuItem.getTitle(), combinedRecordingsActivity.getString(R.string.export))) {
                    if (!fd.j0.d(menuItem.getTitle(), combinedRecordingsActivity.getString(R.string.edit))) {
                        if (fd.j0.d(menuItem.getTitle(), combinedRecordingsActivity.getString(R.string.create_launcher_shortcut))) {
                            if (!ma.h.f33410y.a().i()) {
                                u1.a.o(combinedRecordingsActivity, R.string.create_shortcut_pro, -2).setAction(combinedRecordingsActivity.getString(R.string.buy_pro), new z6.s(combinedRecordingsActivity, 6)).show();
                            } else {
                                if (aVar10.d().isEmpty()) {
                                    i10 = R.string.combination_no_recordings;
                                } else if (f0.d.a(combinedRecordingsActivity)) {
                                    String name = aVar10.getName();
                                    r6.k kVar = r6.k.COMBINE;
                                    fd.j0.i(name, "name");
                                    fd.j0.i(kVar, "mode");
                                    SettingsDialogs.Companion.showCreateShortcutDialog(combinedRecordingsActivity, name, new f7.m(combinedRecordingsActivity, kVar, name));
                                } else {
                                    i10 = R.string.shortcuts_no_available;
                                }
                                u1.a.s(combinedRecordingsActivity, i10, 0, 2);
                            }
                        }
                        break;
                    } else {
                        try {
                            Objects.requireNonNull(CombinationActivity.f13209j);
                            CombinationActivity.f13210k = aVar10;
                            combinedRecordingsActivity.startActivity(new Intent(combinedRecordingsActivity, (Class<?>) CombinationActivity.class));
                        } catch (Exception e10) {
                            Toast.makeText(combinedRecordingsActivity, combinedRecordingsActivity.getString(R.string.error_with_param, new Object[]{e10.getMessage()}), 1).show();
                        }
                    }
                } else if (combinedRecordingsActivity.l()) {
                    nb.b bVarE3 = ec.a.e(lb.i.n(Boolean.TRUE), z6.k0.f45091c, null, new z6.l0(combinedRecordingsActivity, aVar10), 2);
                    nb.a aVar11 = combinedRecordingsActivity.f13238h;
                    fd.j0.j(aVar11, "compositeDisposable");
                    aVar11.a(bVarE3);
                }
                break;
        }
        return true;
        return true;
    }
}
