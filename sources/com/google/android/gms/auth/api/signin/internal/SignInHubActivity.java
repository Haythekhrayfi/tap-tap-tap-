package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.n;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class SignInHubActivity extends n {
    private static boolean zba;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private Intent zbf;

    private final void zbc() {
        getSupportLoaderManager().c(0, null, new zbw(this, null));
        zba = false;
    }

    private final void zbd(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zba = false;
    }

    private final void zbe(String str) {
        Intent intent = new Intent(str);
        intent.setPackage(str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent.putExtra("config", this.zbc);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.zbb = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            zbd(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.zbb) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
            if (signInAccount != null && signInAccount.zba() != null) {
                GoogleSignInAccount googleSignInAccountZba = signInAccount.zba();
                zbn zbnVarZbc = zbn.zbc(this);
                GoogleSignInOptions googleSignInOptionsZba = this.zbc.zba();
                Objects.requireNonNull(googleSignInAccountZba);
                zbnVarZbc.zbe(googleSignInOptionsZba, googleSignInAccountZba);
                intent.removeExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                intent.putExtra("googleSignInAccount", googleSignInAccountZba);
                this.zbd = true;
                this.zbe = i11;
                this.zbf = intent;
                zbc();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                }
                zbd(intExtra);
                return;
            }
        }
        zbd(8);
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        Objects.requireNonNull(bundleExtra);
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.zbc = signInConfiguration;
        if (bundle == null) {
            if (zba) {
                setResult(0);
                zbd(GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
                return;
            } else {
                zba = true;
                zbe(action);
                return;
            }
        }
        boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
        this.zbd = z10;
        if (z10) {
            this.zbe = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            Objects.requireNonNull(intent2);
            this.zbf = intent2;
            zbc();
        }
    }

    @Override // androidx.fragment.app.n, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    @Override // androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
        }
    }
}
