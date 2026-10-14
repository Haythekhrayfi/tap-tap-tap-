package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzb;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ResultReceiver f3744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ResultReceiver f3745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3747f;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Intent intentA;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100 || i10 == 110) {
            int i12 = zzb.zzd(intent, "ProxyBillingActivity").f3848a;
            if (i11 != -1) {
                zzb.zzj("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i12);
            } else if (i12 != 0) {
                i11 = -1;
                zzb.zzj("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i12);
            } else {
                i12 = 0;
            }
            ResultReceiver resultReceiver = this.f3744c;
            if (resultReceiver != null) {
                resultReceiver.send(i12, intent != null ? intent.getExtras() : null);
            } else {
                if (intent != null) {
                    if (intent.getExtras() != null) {
                        String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                        if (string != null) {
                            intentA = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                            intentA.setPackage(getApplicationContext().getPackageName());
                            intentA.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                        } else {
                            Intent intentA2 = a();
                            intentA2.putExtras(intent.getExtras());
                            intentA2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            intentA = intentA2;
                        }
                    } else {
                        intentA = a();
                        zzb.zzj("ProxyBillingActivity", "Got null bundle!");
                        intentA.putExtra("RESPONSE_CODE", 6);
                        intentA.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        n nVar = new n();
                        nVar.f3848a = 6;
                        nVar.f3849b = "An internal error occurred.";
                        intentA.putExtra("FAILURE_LOGGING_PAYLOAD", u1.a.w(22, 2, nVar).zzc());
                    }
                    intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    intentA = a();
                }
                if (i10 == 110) {
                    intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentA);
            }
        } else if (i10 == 101) {
            int iZza = zzb.zza(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver2 = this.f3745d;
            if (resultReceiver2 != null) {
                resultReceiver2.send(iZza, intent != null ? intent.getExtras() : null);
            }
        } else {
            zzb.zzj("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
        }
        this.f3746e = false;
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i10;
        PendingIntent pendingIntent;
        int i11;
        super.onCreate(bundle);
        if (bundle != null) {
            zzb.zzi("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f3746e = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f3744c = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f3745d = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f3747f = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            return;
        }
        zzb.zzi("ProxyBillingActivity", "Launching Play Store billing flow");
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f3747f = true;
                i11 = 110;
                i10 = i11;
            } else {
                i10 = 100;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f3744c = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            i10 = 100;
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f3745d = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            i11 = 101;
            i10 = i11;
        } else {
            i10 = 100;
            pendingIntent = null;
        }
        try {
            this.f3746e = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i10, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e10) {
            zzb.zzk("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
            ResultReceiver resultReceiver = this.f3744c;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f3745d;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentA = a();
                    if (this.f3747f) {
                        intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentA.putExtra("RESPONSE_CODE", 6);
                    intentA.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentA);
                }
            }
            this.f3746e = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f3746e) {
            Intent intentA = a();
            intentA.putExtra("RESPONSE_CODE", 1);
            intentA.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentA);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f3744c;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f3745d;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f3746e);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f3747f);
    }
}
