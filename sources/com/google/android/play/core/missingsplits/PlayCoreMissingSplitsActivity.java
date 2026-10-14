package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.d0;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.by;

/* JADX INFO: loaded from: classes2.dex */
public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    private final String a() {
        return getApplicationInfo().loadLabel(getPackageManager()).toString();
    }

    private final void a(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(d0.a(new StringBuilder(String.valueOf(str).length() + 66), "market://details?id=", str, "&referrer=utm_source%3Dplay.core.missingsplits"))).setPackage("com.android.vending"));
        } catch (ActivityNotFoundException e10) {
            new af(getClass().getName()).a(e10, "Couldn't start missing splits activity for %s", str);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        if (i10 == -1) {
            a(getPackageName());
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (by.a(this)) {
            String strA = a();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strA).length() + 91);
            sb2.append("The app ");
            sb2.append(strA);
            sb2.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb2.toString()).setPositiveButton("Reinstall", this);
        } else {
            String strA2 = a();
            StringBuilder sb3 = new StringBuilder(String.valueOf(strA2).length() + 87);
            sb3.append("The app ");
            sb3.append(strA2);
            sb3.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb3.toString());
        }
        neutralButton.create().show();
    }
}
