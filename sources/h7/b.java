package h7;

import android.app.AlertDialog;
import android.widget.CompoundButton;
import com.inscode.autoclicker.ui.consent.ConsentActivity;
import com.inscode.autoclicker.ui.dialogs.SettingsDialogs;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30950a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30951b;

    public /* synthetic */ b(AlertDialog alertDialog) {
        this.f30951b = alertDialog;
    }

    public /* synthetic */ b(ConsentActivity consentActivity) {
        this.f30951b = consentActivity;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        switch (this.f30950a) {
            case 0:
                ConsentActivity.onCreate$lambda$0((ConsentActivity) this.f30951b, compoundButton, z10);
                break;
            default:
                SettingsDialogs.Companion.showCreateShortcutDialog$lambda$3$lambda$0((AlertDialog) this.f30951b, compoundButton, z10);
                break;
        }
    }
}
