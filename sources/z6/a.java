package z6;

import android.content.DialogInterface;
import com.inscode.autoclicker.service.combine.CombinationActivity;
import com.inscode.autoclicker.ui.main.MainActivity;
import com.inscode.autoclicker.ui.main.SettingsActivity;
import com.inscode.autoclicker.ui.prepare.PrepareActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45029c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45030d;

    public /* synthetic */ a(MainActivity mainActivity) {
        this.f45030d = mainActivity;
    }

    public /* synthetic */ a(SettingsActivity settingsActivity) {
        this.f45030d = settingsActivity;
    }

    public /* synthetic */ a(PrepareActivity prepareActivity) {
        this.f45030d = prepareActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f45029c) {
            case 0:
                CombinationActivity.g((CombinationActivity) this.f45030d, dialogInterface, i10);
                break;
            case 1:
                MainActivity.initRestartApp$lambda$13$lambda$11((MainActivity) this.f45030d, dialogInterface, i10);
                break;
            case 2:
                SettingsActivity.initExperimentalState$lambda$7$lambda$5((SettingsActivity) this.f45030d, dialogInterface, i10);
                break;
            default:
                PrepareActivity.showAccessibilityConsent$lambda$2((PrepareActivity) this.f45030d, dialogInterface, i10);
                break;
        }
    }
}
